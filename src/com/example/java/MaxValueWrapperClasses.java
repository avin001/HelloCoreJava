package com.example.java;

public class MaxValueWrapperClasses {

    public static void main(String[] args) {

        // Check Byte MAX_VALUE
        byte b = 127;
        System.out.println("Byte " + b);
        b++;
        System.out.println("Byte " + b);
        b = 127;

        if(b < Byte.MAX_VALUE) {
            b++;
        }

        System.out.println("Byte " + b);
        System.out.println(Byte.MIN_VALUE);

        // Check Short MAX_VALUE
        short sh = 32767;
        System.out.println("Short " + sh);
        sh++;
        System.out.println("Short " + sh);
        sh = 32767;

        if(sh < Short.MAX_VALUE) {
            sh++;
        }

        System.out.println("Short " + sh);
        System.out.println(Short.MIN_VALUE);

        // Check Integer MAX_VALUE
        int i = 2147483647;
        System.out.println("Integer " + i);
        i++;
        System.out.println("Integer " + i);
        i = 2147483647;

        if(i < Integer.MAX_VALUE) {
            i++;
        }

        System.out.println("Integer " + i);
        System.out.println(Integer.MIN_VALUE);

        // Check Long MAX_VALUE
        long l = 9223372036854775807L;
        System.out.println("Long " + l);
        l++;
        System.out.println("Long " + l);
        l = 9223372036854775807L;
        if(l < Long.MAX_VALUE) {
            l++;
        }

        System.out.println("Long " + l);
        System.out.println(Long.MIN_VALUE);

        // Check Character MAX_VALUE
        char c = 65535;
        System.out.println("Character Max Value " + Character.MAX_VALUE);
        System.out.println(Character.MAX_VALUE + 0);
        System.out.println(Character.MAX_VALUE - 1);
        /* Character.MAX_VALUE does not print the Max Value of char(Which is 65535) but MAX_VALUE+0 or MAX_VALUE-1 does.
        This is because on line no. 64, Character.MAX_VALUE is concatenated with the String.
        The string concatenation operator +, which, when given a String operand and an integral operand, will convert
        the integral operand to a String representing its value in decimal form, and then produce a newly created
        String that is the concatenation of the two strings. As Character.MAX_VALUE is not printable, you don't see it.
        When you are doing a subtraction with an int, the whole expression is casted to int and it prints an int value.
        ************************************************************************************************
        Reference URL: https://stackoverflow.com/questions/23413497/how-to-print-max-value-of-character
        ************************************************************************************************
         */
        System.out.println("Char " + c);
        c++;
        System.out.println("Char " + c);
        c = 65535;

        if(c < Character.MAX_VALUE) {
            c++;
        }

        System.out.println("Char " + c);
        System.out.println(Character.MIN_VALUE);

        // Check Float MAX_VALUE
        float f = 3.4028235E38f;
        System.out.println("Float " + f);
        f++;
        System.out.println("Float " + f);
        f = 3.4028235E38f;

        if(f < Float.MAX_VALUE) {
            f++;
        }

        System.out.println("Float " + f);
        System.out.println(Float.MIN_VALUE);

        // Check Double MAX_VALUE
        double d = 1.7976931348623157E308;
        System.out.println("Double " + d);
        d++;
        System.out.println("Double " + d);
        d = 1.7976931348623157E308d;
        if(d < Double.MAX_VALUE) {
            d++;
        }

        System.out.println("Double " + d);
        System.out.println(Double.MIN_VALUE);



    }
}
