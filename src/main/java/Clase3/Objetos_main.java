package Clase3;

public class Objetos_main {
    public static void main(String[] args) {
      //  Persona carlos = new Persona("Carlos", "Calderon", 23, "cfcalderonm@ut.edu.co","3108577037");        carlos.informacionGeneral();
       // Persona jose = new Persona("Jose", "Calderon", 23, "cfcalderonm@ut.edu.co","3108577037");

        //String email = carlos.getEmail();

       // try {
        //    carlos.setEmail("carlos047@Hotmailcom");
       // } catch (NoSuchFieldException e) {
         //   System.out.println(e.getMessage());
      //  }
      //  carlos.informacionGeneral();

      Jefe andres = new Jefe("Andres", "Tabares", 27, "adtaba@gmail.com","3102577037","Jefe administrativo", "El que administra");
        andres.caminar();
        andres.saludar();
        andres.informacionGeneral();

        Director carloso = new Director("carloso", "Tabares", 27, "adtaba@gmail.com","3102577037","Jefe administrativo", "El que administra", "Taba y asociados");
        carloso.caminar();
        carloso.saludar();
        carloso.informacionGeneral();


        System.out.println(carloso.toString());

    }



}
