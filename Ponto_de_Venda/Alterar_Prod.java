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
public class Alterar_Prod extends JFrame{
	JPanel fundo = new JPanel();
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
		
		JLabel cima = new JLabel(new ImageIcon(getClass().getResource("cima.png")));
		cima.setBackground(new Color(0, 0, 0));
		cima.setBounds(-5, -1, 720, 48);
		add(cima);
		
		JLabel np = new JLabel("Nome do Produto:");
		np.setBounds(10, 80, 180, 25);
		np.setFont(new Font("Arial", Font.BOLD, 20));
		fundo.add(np);
		
		JTextField npc = new JTextField();
		npc.setBounds(185, 78, 250, 30);
		npc.setBackground(new Color(147, 203, 234));
		fundo.add(npc);
		
		JLabel dt = new JLabel("Data de Fabricação:");
		dt.setBounds(10, 130, 250, 25);
		dt.setFont(new Font("Arial", Font.BOLD, 20));
		fundo.add(dt);
		
		JTextField dtc = new JTextField();
		dtc.setBounds(200, 130, 250, 30);
		dtc.setBackground(new Color(147, 203, 234));
		fundo.add(dtc);
		
		JLabel dtf = new JLabel("Data de Validação:");
		dtf.setBounds(10, 180, 250, 25);
		dtf.setFont(new Font("Arial", Font.BOLD, 20));
		fundo.add(dtf);
		
		JTextField dtfc = new JTextField();
		dtfc.setBounds(190, 180, 250, 30);
		dtfc.setBackground(new Color(147, 203, 234));
		fundo.add(dtfc);
		
		JLabel pp = new JLabel("Preço do Produto:");
		pp.setBounds(10, 230, 250, 25);
		pp.setFont(new Font("Arial", Font.BOLD, 20));
		fundo.add(pp);
		
		JTextField ppc = new JTextField();
		ppc.setBackground(new Color(147, 203, 234));
		ppc.setBounds(185, 230, 250, 30);
		fundo.add(ppc);
		
		JLabel cd = new JLabel("Código:");
		cd.setBounds(10, 280, 250, 25);
		cd.setFont(new Font("Arial", Font.BOLD, 20));
		fundo.add(cd);
		
		JTextField cdc = new JTextField();
		cdc.setBackground(new Color(147, 203, 234));
		cdc.setBounds(90, 280, 250, 30);
		fundo.add(cdc);
		
		JLabel des = new JLabel("Descrição:");
		des.setBounds(10, 330, 250, 25);
		des.setFont(new Font("Arial", Font.BOLD, 20));
		fundo.add(des);
		
		JTextField desc = new JTextField();
		desc.setBounds(115, 330, 250, 30);
		desc.setBackground(new Color(147, 203, 234));
		fundo.add(desc);
		
		JLabel altp = new JLabel("Alterar Produto");
		altp.setBounds(180, 5, 150, 25);
		altp.setFont(new Font("Arial", Font.BOLD, 20));
		fundo.add(altp);
		
		JLabel linha = new JLabel(new ImageIcon(getClass().getResource("linha.png")));
		linha.setBounds(-1, 40, 530, 2);
		fundo.add(linha);
		
		cancel = new JButton("Cancelar");
		cancel.setBounds(150, 425, 150, 40);
		cancel.setFont(new Font("Monospaced", Font.BOLD, 20));
		cancel.setBackground(new Color(110, 156, 182));
		cancel.setForeground(new Color(159, 0, 0));
		add(cancel);
		
		fundo.setBounds(150, 50, 530, 370);
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
		
		list = new JButton(new ImageIcon(getClass().getResource("lista.png")));
		list.setBounds(40, 380, 60, 60);
		list.setBackground(new Color(139, 144, 147));
		add(list);

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
	}
	public static void main(String[] args) {
		new Alterar_Prod().montatudo();
	}
}
