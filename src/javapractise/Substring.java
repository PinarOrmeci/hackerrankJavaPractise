package javapractise;

import java.util.Scanner;

public class Substring
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String startEnd =scanner.nextLine();
        int start = Integer.parseInt(startEnd.split(" ")[0]);
        int end = Integer.parseInt(startEnd.split(" ")[1]);

        System.out.println(sentence.substring(start,end));
    }
}
