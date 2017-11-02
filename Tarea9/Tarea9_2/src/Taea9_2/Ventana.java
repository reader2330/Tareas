package Taea9_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ventana extends JFrame{
    private JPanel Principal;
    private JPanel LugarTitulo;
    private JPanel Centro;
    private JButton Consultar;
    private JPanel Datos;
    private JTable tabla;



    public Ventana(){

        this.setContentPane(Principal);
        this.setDefaultCloseOperation(3);

        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CrearTable();
            }
        });
    }

    public void CrearTable(){


        JDialog dialogo = new JDialog();

        dialogo.add(tabla = createTable());
        JScrollPane scrollPane = new JScrollPane(tabla);
        dialogo.add(scrollPane);
        dialogo.pack();
        dialogo.setVisible(true);
        dialogo.setLocationRelativeTo(null);
        dialogo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);


    }



    public static JTable createTable()

    {
        String data [][] = new String[4][5];
        Integer i = 0;
        PreparedStatement pr;
        ResultSet rs;
        String sql = "select * from usuarios";
        Conexion conn = new Conexion();
        Connection con = null;
        try{

            con=conn.Connect();
            pr=con.prepareStatement(sql);
            rs= pr.executeQuery();

            while (rs.next()){

                int j = 0;


                data[i][j]=Integer.toString(rs.getInt(1));
                data[i][j+1]=rs.getString(2);
                data[i][j+2]=rs.getString(3);
                data[i][j+3]=rs.getString(4);
                data[i][j+4]=Integer.toString(rs.getInt(5));


                i++;



            }






        }catch(SQLException ex){

            System.out.println("Error : "+ex.getMessage());

        }

        String[] columnNames = {"ID","Nombre","Apellido Paterno","Apellido Materno","Edad"};

        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);



        return table;
    }


}
