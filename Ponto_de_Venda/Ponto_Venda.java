package pdv;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
@SuppressWarnings("serial")
public class Ponto_Venda extends JFrame{
	JLabel fun, logo, car_cred, car_deb, troco, vl_rece, vl_tot;
	JButton cance_vend, apli_des, rea_pag;
	public void montatudo() {
		frame();
		comandos();
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ponto_Venda().montatudo();
	}
	public void frame() {
		setLayout(null);
		setBounds(150, 0, 720, 512);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		JLabel pdv = new JLabel("Ponto de Venda");
		pdv.setForeground(new Color(255, 255, 255));
		pdv.setBounds(340, 20, 270, 35);
		pdv.setFont(new Font("Libre Bodoni", Font.PLAIN, 35));
		add(pdv);
		
		JLabel fund = new JLabel(new ImageIcon(getClass().getResource("fund.png")));
		fund.setBounds(300, 70, 351, 320);
		add(fund);
		
		car_cred = new JLabel(new ImageIcon(getClass().getResource("car_cred.png")));
		car_cred.setBounds(10, 100, 150, 55);
		add(car_cred);

		car_deb = new JLabel(new ImageIcon(getClass().getResource("car_cred.png")));
		car_deb.setBounds(10, 170, 150, 55);
		add(car_deb);

		troco = new JLabel(new ImageIcon(getClass().getResource("troco.png")));
		troco.setBounds(10, 240, 150, 55);
		add(troco);

		vl_rece = new JLabel(new ImageIcon(getClass().getResource("vl_rece.png")));
		vl_rece.setBounds(10, 310, 150, 55);
		add(vl_rece);

		vl_tot = new JLabel(new ImageIcon(getClass().getResource("vl_tot.png")));
		vl_tot.setBounds(10, 380, 150, 55);
		add(vl_tot);
		
		cance_vend = new JButton("Cancelar");
		cance_vend.setFont(new Font("Monospaced", Font.BOLD, 20));
		cance_vend.setBounds(180, 400, 150, 50);
		cance_vend.setBackground(new Color(110, 156, 182));
		cance_vend.setForeground(new Color(0, 0, 0));
		add(cance_vend);
		
		apli_des = new JButton("Desconto");
		apli_des.setFont(new Font("Monospaced", Font.BOLD, 20));
		apli_des.setBounds(350, 400, 150, 50);
		apli_des.setBackground(new Color(110, 156, 182));
		apli_des.setForeground(new Color(0, 0, 0));
		add(apli_des);
		
		rea_pag = new JButton("Concluir");
		rea_pag.setFont(new Font("Monospaced", Font.BOLD, 20));
		rea_pag.setBounds(520, 400, 150, 50);
		rea_pag.setBackground(new Color(110, 156, 182));
		rea_pag
		.setForeground(new Color(0, 0, 0));
		add(rea_pag);
		
		logo = new JLabel(new ImageIcon(getClass().getResource("logo.png")));
		logo.setBounds(0, 0, 135, 87);
		add(logo);
		
		fun = new JLabel(new ImageIcon(getClass().getResource("fun.png")));
		fun.setBounds(0, 0, 720, 512);
		add(fun);
	}
	public void comandos() {
		apli_des.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Apli_Des().montatudo();
			}
		});
	}
}