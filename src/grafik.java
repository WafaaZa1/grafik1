import javax.swing.*;
import java.awt.*;

public class grafik extends Canvas {

    public grafik() {
        setSize(800,600);
        JFrame frame = new JFrame("grafik");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        drawBox(100,100, g);
        drawBox(300,200,g);
        g.setColor(new Color(0x3DAFFF));
        g.fillOval(200,200,300,150);
    }

    private void drawBox(int x, int y, Graphics g) {
        g.setColor(new Color(0xFF3F4F));
        g.drawRect(x,y,300,200);
    }

    public static void main(String[] args) {
        grafik mingrafik = new grafik();
    }
}