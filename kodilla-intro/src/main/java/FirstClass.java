public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook(1400, 1900, 2019);
        Notebook notebook2 = new Notebook(1700, 500, 2008);
        Notebook notebook3 = new Notebook(2600, 1000, 2014);
        System.out.println("Weight: " + notebook1.weight + " Price: " + notebook1.price + " Year: " + notebook1.year);
        notebook1.checkPrice();
        notebook1.checkWeight();
        notebook1.checkYear();

        notebook1.checkYearAndPrice();
        notebook2.checkYearAndPrice();
        notebook3.checkYearAndPrice();
    }
}
