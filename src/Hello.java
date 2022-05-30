import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Hello extends Applet implements MouseListener {
    private int mouseX1=25;
    private int mouseY1=25;
    private int mouseX2=35;
    private int mouseY2=35;

    public void init(){
        addMouseListener(this);
    }
    public void paint(Graphics g){
        g.drawLine(mouseX1,mouseY1,mouseX2,mouseY2);
        g.drawString("起点",mouseX1,mouseY1);
        g.drawString("终点",mouseX2,mouseY2);
        g.setColor(Color.RED);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {
        mouseX1=e.getX();
        mouseY1=e.getY();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX2=e.getX();
        mouseY2=e.getY();
        repaint();
    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
