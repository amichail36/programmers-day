import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.19."+year);
        }
        else {
            System.out.println("13.19."+year);
        }
    }
    public static boolean isLeapYear(int year) {
        boolean isLeapYear;
        int divaideFour = year/4;
        int divaideHundred = year/100;
        int divaideFourHundred = year/400;

        if (year-(divaideFourHundred*400)==0) {
            isLeapYear = true;
        } else {
            if (year - (divaideHundred * 100) != 0) {
                if (year - (divaideFour * 4) == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = false;
            }
        }
        return isLeapYear;
    }
}