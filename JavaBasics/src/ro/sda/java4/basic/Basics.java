package ro.sda.java4.basic;

import java.text.DecimalFormat;

public class Basics {

    public static void main(String[] args) {
        //double d=10.5678; //definim un double cu mai multi digiti dupa .
        //long l=100L;
        //for (int i = 0; i < 3; i++) {  //-> daca vrei sa printezi de 3 ori
           //System.out.println("Hello World!" + i);
           //System.out.format("Hello Java! %.2f \n" , d); //%.2f -> pentru  a printa primele 2 zecimale
                                                         // \n -> pentru a trece la o linie noua

            DecimalFormat decimalFormat=new DecimalFormat("#.##");
            String s1 = "String1", s2="String2", s3="String3";
            System.out.format("%-10s %-10s %-10s\n" , s1, s2, s3);
            boolean flag = true;
            System.out.println("Flag value is: " + String.format("%b", flag));




        }



    }

