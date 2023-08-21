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
public class Alterar_Forne extends JFrame{
	JLabel fun, nc, dn, nt, em, cp, rg, es, cd, end, br, txt, cn;
	JTextField ncc, dnc, ntc, emc, cpc, rgc, opcs, esc, cdc, brc, endc, cnc;
	JButton est, forn, pdv, editar, excluir, cancel;
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
		
		cancel = new JButton("Cancelar");
		cancel.setBounds(530, 425, 150, 40);
		cancel.setFont(new Font("Monospaced", Font.BOLD, 20));
		cancel.setBackground(new Color(110, 156, 182));
		cancel.setForeground(new Color(159, 0, 0));
		add(cancel);
		
		nc = new JLabel("Nome completo:");
		nc.setBounds(170, 120, 250, 23);
		nc.setForeground(new Color(0, 0, 0));
		nc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(nc);

		ncc = new JTextField("");
		ncc.setBounds(340, 120, 280, 27);
		ncc.setForeground(new Color(0, 0, 0));
		ncc.setBackground(new Color(157, 200, 224));
		ncc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(ncc);

		em = new JLabel("E-mail:");
		em.setBounds(170, 157, 250, 23);
		em.setForeground(new Color(0, 0, 0));
		em.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(em);

		emc = new JTextField("");
		emc.setBounds(255, 157, 280, 27);
		emc.setForeground(new Color(0, 0, 0));
		emc.setBackground(new Color(157, 200, 224));
		emc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(emc);

		nt = new JLabel("Número de telefone:");
		nt.setBounds(170, 194, 250, 23);
		nt.setForeground(new Color(0, 0, 0));
		nt.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(nt);

		ntc = new JTextField("");
		ntc.setBounds(400, 194, 250, 27);
		ntc.setForeground(new Color(0, 0, 0));
		ntc.setBackground(new Color(157, 200, 224));
		ntc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(ntc);

		dn = new JLabel("Data de nascimento:");
		dn.setBounds(170, 231, 250, 23);
		dn.setForeground(new Color(0, 0, 0));
		dn.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(dn);

		dnc = new JTextField("");
		dnc.setBounds(400, 231, 250, 27);
		dnc.setForeground(new Color(0, 0, 0));
		dnc.setBackground(new Color(157, 200, 224));
		dnc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(dnc);

		
		end = new JLabel("Endereço:");
		end.setBounds(170, 342, 250, 23);
		end.setForeground(new Color(0, 0, 0));
		end.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		add(end);

		endc = new JTextField("");
		endc.setBounds(280, 342, 145, 27);
		endc.setForeground(new Color(0, 0, 0));
		endc.setBackground(new Color(157, 200, 224));
		endc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(endc);

		cd = new JLabel("Cidade:");
		cd.setBounds(170, 305, 250, 23);
		cd.setForeground(new Color(0, 0, 0));
		cd.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cd);
		
		cdc = new JTextField("");
		cdc.setBounds(255, 305, 145, 27);
		cdc.setForeground(new Color(0, 0, 0));
		cdc.setBackground(new Color(157, 200, 224));
		cdc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cdc);

		cp = new JLabel("CEP:");
		cp.setBounds(170, 268, 250, 23);
		cp.setForeground(new Color(0, 0, 0));
		cp.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cp);
		
		cpc = new JTextField("");
		cpc.setBounds(220, 268, 180, 27);
		cpc.setForeground(new Color(0, 0, 0));
		cpc.setBackground(new Color(157, 200, 224));
		cpc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(cpc);
		
		
		es = new JLabel("Estado:");
		es.setBounds(410, 268, 250, 23);
		es.setForeground(new Color(0, 0, 0));
		es.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(es);

		esc = new JTextField();
		esc.setBounds(495, 268, 155, 27);
		esc.setForeground(new Color(0, 0, 0));
		esc.setBackground(new Color(157, 200, 224));
		esc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(esc);

		br = new JLabel("Bairro:");
		br.setBounds(410, 305, 250, 23);
		br.setForeground(new Color(0, 0, 0));
		br.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(br);

		brc = new JTextField("");
		brc.setBounds(495, 305, 155, 27);
		brc.setForeground(new Color(0, 0, 0));
		brc.setBackground(new Color(157, 200, 224));
		brc.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(brc);

		rg = new JLabel("RG:");
		rg.setBounds(474, 342, 250, 23);
		rg.setForeground(new Color(0, 0, 0));
		rg.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(rg);

		rgc = new JPasswordField("");
		rgc.setBounds(520, 342, 145, 27);
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
		
		JPanel fundo = new JPanel();
		fundo.setBounds(150, 100, 530, 320);
		fundo.setBackground(new Color(255, 255, 255));
		add(fundo);
		
		JLabel forne =  new JLabel(new ImageIcon(getClass().getResource("Fornecedor.png")));
		forne.setBounds(410, 30, 250, 38);
		add(forne);
		
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
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Fornecedores().montatudo();
			}
		});
	}
	public static void main(String[] args) {
		new Alterar_Forne().montatudo();
	}
}
