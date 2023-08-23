package org.example;

import java.util.Scanner;

public class ReverseAString {

    // ***********************************************
    // Using For Loops: 3 of them.
    // ***********************************************

    //Using concatenation ('+' operator)
    public static String method1a(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = sc.nextLine();
        int len = str.length();
        String rev = "";
        //starting from the first character    OR        (Reversed For-Loop) starting from the last character
        for(int i = 0; i < len; i++) {                  // for(int i = len -1; i>= 0; i--){
            rev = str.charAt(i) + rev;                   // rev += str.charAt(i); }
        }
        return rev;
    }

    //Using concatenation (charArray)
    public static String method1b(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = sc.nextLine();
        char[] a = str.toCharArray();
        int len = a.length;
        String rev = "";
        //starting from the first character    OR        (Reversed For-Loop) starting from the last character
        for(int i = 0; i < len ; i++){                  //  for(int i = len -1; i>= 0; i--){
            rev = a[i] + rev;                            //   rev += a[i]; }
        }
        return rev;
    }



    public static String method1c(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = sc.nextLine();
        char[] a = str.toCharArray();
        int len = a.length;
        String rev = "";
        //starting from the first character    OR
        for(int i = 0; i < len ; i++){
            rev = rev + a[a.length - i - 1];
        }
        return rev;
    }

    // ***********************************************
    // Using StringBuffer And StringBuilder
    // ***********************************************


    //Using StringBuffer
    public static String method2a() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    //Using StringBuilder
    public static String method2b(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // ***********************************************
    // Using the recursion
    // ***********************************************

    public static String recursiveStr(String str){
        //Terminating condition or Base case
        if(str == null || str.length() <= 1){
            return str;
        }
        //recursive call
        return recursiveStr(str.substring(1)) + str.charAt(0);
    }



    public static void main(String[] args) {
        String str = "ADELEKE";
        System.out.println(recursiveStr(str));
        System.out.println(method1a());
        System.out.println(method1b());
        System.out.println(method2a());
        System.out.println(method2b(str));
        System.out.println(method1c());
    }
}
