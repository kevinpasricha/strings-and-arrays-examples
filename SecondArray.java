import java.util.Scanner;

public class SecondArray {
    // SecondArray() - Shows how passing array
    // parameters works
    public static void main(String[] args) {
        int [] x = { 1, 2, 3, 4};
        
        // First use the scalar parameter
        myFunc(x[0]);
        
        for (int i = 0; i < x.length; i++)
            System.out.print(" " + x[i]);
        System.out.println();

        // Second use the array parameter
        myFunc(x);
        for (int i = 0; i < x.length; i++)
            System.out.print(" " + x[i]);
        System.out.println();
    }
    
    // myFunc() - The array method
    public static void myFunc(int [] a) {
        System.out.println("This is the array method.");
        for (int i = 0; i < a.length; i++)
             a[i] = 5 * (i + 1);
    }
    
    // myFunc() - The scalar method
    public static void myFunc(int a) {
        System.out.println("This is the scalar method.");
        a = 99;
    }
}
