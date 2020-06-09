package lab6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pie pie = new Pie("pie", 5, 700);
        Chocolate chocolate = new Chocolate("chocolate", 80, 90);
        Candy candy = new Candy("candy", 50, 10);
        Cake cake = new Cake("cake", 60, 1000);

        ArrayList<Sweets> sw = new ArrayList<Sweets>();
        sw.add(pie);
        sw.add(chocolate);
        sw.add(candy);
        sw.add(cake);
        for (Sweets sweets : sw) {
            System.out.println(sweets.getInformation());
        }

        if (isCorrectSweets(sw)) {
            Basket basket = new Basket(sw);
            System.out.print("Вага солодощів (гр): ");

            System.out.println(basket.getContainSweets());

            basket.sortSweets(sw);
            System.out.println("\nВідсортовані солодощі");
            for (int i = 0; i < sw.size(); i++) {
                System.out.println(( basket.getSweets().get(i)).getInformation());
            }
        }

        int minContain = 15; int maxContain =65;
        System.out.println("\nСолодощі з вибраного діапазону вмісту шоколаду: " + minContain
                + "-" + maxContain);

        for (int i = 0; i < sw.size(); i++) {
            if ((sw.get(i).getContain() >= minContain)
                    && (sw.get(i).getContain() <= maxContain)) {
                System.out.println(sw.get(i).getInformation());
            }
        }

    }

    public static boolean isCorrectSweets(ArrayList<Sweets> sw) {
        int q = 0;
        boolean bul = true;
        Sweets buf;
        for (Sweets sweets : sw) {
            q = 0;
            buf = sweets;
            for (Sweets swOne : sw) {
                if ((buf.getClass()).equals(swOne.getClass()))
                    q++;
            }
            if (q >= 2) {
                bul = false;
                break;
            }
        }
        return bul;
    }
}
