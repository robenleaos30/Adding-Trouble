package Day13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        add(a, b, c);
    }

    static void add(int a, int b, int c) {
        if (c != (a + b)) {
            System.out.println("wrong!");
        }
        else {
            System.out.println("correct!");
        }
    }
}
