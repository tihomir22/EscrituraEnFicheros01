/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja09escrituraenficheros;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class escribir10enterosEnFichero {
    public static void main(String[]args){
        File arch2=new File("file2.txt");
        try {
            PrintWriter pw2=new PrintWriter(arch2);
            for (int i = 0; i < 10; i++) {
                pw2.println(i);
            }
            pw2.close();
            Scanner scn=new Scanner(arch2); //Para imprimir el contenido del fichero
            while(scn.hasNext()){
                System.out.println("Valor leido es "+scn.nextInt());
            }
            pw2.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(escribir10enterosEnFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
