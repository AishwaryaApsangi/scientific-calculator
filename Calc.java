import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	private JButton btnCos;
	private JButton btnTan;
	private JButton btnB;
	private JButton btnC;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnSqr;
	private JButton btnFac;
	private JButton btnAdd;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnCube;
	private JButton btnLog;
	private JButton btnSub;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnSqrt;
	private JButton btnPow;
	private JButton btnMul;
	private JButton btn0;
	private JButton btnEql;
	private JButton btnDiv;
	private JButton btnDot;
	double intI;
	double intII;
	double total;
	String action;
	String answer;
	Color babyPink = new Color(244, 194, 194);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 761, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBackground(new Color(128, 128, 192));
		textField.setBounds(10, 11, 711, 102);
		textField.setFont(new Font("Calibri", Font.BOLD, 33));
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnSin = new JButton("Sin");
		btnSin.setBackground(babyPink); // Set the background color to blue
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("Sin fn is = ");
				textField.setText(textField.getText() + s);
			}
		});
		btnSin.setBounds(20, 134, 89, 64);
		btnSin.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnSin);

		btnCos = new JButton("Cos");
		btnCos.setBackground(babyPink);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double c = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("Cos fn is = ");
				textField.setText(textField.getText() + c);
			}
		});
		btnCos.setBounds(127, 134, 89, 64);
		btnCos.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnCos);

		btnTan = new JButton("Tan");
		btnTan.setBackground(babyPink);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("Tan fn is = ");
				textField.setText(textField.getText() + t);
			}
		});
		btnTan.setBounds(240, 134, 89, 64);
		btnTan.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnTan);

		btnB = new JButton("B");
		btnB.setBackground(babyPink);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bck = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					bck = str.toString();
					textField.setText(bck);
				}

			}
		});
		btnB.setBounds(352, 134, 89, 64);
		btnB.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnB);

		btnC = new JButton("C");
		btnC.setBackground(babyPink);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(466, 134, 255, 64);
		btnC.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnC);

		btn7 = new JButton("7");
		btn7.setBackground(babyPink);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(20, 209, 89, 64);
		btn7.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btn7);

		btn8 = new JButton("8");
		btn8.setBackground(babyPink);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(127, 209, 89, 64);
		btn8.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btn8);

		btn9 = new JButton("9");
		btn9.setBackground(babyPink);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(240, 209, 89, 64);
		btn9.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btn9);

		btnSqr = new JButton("^2");
		btnSqr.setBackground(babyPink);
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x = (Double.parseDouble(textField.getText()));
				x = x * x;
				textField.setText("Square is = ");
				textField.setText(textField.getText() + x);
			}
		});
		btnSqr.setBounds(352, 209, 89, 64);
		btnSqr.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnSqr);

		btnFac = new JButton("x!");
		btnFac.setBackground(babyPink);
		btnFac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double f = Double.parseDouble(textField.getText());
				double fac = 1;
				if (f != 0) {
					while (f != 0) {
						fac = fac * f;
						f--;
					}
				} else {
					fac = 1;

				}
				textField.setText("The factorial is =");
				textField.setText(textField.getText() + fac);

			}
		});
		btnFac.setBounds(466, 209, 89, 64);
		btnFac.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnFac);

		btnAdd = new JButton("+");
		btnAdd.setBackground(babyPink);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "+";
			}
		});
		btnAdd.setBounds(580, 209, 141, 64);
		btnAdd.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnAdd);

		btn4 = new JButton("4");
		btn4.setBackground(babyPink);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(20, 284, 89, 64);
		btn4.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btn4);

		btn5 = new JButton("5");
		btn5.setBackground(babyPink);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(127, 284, 89, 64);
		btn5.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btn5);

		btn6 = new JButton("6");
		btn6.setBackground(babyPink);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(240, 284, 89, 64);
		btn6.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btn6);

		btnCube = new JButton("^3");
		btnCube.setBackground(babyPink);
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double y = (Double.parseDouble(textField.getText()));
				y = y * y * y;
				textField.setText("Cube is = ");
				textField.setText(textField.getText() + y);

			}
		});
		btnCube.setBounds(352, 284, 89, 64);
		btnCube.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnCube);

		btnLog = new JButton("Log");
		btnLog.setBackground(babyPink);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double log = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("Log is = ");
				textField.setText(textField.getText() + log);
			}
		});
		btnLog.setBounds(466, 284, 89, 64);
		btnLog.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnLog);

		btnSub = new JButton("-");
		btnSub.setBackground(babyPink);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "-";
			}
		});
		btnSub.setBounds(580, 284, 141, 64);
		btnSub.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnSub);

		btn1 = new JButton("1");
		btn1.setBackground(babyPink);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(20, 362, 89, 64);
		btn1.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btn1);

		btn2 = new JButton("2");
		btn2.setBackground(babyPink);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(127, 362, 89, 64);
		btn2.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btn2);

		btn3 = new JButton("3");
		btn3.setBackground(babyPink);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(240, 359, 89, 64);
		btn3.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btn3);

		btnSqrt = new JButton("sqrt");
		btnSqrt.setBackground(babyPink);
		btnSqrt.setBounds(352, 362, 89, 64);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sqr = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("Square root is = ");
				textField.setText(textField.getText() + sqr);
			}
		});
		btnSqrt.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnSqrt);

		btnPow = new JButton("x^y");
		btnPow.setBackground(babyPink);
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI = Double.parseDouble(textField.getText());
				action = "x^y";

			}
		});
		btnPow.setBounds(466, 359, 89, 64);
		btnPow.setFont(new Font("Maiandra GD", Font.BOLD, 23));
		frame.getContentPane().add(btnPow);

		btnMul = new JButton("*");
		btnMul.setBackground(babyPink);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "*";
			}
		});
		btnMul.setBounds(580, 359, 141, 64);
		btnMul.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		frame.getContentPane().add(btnMul);

		btn0 = new JButton("0");
		btn0.setBackground(babyPink);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		btn0.setBounds(20, 437, 196, 64);
		frame.getContentPane().add(btn0);

		btnEql = new JButton("=");
		btnEql.setBackground(babyPink);
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intII = Double.parseDouble(textField.getText());
				if (action == "+") {
					total = intI + intII;
					answer = String.format("%.1f + %.1f = %.2f", intI, intII, total);
					textField.setText(answer);
				} else if (action == "-") {
					total = intI - intII;
					answer = String.format("%.1f - %.1f = %.2f", intI, intII, total);
					textField.setText(answer);

				}

				else if (action == "*") {
					total = intI * intII;
					answer = String.format("%.1f * %.1f = %.2f", intI, intII, total);
					textField.setText(answer);

				}

				else if (action == "/") {
					total = intI / intII;
					answer = String.format("%.1f / %.1f = %.2f", intI, intII, total);
					textField.setText(answer);

				}

				else if (action == "x^y") {
					int i = 0;
					double n = 1;

					while (i < intII) {
						n = n * intI;
						i++;
					}
					answer = String.format("%.1f ^ %.1f = %.2f", intI, intII, n);
					textField.setText(answer);

				}

			}
		});
		btnEql.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		btnEql.setBounds(352, 437, 196, 64);
		frame.getContentPane().add(btnEql);

		btnDiv = new JButton("/");
		btnDiv.setBackground(babyPink);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "/";
			}
		});
		btnDiv.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		btnDiv.setBounds(580, 437, 141, 64);
		frame.getContentPane().add(btnDiv);

		btnDot = new JButton(".");
		btnDot.setBackground(babyPink);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Maiandra GD", Font.BOLD, 31));
		btnDot.setBounds(240, 437, 89, 64);
		frame.getContentPane().add(btnDot);

		JRadioButton btnWant = new JRadioButton("Open Calc");
		btnWant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnPow.setEnabled(true);
				btnLog.setEnabled(true);
				btnSqr.setEnabled(true);
				btnCube.setEnabled(true);
				btnSqrt.setEnabled(true);
				btnFac.setEnabled(true);
			}
		});
		btnWant.setBounds(41, 521, 111, 23);
		frame.getContentPane().add(btnWant);
		frame.getContentPane().setBackground(Color.WHITE);

		JRadioButton btnClose = new JRadioButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnPow.setEnabled(false);
				btnLog.setEnabled(false);
				btnSqr.setEnabled(false);
				btnCube.setEnabled(false);
				btnSqrt.setEnabled(false);
				btnFac.setEnabled(false);

			}
		});
		btnClose.setBounds(649, 521, 111, 23);
		frame.getContentPane().add(btnClose);
	}
}
