package com.kodilla.mockito.homework;

public class Launcher {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        Subscriber subscriber = new Subscriber("John");
        Subscriber subscriber1 = new Subscriber("Kate");
        weatherService.addSubscriber("Kraków", subscriber);
        weatherService.addSubscriber("Kraków", subscriber1);
        System.out.println(weatherService.getServiceMap().get("Kraków").size());
        weatherService.weatherChanged("Kraków", new Temperature(30));
        weatherService.removeSubscriberFromLocation("Kraków",subscriber);
        System.out.println(weatherService.getServiceMap().get("Kraków").size());
    }
}
