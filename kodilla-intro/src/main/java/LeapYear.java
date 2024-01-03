public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        int denominator1 = 4;
        int denominator2 = 100;
        int denominator3 = 400;

        System.out.println(year);

        if (year%denominator1 != 0) {
            System.out.println("Non leap year");
        } else if (year%denominator2 != 0) {
            System.out.println("Leap year");
        } else if (year%denominator3 != 0) {
            System.out.println("Non leap year");
        } else {
        System.out.println("Leap year");
        }
    }
}

