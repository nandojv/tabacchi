

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.SwingConstants;
// applicazione che somma due numeri
// ATTENZIONE: questa classe estende JFrame, quindi
// la finestra sarà accessibile tramite "this"
public class sigarette extends JFrame {
	public JTextField campo1;
	public JLabel label2;
	public JTextField campo2;
	public JLabel label3;
	public JTextField campo3;
	public JButton bottone;
	public JButton bottone1;
	public JButton bottone2;
	public JButton bottone3;
	public JButton bottone4;
	public JButton bottone5;
	public distributore c=new distributore(0);
	
	// il main semplicemente crea un oggetto di questa classe
	public static void main(String[] args) {
		
		 
			
				
					sigarette window = new sigarette("Distributore");
					window.setVisible(true);
	}
				
		
	
	
	// il costruttore fa tutto il lavoro
	public sigarette(String titolo) {
		super(titolo); // crea il JFrame
		setBackground(Color.GREEN);
		// imposta la dimensione della finestra
		this.setSize(445, 217);
		// specifica che la finestra deve essere centrata
		this.setLocationRelativeTo(null);
		// specifica che la chiusura della finestra
		// deve far terminare il programma
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		 distributore a=new distributore(0);
		campo1 = new JTextField(10);
		campo1.setBackground(Color.GREEN);
		
		// inizializza la seconda casella di input
		//label2 = new JLabel("Addendo 2");
		//campo2 = new JTextField(25);
		
		// inizializza una casella per visualizzare il risultato
		//label3 = new JLabel("  Risultato");
		//campo3 = new JTextField(25);
		//campo3.setEditable(false); // non modificabile dall'utente
		
		// crea un bottone che fa eseguire il calcolo
		bottone = new JButton("malboro");
		bottone.setForeground(Color.RED);
		bottone.setBackground(new Color(255, 55, 73));
		bottone1 = new JButton("camel");
		bottone1.setForeground(new Color(0, 0, 255));
		bottone2 = new JButton("merit");
		bottone2.setForeground(Color.YELLOW);
		bottone3 = new JButton("kim");
		bottone3.setForeground(Color.GREEN);
		bottone4 = new JButton("inserisci");
		
		// llega il bottone al suo gestore degli eventi
		bottone.addActionListener(new malboroActionListener(this));
		bottone2.addActionListener(new meritActionListener(this));
		bottone1.addActionListener(new camelActionListener(this));
		bottone3.addActionListener(new kimActionListener(this));
		bottone4.addActionListener(new InserisciActionListener(this));
		// inserisce tutti gli elementi in un panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		
		panel.add(bottone);
		panel.add(bottone1);
		panel.add(bottone2);
		panel.add(bottone3);
		panel.add(campo1);
		panel.add(bottone4);
		// inserisce il panel nella finestra
		getContentPane().add(panel);
		bottone5 = new JButton("Resto");
		bottone5.addActionListener(new RestoActionListener(this));
		panel.add(bottone5);
		
		// visualizza la finestra
		this.setVisible(true);
	}

}
