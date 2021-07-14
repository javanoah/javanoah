import java.util.Locale;

public class HolaMundo{
    public static void main (String[] args) {
        String saludar ="Hola Mundo";
        System.out.println(saludar);
        System.out.println("Saludar =" + saludar.toUpperCase());


        String num = "10";
        int num1 =12;
        int num3 = 15;

        if (num1 == 12){
           // int num3 = 15;
            System.out.println(num3+"-----");
        }

        System.out.println(num3+"-----");
        // Entero - Integer
        //byte
        byte enteroByte =127;
        //short
        short enteroShort = 32767;
        //int
        //long

/*
byte (8 BITS - Límite 127) -127 a 127 (byte enteroByte =127;)

short (16 BITS - Límite 32767) -32767 a 32767 (short enteroShort = 32767;)

Genérico: int (32 BITS - Límite 2147483647) -2147483647 a 2147483647 (int enteroInt = 2147483647;)

long (64 BITS - Límite 9223372036854775807L) -9223372036854775807L A 9223372036854775807L (long enteroLong = 9223372036854775807L;)
        */
        float numFloat = 15.10f;
        System.out.println("NumFloat= " + numFloat);


        double numDouble = 1538.2e-18;
        System.out.println("numDouble = " + numDouble);

        boolean verdadero = true;
        boolean falso = false;

        if(falso){
            System.out.println("verdadero");

            char a='as';
            char _1 = '1';
            char saltoLinea ='\n';

            char c = '';
            System.out.println("c = " + c)


    }



}