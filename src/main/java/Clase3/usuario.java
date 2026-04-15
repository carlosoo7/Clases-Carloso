package Clase3;

public class usuario extends Persona {

    public usuario(String nombre, String apellido, int edad, String email, String telefono){
        super(nombre, apellido, edad, email, telefono); // llama al constructor padre

    }
    
    //dale un nuevo variable como tipo de usuario y sobreescribe el metodo inforacion
    // para dar toda la info posible (falta telefono y tipo de usuario) y que aparezca en el main
    // hacerle set y get a tipo de ususario y que en el set se verifique si el usuario es "vip" o "regular"
    //en caso contrario que se lance una excepcion con mensaje personalizado

}
