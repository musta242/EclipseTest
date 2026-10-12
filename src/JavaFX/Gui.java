package JavaFX;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
public class Gui extends JFrame{
	 private JTextField textField;
	 private JButton buttonLänge;
	 private JButton buttonReverse;
	 public Gui() {
		 setTitle("Text");
		 setSize(400,120);
		 setResizable(false);
		 setLayout(new FlowLayout());
		 textField = new JTextField(20);
		 buttonLänge = new JButton("Textlänge");
		 buttonReverse = new JButton("Textrückwärts");
		 add(textField);
		 add(buttonLänge);
		 add(buttonReverse);
		 setVisible(true);
		 
		 buttonLänge.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
				 String text = textField.getText();
				 int laenge = text.length();
				 JOptionPane.showMessageDialog(null, "Textlänge ist" + laenge);
			 }
		 });
		 buttonReverse.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
				 String text = textField.getText();
				 String reverse = new StringBuilder(text).reverse().toString();
				 JOptionPane.showMessageDialog(null, "TextAndersrum" + reverse);
			 }
		 });
		 
	 }
}