package javapractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Challenge3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        IntStream.range(0, 3).forEach(i -> inputs.add(scanner.nextLine()));

        System.out.println("================================");

        inputs.forEach(i->{
            String[] sI = i.split(" ");
            int charSizeOfString = sI[0].length();
            int charSizeOfNumber = sI[1].length();

            String resultNum = switch (charSizeOfNumber){
                case 1 -> "00"+sI[1];
                case 2 -> "0"+sI[1];
                case 3 -> sI[1];
                default -> throw new IllegalStateException("Unexpected value: " + charSizeOfNumber);
            };
            String a="";
            for(int j =1; j<=15-charSizeOfString; j++){
                a+=" ";
            }
            System.out.println(sI[0]+a+resultNum);
        });
        System.out.println("================================");

    }
}
