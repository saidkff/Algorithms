import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int second = 0, first = 0;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            if (x > first) {
                second = first;
                first = x;
            }
            if (x > second && x < first) {
                second = x;
            }
        }
        System.out.println(second);
    }
}