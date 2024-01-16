public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (600 <= this.price && 1000 > this.price) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1500) {
            System.out.println("This notebook is light.");
        } else if (1500 <= this.weight && 2500 > this.weight) {
            System.out.println("This notebook is not so heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year > 2018) {
            System.out.println("This notebook is modern.");
        } else if (2014 < this.year && 2018 >= this.year) {
            System.out.println("This notebook is relatively modern");
        } else {
            System.out.println("This notebook is old.");

        }
    }
}
