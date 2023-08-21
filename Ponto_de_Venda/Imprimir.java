package pdv;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Imprimir extends JFrame{
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
		
		JLabel txt = new JLabel(new ImageIcon(getClass().getResource("txt.png")));
		txt.setBounds(160, 100, 400, 36);
		add(txt);
		
		JLabel fundo = new JLabel(new ImageIcon(getClass().getResource("fundo.png")));
		fundo.setBounds(0,  180, 720, 182);
		add(fundo);
		
		JLabel cima = new JLabel(new ImageIcon(getClass().getResource("cima.png")));
		cima.setBackground(new Color(0, 0, 0));
		cima.setBounds(-5, -1, 720, 48);
		add(cima);
		
		cancel = new JButton("Cancelar");
		cancel.setBounds(10, 425, 150, 40);
		cancel.setFont(new Font("Monospaced", Font.BOLD, 20));
		cancel.setBackground(new Color(110, 156, 182));
		cancel.setForeground(new Color(159, 0, 0));
		add(cancel);

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
	}
	public static void main(String[] args) {
		new Imprimir().montatudo();
	}
}
