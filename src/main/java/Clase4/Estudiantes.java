package Clase4;

import java.io.*;
import java.util.Scanner;

public class Estudiantes {
    public static void main(String[] args) throws IOException {
        String ruta_archivo;
        String NombreArchivo= "/datos_estudaiantes";
        File archivo = new File("src/resource" + NombreArchivo);

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
        String Respuesta="";
        FileWriter editor_archivo = new FileWriter("src/resource"+NombreArchivo, true);
        Scanner scan = new Scanner(System.in);


        System.out.println("Ingrese el estudiante,codigo");
        Respuesta = scan.nextLine();
        editor_archivo.write("\n"+Respuesta);
        editor_archivo.close();


        BufferedReader lector = new BufferedReader(new FileReader("src/resource"+NombreArchivo));
        String linea;
        String[] datos = new String[10];

        while ((linea = lector.readLine()) != null) {
            datos = linea.split(",");
            System.out.println("Nombre: "+datos[0] + " Codigo:" + datos[1]);
        }
        lector.close();
    }
}
