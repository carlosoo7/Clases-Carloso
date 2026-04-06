package Clase1;

public class carro {
    int llanta;
    int Sillas;
    String color;



    carro(int llanta, int sillas, String color) {

        this.llanta = llanta;
        this.Sillas = sillas;
        this.color = color;

    }


    String Informacion (){
        String informacion ="El carro tiene " + llanta+ " llantas y tiene  "+ Sillas + " Sillas de color " + color;
        return informacion;
    }




}
