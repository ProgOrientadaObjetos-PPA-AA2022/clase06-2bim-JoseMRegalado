/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        Scanner sc = new Scanner(System.in);
        String continuar;
        do {
            System.out.print("Ingrese el nombre de la "
                    + "ciudad que desea ingresar: ");
            String nombreC = sc.nextLine();
            System.out.print("Ingrese la poblacion de la "
                    + "ciudad que desea ingresar: ");
            int pobC = sc.nextInt();
            Ciudad ciudad = new Ciudad(nombreC, pobC);
            c.insertarCiudad(ciudad);
            sc.nextLine();
            System.out.print("Desea ingresar otra ciudad?: ");
            continuar = sc.nextLine();
        } while (continuar.equals("Si"));

        //for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
        //  System.out.printf("%s", c.obtenerDataCiudad().get(i));
        //}
    }
}
