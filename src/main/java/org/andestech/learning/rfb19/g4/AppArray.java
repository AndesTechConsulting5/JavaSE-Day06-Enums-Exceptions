package org.andestech.learning.rfb19.g4;

import java.util.Arrays;
import java.util.Random;

public class AppArray {

    public static void printArray(int[] arr)
    {
        System.out.print("[");
        if(arr.length != 0)
            for(int i = 0; i<arr.length; i++)
            {
                System.out.print(arr[i] + ", ");
            }
        System.out.print("\b\b]\n");
    }


    public static int[] generateRandomArray(int N, int min, int max)
    {
        int[] arr = new int[N];

        for (int i=0; i<N; i++)
        {
          //  arr[i] = min + (int)((max - min)*(new Random().nextDouble()));
            arr[i] = min + new Random().nextInt(max-min);
        }

        return arr;

    }

    public static void main(String[] args)
    {

        int[] arr1;
        int arr2[];
        int[] arr3;


        int N =15;
        arr3 = new int[N];

        int[] arr = {11,2,32,-4,33,55}; //1
        arr1 = new int[10];

       // System.out.println(arr[4]);

        printArray(arr);
        System.out.println(Arrays.toString(arr));

        for(int d: arr) System.out.println(d);

        //----------------------------------

        System.out.println(new Random().nextInt(1000));
        for (int i =0; i<arr3.length; i++)
        {
            arr3[i] = 500 - new Random().nextInt(1000);
        }

        System.out.println(Arrays.toString(arr3));


        int[] newarr = generateRandomArray(5,-10,10);
        System.out.println(Arrays.toString(newarr));

    }


}
