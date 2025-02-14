package TypeCasting;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        // System.out.print("Enter any num: ");
        // Scanner input=new Scanner(System.in);
        // float num=input.nextFloat();
        // System.out.println(num);

        //type casting
        int num=(int)(98.38f);
        System.out.println(num);//float to int

        //automatic type promotion in expressions

        // int a=257;
        // byte b=(byte)(a);// 257 % 256 = 1,   max value of byte is 256
        // System.out.println(b);

        byte a=40;
        byte b=50;
        byte c=100;
        int d= (a*b)/c;//value of byte exceeds by doing * therefore java automatically converts the byte to int for the calculation. and d is int here, therefore it is not giving an error, but if it was byte then it'll give error
        System.out.println(d);
    }
}
