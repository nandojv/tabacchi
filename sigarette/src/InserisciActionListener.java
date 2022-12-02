

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InserisciActionListener implements ActionListener {

	
	sigarette a;
	
JFrame k;
	
public InserisciActionListener(sigarette a) {
		this.a=a;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		int credito=Integer.parseInt(a.campo1.getText());
	     a.c.credito=credito;
	     
	     k=new JFrame();
			JOptionPane.showMessageDialog(k,a.c.credito);
	}

}
