import java.util.Random;
public class RandomNumbers {

    int min = 30;
    int max = 0;

    public void getRandomNumber() {
        Random random = new Random();
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
    }
    public int getMax() {
        return max;
    }
    public int getMin() {
        return min;
    }
}

