import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
                case 1:
                    System.out.println("OddEvenTest");
                    oddTester.testNumber(bufferedReader.read());
                    break;
                case 2:
                    System.out.println("PrimeTester");
                    primeTester.testNumber(bufferedReader.read());
                    break;
                case 3:
                    System.out.println("PalindromTester");
                    palindromeTester.testNumber((bufferedReader.read()));
                    break;
            }

        } catch (Exception e) {
            System.out.println("Fehler");
        }
    }


}
