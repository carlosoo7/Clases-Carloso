package Clase2;

public class Ejercicios {
    public static void main(String[] args) {

        double[] notas = new double[5]; //array basico
        notas[0] = 1.0;
        notas[1] = 4.3;
        notas[2] = 3.2;
        notas[3] = 5.0;
        notas[4] = 3.4;

        double suma = 0;
        //Promedio
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];  //suma= suma+x
        }
        double promedio = (double) suma / notas.length;
        //System.out.println(promedio);


        //Numero Mayor
        double mayor = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            // System.out.println("recorrido numero: "+ i+ " el numero mayor hasta ahora es "+mayor);
        }
        double menor = 5.0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
            // System.out.println("recorrido numero: "+ i+ " el numero menor hasta ahora es "+menor);
        }


        //Invertir array
        double[] notasInvertidas = new double[notas.length];
        int contador = 0;
        for (int i = notasInvertidas.length - 1; i >= 0; i--) {
            notasInvertidas[contador] = notas[i];
            System.out.println(notasInvertidas[contador]);
            contador++;
        }

        String nombre = "Carlos Calderon";      // char letra = 'a'; //char letra2 = nombre.charAt(0);
        String[] separado = nombre.split(" ");


        char[] letras = new char[nombre.length()];


        for (int i = 0; nombre.length() > i; i++)
            letras[i] = nombre.charAt(i);



        String name = "Andres Tabares Calderon Jose Dias ";

        String[] separados = new String[name.length()]; // tamaño máximo
        String palabra = "";
        int contador3 = 0;

        for (int i = 0; i < name.length(); i++) {
            char letra = name.charAt(i);
            if (letra != ' ') {
                palabra += letra;
            } else {
                // cuando encuentra espacio guarda palabra
                if (!palabra.isEmpty()) {
                    separados[contador] = palabra;
                    contador3++;
                    palabra = "";
                }
            }
        }





    }
}
        //Tarea: Como separar una cadena de texto en diferentes string usando el espacio " " como separador Ejemplo:
        //String Nombre = Andres Tabares
        //Resultado....

        //  String[] NombresSeparado = new String[1];
        //  NombreSeparado[0] = Andres
        //  NombreSeparado[1] = Tabare





