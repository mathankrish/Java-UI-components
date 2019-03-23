import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class UiSumOfDigits implements ActionListener,KeyListener{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JLabel l1,l2,l3;
	private JButton b1;
	String s1="";
	private JLabel l4;
char c;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UiSumOfDigits window = new UiSumOfDigits();
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
	public UiSumOfDigits() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 752);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		l1 = new JLabel("Sum Of Digits");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		l1.setBounds(224, 43, 176, 46);
		frame.getContentPane().add(l1);
		
		l2 = new JLabel("Enter the digits :");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		l2.setBounds(25, 194, 189, 46);
		frame.getContentPane().add(l2);
		
		t1 = new JTextField();
		t1.setBounds(284, 203, 189, 39);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		t1.addKeyListener(this);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(284, 406, 189, 39);
		frame.getContentPane().add(t2);
		
		l3 = new JLabel("Sum of the digits :");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		l3.setBounds(12, 399, 202, 46);
		frame.getContentPane().add(l3);
		
		b1 = new JButton("Press");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		b1.setBounds(316, 306, 117, 39);
		frame.getContentPane().add(b1);
		
		l4 = new JLabel("(type max of 9 digits)");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l4.setBounds(25, 221, 189, 46);
		frame.getContentPane().add(l4);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		s1=t1.getText();
		int n1=Integer.parseInt(s1);
		int rem,sum=0;
		while(n1!=0)
		{
			rem=n1%10;
			sum=sum+rem;
			n1=n1/10;
		}
		t2.setText(""+sum);
			
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//if(t1.getText().length()<9)
		//{
		c=e.getKeyChar();
		if(c>='0' && c<='9')
			s1=s1+c;
		//}
		if(c==e.VK_BACK_SPACE)
		{
			if(s1.length()>0)
			{
				s1=s1.substring(0,s1.length()-1);
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
		t1.setText(s1);
		actionPerformed(null);
	}
}
