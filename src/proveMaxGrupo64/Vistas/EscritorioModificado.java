

package proveMaxGrupo64.Vistas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;


public class EscritorioModificado extends JDesktopPane {
    
    private BufferedImage img;
    
    public EscritorioModificado(){
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/Imagenes/Fondo.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, 1584, 633, null);
        
    }

}
