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
public class Produtos extends JFrame {
	JButton editar, excluir, forn, list;
	JButton est,pdv, ok;
	public void montatudo() {
		frame();
		comandos();
		setVisible(true);
	}
	public static void main(String[] args) {
		new Produtos().montatudo();
	}
	public void comandos() {
		forn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Fornecedores().montatudo();
			}
		});
		editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Alterar_Prod().montatudo();
			}
		});
		excluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Excluir_Prod().montatudo();
			}
		});
		list.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Imprimir().montatudo();
			}
		});
        pdv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Ponto_Venda().montatudo();
			}
		});
        ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Cadastro_Pro().montatudo();
			}
		});
	}
	public void frame() {
		setLayout(null);
		setBounds(150, 0, 720, 512);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		editar = new JButton(new ImageIcon(getClass().getResource("editar.png")));
		editar.setBounds(40, 260, 60, 60);
		editar.setBackground(new Color(139, 144, 147));
		add(editar);

		excluir = new JButton(new ImageIcon(getClass().getResource("lixeira.png")));
		excluir.setBounds(40, 335, 60, 60);
		excluir.setBackground(new Color(139, 144, 147));
		add(excluir);
		
		list = new JButton(new ImageIcon(getClass().getResource("lista.png")));
		list.setBounds(40, 410, 60, 60);
		list.setBackground(new Color(139, 144, 147));
		add(list);
		
		pdv = new JButton("PDV");
		pdv.setBounds(0, 183, 140, 70);
		pdv.setFont(new Font("Arial", Font.BOLD, 26));
		pdv.setBackground(new Color(219, 232, 239));
		add(pdv);

		est = new JButton("Produtos");
		est.setBounds(0, 46, 140, 70);
		est.setFont(new Font("Arial", Font.BOLD, 24));
		est.setBackground(new Color(219, 232, 239));
		add(est);

		forn = new JButton("Fonece.");
		forn.setBounds(0, 115, 140, 70);
		forn.setBackground(new Color(219, 232, 239));
		forn.setFont(new Font("Arial", Font.BOLD, 26));
		add(forn);

		JLabel Nitens, cod, desc, quant, vl_tot;
		JTextField pesq = new JTextField("                   Pesquise seu produto aqui");
		pesq.setBackground(new Color(147, 203, 234));
		pesq.setBounds(150, 50, 350, 35);
		pesq.setBorder(null);
		pesq.setFont(new Font("Arial", Font.BOLD, 15));
		add(pesq);

		Nitens = new JLabel("N°itens");
		Nitens.setForeground(new Color(255, 255, 255));
		Nitens.setFont(new Font("Arial", Font.BOLD, 18));
		Nitens.setBounds(150, 90, 100, 18);
		add(Nitens);

		cod = new JLabel("Código");
		cod.setForeground(new Color(255, 255, 255));
		cod.setFont(new Font("Arial", Font.BOLD, 18));
		cod.setBounds(240, 90, 100, 18);
		add(cod);

		desc = new JLabel("Descrição");
		desc.setForeground(new Color(255, 255, 255));
		desc.setFont(new Font("Arial", Font.BOLD, 18));
		desc.setBounds(340, 90, 100, 18);
		add(desc);

		quant = new JLabel("Quantidade");
		quant.setForeground(new Color(255, 255, 255));
		quant.setFont(new Font("Arial", Font.BOLD, 18));
		quant.setBounds(460, 90, 100, 18);
		add(quant);

		vl_tot = new JLabel("Valor total");
		vl_tot.setForeground(new Color(255, 255, 255));
		vl_tot.setFont(new Font("Arial", Font.BOLD, 18));
		vl_tot.setBounds(590, 90, 100, 18);
		add(vl_tot);

		JLabel txta = new JLabel("R$:");
		txta.setBounds(585, 380, 100, 25);
		txta.setForeground(new Color(255, 255, 255));
		txta.setFont(new Font("Arial", Font.BOLD, 18));
		add(txta);

		JTextField vl_totc = new JTextField();
		vl_totc.setBounds(620, 380, 70, 25);
		vl_totc.setBorder(null);
		vl_totc.setFont(new Font("Arial", Font.BOLD, 15));
		vl_totc.setBackground(new Color(147, 203, 234));
		vl_totc.setEditable(false);
		add(vl_totc);

		JPanel[] bar = new JPanel[4];
		for (int i = 0; i < bar.length; i++) {
			bar[i] = new JPanel();
			bar[i].setBackground(new Color(110, 156, 182));
		}
		bar[0].setBounds(223, 95, 5, 310);
		bar[1].setBounds(320, 95, 5, 310);
		bar[2].setBounds(440, 95, 5, 310);
		bar[3].setBounds(572, 95, 5, 310);
		for (int i = 0; i < bar.length; i++) {
			add(bar[i]);
		}

		JButton canca;

		canca = new JButton("Cancelar");
		canca.setBounds(150, 415, 140, 45);
		canca.setForeground(new Color(159, 0, 0));
		canca.setFont(new Font("Arial", Font.BOLD, 20));
		canca.setBackground(new Color(110, 156, 182));
		add(canca);

		ok = new JButton("adicionar");
		ok.setBounds(550, 415, 140, 45);
		ok.setForeground(new Color(0, 0, 0));
		ok.setFont(new Font("Arial", Font.BOLD, 20));
		ok.setBackground(new Color(110, 156, 182));
		add(ok);
		
		JPanel ld = new JPanel();
		ld.setBounds(-1, 50, 140, 720);
		ld.setBackground(new Color(219, 232, 239));
		add(ld);

		JLabel cima = new JLabel(new ImageIcon(getClass().getResource("cima.png")));
		cima.setBackground(new Color(0, 0, 0));
		cima.setBounds(-5, -1, 720, 48);
		add(cima);
		
		getContentPane().setBackground(new Color(28, 76, 116));
	}
}
