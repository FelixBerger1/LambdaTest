import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static final NumberTester numberTester = new NumberTester("Tests");

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        numberTester.setOddEvenTester(number -> number % 2 == 0);
        numberTester.setPrimeTester(number -> {
            if (number <= 1)
                return false;

            for (int i = 2; i < number; i++)
                if (number % i == 0)
                    return false;

            return true;
        });
        numberTester.setPalindromeTester(number -> {
            int palindrome = number;
            int reverse = 0;

            while (palindrome != 0) {
                int remainder = palindrome % 10;
                reverse = reverse * 10 + remainder;
                palindrome = palindrome / 10;
            }
            return number == reverse;
        });
        numberTester.testFile();

        System.out.println("1 - Rational Calculator");
        System.out.println("2 - Vector Calculator");
        System.out.println("3 - Exit Program");
        int a = s.nextInt();
        do {

            switch (a) {
                case 1:

                    int op = 5;
                    int xa = 0;
                    int xb = 0;
                    int ya = 0;
                    int yb = 0;
                    do {
                        System.out.println("Enter Number x a>");
                        xa = s.nextInt();
                        System.out.println("Enter Number x b>");
                        xb = s.nextInt();
                        System.out.println("Enter Number y a>");
                        ya = s.nextInt();
                        System.out.println("Enter Number y b>");
                        yb = s.nextInt();
                        System.out.println("""
                                Choose Operation:
                                1 - add
                                2 - substract
                                3 - multiply
                                4 - divide
                                5 - Re-enter Numbers""");
                        op = s.nextInt();
                    }
                    while (op == 5);

                    switch (op) {
                        case 1:

                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }


                    break;

                case 2:
                    break;

                case 3:
                    break;

                default:
                    System.out.println("System Error");
                    break;

            }
            System.out.println("1 - Rational Calculator");
            System.out.println("2 - Vector Calculator");
            System.out.println("3 - Exit Program");
            a = System.in.read();
        }

        while (a != 3);


    }


}