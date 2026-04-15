package Clase3;

public class Jefe extends Persona{

    private String rango;
    private String responsabilidad;

    public Jefe(String nombre, String apellido, int edad, String email, String telefono,
                String rango, String responsabilidad) {
        super(nombre, apellido, edad, email, telefono); // llama al constructor padre
        this.rango = rango;
        this.responsabilidad = responsabilidad;
    }
    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }
    public String getResponsabilidad() {
        return responsabilidad;
    }
    public void setResponsabilidad(String responsabilidad) {
        this.responsabilidad = responsabilidad;
    }
    @Override
    void informacionGeneral(){
        System.out.println("Tengo: " + super.getEdad() + "Nombre: " + super.getNombre() + " Apellido: " + super.getApellido());
    }

}
