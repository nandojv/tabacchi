
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class malboroActionListener implements ActionListener {
   JFrame  f;
   JFrame  m;
   sigarette  c;
	public malboroActionListener(sigarette sigarette) {
		this.c=sigarette;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(c.c.credito>=6) {
			
			
			c.c.credito-=6;
			 m=new JFrame();
				JOptionPane.showMessageDialog(m,"erogazione prodotto");
			
			}
			else {
			
			m=new JFrame();
			JOptionPane.showMessageDialog(m,"credito non disponibile");
			
			}
         
	}

}
