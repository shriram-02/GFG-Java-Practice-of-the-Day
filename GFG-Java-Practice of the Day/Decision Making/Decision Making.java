import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n < m) {
            System.out.println("lesser");
        } else if (n == m) {
            System.out.println("equal");
        } else {
            System.out.println("greater");
        }
    }
}