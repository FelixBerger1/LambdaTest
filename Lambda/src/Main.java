import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static NumberTester numberTester = new NumberTester("Tests");

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


    }


}