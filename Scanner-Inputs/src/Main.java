import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");

        int year = myScanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" The entered year is a leap year");
        } else {
            System.out.println("The entered year is not a leap year");

        }
        myScanner.close();
    }

}
