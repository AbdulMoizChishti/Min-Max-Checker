/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax;

/**
 *
 * @author Abdul Moiz Chishti
 */
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
        System.out.print("Enter First Number: ");
    int a=obj.nextInt();
    System.out.print("Enter Second Number: ");
    int b=obj.nextInt();
    System.out.print("Enter third Number: ");
    int c=obj.nextInt();
    if(a>b){
        if(a>c){
            System.out.println(a+" is greater");
            if(c>b){
                System.out.println("b is smaller");}
            else{
                System.out.println("c is smaller");
            }
        }
    }
    else if(b>c){
        System.out.println(b+" is greater");
        if(c>a){
            System.out.println(a+" is smaller");
        }
        else{
            System.out.println(c+" is smaller");
        }
    }
    else{
        System.out.println(c+" is greater");
        
    if(b> a){
        System.out.println(a+" is smaller");
    }
    else{
        System.out.println(b+" is smaller");}
    
    }
}
}