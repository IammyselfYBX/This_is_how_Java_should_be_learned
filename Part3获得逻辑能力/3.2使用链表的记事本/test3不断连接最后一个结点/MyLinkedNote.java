import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyLinkedNote{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300, 400);

        MyPanel mp = new MyPanel();
        jf.add(mp);

        jf.addKeyListener(mp);
        mp.addKeyListener(mp);

        jf.setVisible(true);
    }
}

class MyPanel extends JPanel implements KeyListener{
    Node firstNode = new Node();
    Node nowNode = firstNode;
    int cursor = 0;

    public void paint(Graphics g){
        super.paint(g);

        Node tmpNode = firstNode;
        int x = 0;
        while(tmpNode.next != null){
            g.drawString(""+tmpNode.next.value, 10+x*8, 10);
            x++;

            tmpNode = tmpNode.next;
        }
        //光标
		g.drawLine(10+cursor*8, 0, 10+cursor*8, 10) ;
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() >= KeyEvent.VK_A && e.getKeyCode() <= KeyEvent.VK_Z){
            cursor++;
            Node newNode = new Node();
            newNode.value = e.getKeyChar();
            nowNode.next = newNode;
            nowNode = newNode;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
        }
        if(e.getKeyCode() == KeyEvent.VK_DELETE){
        }
        
        repaint();
    }

    public void keyReleased(KeyEvent e){
    }

    public void keyTyped(KeyEvent e){
    }
}