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
public class Fornecedores extends JFrame {
	JButton est, forn, pdv, editar, excluir;
	JButton cance, adc;
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
		
		adc = new JButton("Adicionar");
		adc.setFont(new Font("Monospaced", Font.BOLD, 20));
		adc.setBounds(190, 420, 150, 40);
		adc.setBackground(new Color(110, 156, 182));
		adc.setForeground(new Color(0, 0, 0));
		add(adc);

		cance = new JButton("Cancelar");
		cance.setFont(new Font("Monospaced", Font.BOLD, 20));
		cance.setBounds(510, 420, 150, 40);
		cance.setBackground(new Color(110, 156, 182));
		cance.setForeground(new Color(159, 0, 0));
		add(cance);
		
		JLabel nf = new JLabel("Nome dos Fornecedores:");
		nf.setBounds(210, 120, 230, 25);
		nf.setFont(new Font("Arial", Font.BOLD, 15));
		add(nf);
		
		JLabel nuf = new JLabel("Número de Fornecedores:");
		nuf.setBounds(450, 120, 230, 25);
		nuf.setFont(new Font("Arial", Font.BOLD, 15));
		add(nuf);
		
		JLabel forne =  new JLabel(new ImageIcon(getClass().getResource("Fornecedor.png")));
		forne.setBounds(410, 30, 250, 38);
		add(forne);
		
		JPanel qd = new JPanel();
		qd.setBackground(new Color(219, 232, 239));
		qd.setBounds(190, 100, 470, 310);
		add(qd);
		
		JTextField[] b = new JTextField[6];
		for(int i=0; i<b.length; i++) {
			b[i] = new JTextField();
			b[i].setBackground(new Color(0, 0, 0));
			b[i].setEditable(false);
		}
		b[0].setBounds(210, 160, 10, 10);
		b[1].setBounds(210, 190, 10, 10);
		b[2].setBounds(210, 220, 10, 10);
		b[3].setBounds(450, 160, 10, 10);
		b[4].setBounds(450, 190, 10, 10);
		b[5].setBounds(450, 220, 10, 10);
		for(int i=0; i<b.length; i++) {
			add(b[i]);
		}

		editar = new JButton(new ImageIcon(getClass().getResource("editar.png")));
		editar.setBounds(40, 250, 60, 60);
		editar.setBackground(new Color(139, 144, 147));
		add(editar);

		excluir = new JButton(new ImageIcon(getClass().getResource("lixeira.png")));
		excluir.setBounds(40, 370, 60, 60);
		excluir.setBackground(new Color(139, 144, 147));
		add(excluir);

		pdv = new JButton("PDV");
		pdv.setBounds(0, 0, 140, 70);
		pdv.setFont(new Font("Arial", Font.BOLD, 26));
		pdv.setBackground(new Color(219, 232, 239));
		add(pdv);

		est = new JButton("Estoque");
		est.setBounds(0, 69, 140, 70);
		est.setFont(new Font("Arial", Font.BOLD, 26));
		est.setBackground(new Color(219, 232, 239));
		add(est);

		forn = new JButton("Fonece.");
		forn.setBounds(0, 138, 140, 70);
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
		editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Alterar_Forne().montatudo();
			}
		});
		cance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Tela_Ini_Gere().montatudo();
			}
		});
		adc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Cadastro_For().montatudo();
			}
		});
	}
	public static void main(String[] args) {
		new Fornecedores().montatudo();
	}
}
