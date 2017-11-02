package Tarea9_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Lector {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);



    public int LeerEnteros() {

        int lectura = 0;
        int a = 0;

        while (a == 0) {
            try {

                lectura = Integer.parseInt(br.readLine());
                a++;

            } catch (IOException ex) {

                System.out.println("Entrada Invalid");

            } catch (NumberFormatException ex) {

                System.out.println("Esas son letras , favor de introducir numeros");

            }

        }

        return lectura;
    }


    public float LeerFloat() {

        float lectura = 0F;
        int a = 0;

        while (a == 0) {
            try {

                lectura = Float.parseFloat(br.readLine());
                a++;

            } catch (IOException ex) {

                System.out.println("Entrada Invalid");

            } catch (NumberFormatException ex) {

                System.out.println("Esas son letras , favor de introducir numeros");

            }

        }

        return lectura;
    }

    public String LeerCadenas(){

        String lectura="0";

            try {

                lectura = br.readLine();


            } catch (IOException ex) {

                System.out.println("Entrada Invalid");



        }

        return lectura;
    }

}
