package lab6;

public class Pie extends Sweets {
    public Pie(String n,int c,double w){
        super(n, c, w);

    }
    private String name = "Пиріг";

    public String getInformation() {
        return "Тип "+ name + "  " + super.getInformation();
    }
}
