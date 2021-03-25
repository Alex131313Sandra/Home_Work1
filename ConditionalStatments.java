package Home_Work1;

 public class ConditionalStatments {

     public static int calcNumbersSumOrMultiply(int a, int b) {
         if (a % 2 == 0) {
             return a * b;
         } else {
             return a + b;
         }
     }

     public static String calcCoordinatesQuater(int x, int y) {
         String res = "";
         if (x > 0 && y > 0) {
             res = "I quarter";
         } else if (x < 0 && y > 0) {
             res = "II quarter";
         } else if (x < 0 && y < 0) {
             res = "III quarter";
         } else if (x > 0 && y < 0) {
             res = "IV quarter";
         } else if (x == 0 && y > 0) {
             res = "on the axis y between I and II";
         } else if (x == 0 && y < 0) {
             res = "on the axis y between III and IV";
         } else if (x > 0 && y == 0) {
             res = "on the axis x between I and IV";
         } else if (x < 0 && y == 0) {
             res = "on the axis x between II and III";
         } else if (x == 0 && y == 0) {
             res = "at the origin";
         }
         return res;
     }

     public static int calcPositiveNumbers(int a, int b, int c) {
         int res = 0;
         if (a > 0) {
             res += a;
         }
         if (b > 0) {
             res += b;
         }
         if (c > 0) {
             res += c;
         }
         return res;
     }

     public static int numMax(int a, int b, int c) {
         int result;
         int sum = a + b + c;
         int multiply = a * b * c;
         if (sum > multiply) {
             result = sum + 3;
         } else {
             result = multiply + 3;
         }
         return result;
     }

     public static String getMark(int mark){
         if (mark < 0 || mark >100){
             throw new IllegalArgumentException("Число должно быть больше 0 и меньше 100");
         } else if (mark >= 0 && mark <= 19) {
             return "F";
         } else if (mark >= 20 && mark <= 39) {
             return "E";
         } else if (mark >= 40 && mark <= 59) {
             return "D";
         } else if (mark >= 60 && mark <= 74) {
             return "C";
         } else if (mark >= 75 && mark <= 89) {
             return "B";
         }
             return "A";
         }
      }


