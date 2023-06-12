package tarea09;

import javax.swing.JFrame;

/**
 *
 * @author Frida Paolette Ramirez-Lara
 */
public class Tarea09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("ColorSelect");
        ColorSel panel = new ColorSel();
        f.setSize(300, 150);
        f.setLocationRelativeTo(null);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
