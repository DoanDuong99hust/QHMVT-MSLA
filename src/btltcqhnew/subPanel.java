/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btltcqhnew;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author acer
 */
public class subPanel extends JPanel {

    public List<Node> lstN;
    public List<Point> lstP;

    public subPanel(List<Node> lstN) {
        this.lstN = lstN;
    }

    public List<Point> genP(){
        this.lstP = new ArrayList();
        int x0 = 100;
        int y0 = 900;
        for(int i = 0; i < 12; i++){
            Point p = new Point();
            p.setLocation(x0, y0);
            y0-=70;
            this.lstP.add(p);
        }
        x0 = 100;
        y0 = 900;
        for(int i = 0; i < 11; i++){
            Point p = new Point();
            p.setLocation(x0+70, y0);
            x0+=70;
            this.lstP.add(p);
        }
        return this.lstP;
    }

    public Node getFromSTT(String STT, List<Node> lstN) {
        for (Node n : lstN) {
            if (n.getSTT().equals(STT)) {
                return n;
            }
        }
        return null;
    }
    public void drawBoarder9Nut(Graphics g1, List<Node> lstN) {
        Graphics2D g2d = (Graphics2D) g1;
        int x0 = 100;
        int y0 = 900;
        g2d.drawLine(100, 900, 100, 100);
        g2d.drawLine(100, 900, 900, 900);
        g2d.drawString("0", x0 - 20, y0);
        g2d.drawString("1", x0 - 20, y0 - 70);
        g2d.drawString("2", x0 - 20, y0 - 140);
        g2d.drawString("3", x0 - 20, y0 - 210);
        g2d.drawString("4", x0 - 20, y0 - 280);
        g2d.drawString("5", x0 - 20, y0 - 350);
        g2d.drawString("6", x0 - 20, y0 - 420);
        g2d.drawString("7", x0 - 20, y0 - 490);
        g2d.drawString("8", x0 - 20, y0 - 560);
        g2d.drawString("9", x0 - 20, y0 - 630);
        g2d.drawString("10", x0 - 20, y0 - 700);
        g2d.drawString("11", x0-20, y0 - 770);
        g2d.drawString("1", x0 + 70, y0 + 20);
        g2d.drawString("2", x0 + 140, y0 + 20);
        g2d.drawString("3", x0 + 210, y0 + 20);
        g2d.drawString("4", x0 + 280, y0 + 20);
        g2d.drawString("5", x0 + 350, y0 + 20);
        g2d.drawString("6", x0 + 420, y0 + 20);
        g2d.drawString("7", x0 + 490, y0 + 20);
        g2d.drawString("8", x0 + 560, y0 + 20);
        g2d.drawString("9", x0 + 630, y0 + 20);
        g2d.drawString("10", x0 + 700, y0 + 20);
        g2d.drawString("11", x0 + 770, y0 + 20);
        this.lstN.forEach((n) -> {
            g2d.drawString(n.getSTT(), 100 + n.getX() * 70+10, 900 - n.getY() * 70+10);
        });
        for (Node n : this.lstN) {
            if (!n.getSTT().equals("0")) {
                int x = 100 + n.getX() * 70;
                int y = 900 - n.getY() * 70;
                int x1 = 100 + getFromSTT(n.getNutCha(), lstN).getX() * 70;
                int y1 = 900 - getFromSTT(n.getNutCha(), lstN).getY() * 70;
                g2d.drawLine(x, y, x1, y1);
            }
        }
    }

    public void drawNode(Graphics g, Node n){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillOval(100 + n.getX()*70 - 5, 900 - n.getY()*70 - 5, 10, 10);
    }
    public void drawXYAxis(Graphics g, Point p){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillOval(p.x-5, p.y-5, 10, 10);
    }
    public void paint(Graphics g) {
        super.paint(g);
        drawBoarder9Nut(g, this.lstN);
        genP();
        for(Node n : this.lstN){
            drawNode(g,n);
        }
        for(Point p : this.lstP){
            drawXYAxis(g, p);
        }
    }

}
