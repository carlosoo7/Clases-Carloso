package Clase3;

public class Director extends Jefe {
    String empresa;
    public Director(String nombre, String apellido, int edad, String email, String telefono, String rango, String responsabilidad, String empresa) {
        super(nombre, apellido, edad, email, telefono, rango, responsabilidad);
        this.empresa = empresa;
    }

    @Override
    void caminar() {
        System.out.println("Soy de la empresa: " + this.empresa);
    }


}
