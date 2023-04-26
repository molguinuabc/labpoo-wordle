package wordlegrafico.iugrafica;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
/**
 *
 * @author molguin
 *
 * Agregar la siguiente linea de codigo en el constructor
 * de la clase Canvas:
 * canvas.addMouseListener(new MiMouseAdapter(this));
 *
 */
public class MiMouseAdapter extends MouseAdapter {
    
    Canvas canvas;

    public MiMouseAdapter(Canvas canvas) {
       super();
       this.canvas = canvas;
       
    }
    
    @Override
     public void mouseClicked(MouseEvent e) {
          int x = e.getX();
          int y = e.getY();
          System.out.println("Mouse clicked at (" + x + ", " + y + ")");
          this.canvas.drawString("Hola", x, y);
     }
       
    
}

