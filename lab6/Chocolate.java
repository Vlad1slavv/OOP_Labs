package lab6;

public class Chocolate extends Sweets {
    public Chocolate(String n,int c,double w){
        super(n, c, w);

    }
    private String name = "Шоколадка";

    public String getInformation() {
        return "Тип "+ name + "  " + super.getInformation();
    }

}
