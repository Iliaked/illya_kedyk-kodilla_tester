public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];

        animals[0] = "cat";
        animals[1] = "dog";
        animals[2] = "cow";
        animals[3] = "sheep";
        animals[4] = "goat";

        String animal = animals[3];

        System.out.println(animal);

        int numberOfElements = animals.length;

        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}
