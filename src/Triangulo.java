import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class Triangulo extends Dibujar {
    public Point inicial;
    public Point fin;
    public Color color;

    public Triangulo(Point i, Point f, Color c) {
        this.inicial = i;
        this.fin = f;
        this.color = c;
    }

    public double calcularArea() {
        double base = Math.abs(this.inicial.x - this.fin.x);
        double altura = Math.abs(this.inicial.y - this.fin.y);
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        double lado1 = this.fin.x - this.inicial.x;
        double lado2 = this.fin.y - this.inicial.y;
        double hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        return lado1 + lado2 + hipotenusa;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);

        
        int x1 = this.inicial.x;
        int y1 = this.fin.y; 
        int x2 = this.fin.x; 
        int y2 = this.fin.y; 
        int x3 = (this.inicial.x + this.fin.x) / 2; 
        int y3 = this.inicial.y; 

        int[] xPoints = {x1, x2, x3};
        int[] yPoints = {y1, y2, y3};

        g.fillPolygon(xPoints, yPoints, 3); 
    }
}
