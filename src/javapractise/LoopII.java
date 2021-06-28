package javapractise;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopII
{
    public static void main(String[] args)
    {
        ArrayList<String> in = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int q = Integer.parseInt(line);


        for (int i = 0; i < q; i++)
        {
            String nums = scanner.nextLine();
            in.add(nums);
        }

        in.forEach(i -> {
            String[] numbers = i.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int n = Integer.parseInt(numbers[2]);

            int result = a;
            for (int m = 0; m < n; m++)
            {
                for (int j = 0; j <= m; j++)
                {
                    result += Math.pow(2, j) * b;
                }
                System.out.print(result + " ");
                result = a;
            }
            System.out.println();
        });
    }
}
