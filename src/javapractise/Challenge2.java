package javapractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        for (int i = 0; i < 3; i++)
        {
            inputs.add(scanner.nextLine());
        }
        System.out.println("String: " + inputs.get(2));
        System.out.println("Double: " + Double.valueOf(inputs.get(1)));
        System.out.println("Int: " + Integer.valueOf(inputs.get(0)));
    }
}
