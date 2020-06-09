package com.company;

public class Word  {
    public Letter[] letter;
    public String wordd;
    public int quantity;
    public Word(String word){
        quantity = find(word);
        wordd = word;
        String [] splited_word = word.split("");
        letter = new Letter[splited_word.length];
        for (int i = 0; i < splited_word.length; i++) {
            letter[i] = new Letter(splited_word[i]);
        }
    }
    public static int find(String s) {
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.substring(i, i + 1).equalsIgnoreCase("a")) | (s.substring(i, i + 1).equalsIgnoreCase("e")) | (s.substring(i, i + 1).equalsIgnoreCase("y"))
                    | (s.substring(i, i + 1).equalsIgnoreCase("u")) | (s.substring(i, i + 1).equalsIgnoreCase("i")) | (s.substring(i, i + 1).equalsIgnoreCase("o")))
                k++;
        }
        return k;
    }
}