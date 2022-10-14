public class Admin {
    String nombre;
    String apellido;
    String mail;
    String password;

    public Admin(String nombre, String apellido,String password, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
    }

    public Admin() {

    }
    public String getPassword(){ return password;}

    public void setPassword(String password){ this.password=password;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
