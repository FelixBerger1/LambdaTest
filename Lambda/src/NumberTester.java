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
            int b = Integer.parseInt(bufferedReader.readLine());
            int c = 0;
            while (c < b) {
                c++;
                String s = bufferedReader.readLine();
                String[] parts = s.split(" ");
                int i = Integer.parseInt(parts[0]);
                int j = Integer.parseInt(parts[1]);
                switch (i) {
                    case 1:
                        System.out.println("OddEvenTest");
                        if (oddTester.testNumber(j)) {
                            System.out.println("Even");
                        } else {
                            System.out.println("Odd");
                        }

                        break;
                    case 2:
                        System.out.println("PrimeTester");
                        if (primeTester.testNumber(j)) {
                            System.out.println("Ist Prim");
                        } else {
                            System.out.println("Ist Nicht Prim");
                        }
                        break;
                    case 3:
                        System.out.println("PalindromTester");
                        if (palindromeTester.testNumber(j)) {
                            System.out.println("Ist ein Palindrom");
                        } else {
                            System.out.println("Ist kein Palindrom");
                        }
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Fehler");
        }
    }


}
