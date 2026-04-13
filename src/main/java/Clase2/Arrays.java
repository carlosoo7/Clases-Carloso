package Clase2;
import Clase1.carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {

        ArrayList<carro> carros = new ArrayList<>();

        carros.add(new carro(4,6,"Rojo"));
        carros.add(new carro(5,7,"Azul"));
        carros.add(new carro(3,8,"Rojo"));


        carro carro = new carro(5,7,"Azul");

       // carros.removeIf(c -> carro.color.equals("Rojo"));

       // carros.remove(0);

        carros.forEach(x -> {if (x.color.equals("Rojo")){System.out.println(x.Informacion());}});



        //HashMap
        HashMap<String, String> Usuarios = new HashMap<>();

        Usuarios.put("Carlosoo7","Admin");
        Usuarios.put("Andres","Usuario");

        System.out.println(Usuarios.get("Carlosoo7"));

        System.out.println(Usuarios.containsKey("Carlosoo7"));

        for(String num:Usuarios.keySet()){

            System.out.println(num +  "->" + Usuarios.get(num));
        }

        String user = "Carlosoo7";
        String pass ="Admin";

        if(Usuarios.containsKey(user) && Usuarios.get(user).equals(pass)){
            System.out.println("ACCESO CONCEDIDO " + user);
        }else{
             System.out.println("NO ACCESO CONCEDIDO error en credenciales" );
        }

        HashSet<String> Usuarios2 = new HashSet<>();
        Usuarios2.add("Carlosoo7");
        Usuarios2.add("Carlosoo7");
        Usuarios2.add("Andres");

        if(Usuarios2.contains(user)){
            System.out.println("No puede usar ese usuario porque ya existe");
        }
        System.out.println(Usuarios2);

    }
}
