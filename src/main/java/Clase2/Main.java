package Clase2;


public class Main {
    public static void main(String[] args) {
         //int nota_1=10;
         //int nota_2=10;
         //int nota_3=10;
        int[] notas = new int[5]; //array basico
        notas[0]=10;
        notas[1]=20;
        notas[2]=30;

        int[] notas2 = {10,20,35}; //array de 3 pociciones ya declaradas
        notas2[0]=13; //cambio de dato

        int[][] notas3 = new int[5][5]; //array estilo matris (0,1), (0,2), (1,1), (1,2)
        notas3[0][0]=10;
        notas3[0][1]=20;
        notas3[0][2]=30;
        notas3[0][3]=40;



        String[] notas4 = new String[5]; //array de String
        notas4[0] = "a";

        for (int i = 0; i < notas4.length; i++) {
            System.out.println(notas4[i]); //da null las pociciones vacias
        }
        for(int i = 0; i < notas3.length; i++) {  //for dentro de for para array matris
            for(int j = 0; j < notas3.length; j++) {
                System.out.println(notas3[i][j]); //da 0 las pociciones vacias
            }
        }

        //FOR EACH

        for(String num:notas4) {
            System.out.println(num);
        }


        for(int[] num: notas3) { // recorrido 1 num = {1, 2, 3}
            for(int i: num) {
                System.out.println(i);
            }
        }

        //Ejemplo manejo de error pocicion fuera del array // ArrayIndexOutOfBounds
        try{
            System.out.println(notas2[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error valor de indice muy alto");
        }
    }
}