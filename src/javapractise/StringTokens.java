package javapractise;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text=text.trim();
        String[] strings = text.split("['!?,._@ ]+");
        if(strings.length==0 || strings[0].equals(""))
            System.out.println("0");
        else{
            System.out.println(strings.length);
            Arrays.stream(strings).forEach(w-> System.out.println(w));
        }
    }
}
