import javax.swing.*;
import java.util.Scanner;

public class Main {

    //MENU
    //NO LOGRE TERMINAR EL MENU, DEBIDO A QUE ME DIO ERRORES, AUN ESTOY INVESTIGANDO EL POR QUE.


    //EJERCICIOS IF-ELSE
    //Ejercicio 1) edad
    /*public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("¿Cuál es tú edad?:");
        int edad = Integer.parseInt(teclado.nextLine());
        if (edad>18)
        {
            System.out.print("Eres mayor de edad");
        }
        else
        {
            System.out.print("Eres menor de edad");

        }
    }*/



    //Ejercicio 2) numero mayor

       /* public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n1, n2;

            System.out.print("Introduzca primer número: ");
            n1 = sc.nextInt();
            System.out.print("Introduzca segundo número: ");
            n2 = sc.nextInt();

            if (n1 > n2) {
                System.out.println("El mayor es " + n1);
            } else if (n1 < n2) {
                System.out.println("El mayor es " + n2);
            } else {
                System.out.println("Los números son iguales");
            }
        }*/



    //Ejercicio 3) numero par
    /*public static void main( String[] args )
    {
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.printf( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR" );
        }
        else
        {
            System.out.printf( "ES IMPAR" );
        }
    }*/



    //EJERCICIOS FOR-WHILE
    //Ejercicio 4) factorial
    /*public static void main(String[] args) {
        int n;
        double factorial = 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un numero entero >= 0: ");
            n = sc.nextInt();
        } while (n < 0);


        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        //mostrar el resultado
        System.out.printf("%d! = %.0f %n", n, factorial);
    }*/



    //Ejercicio 5) numeros impares FOR
    /*public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero mayor a 10 y menor a 30: ");
        numero = teclado.nextInt();

        if (numero >= 10 && numero <= 30){
            System.out.println("Los numeros impares hasta ese numero son: ");
            for (int num = 1; num <= numero; num += 2) {
                System.out.print(num + ", ");
            }

        }else{
            System.out.println("Debe ser un numero entre 10  y 30");
        }
    }*/



    //Ejercicio 6) numeros impares WHILE
    /*public static void main(String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero mayor a 10 y menor a 30: ");
        numero = teclado.nextInt();

        if (numero >= 10 && numero <= 30) {
            System.out.println("Los numeros impares hasta ese numero son: ");
            int num = 1;
            while (num <= numero) {
                System.out.print(num + ", ");
                num += 2;
            }

        } else {
            System.out.println("Debe ser un numero entre 10  y 30");
        }
    }*/


    
    //EJERCICIOS SWITCH
    //Ejercicio 7) dias de la semana
   /* public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.print("Escribe un numero entre 1 y 5: ");

        int dia = teclado.nextInt();

        String NDia = "";

        switch(dia){

            case 1:

                NDia = "El 1 corresponde a Lunes";

                break;

            case 2:

                NDia = "El 2 corresponde a Martes";

                break;

            case 3:

                NDia = "El 3  corresponde a Miercoles";

                break;

            case 4:

                NDia = "El 4 corresponde a Jueves";

                break;

            case 5:

                NDia = "El 5 corresponde a Viernes";

                break;

            default:

                NDia = "El numero de dia no es valido";

                break;

        }

        System.out.println(NDia);

    }*/

}
































