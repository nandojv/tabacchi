

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class RestoActionListener implements ActionListener {
	JFrame t;
	sigarette a;
	
	public RestoActionListener(sigarette a) {
		this.a=a;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		t=new JFrame();
		JOptionPane.showMessageDialog(t,"erogazione resto");
		a.c.credito=0;
		}
	}


