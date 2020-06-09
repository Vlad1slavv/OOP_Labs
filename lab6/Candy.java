package lab6;

public class Candy extends Sweets {
    public Candy(String n,int c,double w){
        super(n, c, w);

    }
    private String name = "Цукерка";

    public String getInformation() {
        return "Тип "+ name + "  " + super.getInformation();
    }
}
