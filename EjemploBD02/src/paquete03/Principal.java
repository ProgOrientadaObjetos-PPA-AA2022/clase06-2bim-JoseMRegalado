/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Auto;
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
            System.out.print("Ingrese la placa del "
                    + "auto que desea ingresar: ");
            String placa = sc.nextLine();
            System.out.print("Ingrese el valor de la "
                    + "matricula del auto que desea ingresar: ");
            double vMat = sc.nextDouble();
            Auto a = new Auto();
            a.establecerPlaca(placa);
            a.establecerValorMatricula(vMat);

            c.insertarAuto(a);
            sc.nextLine();
            System.out.print("Desea ingresar otro auto?: ");
            continuar = sc.nextLine();
        } while (continuar.equals("Si"));

    }
}
