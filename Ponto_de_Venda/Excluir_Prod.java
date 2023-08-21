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
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Excluir_Prod extends JFrame{
	JPanel fundo = new JPanel();
	JButton exclui, cance;
	JLabel fun, nc, dn, nt, em, cp, rg, es, cd, end, br, txt, cn;
	JTextField ncc, dnc, ntc, emc, cpc, rgc, opcs, esc, cdc, brc, endc, cnc;
	JButton est, forn, pdv, editar, excluir, cancel, list;
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
		fundo.setLayout(null);
		
		JLabel ex = new JLabel("Excluir Produto");
		ex.setBounds(150, 10, 200, 25);
		ex.setFont(new Font("Arial", Font.BOLD, 20));
		fundo.add(ex);
		
		JLabel linha = new JLabel(new ImageIcon(getClass().getResource("linha.png")));
		linha.setBounds(-1, 45, 530, 2);
		fundo.add(linha);
		
		JLabel txt1 = new JLabel("Deseja Realmente ");
		txt1.setBounds(100, 120, 300, 30);
		txt1.setFont(new Font("Arial", Font.BOLD, 30));
		fundo.add(txt1);
		
		JLabel txt2 = new JLabel("Excluir este Produto?");
		txt2.setBounds(80, 160, 350, 30);
		txt2.setFont(new Font("Arial", Font.BOLD, 30));
		fundo.add(txt2); 
		
		exclui = new JButton("Excluir");
		exclui.setBounds(10, 250, 150, 40);
		exclui.setFont(new Font("Monospaced", Font.BOLD, 20));
		exclui.setBackground(new Color(110, 156, 182));
		exclui.setForeground(new Color(159, 0, 0));
		fundo.add(exclui);
		
		cance = new JButton("Cancelar");
		cance.setBounds(290, 250, 150, 40);
		cance.setFont(new Font("Monospaced", Font.BOLD, 20));
		cance.setBackground(new Color(110, 156, 182));
		cance.setForeground(new Color(159, 0, 0));
		fundo.add(cance);
		
		
		
		JLabel cima = new JLabel(new ImageIcon(getClass().getResource("cima.png")));
		cima.setBackground(new Color(0, 0, 0));
		cima.setBounds(-5, -1, 720, 48);
		add(cima);
		
		cancel = new JButton("Cancelar");
		cancel.setBounds(150, 425, 150, 40);
		cancel.setFont(new Font("Monospaced", Font.BOLD, 20));
		cancel.setBackground(new Color(110, 156, 182));
		cancel.setForeground(new Color(159, 0, 0));
		add(cancel);
		
		fundo.setBounds(200, 85, 450, 305);
		fundo.setBackground(new Color(255, 255, 255));
		add(fundo);
		
		editar = new JButton(new ImageIcon(getClass().getResource("editar.png")));
		editar.setBounds(40, 220, 60, 60);
		editar.setBackground(new Color(139, 144, 147));
		add(editar);

		excluir = new JButton(new ImageIcon(getClass().getResource("lixeira.png")));
		excluir.setBounds(40, 300, 60, 60);
		excluir.setBackground(new Color(139, 144, 147));
		add(excluir);

		est = new JButton("Estoque");
		est.setBounds(0, 47, 140, 70);
		est.setFont(new Font("Arial", Font.BOLD, 26));
		est.setBackground(new Color(219, 232, 239));
		add(est);

		forn = new JButton("Fonece.");
		forn.setBounds(0, 116, 140, 70);
		forn.setBackground(new Color(219, 232, 239));
		forn.setFont(new Font("Arial", Font.BOLD, 26));
		add(forn);

		JPanel ld = new JPanel();
		ld.setBounds(-1, -1, 140, 720);
		ld.setBackground(new Color(219, 232, 239));
		add(ld);

		JLabel fun = new JLabel(new ImageIcon(getClass().getResource("fun.png")));
		fun.setBounds(0, 0, 720, 512);
		add(fun);
	}
	public void comandos() {
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Produtos().montatudo();
			}
		});
		exclui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Produtos().montatudo();
			}
		});
		cance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Produtos().montatudo();
			}
		});
	}
	public static void main(String[] args) {
		new Excluir_Prod().montatudo();
	}
}
