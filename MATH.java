package Home_Work1;
import java.awt.*;

public class MATH {
    public static void main(String[] args) {

    }
        public static double findDistanceDegrees_1(int V, int angle) {
            double distance;
            distance = java.lang.Math.pow(V, 2) * java.lang.Math.sin(angle) / 9.8;
            return distance;
        }

        public static double findDistanceRadians_1(int V, int angle) {
            double distance;
            distance = java.lang.Math.pow(V, 2) * java.lang.Math.sin(java.lang.Math.toRadians(angle)) / 9.8;
            return distance;
        }

        public static double findDistance_2(int V1, int V2, int T, int S) {
            double L = (V1 + V2) * T + S;
            return L;
        }

        public static boolean isPlacedInArea(double x, double y) {
            int[] xpoints = {2, 0, -2, 0};
            int[] ypoints = {2, 1, 2, 0};
            int npoints = 4;
            Polygon polygon = new Polygon (xpoints, ypoints, npoints) ;
            boolean answer = polygon.contains(x, y);
            return answer;
        }

        public static double bigFormula_4(double b, double x) {
            double sin = java.lang.Math.sin(x);
            double cos = java.lang.Math.cos(x);
            double pow = java.lang.Math.pow(b, x + 1);
            double upperPart = 6 * (java.lang.Math.log(java.lang.Math.sqrt(pow + 2 * java.lang.Math.pow(b, x) * cos)));
            double lowerPart = (java.lang.Math.log((x - pow * sin)));
            double secondPart = java.lang.Math.abs(cos / java.lang.Math.pow(b, sin));
            double z = upperPart / lowerPart + secondPart;
            return z;
        }

    }
