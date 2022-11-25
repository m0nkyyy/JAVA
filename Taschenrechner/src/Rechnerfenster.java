import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rechnerfenster extends JFrame implements ActionListener {

	private JTextField ergebnisText; // grafische Elemente
	private JPanel hauptPanel;
	private JButton btn1, btn2;

	public Rechnerfenster(String titel) {
		super(titel); // Konstruktor von JFrame

		// Elemente erzeugen
		hauptPanel = new JPanel();
		ergebnisText = new JTextField("Hallo Welt!");
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");

		// Elemente dem Panel hinzufügen
		hauptPanel.add(ergebnisText);
		hauptPanel.add(btn1);
		hauptPanel.add(btn2);
		
		// Button Action Listener
		btn1.addActionListener(this);
		btn2.addActionListener(this);

		// Hauptfenster finishen
		this.add(hauptPanel);
		this.setSize(400, 300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		if (a.getSource() == this.btn1) {
			ergebnisText.setText("Hühner in..");
		} else if (a.getSource() == this.btn2) {
			ergebnisText.setText("..Freilandhaltung.");
		}
	}
}