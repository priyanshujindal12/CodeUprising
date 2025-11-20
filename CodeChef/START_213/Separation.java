import java.util.*;

public class Separation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            long X = sc.nextLong();

            int cLT = 0, cGT = 0, cEQ = 0;

            for (int i = 0; i < N; i++) {
                long val = sc.nextLong();
                if (val < X) cLT++;
                else if (val > X) cGT++;
                else cEQ++;
            }

            // Condition for NOT being separated
            if (cLT == 0 || cGT == 0 || cEQ > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
