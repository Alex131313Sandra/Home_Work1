package Home_Work1;
import java.util.Arrays;
import java.util.Random;

public class MY_RANDOM {
    public static void main(String[] args) {
        randomNumber();
        randomNumbers();
        tenRandomNumbers();
        randomInRange();
        tenRandomWithNegative();
        randomQuantityRandomNumber();
    }

    //Вывести на консоль случайное число.
    public static void randomNumber() {
        String s = String.format("%s", (int) (Math.random() * 100));
        System.out.println(s);
    }

    //Вывести на консоль 10 случайных чисел.
    public static void randomNumbers() {
        int amount = 10;
        for(int i = 0; i < amount; i++) {
            System.out.println(new Random().nextInt());
        }
    }

    //Вывести на консоль 10 случайных чисел, каждое в диапазоне от 0 до 10
    public static void tenRandomNumbers() {
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        boolean alreadyused;

        for (int i = 0; i < SIZE; i++) {
            alreadyused = false;
            int newRandomValue = (int) (Math.random() * 11);
            arr[i] = newRandomValue;
            for (int j = 0; j <= i; j++) {
                if (arr[j] == newRandomValue) {
                    alreadyused = true;
                    break;
                }
            }
            if (!alreadyused)
                arr[i] = newRandomValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Вывести на консоль 10 случайных чисел, каждое в диапазоне от 20 до 50.
    public static void randomInRange() {
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        boolean alreadyused;

        for (int i = 0; i < SIZE; i++) {
            alreadyused = false;
            int newRandomValue = (int) (Math.random() * 51);
            arr[i] = newRandomValue;
            for (int j = 20; j <= i; j++) {
                if (arr[j] == newRandomValue) {
                    alreadyused = true;
                    break;
                }
            }
            if (!alreadyused)
                arr[i] = newRandomValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Вывести на консоль 10 случайных чисел, каждое в диапазоне от -10 до 10.
    public static void tenRandomWithNegative() {
        Random random = new Random();
        int max = 10;
        int min = -10;

        for (int i = 0; i < 10; i++){
            int randomNumber = random.nextInt(max + 1 - min) + min;
            System.out.println(randomNumber);
        }
    }

    //Вывести на консоль случайное количество (в диапазоне от 3 до 15) случайных чисел, каждое в диапазоне от -10 до 35.
    public static void randomQuantityRandomNumber() {
        Random random = new Random();
        int cMax = 15;
        int cMin = 3;
        int randomCount = random.nextInt(cMax + 1 - cMin) + cMin;
        int max = 35;
        int min = -10;
        for (int i = 0; i < randomCount; i++) {
            int randomNumber = random.nextInt(max + 1 - min) + min;
            System.out.println(randomNumber);
        }
    }
}


