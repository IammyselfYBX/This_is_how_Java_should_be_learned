import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyTest implements ActionListener{
    public static void main(String args[]){
        JFrame jf = new JFrame();
        jf.setSize(300, 125);

        JLabel labUser = new JLabel("User name");
        JLabel labPass = new JLabel("Password");
        JTextField txtUser = new JTextField();
        JPasswordField txtPass = new JPasswordField();

        JPanel input = new JPanel();
        input.setLayout(new GridLayout(2,2));
        input.add(labUser);
        input.add(txtUser);
        input.add(labPass);
        input.add(txtPass);

        JButton jb1 = new JButton("Login");
        JButton jb2 = new JButton("Register");
        JButton jb3 = new JButton("Cancel");
        JPanel jbp = new JPanel();
        jbp.setLayout(new FlowLayout());
        jbp.add(jb1);
        jbp.add(jb2);
        jbp.add(jb3);

        jf.setLayout(new BorderLayout());
        jf.add(input, BorderLayout.NORTH);
        jf.add(jbp, BorderLayout.SOUTH);

        MyTest mt = new MyTest();
        jb1.addActionListener(mt);
        jb2.addActionListener(mt);
        jb3.addActionListener(mt);

        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Login")){
            System.out.println("Click Login");
        }
        if(e.getActionCommand().equals("Register")){
            System.out.println("Click Register");
        }
        if(e.getActionCommand().equals("Cancel")){
            System.out.println("Click Cancel");
        }
    }
}