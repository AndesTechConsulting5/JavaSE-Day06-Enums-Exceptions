package org.andestech.learning.rfb19.g4;

public enum Colors {

    Red(255,0,0),
    Green(0,255,0),
    Blue(0,0,255);

    private int r,g,b;

    public int getR(){return r;}
    public int getG(){return g;}
    public int getB(){return b;}

    Colors(int r, int g, int b){
        System.out.println("+++ enum, " + this);
        this.r = r;
        this.g = g;
        this.b = b;

    }


}
