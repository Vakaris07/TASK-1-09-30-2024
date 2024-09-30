//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Imput 5 integers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        for (int i = 5; i != num1; i--) {
            switch (i) {
                case 5:
                    System.out.println(num5);
                    break;
                case 4:
                    System.out.println(num4);
                    break;
                case 3:
                    System.out.println(num3);
                    break;
                case 2:
                    System.out.println(num2);
                    break;
                case 1:
                    System.out.println(num1);
                    break;
            }

        }
    }


}
