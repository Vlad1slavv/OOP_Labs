package com.company;

public class Text{
    public  Sentence [] sentences;

    public Text(String txt){
        String [] sentances_quantity = txt.split("(?<=[?!.])");
        sentences = new Sentence [sentances_quantity.length];
        for (int i = 0; i < sentances_quantity.length; i++) {
            sentences[i] = new Sentence(sentances_quantity[i]);
        }
    }

}