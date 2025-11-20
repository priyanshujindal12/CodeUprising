import java.util.*;

public class Exun_And_The_Pizzas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();  // total pizzas available for selling
        int N = sc.nextInt();  // total pizzas required
        int R = sc.nextInt();  // price of one pizza

        int remaining = K - N;  // pizzas left after requirement
        System.out.println(remaining * R);
    }
}
