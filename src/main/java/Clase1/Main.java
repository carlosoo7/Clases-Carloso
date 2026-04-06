package Clase1;

import java.util.Scanner;

public class Main {
    static void main() {
       // byte numero = 0;
       // short numero2 = 0;
       // int contador = 0;
       // long contadorgrande = 0;
       // double contadorrande = 0.2;

      // carro toyota = new carro(4, 4, "Negro");
       // carro susuki = new carro(8, 5, "Blanco");

       // System.out.println(toyota.Informacion());
        // System.out.println();
        double numero1 = 0;
        double numero2 = 0;
        int rUsuario = 1;
        double resultado = 0;
        Calculos calculadora = new Calculos();
        do {
            Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Bienvenido a caluladora 1 para sumar 2 para restar escriba 0 para salir");

                rUsuario = sc.nextInt();

                if (rUsuario == 0) { // ==, &&, <,>, ||
                    System.out.println("GRACIAS POR USAR NUESTRA CALCULADORA");
                    System.exit(0);
                }
                System.out.println("por favor digite el primer numero...");
                numero1 = sc.nextInt();
                System.out.println("sigite el segundo numero");
                numero2 = sc.nextInt();
            }catch(Exception e){
                System.out.println(e);
                continue;
            }
            switch (rUsuario) {
                case 1: resultado= calculadora.sumar(numero1, numero2); break;

                case 2: resultado= calculadora.restar(numero1, numero2); break;

                case 3:
                    do {
                        System.out.println("Ingrese el numero correcto para numero 2");
                        numero2 = sc.nextInt();
                    }while(numero2==0);
                    resultado= calculadora.dividir(numero1, numero2); break;

                case 4: resultado= Math.pow(numero1,numero2); break;

                //Math.sqrt(numero1);
                //Math.max(numero1,numero2);
                //Math.min(numero1,numero2);
                //Math.floor(numero1);
                //Math.random();
                //Math.sin(numero2);
        }

            System.out.println("Su resultado es: " + resultado);

        }while(true);
    }

}
