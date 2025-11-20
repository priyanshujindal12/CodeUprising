
import java.util.*;

class No_4_Please {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int count1 = 0, count2 = 0, count3 = 0;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                if (x == 1) count1++;
                else if (x == 2) count2++;
                else if (x == 3) count3++;
            }

            int deletionsFor13 = Math.min(count1, count3);        // remove all 1s or all 3s
            int deletionsFor2  = Math.max(0, count2 - 1);         // keep at most one 2

            System.out.println(deletionsFor13 + deletionsFor2);
        }
    }
}
