package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;
import com.kodilla.stream.User;


public class ForumStats {
    public static double averagePostsForUsersAbove40(UsersRepository usersRepository) {
        return usersRepository.getUsersList().stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public static double averagePostsForUsersBelow40(UsersRepository usersRepository) {
        return usersRepository.getUsersList().stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepository();
        double averagePostsAbove40 = averagePostsForUsersAbove40(usersRepository);
        double averagePostsBelow40 = averagePostsForUsersBelow40(usersRepository);
        System.out.println("Średnia liczba postów dla użytkowników powyżej 40 lat: " + averagePostsAbove40);
        System.out.println("Średnia liczba postów dla użytkowników poniżej 40 lat: " + averagePostsBelow40);
    }
}
