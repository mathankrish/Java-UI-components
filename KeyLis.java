import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyLis implements KeyListener{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JLabel l1,l2;
	String s="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyLis window = new KeyLis();
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
	public KeyLis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 681, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(335, 139, 253, 50);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		t1.addKeyListener(this);
		
		l1 = new JLabel("Enter the name1 :");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		l1.setBounds(107, 148, 176, 33);
		frame.getContentPane().add(l1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(335, 223, 253, 50);
		t2.addKeyListener(this);
		frame.getContentPane().add(t2);
		
		l2 = new JLabel("Enter the name2 :");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		l2.setBounds(107, 229, 176, 33);
		frame.getContentPane().add(l2);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()>='0' && e.getKeyChar()<='9')
		{
			s=s+e.getKeyChar();
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
