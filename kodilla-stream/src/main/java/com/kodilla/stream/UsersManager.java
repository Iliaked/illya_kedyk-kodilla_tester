package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> ageGroupUsernames = filterAgeGroupUsernames();
        System.out.println(ageGroupUsernames);

        List<String> postsGroupUsernames = filterNumberOfPosts();
        System.out.println(postsGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static List<String> filterAgeGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter (age -> age.getAge() > 40)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static List<String> filterNumberOfPosts() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter (posts -> posts.getNumberOfPost() > 10)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
