

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class kimActionListener implements ActionListener {
   JFrame  k;
	public kimActionListener(sigarette sigarette) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
k=new JFrame();
		JOptionPane.showMessageDialog(k, "costo 6 euro");
	}

}
