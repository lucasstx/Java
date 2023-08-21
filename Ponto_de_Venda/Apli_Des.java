package pdv;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Apli_Des extends JFrame {
	JButton sv = new JButton("Salvar");
	public void montatudo() {
		frame();
		comandos();
		setVisible(true);
	}
	public void frame() {
		setLayout(null);
		setBounds(220, 160, 552, 236);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		JLabel np = new JLabel("Nome do Produto:");
		np.setBounds(10, 10, 220, 25);
		np.setFont(new Font("Arial", Font.BOLD, 25));
		np.setForeground(new Color(0, 0, 0));
		np.setBackground(new Color(255, 255, 255));
		add(np);

		JTextField npc = new JTextField();
		npc.setBounds(230, 10, 250, 30);
		npc.setFont(new Font("Arial", Font.BOLD, 25));
		npc.setForeground(new Color(0, 0, 0));
		npc.setBackground(new Color(147, 203, 234));
		add(npc);

		JLabel pp = new JLabel("Preço do Produto:");
		pp.setBounds(10, 55, 220, 25);
		pp.setFont(new Font("Arial", Font.BOLD, 25));
		pp.setForeground(new Color(0, 0, 0));
		pp.setBackground(new Color(255, 255, 255));
		add(pp);

		JTextField ppc = new JTextField();
		ppc.setBounds(230, 55, 250, 30);
		ppc.setForeground(new Color(0, 0, 0));
		ppc.setFont(new Font("Arial", Font.BOLD, 25));
		ppc.setBackground(new Color(147, 203, 234));
		add(ppc);

		JLabel npp = new JLabel("Novo Preço do Produto:");
		npp.setBounds(10, 100, 300, 25);
		npp.setFont(new Font("Arial", Font.BOLD, 25));
		npp.setForeground(new Color(0, 0, 0));
		npp.setBackground(new Color(255, 255, 255));
		add(npp);
		
		JTextField nppc = new JTextField();
		nppc.setBounds(300, 100, 150, 30);
		nppc.setForeground(new Color(0, 0, 0));
		nppc.setFont(new Font("Arial", Font.BOLD, 25));
		nppc.setBackground(new Color(147, 203, 234));
		add(nppc);
		
		sv.setBounds(50, 140, 150, 40);
		sv.setFont(new Font("Monospaced", Font.BOLD, 25));
		sv.setBackground(new Color(110, 156, 182));
		sv.setForeground(new Color(46, 98, 22));
		add(sv);
	}
	public void comandos() {
		sv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
			}
		});
	}
	public static void main(String[] args) {
		new Apli_Des().montatudo();
	}
}
