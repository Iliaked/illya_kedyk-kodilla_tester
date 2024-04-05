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

        objectGrades.showLast();
        objectGrades.showAverage();


        int numberOfGrades = objectGrades.size;

        System.out.println("size is " + numberOfGrades);
    }

    private void showLast() {
        int lastGrade = grades[grades.length - 1];
        if (grades.length > 0) {
            System.out.println(lastGrade);
        }
    }

    private void showAverage() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum +=grades[i];
        }
        double average = sum/ grades.length;
        System.out.println(average);
    }
}




