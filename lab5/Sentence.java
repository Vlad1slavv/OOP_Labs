package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Sentence{
    Punctuation [] punctuation;
    public Word[] Word;
    public  String sentt;
    public  int qunt;
    public Sentence (String sent){
        sentt = sent;
        String punctuation_symbols = ".!,-?";
        sent = sent.replaceAll("[\\s]{2,}", " ");
        String [] splited_sentence = sent.split("(?=,|\\.|\\,|\\S+\\-+\\s|!|\\?)|\\s");
        int counter_Punctuation = 0;
        int counter_Word = 0;
        for (int i = 0; i < splited_sentence.length; i++) {
            if(punctuation_symbols.contains(splited_sentence[i])){
                if(!splited_sentence[i].equals("")){
                    punctuation = addPunctuation(counter_Punctuation, punctuation, splited_sentence[i]);
                    counter_Punctuation+=1;
                }

            }
            else{
                Word = addWord(counter_Word, Word, splited_sentence[i]);
                counter_Word+=1;
            }
        }


        qunt=counter_Word;
        Arrays.sort(Word, new sort() );
    }
    public static Punctuation[] addPunctuation(int n, Punctuation[] arr, String x)
    {
        int i;

        // create a new array of size n+1
        Punctuation[] newarr = new Punctuation[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = new Punctuation(x);

        return newarr;
    }
    public static Word[] addWord(int n, Word[] arr, String x)
    {
        int i;

        // create a new array of size n+1
        Word[] newarr = new Word[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = new Word(x);

        return newarr;
    }

}
class sort implements Comparator<Word> {
    @Override
    public int compare(Word o1, Word o2) {
        return o1.quantity - o2.quantity;
    }
}