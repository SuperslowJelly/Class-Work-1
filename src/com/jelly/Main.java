package com.jelly;

public class Main {

    public static void main(String[] args) {
        char[] lowerCase = new char[26];
        char[] upperCase = new char[26];
        int i = 0, c = 97;
        while (c <= 122) {
            lowerCase[i] = (char) c;
            upperCase[i] = (char) (c - 32);
            c++;
            i++;
        }

        int[] numbers = new int[26];
        StringBuilder output = new StringBuilder();
        i = 0;
        while (i < 26) {
            numbers[i] = i + 1;
            if (i == 0) output.append("┌────────────┐\n");
            output.append("│  ").append(String.format("%-2s", numbers[i])).append("  ").append(lowerCase[i]).append("  ").append(upperCase[i]).append("  │\n");
            if (i == 25) output.append("└────────────┘");
            i++;
        }
        System.out.print(output);
    }

}
