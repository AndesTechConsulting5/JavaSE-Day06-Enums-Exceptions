package org.andestech.learning.rfb19.g4;

enum Days
{
    Good, Bad, Ordinary, Супер, Таксебе, Выходной
}


public class AppEnum
{

    private enum Apples{App1, App2, App3 }




    private static void checkDay(Days days){

        switch (days)
        {
            case Bad:
                System.out.println("Вторник... bad?"); break;
                //
            case Good:
                System.out.println("Monday.. Good?"); break;
                //
            case Выходной:
                System.out.println("Saturday... fine?"); break;
                //


        }



    }

    private static void testCircle(final Circle circle, int delta)
    {
       // circle = new Circle(222);
       //

        delta =22;


        circle.r =13123 + delta;


    }

    public static void main( String[] args )
    {

      Days ds = Days.Выходной;
        System.out.println(ds.ordinal() + " : " + ds.name());

      Apples apples = Apples.App3;

      checkDay(ds);

      for(Days d : Days.values())
      {
          System.out.println(d);
      }

        System.out.println("----------------------- Colors -------------");


      Colors color= Colors.Blue;
       System.out.println(color.getR() +":"+ color.getG() + ":" + color.getB() );

        System.out.println("----------------------- FinalTest-------------");

        System.out.println(new Ellipse().getExtraData());

        System.out.println("----------------------- Inner Classes -------------");

       // Circle.BackGround bg = new Circle().new BackGround();
       // Circle.BackGround bg = new Circle.BackGround();

    }
}
