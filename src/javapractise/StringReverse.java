package javapractise;

import java.util.Scanner;

public class StringReverse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        StringBuilder str = new StringBuilder();
        StringBuilder reverse = str.append(input).reverse();
        if (reverse.toString().equals(input))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
