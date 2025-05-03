import java.util.Scanner;

public class perulanganJobsheet1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        char digit1 = nim.charAt(nim.length() - 2);
        char digit2 = nim.charAt(nim.length() - 1);
        
        int n = (digit1 - '0') * 10 + (digit2 - '0');
        
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}