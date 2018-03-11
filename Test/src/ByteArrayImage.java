/**
 * Clase para pasar imágenes a array de bytes y visceversa
 * y así poder imprimirlas, guardarlas etc, en otro lado
 */

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

public class ByteArrayImage{

    public static void main(String[] args) {
       
        try {

            File file = new File("C:\\Users\\Jhonatan\\Pictures\\Anime\\Ecchi\\lala.jpg");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.exists() + "!!");
           
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            try {
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                    System.out.println("read " + readNum + " bytes,");
                }
            } catch (IOException ex) {
                Logger.getLogger(ByteArrayImage.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            //bytes is the ByteArray we need
            byte[] bytes = bos.toByteArray();
           
            //////////////////////////////////////////////////////////////////////////////////////////////////////
           
            File newFile= new File("C:\\Users\\Jhonatan\\Desktop\\imgTest-"+System.currentTimeMillis()+".jpg");
            BufferedImage imag=ImageIO.read(new ByteArrayInputStream(bytes));
            ImageIO.write(imag, "jpg", newFile);
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}