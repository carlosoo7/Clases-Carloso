package Clase4;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

        String ruta_archivo;
        File archivo = new File("src/resource/datos.txt");

        if(archivo.exists()){
            System.out.println("Archivo encontrado");
            System.out.println(archivo.getAbsolutePath());
            ruta_archivo = archivo.getAbsolutePath();
        }
        else {
            try {
                archivo.createNewFile();
                System.out.println("Archivo creado: " + archivo.getAbsolutePath());

            } catch (IOException e) {
                System.out.println("Error al crear el archivo" + e.getMessage());
            }
        }
            FileWriter editor_archivo = new FileWriter("src/resource/datos.txt", true);
            editor_archivo.write("\n"+"Hola Mundo\n" );
            editor_archivo.write("Hola Nuevo Mundo");
            editor_archivo.close();

            BufferedReader lector = new BufferedReader(new FileReader("src/resource/datos.txt"));

            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();


    }
}
