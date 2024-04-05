package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;
import com.kodilla.stream.User;

import java.util.List;


public class ForumStats {
    public static double averagePostsForUsersAbove40(List<User> usersRepository) {
        return usersRepository.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public static double averagePostsForUsersBelow40(List<User> usersRepository) {
        return usersRepository.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        double averagePostsAbove40 = averagePostsForUsersAbove40(UsersRepository.getUsersList());
        double averagePostsBelow40 = averagePostsForUsersBelow40(UsersRepository.getUsersList());
        System.out.println("Średnia liczba postów dla użytkowników powyżej 40 lat: " + averagePostsAbove40);
        System.out.println("Średnia liczba postów dla użytkowników poniżej 40 lat: " + averagePostsBelow40);
    }
}
