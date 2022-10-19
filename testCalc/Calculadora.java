package testCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	String sinal;
	Double valor1, valor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 301);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 164, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 164, 255));
		panel.setBounds(10, 11, 299, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(10, 37, 279, 33);
		panel.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnUm = new JButton("1");
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "1");
			}
		});
		btnUm.setBackground(new Color(255, 128, 255));
		btnUm.setBounds(10, 92, 48, 23);
		panel.add(btnUm);
		
		JButton btnDois = new JButton("2");
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "2");
			}
		});
		btnDois.setBackground(new Color(255, 128, 255));
		btnDois.setBounds(68, 92, 48, 23);
		panel.add(btnDois);
		
		JButton btnTres = new JButton("3");
		btnTres.setBackground(new Color(255, 128, 255));
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "3");
			}
		});
		btnTres.setBounds(126, 92, 48, 23);
		panel.add(btnTres);
		
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "4");
			}
		});
		btnQuatro.setBackground(new Color(255, 128, 255));
		btnQuatro.setBounds(10, 126, 48, 23);
		panel.add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "5");
			}
		});
		btnCinco.setBackground(new Color(255, 128, 255));
		btnCinco.setBounds(68, 126, 48, 23);
		panel.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "6");
			}
		});
		btnSeis.setBackground(new Color(255, 128, 255));
		btnSeis.setBounds(126, 126, 48, 23);
		panel.add(btnSeis);
		
		JButton btnSete = new JButton("7");
		btnSete.setBackground(new Color(255, 128, 255));
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "7");
			}
		});
		btnSete.setBounds(10, 160, 48, 23);
		panel.add(btnSete);
		
		JButton btnOito = new JButton("8");
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "8");
			}
		});
		btnOito.setBackground(new Color(255, 128, 255));
		btnOito.setBounds(68, 160, 48, 23);
		panel.add(btnOito);
		
		JButton btnNove = new JButton("9");
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "9");
			}
		});
		btnNove.setBackground(new Color(255, 128, 255));
		btnNove.setBounds(126, 160, 48, 23);
		panel.add(btnNove);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "0");
			}
		});
		btnZero.setBackground(new Color(255, 128, 255));
		btnZero.setBounds(10, 194, 106, 23);
		panel.add(btnZero);
		
		JButton btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "adicao";
			}
		});
		btnMais.setBackground(new Color(255, 128, 255));
		btnMais.setBounds(241, 92, 48, 23);
		panel.add(btnMais);
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "subtracao";
			}
		});
		btnMenos.setBackground(new Color(255, 128, 255));
		btnMenos.setBounds(241, 126, 48, 23);
		panel.add(btnMenos);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "multiplicacao";
			}
		});
		btnMult.setBackground(new Color(255, 128, 255));
		btnMult.setBounds(241, 160, 48, 23);
		panel.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "divisao";
			}
		});
		btnDiv.setBackground(new Color(255, 128, 255));
		btnDiv.setBounds(241, 194, 48, 23);
		panel.add(btnDiv);
		
		JButton btnLimpa = new JButton("CE");
		btnLimpa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
			}
		});
		btnLimpa.setBackground(new Color(255, 128, 255));
		btnLimpa.setBounds(184, 92, 48, 23);
		panel.add(btnLimpa);
		
		JButton btnApaga = new JButton("C");
		btnApaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = null;
				valor2 = null;
				txtResultado.setText("");
			}
		});
		btnApaga.setBackground(new Color(255, 128, 255));
		btnApaga.setBounds(184, 126, 48, 23);
		panel.add(btnApaga);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtResultado.getText());
				if (sinal == "adicao") {
					txtResultado.setText(String.valueOf(valor1 + valor2));
				} else if (sinal == "subtracao") {
					txtResultado.setText(String.valueOf(valor1 - valor2));
				} else if (sinal == "multiplicacao") {
					txtResultado.setText(String.valueOf(valor1 * valor2));
				} else if (sinal == "divisao") {
					txtResultado.setText(String.valueOf(valor1 / valor2));
				} else {
					txtResultado.setText("Erro!");
				}
			}
		});
		btnIgual.setBackground(new Color(255, 128, 255));
		btnIgual.setBounds(184, 160, 48, 57);
		panel.add(btnIgual);
		
		JButton btnPonto = new JButton(".");
		btnPonto.setBackground(new Color(255, 128, 255));
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ ".");
			}
		});
		btnPonto.setBounds(126, 194, 48, 23);
		panel.add(btnPonto);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(111, 12, 89, 14);
		panel.add(lblNewLabel);
	}
}
