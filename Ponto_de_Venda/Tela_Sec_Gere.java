package pdv;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Tela_Sec_Gere extends JFrame{
	JButton pdv, forn, est, prod;
	public void montatudo() {
		frame();
		comandos();
		setVisible(true);
	}
	public void comandos() {
		prod.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Produtos().montatudo();
			}
		});
		forn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Fornecedores().montatudo();
			}
		});
		pdv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Ponto_Venda().montatudo();
			}
		});

	}
	public void frame() {
		setLayout(null);
		setBounds(150, 0, 720, 512);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		prod = new JButton(new ImageIcon(getClass().getResource("produ.png")));
		prod.setBounds(140, 70, 100, 26);
		prod.setBackground(new Color(55, 102, 142));
		prod.setBorderPainted(false);
		add(prod);
		
		pdv = new JButton("PDV");
		pdv.setBounds(0, 183, 140, 70);
		pdv.setFont(new Font("Arial", Font.BOLD, 26));
		pdv.setBackground(new Color(219, 232, 239));
		add(pdv);

		est = new JButton("Estoque");
		est.setBounds(0, 46, 140, 70);
		est.setFont(new Font("Arial", Font.BOLD, 26));
		est.setBackground(new Color(219, 232, 239));
		add(est);

		forn = new JButton("Fonece.");
		forn.setBounds(0, 115, 140, 70);
		forn.setBackground(new Color(219, 232, 239));
		forn.setFont(new Font("Arial", Font.BOLD, 26));
		add(forn);
		
		JLabel cima = new JLabel(new ImageIcon(getClass().getResource("cima.png")));
		cima.setBackground(new Color(0, 0, 0));
		cima.setBounds(-5, -1, 720, 48);
		add(cima);
		
		JPanel ld = new JPanel();
		ld.setBounds(-1, 50, 140, 720);
		ld.setBackground(new Color(219, 232, 239));
		add(ld);

		
		JLabel fun = new JLabel(new ImageIcon(getClass().getResource("fun.png")));
		fun.setBounds(0, 0, 720, 512);
		add(fun);
	}
	public static void main(String[] args) {
		new Tela_Sec_Gere().montatudo();
	}

}
