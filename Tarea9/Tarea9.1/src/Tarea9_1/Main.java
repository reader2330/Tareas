package Tarea9_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Usuario> usuarios = new ArrayList<>();

        Conexion conn = new Conexion();

        conn.Connect();

        usuarios = conn.listar();

        for (int i = 0; i<usuarios.size();i++) {

            System.out.println(usuarios.get(i).toString());


        }


        System.out.println(conn.Insertar());


    }

}
