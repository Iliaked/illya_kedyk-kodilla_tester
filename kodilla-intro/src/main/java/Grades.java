public class Grades {
    private static int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public static void main(String[] args) {
        Grades objectGrades = new Grades();

        objectGrades.add(8);
        objectGrades.add(5);
        objectGrades.add(8);
        objectGrades.add(1);
        objectGrades.add(7);
        objectGrades.add(7);
        objectGrades.add(4);
        objectGrades.add(5);
        objectGrades.add(3);
        objectGrades.add(5);

        showLast(objectGrades);


        int numberOfGrades = objectGrades.size;

        System.out.println("size is " + numberOfGrades);

        }

    private static void showLast(Grades objectGrades) {
            int lastGrade = grades[grades.length - 1];
            int numberOfGrades = objectGrades.size;
            if (numberOfGrades > 0);
            System.out.println(lastGrade);

    }

}




