package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import authentification.Gestion;

public class Ihm extends JFrame{
	public JTextField login;
	public JTextField pw;
	public JLabel message = new JLabel();	
	public JLabel verif = new JLabel();
	public Ihm() {
		setVisible(true);
		setTitle("Authentification");
		setBounds(80, 80, 500, 400);
		setResizable(false);
		setAlwaysOnTop(true);//fen�tre au premier plan
		

	message.setBounds(150, 30, 200, 50);
	verif.setBounds(200, 150, 300, 100);
	JLabel l1=new JLabel("login :");
	JLabel l2=new JLabel("Mot de passe :");
	login = new JTextField();
	pw =new JTextField();
	
	JButton b1 =new JButton("Ok");
	JButton b2 =new JButton("Annuler");
	

	
	
	l1.setBounds(90, 60, 100, 50);
	login.setBounds(250, 70, 100, 30);
	
	l2.setBounds(90, 120, 100, 50);
	pw.setBounds(250, 120, 100, 30);
	
	b1.setBounds(90, 250, 100, 40);
	b2.setBounds(250, 250, 100, 40);
	

	getContentPane().setLayout(null);

	
	getContentPane().add(message);
	getContentPane().add(verif);
	getContentPane().setVisible(true);

	getContentPane().add(l1);
	getContentPane().add(l2);
	getContentPane().add(login);
	getContentPane().add(pw);
	getContentPane().add(b1);
	getContentPane().add(b2); 
	
	
	}
}



