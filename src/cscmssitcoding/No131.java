package cscmssitcoding;

import javax.swing.text.GlyphView;

class Factory{
    // Implement your Factory class here
    private double iron;
    private double copper;
    private double silver;
    private double gold;
    private static int circuitBoard;
    public Factory(double iron, double copper,double silver, double gold){
        this.iron=iron;
        this.copper=copper;
        this.silver=silver;
        this.gold=gold;
    }
    public void buildCircuitBoard(int num){
        silver -= num*2.0;
        gold -=num*0.01;
        copper -=num*5.0;
        circuitBoard+=num;
    }
    public double getSilver(){
        return silver;
    }
    public double getIron(){
        return iron;
    }
    public double getGold(){
        return gold;
    }
    public double getCopper(){
        return copper;
    }
    public int getCircuitBoard(){
        return circuitBoard;
    }
}


public class No131 {
    public static void main(String[] args) {
        Factory fac1 = new Factory(67,9,10,1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());

        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
      	System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}
