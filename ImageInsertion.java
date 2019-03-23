import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageInsertion {

	private JFrame frame;
	private JLabel l1,l2; 
	private JButton b1;
	ImageIcon ic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageInsertion window = new ImageInsertion();
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
	public ImageInsertion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		ic= new ImageIcon("I:\\Eclipse\\UiComponents\\src\\2.jpg");
		frame.setBounds(100, 100, 674, 705);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		l1 = new JLabel("New label");
		l1.setIcon(ic);
		l1.setBounds(135, 180, 145, 38);
		frame.getContentPane().add(l1);
		
		l2 = new JLabel("New label");
		l2.setBounds(135, 360, 145, 38);
		frame.getContentPane().add(l2);
		l2.setIcon(ic);
		
		b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Width = "+ic.getIconWidth()+" Height = "+ic.getIconHeight());
				l1.setBounds(0, 0, ic.getIconWidth(), ic.getIconHeight());
				l2.setBounds(0, 450, ic.getIconWidth(), ic.getIconHeight());
			}
		});
		b1.setBounds(111, 269, 97, 25);
		frame.getContentPane().add(b1);
	}
}
