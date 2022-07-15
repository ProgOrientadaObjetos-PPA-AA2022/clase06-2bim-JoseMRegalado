/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import paquete01.Enlace;
/**
 *
 * @author SALA I
 */
public class Principal2 {
    public static void main(String[] args) {
        Enlace c = new Enlace();
        for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
          System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }
    }
}
