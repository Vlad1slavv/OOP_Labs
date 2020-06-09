package com.company;

public class Main {
    public static void main(String[] args) {
        String sr = new String("Crew, Dragon, is the future, of space. technologies hdfg fd aer jdfge. ads hfh dfkju!");
        Text txt = new Text(sr);
        for(int i = 0; i < txt.sentences.length; i++){
            System.out.println();
            for(int j = 0; j < txt.sentences[i].Word.length; j++){
                System.out.print(txt.sentences[i].Word[j].wordd + " ");


            }

        }
    }
}
