

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class camelActionListener implements ActionListener {
	JFrame  d;
	sigarette  c;
	JFrame k;
	public camelActionListener(sigarette sigarette) {
	
		// TODO Auto-generated constructor stub
		this.c=sigarette;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(c.c.credito>=5) {
			
	
		c.c.credito-=5;
		 k=new JFrame();
			JOptionPane.showMessageDialog(k,"erogazione prodotto");
		
		}
		else {
		
		d=new JFrame();
		JOptionPane.showMessageDialog(d,"credito non disponibile");
		
		}
	}

}
