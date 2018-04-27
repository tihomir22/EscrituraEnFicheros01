/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja09escrituraenficheros;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class mostrarInformacionFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       if(args.length>0){
           for (int i = 0; i < args.length; i++) {
               File archivo=new File(args[i]);
               if(archivo.exists()){
                   System.out.println(archivo.getName());
                   System.out.println(archivo.getPath());
                   System.out.println(archivo.getAbsolutePath());
                   try {
                       System.out.println(archivo.getCanonicalPath());
                   } catch (IOException ex) {
                       Logger.getLogger(mostrarInformacionFicheros.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }else{
                   System.out.println("No existe el fichero/directorio");
               }
               
           }
       
       }else{
           System.out.println("Usted no ha pasado ningun argumento, fill de puta");
       }
    }
    
}
