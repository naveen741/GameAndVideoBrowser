package puzzlegame;
import java.awt.*;  
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;  
public class ArrangeNumber extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,shuffle,exit;  
	ArrayList<String> list=new ArrayList<String>(9);
ArrangeNumber(){  
    super("ArrangeNumber");  
    b1=new Button("1");
	b1.setBounds(100, 50, 100, 100);
	b2=new Button("2");
	b2.setBounds(200, 50,100, 100);
	b3=new Button("3");
	b3.setBounds(300, 50, 100, 100);
	b4=new Button("4");
	b4.setBounds(100, 150, 100, 100);
	b5=new Button("5");
	b5.setBounds(200, 150,100, 100);
	b6=new Button("6");
	b6.setBounds(300, 150, 100, 100);
	b7=new Button("7");
	b7.setBounds(100, 250, 100, 100);
	b8=new Button("8");
	b8.setBounds(200, 250,100, 100);
	b9=new Button("");
	b9.setBounds(300, 250, 100, 100);  
	shuffle=new Button("shuffle");
	shuffle.setBounds(100, 350, 300, 75);
	exit=new Button("Exit");
	exit.setBounds(100, 425, 300, 75);
    b1.addActionListener(this);  
    b2.addActionListener(this);  
    b3.addActionListener(this);  
    b4.addActionListener(this);  
    b5.addActionListener(this);  
    b6.addActionListener(this);  
    b7.addActionListener(this);  
    b8.addActionListener(this);  
    b9.addActionListener(this);  
    shuffle.addActionListener(this);
	exit.addActionListener(this);
    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
    add(shuffle);
    add(exit);
	setFont(new Font("Serif", Font.BOLD, 50));
    setSize(500,500);  
    setLayout(null);  
    setVisible(true);  
    setResizable(false);
}  
void shuffle() {
	for(int i=1;i<9;i++) {
		list.add(""+i);
	}
	list.add("");
	Collections.shuffle(list);
	b1.setLabel(list.get(0));
	b2.setLabel(list.get(1));
	b3.setLabel(list.get(2));
	b4.setLabel(list.get(3));
	b5.setLabel(list.get(4));
	b6.setLabel(list.get(5));
	b7.setLabel(list.get(6));
	b8.setLabel(list.get(7));
	b9.setLabel(list.get(8));
	list.clear();
}
public static void main(String[] args) {
	new ArrangeNumber();
}
public void actionPerformed(ActionEvent e){  
	if(((Button) e.getSource()).getLabel().equals("shuffle"))
		shuffle();
	else if(((Button) e.getSource()).getLabel().equals("Exit"))
		dispose();
    if(e.getSource()==b1){  
        String label=b1.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b1.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b1.setLabel("");  
        }  
    }  
    if(e.getSource()==b2){  
        String label=b2.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b2.setLabel("");  
        }  
    }  
    if(e.getSource()==b3){  
        String label=b3.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b3.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b3.setLabel("");  
        }  
    }  
    if(e.getSource()==b4){  
        String label=b4.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b4.setLabel("");  
        }  
    }  
    if(e.getSource()==b5){  
        String label=b5.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b5.setLabel("");  
        }  
    }  
    if(e.getSource()==b6){  
        String label=b6.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b6.setLabel("");  
        }  
    }  
    if(e.getSource()==b7){  
        String label=b7.getLabel();  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b7.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b7.setLabel("");  
        }  
    }  
    if(e.getSource()==b8){  
        String label=b8.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b8.setLabel("");  
        }  
    }  
    if(e.getSource()==b9){  
        String label=b9.getLabel();  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b9.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b9.setLabel("");  
        }  
    }  
    if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
            .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
            &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
            .equals("8")&&b9.getLabel().equals("")){     
            JOptionPane.showMessageDialog(this,"Congratulations! You won.");    
    }    
}    
}
