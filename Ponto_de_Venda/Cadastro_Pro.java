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
public class Cadastro_Pro extends JFrame{
	 JTextField npc, dtfc, dtvc, prc, codc, desc;
	 JButton conf, can;
	public void montatudo() {
		frame();
		comandos();
		setVisible(true);
	}
	public static void main(String[] args) {
		new Cadastro_Pro().montatudo();
	}
	public void frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 0, 720, 512);
		
		JPanel b1 = new JPanel();
		b1.setBounds(0, 0, 66, 512);
		b1.setBackground(new Color(157, 200, 224));
		b1.setLayout(null);
		getContentPane().add(b1);
		
		JPanel b2 = new JPanel();
		b2.setBackground(new Color(110, 156, 182));
		b2.setBounds(0, 0, 72, 512);
		getContentPane().add(b2);
		
		JPanel b3 = new JPanel();
		b3.setBackground(new Color(157, 200, 224));
		b3.setBounds(170, 90, 20, 288);
		getContentPane().add(b3);
		
		JPanel b4 = new JPanel();
		b4.setBackground(new Color(110, 156, 182));
		b4.setBounds(190, 90, 5, 288);
		getContentPane().add(b4);
		
		JPanel b5 = new JPanel();
		b5.setBackground(new Color(245, 245, 245));
		b5.setBounds(195, 90, 400, 288);
		getContentPane().add(b5);
		b5.setLayout(null);
		
		JLabel np = new JLabel("Nome do Produto:");
		np.setFont(new Font("Monospaced", Font.BOLD, 20));
		np.setBounds(10, 11, 192, 23);
		b5.add(np);
		
		npc = new JTextField();
		npc.setFont(new Font("Monospaced", Font.BOLD, 18));
		npc.setBackground(new Color(147, 203, 234));
		npc.setBounds(212, 11, 171, 23);
		b5.add(npc);
		npc.setColumns(10);
		
		JLabel dtf = new JLabel("Data de Fabricação:");
		dtf.setFont(new Font("Monospaced", Font.BOLD, 20));
		dtf.setBounds(10, 43, 228, 23);
		b5.add(dtf);
		
		dtfc = new JTextField();
		dtfc.setFont(new Font("Monospaced", Font.BOLD, 18));
		dtfc.setBackground(new Color(147, 203, 234));
		dtfc.setColumns(10);
		dtfc.setBounds(242, 45, 141, 23);
		b5.add(dtfc);
		
		JLabel dtv = new JLabel("Data de Validação:");
		dtv.setFont(new Font("Monospaced", Font.BOLD, 20));
		dtv.setBounds(10, 77, 228, 23);
		b5.add(dtv);
		
		dtvc = new JTextField();
		dtvc.setFont(new Font("Monospaced", Font.BOLD, 18));
		dtvc.setBackground(new Color(147, 203, 234));
		dtvc.setColumns(10);
		dtvc.setBounds(227, 79, 156, 23);
		b5.add(dtvc);
		
		JLabel pr = new JLabel("Preço do Produto:");
		pr.setFont(new Font("Monospaced", Font.BOLD, 20));
		pr.setBounds(10, 111, 204, 23);
		b5.add(pr);
		
		prc = new JTextField();
		prc.setFont(new Font("Monospaced", Font.BOLD, 18));
		prc.setBackground(new Color(147, 203, 234));
		prc.setColumns(10);
		prc.setBounds(215, 114, 156, 23);
		b5.add(prc);
		
		JLabel cod = new JLabel("Código:");
		cod.setFont(new Font("Monospaced", Font.BOLD, 20));
		cod.setBounds(10, 145, 84, 23);
		b5.add(cod);
		
		codc = new JTextField();
		codc.setBackground(new Color(147, 203, 234));
		codc.setFont(new Font("Monospaced", Font.BOLD, 18));
		codc.setColumns(10);
		codc.setBounds(97, 148, 156, 23);
		b5.add(codc);
		
		JLabel des = new JLabel("Descrição:");
		des.setFont(new Font("Monospaced", Font.BOLD, 20));
		des.setBounds(10, 179, 120, 23);
		b5.add(des);
		
		desc = new JTextField();
		desc.setFont(new Font("Monospaced", Font.BOLD, 18));
		desc.setBackground(new Color(147, 203, 234));
		desc.setColumns(10);
		desc.setBounds(132, 182, 239, 23);
		b5.add(desc);
		
		conf = new JButton("Confirmar");
		conf.setBackground(new Color(110, 156, 182));
		conf.setForeground(new Color(46, 98, 22));
		conf.setFont(new Font("Arial", Font.BOLD, 15));
		conf.setBounds(263, 248, 120, 29);
		b5.add(conf);
		
		can = new JButton("Cancelar");
		can.setForeground(new Color(46, 98, 22));
		can.setFont(new Font("Arial", Font.BOLD, 15));
		can.setBackground(new Color(110, 156, 182));
		can.setBounds(118, 248, 120, 29);
		b5.add(can);
		
		JLabel fun = new JLabel("");
		
		fun.setBounds(0, 0, 720, 512);
		fun.setIcon(new ImageIcon(getClass().getResource("fun.png")));
		getContentPane().add(fun);
	}
	public void comandos() {
		can.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Produtos().montatudo();
			}
		});
		conf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Produtos().montatudo();
			}
		});
	}
}
