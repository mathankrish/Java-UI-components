import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class mouseHomeWork implements MouseListener,MouseMotionListener{

	private JFrame frame;
	private JTextArea ta1;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mouseHomeWork window = new mouseHomeWork();
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
	public mouseHomeWork() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ta1 = new JTextArea();
		ta1.setBounds(138, 62, 399, 222);
		frame.getContentPane().add(ta1);
		
		l1 = new JLabel("New label");
		l1.setBounds(200, 420, 256, 54);
		frame.getContentPane().add(l1);
		
		l2 = new JLabel("Hide");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l2.setBounds(550, 268, 56, 16);
		frame.getContentPane().add(l2);
		l2.addMouseListener(this);
		
		l3 = new JLabel("Show");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l3.setBounds(549, 65, 56, 16);
		frame.getContentPane().add(l3);
		l3.addMouseListener(this);
		
		l4 = new JLabel("Exit");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l4.setBounds(549, 172, 56, 16);
		frame.getContentPane().add(l4);
		l4.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l2)
			ta1.setVisible(false);
		else if(e.getSource()==l3)
			ta1.setVisible(true);	
		else if(e.getSource()==l4)
			System.exit(0);
			
	   
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
