package org.example;

public class Factorial {

    // ***********************************************
    // Using For Loop
    // ***********************************************

    public static int factorial(int num){
        int output = 1 ;
        for( int i = 1; i <= num ; i++){
            output = output * i ;
        }
        return output;
    }

    // ***********************************************
    // Using the recursion
    // ***********************************************

    public static int recursiveFactorial(int num){
        // 5! = 5 * 4!  Or n! = n * ( n-1)!

        //Base case
        if(num <= 1){
            System.out.println("factorial(" + num + ") = " + num);
            return num;
         }
        System.out.println("factorial(" + num + ") = " + num + " * factorial(" + (num - 1) + ")");
        return num * recursiveFactorial(num-1);
    }

    public static void main(String[] args) {
        //System.out.print( factorial(5));
        System.out.print( recursiveFactorial(10));
    }
}
