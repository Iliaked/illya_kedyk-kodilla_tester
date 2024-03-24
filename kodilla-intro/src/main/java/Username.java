public class Username {
    public static void main(String[] args) {
        User john = new User("John", 53);
        User kate = new User("Kate", 16);
        User bill = new User("Bill", 2);
        User frank = new User("Frank", 20);
        User matt = new User("Matt", 24);

        User[] users = {john, kate, bill, frank, matt};


            for (int i = 0; i < users.length; i++)
                System.out.println(users[i].name + " - "
                        + users[i].age);

            int sum = (users[0].age + users[1].age + users[2].age + users[3].age + users[4].age);


           // sum0 = (users[0].age + users[1].age);
           // sum0 = (sum0 + users[2].age);
           // sum0 = (sum0 + users[3].age);
        System.out.println(users[0].age);
        System.out.println(getSum(users));


        double average = (sum/users.length);


        System.out.println("Average users age is: " + average);
        getBelowAverage(users);


        }
        private static int getSum(User[] users) {
            int sum0 = 0;
            for (int i = 0; i < users.length; i++) {
                sum0 = sum0 + users[i].age;
            }
            return sum0;
        }

        private static String getBelowAverage(User[] users) {
            int sum = (users[0].age + users[1].age + users[2].age + users[3].age + users[4].age);
        int average = (sum/users.length);
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }
            return null;
        }

}






