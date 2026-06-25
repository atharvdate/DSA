package OOPS;

public class OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen(); //constructor
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.tip = 7;
        System.out.print(p1.tip);

    }
}

class Pen{
    String color;
    public int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
