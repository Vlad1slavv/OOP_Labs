package lab6;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Sweets> sweets;

    public Basket(ArrayList<Sweets> sw) {
        sweets = sw;

    }

    public int getContainSweets(){
        int weight=0;
        for (Sweets sweet : sweets) {
            weight += sweet.getWeight();
        }
        return weight;
    }

    private void swap(ArrayList<Sweets> arr, int i, int j) {
        Sweets t = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, t);
    }
    public void sortSweets(ArrayList<Sweets> arr){
        for(int i = arr.size()-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr.get(j).getContain() > arr.get(j+1).getContain())
                    swap(arr, j, j+1);
            }
        }
    }

    public ArrayList<Sweets> getSweets(){
        return sweets;
    }
}
