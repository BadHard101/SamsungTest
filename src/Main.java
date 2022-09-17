import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        //int num = scanner.nextInt();
        for (int num = 0; num < 999; num++) {
            int s = 0;
            int i = 1;
            do {
                s = (int) Math.pow(3, i);
                i++;
            } while (s < num);
            if (s == num)
                System.out.println(num + "YES");
            else
                System.out.println(num + "NO");
        }
    }
}