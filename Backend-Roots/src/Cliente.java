public class Cliente extends Admin{

String direccion;
int dni;

    public Cliente(String nombre, String apellido, int dni, String direccion, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.mail = mail;

    }

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, String password, String mail, String direccion, int dni) {
        super(nombre, apellido, password, mail);
        this.direccion = direccion;
        this.dni = dni;
    }

    public Cliente(String direccion, int dni) {
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
