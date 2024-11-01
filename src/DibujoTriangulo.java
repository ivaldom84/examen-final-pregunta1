import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujoTriangulo extends JPanel {

    public Triangulo t1;

    public DibujoTriangulo() {
        
        this.t1 = new Triangulo(new Point(100, 200), new Point(200, 300), Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.t1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Triángulo");
        DibujoTriangulo panel = new DibujoTriangulo();
       
        ventana.add(panel);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
