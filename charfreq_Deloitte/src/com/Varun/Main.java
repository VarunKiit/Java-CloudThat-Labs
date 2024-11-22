package com.Varun;

import java.util.Scanner;

class CharFreq{
    char ch;
    int freq;

    public CharFreq(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

public class Main {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input String: ");
        String inputString = sc.next();

        // characters -> upper case
        String UCI = inputString.toUpperCase();
        CharFreq[] charFreqPairs = new CharFreq[256];

        for (char c: UCI.toCharArray()){
            if(charFreqPairs[c] == null){
                charFreqPairs[c] = new CharFreq(c,1);
            }else{
                charFreqPairs[c].freq++;
            }
        }

        for (CharFreq pair: charFreqPairs){
            if (pair!=null){
                System.out.println(pair.ch+": "+ pair.freq);
            }
        }
    }
}
