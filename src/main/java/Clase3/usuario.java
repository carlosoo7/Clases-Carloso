package Clase3;

public class usuario extends Persona {
    private String tipo_de_usuario;

    public usuario(String nombre, String apellido, int edad, String email, String telefono, String tipo_de_usuario) {
        super(nombre, apellido, edad, email, telefono); // llama al constructor padre
        this.tipo_de_usuario = tipo_de_usuario;

    }
    public String tipo_de_usuario() {
        return tipo_de_usuario;
    }
    public void setTipo_de_usuario(String tipo_de_usuario) { this.tipo_de_usuario = tipo_de_usuario; }
    }
    @Override
    void informacionGeneral(){
        System.out.println("Nombre: " + super.getNombre() + " Apellido: " + super.getApellido());

    }
    //dale un nuevo variable como tipo de usuario y sobreescribe el metodo inforacion
    // para dar toda la info posible (falta telefono y tipo de usuario) y que aparezca en el main
    // hacerle set y get a tipo de ususario y que en el set se verifique si el usuario es "vip" o "regular"
    //en caso contrario que se lance una excepcion con mensaje personalizado


