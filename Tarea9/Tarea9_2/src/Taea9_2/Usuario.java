package Taea9_2;

public class Usuario {
    private int id_usuario;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private int edad;





    public Usuario(int id_usuario, String nombre, String apellido_paterno, String apellido_materno , int edad) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.edad=edad;
    }


    public Usuario(){}

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){

        return "\n"+this.id_usuario+"\n"+this.nombre+"\n"+this.apellido_paterno+"\n"+this.apellido_materno;

    }



}
