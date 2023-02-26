package exercises.chapter7;

import java.util.Scanner;

public class daysOfWeek {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        String[] week = {"Monday", "Thusday", "Wendesday", "Thirsday", "Friday", "Saturday", "Sunday"};
        int number = getNumber();
        System.out.println("The day of the week is :" +getDay(number, week));
    }
    public static int getNumber(){

        System.out.println("Enter a number of day: ");
        int number = scanner.nextInt();
        if(number > 7 || number < 1) {
            do {
                System.out.println("The number must be between 1 and 7, tray again: ");
                number = scanner.nextInt();
            } while ((number > 7) || (number < 1));

        }

        return number;
    }
    public static String getDay(int number, String week[]){
        String day = week[number-1];
        return day;
    }
}

