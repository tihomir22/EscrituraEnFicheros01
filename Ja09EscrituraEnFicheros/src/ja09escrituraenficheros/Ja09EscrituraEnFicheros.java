/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja09escrituraenficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class Ja09EscrituraEnFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String fich="file.txt";
       File archivo1=new File(fich);
        try {
            PrintWriter pw=new PrintWriter(archivo1); //Abrimos el fichero para escritura, si no existia se crea y si existia se resetea a 9
            pw.println("Marcos does homework");
            pw.println("Marcos does homework in weekend");
            pw.println("Marcos does homework when he has internet!");
            pw.println(4.45435634634643);
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Problemas al abrir el fichero"+fich);
        }
    }
    
}
