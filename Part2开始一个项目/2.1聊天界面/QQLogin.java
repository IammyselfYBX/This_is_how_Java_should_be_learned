	import java.awt.*;
	import javax.swing.*;
	
	public class QQLogin {
		public static void main(String args[]){
	
			JFrame w = new JFrame() ;
		
			w.setSize(250 , 125) ;
			
			JLabel labUser = new JLabel("�û���") ;
			JLabel labPass = new JLabel("����") ;
			
			JTextField txtUser = new JTextField() ;
			JPasswordField txtPass = new JPasswordField() ;
			
			JButton btnLogin = new JButton("��½") ;
			JButton btnReg = new JButton("ע��") ;
			JButton btnCancel = new JButton("ȡ��") ;
			
			JPanel panInput = new JPanel() ;
			panInput.setLayout(new GridLayout(2 , 2)) ;
			
			panInput.add(labUser) ;
			panInput.add(txtUser) ;
			
			panInput.add(labPass) ;
			panInput.add(txtPass) ;
			
			JPanel panButton = new JPanel() ;
			panButton.setLayout(new FlowLayout()) ;
			
			panButton.add(btnLogin) ;
	 		panButton.add(btnReg) ;
	 		panButton.add(btnCancel) ;
	 		
	 		w.setLayout(new BorderLayout()) ;
	 		
	 		w.add(panInput , BorderLayout.CENTER) ;
	 		w.add(panButton , BorderLayout.SOUTH) ;
	 
			w.setVisible(true) ;
		}
	}