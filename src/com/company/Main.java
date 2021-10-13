package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int Answer = 0;
    int column = 0;
    System.out.println("enter your bit values right to left");
    for (int i = 0; i <4; i++) {
        System.out.println(i + ": ");
        int BitValue = input.nextInt();
        if (i==0) {
            column = 1;
        }
        if (i==1) {
            column = 2;
        }
        if (i==2) {
            column = 4;
        }
        if (i==3) {
            column = 8;
        }
        int BinaryValue = (column * BitValue);
        Answer = (Answer + BinaryValue);
    }
    System.out.println("your decimal value is: " + Answer);








    }
}
