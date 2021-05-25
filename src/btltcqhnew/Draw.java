/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btltcqhnew;

import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.Window;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;

/**
 *
 * @author acer
 */
public class Draw extends JFrame {

    Random rnd = new Random();
    public List<Node> genNode() {
        List<Node> lstNode = new ArrayList<>();
        Node n3 = new Node();
        n3.setSTT("0");
        n3.setX(5);
        n3.setY(7);
        Node n1 = new Node();
        n1.setSTT("1");
        n1.setX(1);
        n1.setY(7);
        n1.setW(7);
        n1.setNutCha(n3.getSTT());
        lstNode.add(n1);
        Node n2 = new Node();
        n2.setSTT("2");
        n2.setX(3);
        n2.setY(5);
        n2.setW(5);
        n2.setNutCha(n3.getSTT());
        lstNode.add(n2);
        Node n4 = new Node();
        n4.setSTT("4");
        n4.setX(2);
        n4.setY(1);
        n4.setW(10);
        n4.setNutCha(n3.getSTT());
        lstNode.add(n4);
        Node n5 = new Node();
        n5.setSTT("5");
        n5.setX(6);
        n5.setY(3);
        n5.setW(7);
        n5.setNutCha(n3.getSTT());
        lstNode.add(n5);
        Node n6 = new Node();
        n6.setSTT("6");
        n6.setX(8);
        n6.setY(6);
        n6.setW(1);
        n6.setNutCha(n3.getSTT());
        lstNode.add(n6);
        n3.getNutCon().add(n1.getSTT());
        n3.getNutCon().add(n2.getSTT());
        n3.getNutCon().add(n4.getSTT());
        n3.getNutCon().add(n5.getSTT());
        n3.getNutCon().add(n6.getSTT());
        lstNode.add(n3);
        return lstNode;
    }

    public List<Node> genNode1() {
        List<Node> lstNode = new ArrayList<>();
        Node n3 = new Node();
        n3.setSTT("0");
        n3.setX(5);
        n3.setY(7);
        Node n1 = new Node();
        n1.setSTT("1");
        n1.setX(1);
        n1.setY(7);
        n1.setW(1);
        n1.setNutCha(n3.getSTT());
        lstNode.add(n1);
        Node n2 = new Node();
        n2.setSTT("2");
        n2.setX(3);
        n2.setY(5);
        n2.setW(5);
        n2.setNutCha(n3.getSTT());
        lstNode.add(n2);
        Node n4 = new Node();
        n4.setSTT("4");
        n4.setX(2);
        n4.setY(1);
        n4.setW(3);
        n4.setNutCha(n3.getSTT());
        lstNode.add(n4);
        Node n5 = new Node();
        n5.setSTT("5");
        n5.setX(6);
        n5.setY(3);
        n5.setW(7);
        n5.setNutCha(n3.getSTT());
        lstNode.add(n5);
        Node n6 = new Node();
        n6.setSTT("6");
        n6.setX(8);
        n6.setY(6);
        n6.setW(1);
        n6.setNutCha(n3.getSTT());
        lstNode.add(n6);
        Node n7 = new Node();
        n7.setSTT("7");
        n7.setX(4);
        n7.setY(3);
        n7.setW(3);
        n7.setNutCha(n3.getSTT());
        lstNode.add(n7);
        Node n8 = new Node();
        n8.setSTT("8");
        n8.setX(5);
        n8.setY(2);
        n8.setW(1);
        n8.setNutCha(n3.getSTT());
        lstNode.add(n8);
        n3.getNutCon().add(n1.getSTT());
        n3.getNutCon().add(n2.getSTT());
        n3.getNutCon().add(n4.getSTT());
        n3.getNutCon().add(n5.getSTT());
        n3.getNutCon().add(n6.getSTT());
        n3.getNutCon().add(n7.getSTT());
        n3.getNutCon().add(n8.getSTT());
        lstNode.add(n3);
        return lstNode;
    }

    public boolean noDup(int x, int y, List<Node> lstN) {
        for (int i = 0; i < lstN.size(); i++) {
            if (x == lstN.get(i).getX() && y == lstN.get(i).getY()) {
                return false;
            }
        }
        return true;
    }
    public List<Node> genNode90() {
        List<Node> lstN = new ArrayList();
        for (int i = 0; i < 30; i++) {
            boolean checkNoDup = false;
            int x = 0;
            int y = 0;
            Node n = new Node();
            while (!checkNoDup) {
                x = rnd.nextInt(801);
                y = rnd.nextInt(801);
                checkNoDup = noDup(x, y, lstN);
                n.setSTT("" + (i + 1));
                n.setX(x);
                n.setY(y);
                n.setW(1);
                if (!n.getSTT().equals("0")) {
                    n.setNutCha("0");
                }
                lstN.add(n);
            }
        }

        getFromSTT("1", lstN).setW(7);
        getFromSTT("12", lstN).setW(7);
        //getFromSTT("72", lstN).setW(7);
        getFromSTT("22", lstN).setW(7);// test
        getFromSTT("17", lstN).setW(5);
        //getFromSTT("59", lstN).setW(5);
        getFromSTT("19", lstN).setW(5);//test
        getFromSTT("29", lstN).setW(5);
        getFromSTT("7", lstN).setW(10);
        getFromSTT("23", lstN).setW(10);
        //getFromSTT("45", lstN).setW(10);
        getFromSTT("15", lstN).setW(10);
        getFromSTT("5", lstN).setSTT("0");
        for (int i = 0; i < lstN.size(); i++) {
            if (!lstN.get(i).getSTT().equals("0")) {
//                System.out.println(getFromSTT("0", lstN).getNutCon().add(lstN.get(i).getSTT()));
                getFromSTT("0", lstN).getNutCon().add(lstN.get(i).getSTT());
            }
        }
        return lstN;
    }

    public Node getFromSTT(String STT, List<Node> lstN) {
        for (Node n : lstN) {
            if (n.getSTT().equals(STT)) {
                return n;
            }
        }
        return null;
    }

    public void showN(List<Node> lstN) {
        for (int i = 0; i < lstN.size(); i++) {
            System.out.print(lstN.get(i).getSTT() + " ");
        }
        System.out.println("");
    }

    public void showS(List<String> lstS) {
        for (int i = 0; i < lstS.size(); i++) {
            System.out.print(lstS.get(i) + " ");
        }
        System.out.println("");
    }

    public List<String> timNutCon(String n, List<Node> lstN) {
        List<String> lstNutCon = new ArrayList<>();
        lstNutCon.addAll(getFromSTT(n, lstN).getNutCon());
        List<String> tempRound = new ArrayList();
        tempRound.addAll(getFromSTT(n, lstN).getNutCon());
        boolean end = false;
        while (!end) {
            end = true;
            List<String> lstTemp = new ArrayList();
            for (int i = 0; i < tempRound.size(); i++) {
                if (!getFromSTT(tempRound.get(i), lstN).getNutCon().isEmpty()) {
                    lstTemp.addAll(getFromSTT(tempRound.get(i), lstN).getNutCon());
                    end = false;
                }
            }
            tempRound.clear();
            tempRound.addAll(lstTemp);
            lstNutCon.addAll(lstTemp);
        }
        return lstNutCon;
    }

    public List<String> timNutCha(String a, List<Node> lstN) {
        List<String> pre = new ArrayList<>();
        String temp = a;
        while (!temp.equals("0")) {
            pre.add(getFromSTT(temp, lstN).getNutCha());
            temp = getFromSTT(temp, lstN).getNutCha();
        }
        return pre;
    }

    public void path00(String a, String b, List<Node> lstN) {
        List<String> lstChaA = new ArrayList<>();

        lstChaA.addAll(timNutCha(a, lstN));

        Collections.reverse(lstChaA);
        lstChaA.add(a);
        lstChaA.add(b);

        getFromSTT("0", lstN).getNutCon().remove(lstChaA.get(1));

        //showS(getFromSTT("0", lstN).getNutCon());
        lstChaA.remove(0);
        //showS(lstChaA);
        for (int i = 0; i < lstChaA.size(); i++) {
            if (i == 0) {

                getFromSTT(lstChaA.get(i), lstN).setNutCha(lstChaA.get(i + 1));

                getFromSTT(lstChaA.get(i), lstN).getNutCon().remove(lstChaA.get(i + 1));
            } else if (i == lstChaA.size() - 1) {

                getFromSTT(lstChaA.get(i), lstN).getNutCon().add(lstChaA.get(i - 1));
            } else {

                getFromSTT(lstChaA.get(i), lstN).setNutCha(lstChaA.get(i + 1));

                getFromSTT(lstChaA.get(i), lstN).getNutCon().remove(lstChaA.get(i + 1));

                getFromSTT(lstChaA.get(i), lstN).getNutCon().add(lstChaA.get(i - 1));
            }
        }
    }

    public int calW(Link l, List<Node> lstN) {
        int w = l.getA().getW();
        //List<Node> lstNutConN = timAnc(l.getA());
        List<String> lstNutCon = new ArrayList();
        lstNutCon.addAll(timNutCon(l.getA().getSTT(), lstN));
        for (int i = 0; i < lstNutCon.size(); i++) {
            w += getFromSTT(lstNutCon.get(i), lstN).getW();
        }
        return w;
    }

    public double heSo(int w) {
        if (w <= 2) {
            return 0.2;
        } else if (2 < w && w <= 6) {
            return 0.4;
        } else if (6 < w && w <= 20) {
            return 0.8;
        }
        return 0;
    }

    public double calAllCost(List<Node> lstN) {
        double temp = 0;
        List<Link> lstLink = new ArrayList<>();
        lstLink.addAll(getLink(lstN));
        for (Link l : lstLink) {
            temp += C(l, lstN);
        }
        return temp;
    }

    public double C(Link l, List<Node> lstN) {
        int w = calW(l, lstN);
        double C = l.getDist() * heSo(w);
        System.out.println("hệ số " + l.getA().getSTT() + l.getB().getSTT() + " " + heSo(w) + " " + w);
        return C;
    }

    public List<Link> getLink(List<Node> lstN) {
        List<Link> lstLink = new ArrayList<>();
        for (int i = 0; i < lstN.size(); i++) {
            if (!lstN.get(i).getSTT().equals("0")) {
                Link l = new Link();
                Node a = new Node(lstN.get(i));
                Node b = new Node(getFromSTT(lstN.get(i).getNutCha(), lstN));
                l.setA(a);
                l.setB(b);
                int deltaX = a.getX() - b.getX();
                int deltaY = a.getY() - b.getY();
                double dist = Math.sqrt(pow(deltaX, 2) + pow(deltaY, 2));
                l.setDist(dist);
                System.out.println("dist " + a.getSTT() + "" + b.getSTT() + " = " + dist);
                int W = calW(l, lstN);
                l.setW(W);
                l.setName("L" + a.getSTT() + "(" + b.getSTT() + ")");
                lstLink.add(l);
                //System.out.println("i =" + i + " j = " + j);
            }
        }
        return lstLink;
    }

    public String nutGanGoc(Node a, List<Node> lstN) {
        List<String> lstNode = new ArrayList();
        lstNode.addAll(timNutCha(a.getSTT(), lstN));
        //System.out.println("a=" + a.getSTT());
        //showS(lstNode);
        lstNode.add(a.getSTT());
        //showS(lstNode);
        //System.out.println("" + getFromSTT(lstNode.get(1), lstN).getNutCha());
        for (String n : lstNode) {
            //System.out.println("n = " + n);
            if (!n.equals("0")) {
                if (getFromSTT(n, lstN).getNutCha().equals("0")) {
                    return n;
                }
            }
        }
        return null;
    }

    public Cost tinhThoaHiep(String a, String b, List<Node> lstN) {
        List<Node> temp = new ArrayList();
        for (int i = 0; i < lstN.size(); i++) {
            temp.add(new Node(lstN.get(i)));
            for (String t : lstN.get(i).getNutCon()) {
                temp.get(i).getNutCon().add(t);
            }
        }
        path00(a, b, temp);
        Cost cost = new Cost();
        String n = nutGanGoc(getFromSTT(b, temp), temp);
        int w = 0;
        List<Node> lstNutCon = new ArrayList();
        //lstAnc.addAll(timAnc(getFromSTT(n, temp)));
        List<String> lstString = timNutCon(n, temp);
        System.out.println("nút n = " + n);
        System.out.println("con của n: ");
        showS(lstString);
        for (int i = 0; i < timNutCon(n, temp).size(); i++) {
            lstNutCon.add(getFromSTT(timNutCon(n, temp).get(i), temp));
        }
        System.out.println("nút con của " + n);
        showN(lstNutCon);
        for (int i = 0; i < lstNutCon.size(); i++) {
            w += lstNutCon.get(i).getW();
        }
        w += getFromSTT(n, lstN).getW();
        System.out.println("w = " + w);
        if (w > 20) {
            System.out.println("W > 20 nen end");
            return null;
        }
        double value = calAllCost(temp);
        cost.setValue(value);
        cost.setA(getFromSTT(a, temp));
        cost.setB(getFromSTT(b, temp));
        return cost;
    }

    public boolean hetThuatToan(double costCu, List<Cost> lstCost) {
        for (Cost c : lstCost) {
            if (c.getValue() < costCu) {
                return true;
            }
        }
        return false;
    }

    public Cost min(List<Cost> lstCost) {
        Cost costMin = new Cost();
        if (!lstCost.isEmpty()) {
            double min = lstCost.get(0).getValue();
            costMin = lstCost.get(0);
            for (Cost c : lstCost) {
                if (c.getValue() < min) {
                    costMin = c;
                    min = c.getValue();
                }
            }
        }
        return costMin;
    }

    public boolean coPhaiNutCon(String a, String b, List<Node> lstN) {
        List<String> lstNutCon = new ArrayList<>();
        lstNutCon.addAll(timNutCon(b, lstN));
        for (String nutCon : lstNutCon) {
            if (nutCon.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public boolean coPhaiNutCha(String a, String b, List<Node> lstN) {
        List<String> lstNutCha = new ArrayList<>();
        lstNutCha.addAll(timNutCha(b, lstN));
        for (String nutCha : lstNutCha) {
            if (nutCha.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public boolean coPhaiCungNhanh(String a, String b, List<Node> lstN) {
        String a1 = nutGanGoc(getFromSTT(a, lstN), lstN);
        String b1 = nutGanGoc(getFromSTT(b, lstN), lstN);
        if (a1.equals(b1)) {
            return true;
        }
        return false;
    }

    public boolean dieuKien(int i, int j, List<Node> lstN) {// thay đổi khi đề bài thay
        if (!lstN.get(i).getSTT().equals(lstN.get(j).getSTT())) {
            if (!lstN.get(i).getSTT().equals("0") && !lstN.get(j).getSTT().equals("0")) {
                if (!lstN.get(i).getSTT().equals(null) && !lstN.get(j).getSTT().equals(null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Node> thucHienThuatToan(List<Node> lstN) {
        double init = calAllCost(lstN);
        System.out.println("cost ban đầu: " + init);
        boolean kTra = true;
        while (kTra) {
            List<Node> lstTemp = new ArrayList<>();
            //lstTemp.addAll(lstN);
            System.out.print("nut con cua 0 ");
            showS(getFromSTT("0", lstN).getNutCon());
            List<Cost> lstCost = new ArrayList();
            //B.showN(lstTemp);
            for (int i = 0; i < lstN.size(); i++) {
                for (int j = 0; j < lstN.size(); j++) {
                    if (dieuKien(i, j, lstN)) {
                        boolean laNutCon = coPhaiNutCon(lstN.get(i).getSTT(), lstN.get(j).getSTT(), lstN);
                        boolean laNutCha = coPhaiNutCha(lstN.get(i).getSTT(), lstN.get(j).getSTT(), lstN);
                        boolean cungNhanh = coPhaiCungNhanh(lstN.get(i).getSTT(), lstN.get(j).getSTT(), lstN);
                        if (!laNutCon) {
                            if (!laNutCha && !cungNhanh) {
                                //B.path00(Integer.toString(i), Integer.toString(j), lstTemp);
                                System.out.println("noi nut " + lstN.get(i).getSTT() + " den nut " + lstN.get(j).getSTT());
                                for (int k = 0; k < lstN.size(); k++) {
                                    lstTemp.add(new Node(lstN.get(k)));
                                    for (String t : lstN.get(k).getNutCon()) {
                                        lstTemp.get(k).getNutCon().add(t);
                                    }
                                }
                                Cost thoaHiep = new Cost();
                                thoaHiep = tinhThoaHiep(lstTemp.get(i).getSTT(), lstTemp.get(j).getSTT(), lstTemp);
                                if (thoaHiep == null) {
                                    lstTemp.clear();
                                    continue;
                                }
                                System.out.println("giá mới" + lstTemp.get(i).getSTT() + lstTemp.get(j).getSTT() + " " + thoaHiep.getValue());
                                System.out.println("thoahiep" + lstTemp.get(i).getSTT() + lstTemp.get(j).getSTT() + " " + (thoaHiep.getValue() - init));
                                lstTemp.clear();
                                lstCost.add(thoaHiep);
                            }
                        }
                    }
                }
            }
            Cost temp = min(lstCost);
            int soAm = 0;
            System.out.println("init cũ = " + init);
            for (Cost c : lstCost) {
                if (c.getValue() < init) {
                    soAm++;
                }

            }
            System.out.println("số các th âm  = " + soAm);
            kTra = hetThuatToan(init, lstCost);

            if (kTra) {
                System.out.println("nối nút " + temp.getA().getSTT() + " đến nút " + temp.getB().getSTT());
                path00(temp.getA().getSTT(), temp.getB().getSTT(), lstN);
            }
            init = calAllCost(lstN);
            System.out.println("init = " + init);
            System.out.println("hết round");
        }
        return lstN;
    }

    /*public Draw() {
        super("Demo 9 nut");

        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }*/
 /*public void paint1(Graphics g1) {
        super.paint(g1);
        drawBoarder9Nut(g1);
        //drawLines(g1);
    }*/
 /*public void paint(Graphics g) {
        super.paint(g);
        //drawBoarder9Nut(g);
        drawLines(g);
    }*/
    public void drawBoarder9Nut(Graphics g1) {
        Graphics2D g2d = (Graphics2D) g1;
        int x0 = 100;
        int y0 = 900;
        g2d.drawLine(100, 900, 100, 100);
        g2d.drawLine(100, 900, 900, 900);
        //g2d.drawLine(100, 100, 900, 100);
        //g2d.drawLine(900, 100, 900, 900);
        g2d.drawString("0", x0 - 20, y0 + 20);
        g2d.drawString("1", x0 - 20, y0 - 50);
        g2d.drawString("2", x0 - 20, y0 - 120);
        g2d.drawString("3", x0 - 20, y0 - 190);
        g2d.drawString("4", x0 - 20, y0 - 260);
        g2d.drawString("5", x0 - 20, y0 - 330);
        g2d.drawString("6", x0 - 20, y0 - 400);
        g2d.drawString("7", x0 - 20, y0 - 470);
        g2d.drawString("8", x0 - 20, y0 - 540);
        g2d.drawString("9", x0 - 20, y0 - 610);
        g2d.drawString("10", x0 - 20, y0 - 680);
        g2d.drawString("11", x0 - 20, y0 - 750);
        g2d.drawString("1", x0 + 50, y0 + 20);
        g2d.drawString("2", x0 + 120, y0 + 20);
        g2d.drawString("3", x0 + 190, y0 + 20);
        g2d.drawString("4", x0 + 260, y0 + 20);
        g2d.drawString("5", x0 + 330, y0 + 20);
        g2d.drawString("6", x0 + 400, y0 + 20);
        g2d.drawString("7", x0 + 470, y0 + 20);
        g2d.drawString("8", x0 + 540, y0 + 20);
        g2d.drawString("9", x0 + 610, y0 + 20);
        g2d.drawString("10", x0 + 680, y0 + 20);
        g2d.drawString("11", x0 + 750, y0 + 20);
    }

    public void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int[] lstX = new int[90];
        int[] lstY = new int[90];
        Random rnd = new Random();
        int x0 = 100;
        int y0 = 900;
        g2d.drawLine(100, 900, 100, 100);
        g2d.drawLine(100, 900, 900, 900);
        //g2d.drawLine(100, 100, 900, 100);
        //g2d.drawLine(900, 100, 900, 900);
        for (int i = 0; i < 90; i++) {
            int x = rnd.nextInt(800);
            int y = rnd.nextInt(800);
            lstX[i] = x;
            lstY[i] = y;
            System.out.println("x:" + x);
            g2d.drawOval(x + 100, 900 - y, 1, 1);
        }
        System.out.println("tọa độ của nút 1 : x = " + (lstX[0]) + " y = " + lstY[0]);
        System.out.println("tọa độ của nút 5 : x = " + (lstX[4]) + " y = " + lstY[4]);
        double dis = sqrt(((lstX[4]) - (lstX[0])) * ((lstX[4]) - (lstX[0])) - (lstY[4] - lstY[0]) * (lstY[4] - lstY[0]));
        System.out.println("khoảng cách : " + dis);
    }

    public static void main(String[] args) {
        Draw B = new Draw();
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        List<Node> lstN = new ArrayList<>();
        lstN.addAll(B.genNode90());
        B.showN(lstN);
        List<Node> ketQua = new ArrayList<>();
        ketQua.addAll(B.thucHienThuatToan(lstN));
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                B.setTitle("B");
                B.setSize(1000, 1000);
                subPanel sub = new subPanel(lstN);
                B.add(sub);
                B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                B.setVisible(true);
            }
        });
    }
}
