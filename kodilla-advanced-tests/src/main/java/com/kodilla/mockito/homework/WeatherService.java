package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {
    private Map<String, Set<SubscriberInterface>> service = new HashMap<>();

    public void addSubscriber(String location, SubscriberInterface subscriberInterface) {
        if (service.containsKey(location)) {
            service.get(location).add(subscriberInterface);
        } else {
            service.put(location, new HashSet<>(Set.of(subscriberInterface)));
        }
    }

    public void removeSubscriberFromLocation(String location, SubscriberInterface subscriberInterface) {
        if (service.containsKey(location) && service.get(location).contains(subscriberInterface)) {
            service.get(location).remove(subscriberInterface);
        } else {
            System.out.println("User does not exist");
        }
    }

    public void weatherChanged(String location, Temperature temperature) {
        sendNotificationToLocationSubscribers(location, temperature);
    }

    public void removeSubscriberFromService(SubscriberInterface subscriberInterface) {
        service.forEach((s, weatherObservers) -> service.get(s).remove(subscriberInterface));
    }

    public void sendNotificationToLocationSubscribers(String location, Temperature temperature) {
        if (!service.containsKey(location)) {
            return;
        }
        for (SubscriberInterface subscriberInterface : service.get(location)) {
            subscriberInterface.updateTemperature(temperature);
        }
    }

    public void sendNotificationToAllSubscribers(String message) {
        service
                .forEach((s, subscriberInterfaces) -> service.get(s)
                        .forEach(subscriberInterface -> subscriberInterface.receiveNotification(message)));
    }

    public void removeLocation(String location) {
        service.remove(location);
    }


    public Map<String, Set<SubscriberInterface>> getServiceMap() {
        return service;
    }
}
