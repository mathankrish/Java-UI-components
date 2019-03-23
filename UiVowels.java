import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;
import javax.swing.JButton;

public class UiVowels implements ActionListener,KeyListener{

	private JFrame frame;
	private JLabel l1,l2;
	private JTextArea t1,t2;
	private JButton b1;
	String s="";
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UiVowels window = new UiVowels();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UiVowels() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 701, 761);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		l1 = new JLabel("Vowels");
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		l1.setBounds(281, 49, 120, 44);
		frame.getContentPane().add(l1);
		
		l2 = new JLabel("Enter the text :");
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		l2.setBounds(25, 183, 160, 44);
		frame.getContentPane().add(l2);
		
		t1 = new JTextArea();
		t1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 27));
		t1.setBounds(241, 183, 234, 44);
		frame.getContentPane().add(t1);
		t1.addKeyListener(this);
		
		b1 = new JButton("Check");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b1.setBounds(281, 275, 144, 44);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);
		
		t2 = new JTextArea();
		t2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 27));
		t2.setBounds(241, 390, 234, 44);
		frame.getContentPane().add(t2);
		
		lblNewLabel = new JLabel("(numbers are not allowed)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(12, 227, 202, 31);
		frame.getContentPane().add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String n=t1.getText();
		String n2="";
		
		
		for (int i=0;i<n.length();i++)
		{
			if(n.charAt(i) =='u' || n.charAt(i)=='o' || n.charAt(i)=='i' || n.charAt(i)=='e' || n.charAt(i)=='a' || n.charAt(i)=='A' || n.charAt(i)=='E' || n.charAt(i)=='I' || n.charAt(i)=='O' || n.charAt(i)=='U')
			{
				n2=n2+n.charAt(i);
			}
			t2.setText(n2);
			
			
			

		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if((e.getKeyChar()>='a' && e.getKeyChar()<='z') || (e.getKeyChar()>='A' && e.getKeyChar()<='Z'))
			s=s+e.getKeyChar();
		if(e.getKeyChar()==e.VK_BACK_SPACE)
		{
			if(s.length()>0)
			{
				s=s.substring(0,s.length()-1);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		t1.setText(s);
	}
}
