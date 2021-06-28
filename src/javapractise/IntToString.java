package javapractise;

import java.util.Scanner;

public class IntToString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        try{
            String.valueOf(i);
            System.out.println("Good job");
        }
        catch (Exception e){
            System.out.println("Wrong answer");
        }
    }
}
