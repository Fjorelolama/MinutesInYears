import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the Minutes: ");
        long enter_minutes = userInput.nextLong();

        long minutes_day =  enter_minutes / 1440;
        long years = minutes_day / 365;
        long years_minute = (years*365)*1440;
        long remaining_minut = enter_minutes - years_minute;
        long days = remaining_minut / 1440;




        System.out.println(enter_minutes + " minutes is approximately " + years + " years " + days + " days");
        //System.out.println(enter_minutes + " minutes is approximately " + years + " years days");
    }
}
 //1000000000

