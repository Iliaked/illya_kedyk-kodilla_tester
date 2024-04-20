package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherServiceTestSuite {
    private WeatherService weatherService = new WeatherService();
    private SubscriberInterface subscriberInterface = Mockito.mock(SubscriberInterface.class);
    private String location = "Waszawa";
    private Temperature temperature = new Temperature(-15);

    @BeforeEach
    public void addingSubscriberToMap() {
        weatherService.addSubscriber(location, subscriberInterface);
    }

    @Test
    public void shouldSubscriberBeAddedToLocation() {
        assertEquals(1, weatherService.getServiceMap().size());
    }

    @Test
    public void shouldSubscriberBeRemovedFromLocation() {
        weatherService.removeSubscriberFromLocation(location, subscriberInterface);
        assertEquals(0, weatherService.getServiceMap().get(location).size());
    }

    @Test
    public void shouldSubscriberBeRemovedFromAllLocations() {
        weatherService.removeSubscriberFromService(subscriberInterface);
        assertEquals(0, weatherService.getServiceMap().get(location).size());
    }

    @Test
    public void shouldLocationSubscribersGetNotification() {
        weatherService.sendNotificationToLocationSubscribers(location, temperature);
        Mockito.verify(subscriberInterface).updateTemperature(temperature);
    }

    @Test
    public void shouldAllSubscribersGetNotification() {
        weatherService.sendNotificationToAllSubscribers("Attention! Weather alert!");
        Mockito.verify(subscriberInterface).receiveNotification("Attention! Weather alert!");
    }

    @Test
    public void shouldLocationBeRemoved() {
        weatherService.removeLocation(location);
        assertEquals(0, weatherService.getServiceMap().size());
    }
}
