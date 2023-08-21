package pdv;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Login extends JFrame{
	int loga = new Cadastro().loga;
	JPanel b1, b2, b3, b4, b5;
	JLabel lo, lo2, sen, cada, fun;
	JTextField log, senh;
	JButton ent, esqsen, cadas;
	public void montatudo() {
		frame();
		comandos();
		setVisible(true);
	}
	public void frame() {
		setLayout(null);
		setBounds(150, 0, 720, 512);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		lo = new JLabel("LOGIN");
		lo.setBounds(335, 30, 150, 35);
		lo.setForeground(new Color(255, 255, 255));
		lo.setFont(new Font("Monospaced", Font.BOLD, 35));
		add(lo);
		
		lo2 = new JLabel("login:");
		lo2.setBounds(220, 170, 80, 23);
		lo2.setForeground(new Color(0, 0, 0));
		lo2.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(lo2);
		
		sen = new JLabel("senha:");
		sen.setBounds(220, 240, 80, 23);
		sen.setForeground(new Color(0, 0, 0));
		sen.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(sen);
		
		cada = new JLabel("Não tem uma conta?");
		cada.setBounds(225, 385, 190, 23);
		cada.setForeground(new Color(0, 0, 0));
		cada.setFont(new Font("Monospaced", Font.BOLD, 17));
		add(cada);
		
		cadas = new JButton("Cadastre-se");
		cadas.setBounds(405, 385, 135, 23);
		cadas.setBackground(new Color(23, 73, 113));
		cadas.setForeground(new Color(0 ,0, 0));
		cadas.setFont(new Font("Monospaced", Font.ITALIC, 15));
		cadas.setBorderPainted(false);
		add(cadas);
		
		log = new JTextField();
		log.setBounds(300, 165, 244, 33);
		log.setBackground(new Color(157, 200, 224));
		log.setForeground(new Color(0, 0, 0));
		log.setFont(new Font("Monospaced", Font.ITALIC, 20));
		add(log);
		
		senh = new JTextField();
		senh.setBounds(300, 235, 244, 33);
		senh.setForeground(new Color(0, 0, 0));
		senh.setBackground(new Color(157, 200, 224));
		senh.setFont(new Font("Monospaced", Font.ITALIC, 20));
		add(senh);
		
		ent = new JButton("entrar");
		ent.setBounds(340, 290, 120, 40);
		ent.setFont(new Font("Monospaced", Font.BOLD, 20));
		ent.setBackground(new Color(110, 156, 182));
		ent.setForeground(new Color(46, 98, 22));
		add(ent);
		
		esqsen = new JButton("Esqueceu a senha?");
		esqsen.setBounds(317, 340, 160, 13);
		esqsen.setFont(new Font("Monospaced", Font.ITALIC, 12));
		esqsen.setBackground(new Color(245, 245, 245));
		esqsen.setForeground(new Color(0, 0, 0));
		esqsen.setBorderPainted(false);
		add(esqsen);
		
		b1 = new JPanel();
		b1.setLayout(null);
		b1.setBackground(new Color(157, 200, 224));
		b1.setBounds(0, 0, 66, 512);
		getContentPane().add(b1);
		
		b2 = new JPanel();
		b2.setLayout(null);
		b2.setBackground(new Color(110, 156, 182));
		b2.setBounds(0, 0, 72, 512);
		getContentPane().add(b2);
		
		b3 = new JPanel();
		b3.setLayout(null);
		b3.setBackground(new Color(157, 200, 224));
		b3.setBounds(170, 90, 20, 288);
		getContentPane().add(b3);
		
		b4 = new JPanel();
		b4.setLayout(null);
		b4.setBackground(new Color(110, 156, 182));
		b4.setBounds(190, 90, 5, 288);
		getContentPane().add(b4);
		
		b5 = new JPanel();
		b5.setLayout(null);
		b5.setBackground(new Color(245, 245, 245));
		b5.setBounds(195, 90, 400, 288);
		getContentPane().add(b5);
		
		fun = new JLabel(new ImageIcon(getClass().getResource("fun.png")));
		fun.setBounds(0, 0, 720, 512);
		add(fun);
	}
	public void comandos() {
		esqsen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,  "");
			}
		});
		ent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(loga == 1) {
					setVisible(false);
					new Ponto_Venda().montatudo();
				}
				else if(loga == 2){
					setVisible(false);
					new Tela_Ini_Gere().montatudo();
				}
			}
		});
		cadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Cadastro ca = new Cadastro();
				ca.montatudo();
			}
		});
	}
}
