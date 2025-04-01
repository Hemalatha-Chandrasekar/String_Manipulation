package com.hema;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String x = "ABC tech";
        System.out.println(x.length());
        System.out.println(x);
        System.out.printf("%c", x.charAt(6));

        x = x.concat("\0");
        char y[] = x.toCharArray();
        int count = 0;
        int i = 0;
        while (y[i] != '\0'){
            ++count;
            ++i;
        }
        System.out.printf("%d", count);


    }
    StringReverse stringReverse = new StringReverse();


}