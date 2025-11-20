import java.util.*;

public class EXML_Race {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int bestCar = 1;
            int bestSpeed = -1;

            for (int i = 1; i <= N; i++) {
                int d = sc.nextInt();
                int t = sc.nextInt();
                int speed = d/t; // integer because d is multiple of t

                if (speed > bestSpeed) {
                    bestSpeed = speed;
                    bestCar = i;
                }
            }

            System.out.println(bestCar);
        }
    }
}
