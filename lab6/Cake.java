package lab6;

public class Cake extends Sweets {
    public Cake(String n,int c,double w){
        super(n, c, w);

    }
    private String name = "Торт";

    public String getInformation() {
        return "Тип "+ name + "  " + super.getInformation();
    }

}
