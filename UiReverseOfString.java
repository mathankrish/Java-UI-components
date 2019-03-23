import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;

public class UiReverseOfString implements ActionListener{

	private JFrame frame;
	private JLabel l1,l2;
	private JTextArea t1,t2;
	private JButton b1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UiReverseOfString window = new UiReverseOfString();
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
	public UiReverseOfString() {
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
		
		l1 = new JLabel("Palindrome");
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
		
		b1 = new JButton("Reverse");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b1.setBounds(281, 275, 144, 44);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);
		
		t2 = new JTextArea();
		t2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 27));
		t2.setBounds(241, 390, 234, 44);
		frame.getContentPane().add(t2);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s1=t1.getText();
		String s2;
		s2=new StringBuffer(s1).reverse().toString();
		t2.setText(s2);
		
	}
}
