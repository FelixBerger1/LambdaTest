import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NumberTester {
    private String fileName;
    private TestNumber oddTester;
    private TestNumber primeTester;
    private TestNumber palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setOddEvenTester(TestNumber oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(TestNumber primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(TestNumber palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));) {
            String s = bufferedReader.readLine();
            String[] parts = s.split(" ");
            int i = Integer.parseInt(parts[0]);
            int j = Integer.parseInt(parts[1]);
            switch (i) {
                case 1:
                    System.out.println("OddEvenTest");
                    oddTester.testNumber(j);
                    break;
                case 2:
                    System.out.println("PrimeTester");
                    primeTester.testNumber(j);
                    break;
                case 3:
                    System.out.println("PalindromTester");
                    palindromeTester.testNumber(j);
                    break;
            }

        } catch (Exception e) {
            System.out.println("Fehler");
        }
    }


}
