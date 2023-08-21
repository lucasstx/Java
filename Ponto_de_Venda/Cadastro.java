package pdv;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Cadastro extends JFrame {
	JButton can;
	int loga;
	JLabel fun, nc, dn, nt, em, cp, rg, es, cd, sx, end, br, sn, txt;
	JTextField ncc, dnc, ntc, emc, cpc, rgc, opcs, esc, cdc, brc, endc;
	JPasswordField snc = new JPasswordField();
	JPanel b1, b2, b3, b4, b5;
	JButton img, cx, gr;
	JComboBox<String> sxc = new JComboBox<String>();
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
		
		cp = new JLabel("CPF:");
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
		
		sx = new JLabel("Sexo:");
		sx.setBounds(434, 265, 250, 23);
		sx.setForeground(new Color(0, 0, 0));
		sx.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(sx);
		
		sxc.addItem("Masculino");
		sxc.addItem("Feminino");
		sxc.setBounds(495, 265, 155, 27);
		sxc.setForeground(new Color(0, 0, 0));
		sxc.setBackground(new Color(157, 200, 224));
		sxc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(sxc);
		
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
		
		br = new JLabel("Bairro:");
		br.setBounds(434, 302, 250, 23);
		br.setForeground(new Color(0, 0, 0));
		br.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(br);
		
		brc = new JTextField("");
		brc.setBounds(520, 302, 145, 27);
		brc.setForeground(new Color(0, 0, 0));
		brc.setBackground(new Color(157, 200, 224));
		brc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(brc);
		
		sn = new JLabel("Senha:");
		sn.setBounds(170, 339, 250, 23);
		sn.setForeground(new Color(0, 0, 0));
		sn.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(sn);
		
		snc = new JPasswordField("");
		snc.setBounds(245, 339, 145, 27);
		snc.setForeground(new Color(0, 0, 0));
		snc.setBackground(new Color(157, 200, 224));
		snc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(snc);
		
		rg = new JLabel("RG:");
		rg.setBounds(434, 339, 250, 23);
		rg.setForeground(new Color(0, 0, 0));
		rg.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(rg);
		
		rgc = new JPasswordField("");
		rgc.setBounds(470, 339, 145, 27);
		rgc.setForeground(new Color(0, 0, 0));
		rgc.setBackground(new Color(157, 200, 224));
		rgc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(rgc);
		
		cx = new JButton("Caixa");
		cx.setBounds(170, 376, 100, 30);
		cx.setForeground(new Color(0, 0, 0));
		cx.setBackground(new Color(157, 200, 224));
		cx.setFont(new Font("Arial", Font.BOLD, 15));
		add(cx);
		
		gr = new JButton("Gerente");
		gr.setBounds(280, 376, 100, 30);
		gr.setForeground(new Color(0, 0, 0));
		gr.setBackground(new Color(157, 200, 224));
		gr.setFont(new Font("Arial", Font.BOLD, 15));
		add(gr);
		
		txt = new JLabel("<- Qual função será exercida?");
		txt.setBounds(390, 376, 240, 35);
		txt.setForeground(new Color(0, 0, 0));
		txt.setFont(new Font("Arial", Font.BOLD, 17));
		add(txt);
		
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
		cx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Ponto_Venda().montatudo();
				setVisible(false);
			}
		});
		gr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Tela_Ini_Gere().montatudo();
				setVisible(false);
			}
		});
	}
}
