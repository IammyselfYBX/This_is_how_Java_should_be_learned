import java.awt.*;
import java.math.*;

public class MyTest{
    public static void main(String args[]){
        Frame f = new Frame();
        f.setSize(1920, 1080);

        MyPanel mp = new MyPanel();
        f.add(mp);

        f.setVisible(true);
    }
}

class MyPanel extends Panel{
    public void paint(Graphics g){
        int x = 0;
        int y = 0;
        for(int i = 0; i< 10; i++){
            y = x*x;
            x++;
            g.setColor(Color.RED);
            g.drawString("*", x, y);
        }
        
    }
}