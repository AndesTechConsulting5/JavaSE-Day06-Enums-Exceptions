package org.andestech.learning.rfb19.g4;

//class BackGround{
//    int aa,bb;
//
//}


public class Circle {
    int r;

    public Circle(int r){
this.r = r;
    }

    public Circle(){}   // 1.

    public final String getExtraData() {
    return "DATA 67657623";

    }

  private static class BackGround{
        int aa,bb;

   }

   BackGround bg;
}


class Ellipse extends Circle{

    public String getExtraData2() {
        return "DATA2";
    }


}