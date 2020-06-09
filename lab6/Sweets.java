package lab6;

public class Sweets {
    private int contain;
    private double weight;
    private String name_sw;
    public Sweets (String name, int с , double w){
        name_sw=name;
        contain=с;
        weight=w;
    }
    public int getContain(){
        return contain;
    }
    public double getWeight(){
        return weight;
    }
    public String getName() {
        return name_sw;
    }
    public String getInformation(){
        return "Name:" +name_sw+" Contain:"+String.valueOf(contain)+" Weight:"+String.valueOf(weight);
    }
}
