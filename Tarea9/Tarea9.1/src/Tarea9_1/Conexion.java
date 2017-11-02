package Tarea9_1;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conn = null;
    PreparedStatement pr = null;
    ResultSet rs;

    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "luis2330";
    private static String base = "tarea9";
    private static String servidor = "jdbc:mysql://localhost:3306/";
    private static String completa = servidor+base;

    public Connection Connect(){


            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(completa, user, password);

            }catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                conn = null;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                conn = null;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                conn = null;
            } finally {
                JOptionPane.showMessageDialog(null, "Conexión Exitosa");
                return conn;
            }

        }



    public ArrayList<Usuario> listar(){

        Conexion conex = new Conexion();

        ArrayList<Usuario> usuarios = new ArrayList<>();
        String sql = "select * from usuarios";

        try{

            pr= conn.prepareStatement(sql);
            rs = pr.executeQuery();

            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setId_usuario(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellido_paterno(rs.getString(3));
                usuario.setApellido_materno(rs.getString(4));
                usuario.setEdad(rs.getInt(5));

                usuarios.add(usuario);
            }


        }catch (SQLException ex){

            System.out.println("Error:"+ ex.getMessage());

        }
        return usuarios;
    }


    public String Insertar(){

        Usuario usuario = new Usuario();
        usuario = usuario.creaUsario();

        String result = null;
        String sql ="INSERT INTO usuarios VALUES (?,?,?,?,?)";

        try {

            pr = conn.prepareStatement(sql);

            pr.setInt(1,usuario.getId_usuario());
            pr.setString(2,usuario.getNombre());
            pr.setString(3,usuario.getApellido_paterno());
            pr.setString(4,usuario.getApellido_materno());
            pr.setInt(5,usuario.getEdad());
            int x = pr.executeUpdate();
            if (x == 1) {
                result = "Se inserto correctamente";
            }

            pr.close();
            conn.close();

        }catch (Exception e){
            System.out.println("Error"+ e.getMessage());
            result = e.getMessage();

        }

        return result;

    }








  }
