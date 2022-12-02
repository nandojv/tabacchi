

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class meritActionListener implements ActionListener {
	JFrame  m;
	public meritActionListener(sigarette sigarette) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		m=new JFrame();
		JOptionPane.showMessageDialog(m, "costo 6 euro");
	}

}
