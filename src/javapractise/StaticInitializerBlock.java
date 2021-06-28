package javapractise;

import java.util.Scanner;

public class StaticInitializerBlock
{
    public static void main(String[] args)
    {
        new Test();
    }
}

class Test
{
    public static int B;
    public static int H;

    static
    {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B > 0 & H > 0)
            System.out.println(B * H);
        else
            try
            {
                throw new Exception("Breadth and height must be positive");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
    }
}
