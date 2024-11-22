package com.Varun;

public class Main {

    public static void main(String[] args) {
                System.out.println("Hello world!");
                String word = "Hello World!";
                char[] hello_Array = {'H','E','L','L','O'};
                String hello_String = new String(hello_Array);
                System.out.println(hello_String);
                System.out.println(hello_String.length());
                String inputString = "My name is Varun";
                int len = inputString.length();

                char[] x = new char[len];
                char[] chars = new char[len];

        for (int i = 0; i < len; i++){
            x[i] = inputString.charAt(i);
        }

        for (int j = 0; j < len; j++){
            chars[j] = x[len-1-j];
        }

        int flg = 0;
        for(int i = 0; i < len; i++){
            if(x[i] != chars[i]){
                flg = 1;
                break;
            }
        }
        if(flg == 1){
            System.out.println("not a palindrome");
        } else {
            System.out.println("It is a palindrome");
        }


    }
}