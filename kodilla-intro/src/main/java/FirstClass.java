public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(1500, 500, 2014);
        System.out.println("Weight: " + notebook.weight + " Price: " + notebook.price + " Year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

    }
}
