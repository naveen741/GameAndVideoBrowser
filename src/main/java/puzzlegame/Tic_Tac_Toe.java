package puzzlegame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class Tic_Tac_Toe extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Button p1,p2,p3,p4,p5,p6,p7,p8,p9,reStart,exit;
	int playerTurn=1;
	String winner="noWin";
	Tic_Tac_Toe(){
		super("Tic_Tac_Toe(X-O Game)");
		p1=new Button("");
		p1.setBounds(100, 50, 100, 100);
		p2=new Button("");
		p2.setBounds(200, 50,100, 100);
		p3=new Button("");
		p3.setBounds(300, 50, 100, 100);
		p4=new Button("");
		p4.setBounds(100, 150, 100, 100);
		p5=new Button("");
		p5.setBounds(200, 150,100, 100);
		p6=new Button("");
		p6.setBounds(300, 150, 100, 100);
		p7=new Button("");
		p7.setBounds(100, 250, 100, 100);
		p8=new Button("");
		p8.setBounds(200, 250,100, 100);
		p9=new Button("");
		p9.setBounds(300, 250, 100, 100);
		reStart=new Button("Restart");
		reStart.setBounds(100, 350, 300, 75);
		exit=new Button("Exit");
		exit.setBounds(100, 425, 300, 75);
		p1.setBackground(Color.cyan);
		p3.setBackground(Color.cyan);
		p5.setBackground(Color.cyan);
		p7.setBackground(Color.cyan);
		p9.setBackground(Color.cyan);
		p2.setBackground(Color.blue);
		p4.setBackground(Color.blue);
		p6.setBackground(Color.blue);
		p8.setBackground(Color.blue);
		p1.addActionListener(this);
		p2.addActionListener(this);
		p3.addActionListener(this);
		p4.addActionListener(this);
		p5.addActionListener(this);
		p6.addActionListener(this);
		p7.addActionListener(this);
		p8.addActionListener(this);
		p9.addActionListener(this);
		reStart.addActionListener(this);
		exit.addActionListener(this);
		add(p1);add(p2);add(p3);add(p4);add(p5);add(p6);add(p7);add(p8);add(p9);
		add(reStart);add(exit);
		setBackground(Color.white);
		setFont(new Font("Serif", Font.BOLD, 50));
		setSize(500,500);  
	    setLayout(null);  
	    setVisible(true);  
	    setResizable(false);
	}
	public void actionPerformed(ActionEvent e) {
		if(((Button) e.getSource()).getLabel().equals("Restart"))
			clrArea();
		else if(((Button) e.getSource()).getLabel().equals("Exit"))
			dispose();
		else if(((Button) e.getSource()).getLabel().equals("")) {
			if(playerTurn==1) {
				((Button) e.getSource()).setLabel("X");
				playerTurn=2;
			}
			else {
				((Button) e.getSource()).setLabel("O");
				playerTurn=1;
			}
		}
		if(rowCheck())
			showResult();
		else if(colCheck())
			showResult();
		else if(diaCheck())
			showResult();
		else if(isFull())
			showResult();
	}
	void showResult() {
		if(winner.equals("X"))
			JOptionPane.showMessageDialog(this,"Congratulations! X  won.");
		else if(winner.equals("O"))
			JOptionPane.showMessageDialog(this,"Congratulations! O  won.");
		else
			JOptionPane.showMessageDialog(this,"Match Draw.");
		winner="noWin";
		playerTurn=1;
		clrArea();
	}
	boolean rowCheck() {
		if((!p1.getLabel().equals("") && p1.getLabel().equals(p2.getLabel()) && p1.getLabel().equals(p3.getLabel()))){
			winner=p1.getLabel();
			return true;
		}
		if (!p4.getLabel().equals("") && p4.getLabel().equals(p5.getLabel()) && p4.getLabel().equals(p6.getLabel())){
			winner=p4.getLabel();
			return true;
		}
		if (!p7.getLabel().equals("") && p7.getLabel().equals(p8.getLabel()) && p7.getLabel().equals(p9.getLabel())){
			winner=p7.getLabel();
			return true;
		}
		return false;
	}
	boolean colCheck() {
		if((!p1.getLabel().equals("") && p1.getLabel().equals(p4.getLabel()) && p1.getLabel().equals(p7.getLabel()))){
			winner=p1.getLabel();
			return true;
		}
		if (!p2.getLabel().equals("") && p2.getLabel().equals(p5.getLabel()) && p2.getLabel().equals(p8.getLabel())){
			winner=p2.getLabel();
			return true;
		}
		if (!p3.getLabel().equals("") && p3.getLabel().equals(p6.getLabel()) && p3.getLabel().equals(p9.getLabel())){
			winner=p3.getLabel();
			return true;
		}
		return false;
	}
	boolean diaCheck() {
		if (!p1.getLabel().equals("") && p1.getLabel().equals(p5.getLabel()) && p1.getLabel().equals(p9.getLabel())){
			winner=p1.getLabel();
			return true;
		}
		if (!p3.getLabel().equals("") && p3.getLabel().equals(p5.getLabel()) && p3.getLabel().equals(p7.getLabel())){
			winner=p3.getLabel();
			return true;
		}
		return false;
	}
	boolean isFull() {
		if(p1.getLabel().equals("") || p2.getLabel().equals("") || p3.getLabel().equals("")
				|| p4.getLabel().equals("") || p5.getLabel().equals("") || p6.getLabel().equals("")
					|| p7.getLabel().equals("") || p8.getLabel().equals("") || p9.getLabel().equals("")) {
			return false;
		}
		return true;
	}
	void clrArea() {
		p1.setLabel("");
		p2.setLabel("");
		p3.setLabel("");
		p4.setLabel("");
		p5.setLabel("");
		p6.setLabel("");
		p7.setLabel("");
		p8.setLabel("");
		p9.setLabel("");
	}
}
