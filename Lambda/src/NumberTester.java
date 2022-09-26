import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {
    private String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() throws FileNotFoundException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));) {
            int i = bufferedReader.read();
            switch (i) {
                case 1:oddTester.TestNumber(bufferedReader.read());
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

        } catch (Exception e) {
            System.out.println("Fehler");
        }
    }


}
