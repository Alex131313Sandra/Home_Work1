package Home_Work1;

public class Stars {
    public static void main(String[] args) {
        square();
//        squareEmpty();
//        star1();
//        star2();
//        star3();
//        star4();
//        star5();
//        star6();
//        star7();
    }

    public static void square(){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void squareEmpty() {
        System.out.println("*  *  *  *  *  *  *");
        for (int i = 0; i < 5; i++) {
            System.out.println("*                 *");
        }
        System.out.println("*  *  *  *  *  *  *");
    }


    public static void star1() {
        int diaogo = 6;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || j == 0 || j == diaogo) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            diaogo--;

        }
    }

    public static void star2() {

        int diago = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 6 || j == 0 || j == diago) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            diago++;

        }
    }

    public static void star3() {
        System.out.println("                   *");
        int k = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 6; j >= 0; j--) {
                if (j == 0) {
                    System.out.print(" * ");
                    continue;
                }
                if (j == 6 - k) {
                    System.out.print(" * ");
                    continue;
                }
                System.out.print("   ");
            }
            k--;
            System.out.println();
        }
        System.out.println(" *  *  *  *  *  *  *");
    }

    public static void star4() {
        System.out.println(" *  *  *  *  *  *  *");
        int k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 6; j >= 0; j--) {
                if (j == 0) {
                    System.out.print(" * ");
                    continue;
                }
                if (j == 6 - k) {
                    System.out.print(" * ");
                    continue;
                }
                System.out.print("   ");
            }
            k++;
            System.out.println();
        }
        System.out.println("                   *");
    }

    public static void star5() {
        int k = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 6; j >= 0; j--) {
                if (j == 6 - k || j == k) {
                    System.out.print(" * ");
                    continue;
                }
                System.out.print("   ");
            }
            k++;
            System.out.println();
        }
    }

    public static void star6() {
        int k = 1;
        System.out.println("*  *  *  *  *  *  *");
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j >= 0; j--) {
                if (j == 6 - k) {
                    System.out.print("* ");
                    continue;
                }
                if (j == k) {
                    System.out.print(" *");
                    continue;
                }
                System.out.print("   ");
            }
            k++;
            System.out.println();
        }
    }

    public static void star7() {
        int k = 3;
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                System.out.println();
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (j == 3 && j == k) {
                    System.out.print("*");
                    continue;
                }
                if (j == 6 - k) {
                    System.out.print(" *");
                    continue;
                }
                if (j == k) {
                    System.out.print("* ");
                    continue;
                }
                System.out.print("   ");
            }
            k--;
            System.out.println();
        }
        System.out.println("*  *  *  *  *  *  *");
    }
}
