package javapractise;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate dt = LocalDate.parse(date, dtf);

        DayOfWeek da =dt.getDayOfWeek();
        System.out.println(da);
    }
}
