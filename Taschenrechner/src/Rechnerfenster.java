import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rechnerfenster extends JFrame implements ActionListener {

	private JTextField ergebnisText; // grafische Elemente
	private JPanel hauptPanel;
	private JButton btn1, btn2, btn3, btnP, btn4, btn5, btn6, btnM, btn7, btn8, btn9, btnT, btn0, btnC, btnE, btnD;

	public Rechnerfenster(String titel) {
		super(titel); // Konstruktor von JFrame

		// Elemente erzeugen
		hauptPanel = new JPanel();
		ergebnisText = new JTextField("Hallo Welt!");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btnP = new JButton("+");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btnM = new JButton("-");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnT = new JButton("*");
		btn0 = new JButton("0");
		btnC = new JButton("C");
		btnE = new JButton("=");
		btnD = new JButton("/");

		// Elemente dem Panel hinzufügen
		hauptPanel.add(ergebnisText);
		hauptPanel.add(btn1);
		hauptPanel.add(btn2);
		hauptPanel.add(btn3);
		hauptPanel.add(btnP);
		hauptPanel.add(btn4);
		hauptPanel.add(btn5);
		hauptPanel.add(btn6);
		hauptPanel.add(btnM);
		hauptPanel.add(btn7);
		hauptPanel.add(btn8);
		hauptPanel.add(btn9);
		hauptPanel.add(btnT);
		hauptPanel.add(btn0);
		hauptPanel.add(btnC);
		hauptPanel.add(btnE);
		hauptPanel.add(btnD);
		
		// Button Action Listener
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btnP.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btnM.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnT.addActionListener(this);
		btn0.addActionListener(this);
		btnC.addActionListener(this);
		btnE.addActionListener(this);
		btnD.addActionListener(this);

		// Hauptfenster finishen
		this.add(hauptPanel);
		this.setSize(400, 300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		if (a.getSource() == this.btn1) {
			ergebnisText.setText("1");
		} else if (a.getSource() == this.btn2) {
			ergebnisText.setText("2");
		} else if(a.getSource() == this.btn3) {
			ergebnisText.setText("3");
		} else if(a.getSource() == this.btnP) {
			ergebnisText.setText("+");
		} else if(a.getSource() == this.btn4) {
			ergebnisText.setText("4");
		} else if(a.getSource() == this.btn5) {
			ergebnisText.setText("5");
		} else if(a.getSource() == this.btn6) {
			ergebnisText.setText("6");
		} else if(a.getSource() == this.btnM) {
			ergebnisText.setText("-");
		} else if(a.getSource() == this.btn7) {
			ergebnisText.setText("7");
		} else if(a.getSource() == this.btn8) {
			ergebnisText.setText("8");
		} else if(a.getSource() == this.btn9) {
			ergebnisText.setText("9");
		} else if(a.getSource() == this.btnT) {
			ergebnisText.setText("*");
		} else if(a.getSource() == this.btn0) {
			ergebnisText.setText("0");
		} else if(a.getSource() == this.btnC) {
			ergebnisText.setText("C");
		} else if(a.getSource() == this.btnE) {
			ergebnisText.setText("=");
		} else if(a.getSource() == this.btnD) {
			ergebnisText.setText("/");
		} 
	}
}