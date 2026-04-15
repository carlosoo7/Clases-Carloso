package Clase3;

public class Persona {
    String nombre;
    private String apellido;
    private int edad;
    String email;
    private String telefono;

    void saludar() {
        System.out.println("HOLA SOY: " + nombre);
    }

    void informacionGeneral() {
        System.out.println("Tengo: " + edad + " mi email es: " + email + "Nombre: " + nombre + " Apellido: " + apellido);
    }

    void caminar(){
        System.out.println("Estoy caminando y soy: " + nombre);
    }



    public Persona(String nombre, String apellido, int edad, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        for (int i = 0; i < telefono.length(); i++) {
            if ((telefono.charAt(i) != '0') && (telefono.charAt(i) != '1') && (telefono.charAt(i) != '2') && (telefono.charAt(i) != '3') && (telefono.charAt(i) != '4') &&
                    telefono.charAt(i) != '5' && telefono.charAt(i) != '6' && telefono.charAt(i) != '7' && telefono.charAt(i) != '8' && telefono.charAt(i) != '9') {
                System.out.println("Telefono deben ser solo numeros");
            } else {
                this.telefono = telefono;
            }
        }
        System.out.println("Persona Creada nombre: " + nombre);
    }

    public Persona(String nombre, String apellido, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        System.out.println("Persona Creada nombre: " + nombre + " Sin Telefono");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws NoSuchFieldException {
        if (email.contains("@") && email.contains(".") && !email.contains("Hotmail.com")) {
            this.email = email;
            System.out.println("Email Creado " + email);
            return;
        }else if (email.contains("Hotmail.com")){
            throw new NoSuchFieldException("Email con dominio incorrecto");
        }

        throw new NoSuchFieldException("El email le faltan cositas");

    }

    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString(){
     System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + telefono);

        return null;
    }

}