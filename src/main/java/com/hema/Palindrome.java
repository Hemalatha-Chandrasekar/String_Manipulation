package com.hema;

public class Palindrome {
    public static void main(String[] args) {
        String x = "aradhya brilliance center";
        char y[] = x.toCharArray();
        int size = y.length;
        y[0] = (char) (y[0] - 32);
        int i = 1;
        while (i != size) {
            if (y[i] == ' ') {
                y[i + 1] = (char) (y[i + 1] - 32);
            }
            ++i;
        }
        System.out.println(x);
        System.out.println(y);


    }
}
