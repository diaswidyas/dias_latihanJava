/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjumlahan;

/**
 *
 * @author user
 */
public class Fibonacci {
    public static void main(String[] args){
        int fibonacciDeret=10;
        int a=0;
        int b=1;
        for(int i=1;i<= fibonacciDeret;i++){
            System.out.println("Fibonacci:"+a);
            a=a+b;
            b=a-b;
        }

                    
            
        }
    }
    

