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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Cadastro_For extends JFrame {
	JButton can, conf;
	JLabel fun, nc, dn, nt, em, cp, rg, es, cd, end, br, txt, cn;
	JTextField ncc, dnc, ntc, emc, cpc, rgc, opcs, esc, cdc, brc, endc, cnc;
	JPanel b1, b2, b3, b4, b5;

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

		nc = new JLabel("Nome completo:");
		nc.setBounds(170, 80, 250, 23);
		nc.setForeground(new Color(0, 0, 0));
		nc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(nc);

		ncc = new JTextField("");
		ncc.setBounds(340, 80, 280, 27);
		ncc.setForeground(new Color(0, 0, 0));
		ncc.setBackground(new Color(157, 200, 224));
		ncc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(ncc);

		em = new JLabel("E-mail:");
		em.setBounds(170, 117, 250, 23);
		em.setForeground(new Color(0, 0, 0));
		em.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(em);

		emc = new JTextField("");
		emc.setBounds(255, 117, 280, 27);
		emc.setForeground(new Color(0, 0, 0));
		emc.setBackground(new Color(157, 200, 224));
		emc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(emc);

		nt = new JLabel("Número de telefone:");
		nt.setBounds(170, 154, 250, 23);
		nt.setForeground(new Color(0, 0, 0));
		nt.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(nt);

		ntc = new JTextField("");
		ntc.setBounds(400, 154, 250, 27);
		ntc.setForeground(new Color(0, 0, 0));
		ntc.setBackground(new Color(157, 200, 224));
		ntc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(ntc);

		dn = new JLabel("Data de nascimento:");
		dn.setBounds(170, 191, 250, 23);
		dn.setForeground(new Color(0, 0, 0));
		dn.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(dn);

		dnc = new JTextField("");
		dnc.setBounds(400, 191, 250, 27);
		dnc.setForeground(new Color(0, 0, 0));
		dnc.setBackground(new Color(157, 200, 224));
		dnc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(dnc);

		
		end = new JLabel("Endereço:");
		end.setBounds(170, 302, 250, 23);
		end.setForeground(new Color(0, 0, 0));
		end.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(end);

		endc = new JTextField("");
		endc.setBounds(280, 302, 145, 27);
		endc.setForeground(new Color(0, 0, 0));
		endc.setBackground(new Color(157, 200, 224));
		endc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(endc);

		cd = new JLabel("Cidade:");
		cd.setBounds(170, 265, 250, 23);
		cd.setForeground(new Color(0, 0, 0));
		cd.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cd);
		
		cdc = new JTextField("");
		cdc.setBounds(255, 265, 145, 27);
		cdc.setForeground(new Color(0, 0, 0));
		cdc.setBackground(new Color(157, 200, 224));
		cdc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cdc);

		cp = new JLabel("CEP:");
		cp.setBounds(170, 228, 250, 23);
		cp.setForeground(new Color(0, 0, 0));
		cp.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cp);
		
		cpc = new JTextField("");
		cpc.setBounds(220, 228, 180, 27);
		cpc.setForeground(new Color(0, 0, 0));
		cpc.setBackground(new Color(157, 200, 224));
		cpc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cpc);
		
		
		es = new JLabel("Estado:");
		es.setBounds(410, 228, 250, 23);
		es.setForeground(new Color(0, 0, 0));
		es.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(es);

		esc = new JTextField();
		esc.setBounds(495, 228, 155, 27);
		esc.setForeground(new Color(0, 0, 0));
		esc.setBackground(new Color(157, 200, 224));
		esc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(esc);

		br = new JLabel("Bairro:");
		br.setBounds(410, 265, 250, 23);
		br.setForeground(new Color(0, 0, 0));
		br.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(br);

		brc = new JTextField("");
		brc.setBounds(495, 265, 155, 27);
		brc.setForeground(new Color(0, 0, 0));
		brc.setBackground(new Color(157, 200, 224));
		brc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(brc);

		rg = new JLabel("RG:");
		rg.setBounds(434, 302, 250, 23);
		rg.setForeground(new Color(0, 0, 0));
		rg.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(rg);

		rgc = new JPasswordField("");
		rgc.setBounds(520, 302, 145, 27);
		rgc.setForeground(new Color(0, 0, 0));
		rgc.setBackground(new Color(157, 200, 224));
		rgc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(rgc);

		cn = new JLabel("CNPJ:");
		cn.setBounds(170, 376, 100, 30);
		cn.setForeground(new Color(0, 0, 0));
		cn.setBackground(new Color(157, 200, 224));
		cn.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cn);

		cnc = new JTextField("");
		cnc.setBounds(230, 380, 280, 27);
		cnc.setForeground(new Color(0, 0, 0));
		cnc.setBackground(new Color(157, 200, 224));
		cnc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cnc);

		conf = new JButton("Confirmar");
		conf.setBounds(555, 430, 120, 35);
		conf.setFont(new Font("Arial", Font.BOLD, 15));
		conf.setForeground(new Color(46, 98, 22));
		conf.setBackground(new Color(110, 156, 182));
		add(conf);

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
		b3.setBounds(120, 65, 24, 353);
		getContentPane().add(b3);

		b4 = new JPanel();
		b4.setLayout(null);
		b4.setBackground(new Color(110, 156, 182));
		b4.setBounds(144, 65, 5, 353);
		getContentPane().add(b4);

		b5 = new JPanel();
		b5.setLayout(null);
		b5.setBackground(new Color(219, 232, 239));
		b5.setBounds(144, 65, 530, 353);
		getContentPane().add(b5);

		fun = new JLabel(new ImageIcon(getClass().getResource("fun.png")));
		fun.setBounds(0, 0, 720, 512);
		add(fun);
	}

	public void comandos() {
		conf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Produtos().montatudo();
			}
		});
	}
	public static void main(String[] args) {
		new Cadastro_For().montatudo();
	}
}
