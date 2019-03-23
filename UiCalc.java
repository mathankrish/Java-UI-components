import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class UiCalc {

	private JFrame frame;
	private JTextField tf1;
	
	double FirstNum;
	double SecondNum;
	double Result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UiCalc window = new UiCalc();
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
	public UiCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 407, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setHorizontalAlignment(SwingConstants.RIGHT);
		tf1.setFont(new Font("Tahoma", Font.BOLD, 23));
		tf1.setBounds(12, 47, 355, 49);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
/*------------------------Row 1----------------------------*/
		
		JButton btnClr = new JButton("<-");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String BackSpace=null;
				
				if(tf1.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(tf1.getText());
					str.deleteCharAt(tf1.getText().length()-1);
					BackSpace=str.toString();
					tf1.setText(BackSpace);
				}
			}
		});
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClr.setBounds(12, 109, 70, 73);
		frame.getContentPane().add(btnClr);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tf1.setText(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(108, 109, 70, 73);
		frame.getContentPane().add(btnCancel);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstNum=Double.parseDouble(tf1.getText());
				tf1.setText("");
				operations="%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMod.setBounds(199, 109, 70, 73);
		frame.getContentPane().add(btnMod);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstNum=Double.parseDouble(tf1.getText());
				tf1.setText("");
				operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(290, 109, 70, 73);
		frame.getContentPane().add(btnPlus);
		
/*------------------------Row 2----------------------------*/		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn7.getText();
				tf1.setText(EnterNum);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(12, 214, 70, 73);
		frame.getContentPane().add(btn7);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn8.getText();
				tf1.setText(EnterNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(108, 214, 70, 73);
		frame.getContentPane().add(btn8);
		
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn9.getText();
				tf1.setText(EnterNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(199, 214, 70, 73);
		frame.getContentPane().add(btn9);
		
		
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstNum=Double.parseDouble(tf1.getText());
				tf1.setText("");
				operations="-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(290, 214, 70, 73);
		frame.getContentPane().add(btnMinus);
		
/*------------------------Row 3----------------------------*/		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn4.getText();
				tf1.setText(EnterNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(12, 315, 70, 73);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn5.getText();
				tf1.setText(EnterNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(108, 315, 70, 73);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn6.getText();
				tf1.setText(EnterNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(199, 315, 70, 73);
		frame.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstNum=Double.parseDouble(tf1.getText());
				tf1.setText("");
				operations="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(290, 315, 70, 73);
		frame.getContentPane().add(btnMul);
		
/*------------------------Row 4----------------------------*/

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn1.getText();
				tf1.setText(EnterNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(12, 420, 70, 73);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn2.getText();
				tf1.setText(EnterNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(108, 420, 70, 73);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn3.getText();
				tf1.setText(EnterNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(199, 420, 70, 73);
		frame.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstNum=Double.parseDouble(tf1.getText());
				tf1.setText("");
				operations="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(290, 420, 70, 73);
		frame.getContentPane().add(btnDiv);
		
/*------------------------Row 5----------------------------*/
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = tf1.getText()+btn0.getText();
				tf1.setText(EnterNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(12, 520, 70, 73);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! tf1.getText().contains("."))
		          {
		          tf1.setText(tf1.getText() + btnDot.getText());
		          }
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(108, 520, 70, 73);
		frame.getContentPane().add(btnDot);
		
		JButton btnPosNeg = new JButton("+/-");
		btnPosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops=Double.parseDouble(String.valueOf(tf1.getText()));
				ops = ops*(-1);
				tf1.setText(String.valueOf(ops));
			}
		});
		btnPosNeg.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPosNeg.setBounds(199, 520, 70, 73);
		frame.getContentPane().add(btnPosNeg);
		
		JButton btnEql = new JButton("=");
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SecondNum=Double.parseDouble(tf1.getText());
				if(operations == "+")
				{
					Result=FirstNum + SecondNum;
					answer=String.format("%.2f", Result);
					tf1.setText(answer);
				}
				
				else if(operations == "-")
				{
					Result=FirstNum - SecondNum;
					answer=String.format("%.2f", Result);
					tf1.setText(answer);
				}
				
				else if(operations == "*")
				{
					Result=FirstNum * SecondNum;
					answer=String.format("%.2f", Result);
					tf1.setText(answer);
				}
				
				else if(operations == "/")
				{
					Result=FirstNum / SecondNum;
					answer=String.format("%.2f", Result);
					tf1.setText(answer);
				}
				
				else if(operations == "%")
				{
					Result=FirstNum % SecondNum;
					answer=String.format("%.2f", Result);
					tf1.setText(answer);
				}
				
				
			}
		});
		btnEql.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEql.setBounds(290, 520, 70, 73);
		frame.getContentPane().add(btnEql);
	}
}
