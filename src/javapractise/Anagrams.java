package javapractise;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anagrams
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();

        Map<Character, Long> characterFrequency1 = input1.chars()  // creates an IntStream
                .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<Character, Long> characterFrequency2 = input2.chars()  // creates an IntStream
                .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        if(characterFrequency1.equals(characterFrequency2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }



}
