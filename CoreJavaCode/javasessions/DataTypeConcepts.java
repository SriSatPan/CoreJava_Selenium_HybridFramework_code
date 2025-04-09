package javasessions;

public class DataTypeConcepts {

    public static void main(String[] args) {

        //Data Types.

        //1. Primitive Data Type - Takes space in the memory - with out Object.
        // 1. boolean Type : true/false.

        //boolean
        // size : ~ 1 bit.


        boolean flag = true;
        boolean flags = false;
        
        System.out.println(flag);
        System.out.println(flags);

        // 2. numeric Type .
        //a. character type: char.

        //a.char.
        //size: 2 bytes = 16 bits. //it can take symbolic values as well because of 16 bits.
        char ch = 'a'; // a-z, A-Z.
        char ci = '1'; //0-9. No negative value since 2 characters not allowed.
        char cy = '$'; // all special chars

        System.out.println(cy);
        System.out.println(ch);
        System.out.println(ci);

        //b. Integral Value:
        //b.1: Integer: byte, short, int, long.


        //b.1 byte
        //size: 1 byte = 8 bits.
        //range: -128 to 127. (-2^7 to 2^7-1).

        byte b = 10;
        b = 30;
        byte c = -128;
        byte d = 127;
        int total = b + c + d;
        System.out.println(total);

        //b.1 short
        //size:2 bytes = 16 bits.
        //range: -32768 to 32767.   (-2^15 to 2^15-1).

        short s = 128;
        short e = -32768;
        short f = 32767;
        
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);

        //b.1 int
        //size: 4 bytes = 32 bits.
        //range: -2147483648 to 2147483647  (-2^31 to 2^31 -1).

        int i = 32768;
        int x = 2147483647;
        int y = -2147483648;
        
        System.out.println(i);
        System.out.println(x);
        System.out.println(y);

        //b.1 long
        //size: 8 bytes = 64 bits.
        //range: (-2^63 to 2^63 -1).

        long p = 2147483647;
        long l = 9223372036854775807l;
        long o = -9223372036854775808L; // not recommended - use strings for long no's which are nor used in calculations
        
        System.out.println(p);
        System.out.println(l);
        System.out.println(o);

        //BigInteger classes for heavy no's larger than long.More than 8 bytes.


        //b.2: Floating-point: float, double

        //b.2 float
        //size: 4 bytes = 32 bits.
        //range: after . it can take up to 7 digits.

        float f1 = 12.33f;
        float f2 = 232356354265.2F;
        float f3 = (float) 345.23;
        float f4 = 100; //100.0
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        

        //b.2 double
        //size: 8 bytes = 64 bits.
        //range: after . it can take up to 15 digits.

        double g = 12.333;
        System.out.println(g);

        //BigDecimal classes for no's higher than double


        //2. Non Primitive Data Types - With Object takes space in the memory. example: Array, String, Classes, Interface ---OOP


    }

}
