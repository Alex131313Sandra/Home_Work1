package Home_Work1;

public class CyclesH1 {
    public static String sumAndQuantity(){
        int sum = 0;
        int quantity = 0;
        for (int i = 2; i <= 99; i += 2) {
            if (i % 2 == 0) {
                sum = sum + i;
                quantity = quantity + 1;
            }
        }
        return "Even numbers quantity = " + quantity + ", their sum = " + sum;
    }

    public static boolean primeNumber(int a){
        if (a <= 1){
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int sqrSelect(int number) {
        int res = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (i * i <= number && (i + 1) * (i + 1) > number) {
                res =  i;
                break;
            }
        }
        return res;
    }


    public static int sqrtBinary(int x) {
        int res = x;
        boolean finished = false;
        if (x != 0 && x != 1) {
            int start = 1, end = x / 2;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid == x / mid) {
                    res = mid;
                    finished = true;
                    break;
                }
                if (mid < x / mid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (!finished) {
                res = start - 1;
            }
        }

        return res;
    }

    public static int factorial(int n){
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static int sumOfDigits(int number){
        int res = 0;
        while(number != 0){
            res = res + number % 10;
            number = number / 10;
        }
        return res;
    }

    public static int mirroredNumber(int num){
        int res = 0;
        for( ;num != 0; res *= 10){
            res = res + num % 10;
            num = num / 10;
        }
        res = res/10;
        return res;
    }
}
