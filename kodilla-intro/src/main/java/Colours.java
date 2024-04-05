import java.util.Scanner;
public class Colours {
    public static String getUserSelection () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of the colour (r-red, b-blue, g-green, w-white)");
            String letter = scanner.nextLine().trim();
            switch (letter) {
                case "r": return "red";
                case "b": return "blue";
                case "g": return "green";
                case "w": return "white";
                default:
                    System.out.println("Wrong letter. Try again.");

            }
        }
    }
    public static void main (String[] args) {
        System.out.println(getUserSelection());
    }
}
