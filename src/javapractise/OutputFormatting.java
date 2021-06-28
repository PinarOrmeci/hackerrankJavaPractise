package javapractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class OutputFormatting
{
    public static void main(String[] args)
    {
        List<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());
        IntStream.range(0, q).forEach(i -> inputs.add(scanner.nextLine()));

        inputs.forEach(i -> {
            try
            {
                long inp = Long.parseLong(i);
                System.out.println(i + " can be fitted in:");
                if (inp >= -128 && inp <= 127)
                    System.out.println("* byte");
                if (inp >= Short.MIN_VALUE && inp <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (inp >= Integer.MIN_VALUE && inp <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (inp >= Long.MIN_VALUE && inp <= Long.MAX_VALUE)
                    System.out.println("* long");

            }
            catch (Exception e)
            {
                System.out.println(i + " can't be fitted anywhere.");
            }
        });
    }
}
