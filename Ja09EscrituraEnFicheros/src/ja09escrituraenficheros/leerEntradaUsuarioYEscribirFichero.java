/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja09escrituraenficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class leerEntradaUsuarioYEscribirFichero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        File destino = new File("file3.txt");
        PrintWriter pw3 = null;
        String cadena;
        
        try {
            pw3=new PrintWriter(destino);
            System.out.println("Introduce datos para acabar escribe fin");
            cadena=teclado.nextLine();
            while(!cadena.equalsIgnoreCase("fin")){
                pw3.println(cadena);
                cadena=teclado.nextLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(leerEntradaUsuarioYEscribirFichero.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            pw3.close();
        }
        

    }
}
