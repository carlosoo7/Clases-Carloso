package Clase1;

 public class carro {

    int llanta;
    int Sillas;
    public String color;


    public carro(int llanta, int sillas, String color) {

        this.llanta = llanta;
        this.Sillas = sillas;
        this.color = color;

    }


    public String Informacion (){
        String informacion ="El carro tiene " + llanta+ " llantas y tiene  "+ Sillas + " Sillas de color " + color;
        return informacion;
    }




}
