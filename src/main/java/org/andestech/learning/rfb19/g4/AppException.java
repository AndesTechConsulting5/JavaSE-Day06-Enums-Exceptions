package org.andestech.learning.rfb19.g4;

public class AppException {


 private static void printStack(Exception ex)
 {
     System.out.println(ex );
     for(StackTraceElement el: ex.getStackTrace())
     {
         System.out.println(el.getFileName() + ":" +
                 el.getClassName() + ":" +
                 el.getMethodName() + ":"+
                 el.getLineNumber());


     }


 }

  private static void testException(){
      int[] arr = {1,2,3};


      try {
          arr[3] = 22;

          System.out.println("End of try block");
      }
      catch (NullPointerException ex)
      {
      printStack(ex);
      }


  }

    public static void main(String[] args)
    {

        try{
        testException();}
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("---------------------------");
            printStack(ex);

        }

        System.out.println("+++++++++++++++++++++++++++++++");

        int a=1,b=2;
        try {
            b = 1/(a-1);
        }
        catch (ClassCastException ex){
            printStack(ex);
        }
        catch (Exception ex){
            printStack(ex);
            //----- // нельзя глотать исключения!!!!
            throw ex;
        }
        finally {
            // close ...
            System.out.println("finally");

    }

    //-------------------

        try{
            //net
            a = 1/(1-b);
        }
        finally {
            // free of resources
            System.out.println("");
        }

//....
//....
        System.out.println("End of main");
    }


}
