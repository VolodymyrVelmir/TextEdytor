package Zad1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class TextEdytor {
	static int Rtla,Gtla,Btla,Rtext,Gtext,Btext;
	TextArea Text=null;
	
	TextEdytor(String Teitle,int Rtla,int Gtla, int Btla,int SizeText,int Rtext,int Gtext, int Btext ){
		this.Rtla= Rtla;
		this.Gtla= Gtla;
		this.Btla= Btla;
 
		this.Rtext= Rtext;
		this.Gtext= Gtext; 
		this.Btext= Btext;
		
        JFrame jf = new JFrame(Teitle){
			 	public void paint(Graphics g) {
			 	 super.paint(g);
			 	    setBackground(new Color(TextEdytor.Rtla, TextEdytor.Gtla, TextEdytor.Btla));
			    	setSize(600, 400);
			    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			     }
			  };
        jf.setVisible(true);

        Text=new TextArea();
        Text.setBounds(8,100, 567, 230); 
        Text.setBackground(new Color(TextEdytor.Rtla, TextEdytor.Gtla, TextEdytor.Btla));
        
        TextField txtBottom = new TextField("");
        txtBottom.setLocation(8, 8);
        txtBottom.setSize(400, 25);
        txtBottom.setVisible(true);
        
      
        
       JButton button = new JButton("Add Text");
       button.setLocation(410, 8);
       button.setSize(165, 25);
       button.setVisible(true);
       button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
				Font font = new Font("TimesRoman", Font.BOLD|Font.ITALIC, SizeText);
				Text.setForeground(new Color(TextEdytor.Rtext, TextEdytor.Gtext, TextEdytor.Btext));
				Text.setFont(font);
        	    Text.appendText(
        		        "\n" + txtBottom.getText());  
        	 
        	    txtBottom.setText("");
           }
        });
       
       TextField BottomTitleR = new TextField(Rtla);
       BottomTitleR.setLocation(8, 35);
       BottomTitleR.setSize(85, 25);
       BottomTitleR.setVisible(true);
       
       TextField BottomTitleG = new TextField(Gtla);
       BottomTitleG.setLocation(93, 35);
       BottomTitleG.setSize(85, 25);
       BottomTitleG.setVisible(true);
       
       TextField BottomTitleB = new TextField(Btla);
       BottomTitleB.setLocation(178, 35);
       BottomTitleB.setSize(85, 25);
       BottomTitleB.setVisible(true);
       
       JButton buttonTitleColour = new JButton("Ustawić kolor tła");
       buttonTitleColour.setLocation(8, 65);
       buttonTitleColour.setSize(255, 25);
       buttonTitleColour.setVisible(true);
       buttonTitleColour.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
       	    TextEdytor.Rtla=Integer.valueOf(BottomTitleR.getText());
       	    TextEdytor.Gtla=Integer.valueOf(BottomTitleG.getText());
       	    TextEdytor.Btla=Integer.valueOf(BottomTitleB.getText());
       	    Text.setBackground(new Color(TextEdytor.Rtla, TextEdytor.Gtla, TextEdytor.Btla));
           }
        });
       
       TextField BottomTextR = new TextField(Rtext);
       BottomTextR.setLocation(321, 35);
       BottomTextR.setSize(85, 25);
       BottomTextR.setVisible(true);
       
       TextField BottomTextG = new TextField(Gtext);
       BottomTextG.setLocation(406, 35);
       BottomTextG.setSize(85, 25);
       BottomTextG.setVisible(true);
       
       TextField BottomTextB = new TextField(Btext);
       BottomTextB.setLocation(491, 35);
       BottomTextB.setSize(85, 25);
       BottomTextB.setVisible(true);
       
       JButton buttonTextColour = new JButton("Ustawić kolor tekstu");
       buttonTextColour.setLocation(321, 65);
       buttonTextColour.setSize(255, 25);
       buttonTextColour.setVisible(true);
       buttonTextColour.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
        	    TextEdytor.Rtext=Integer.valueOf(BottomTextR.getText());
        	    TextEdytor.Gtext=Integer.valueOf(BottomTextG.getText());
        	    TextEdytor.Btext=Integer.valueOf(BottomTextB.getText());
           }
        });
     
       jf.getContentPane().add( Text);
       jf.getContentPane().add( buttonTextColour);
       jf.getContentPane().add( BottomTextR);
       jf.getContentPane().add( BottomTextG);
       jf.getContentPane().add( BottomTextB);
       jf.getContentPane().add( buttonTitleColour);
       jf.getContentPane().add(BottomTitleR);
       jf.getContentPane().add(BottomTitleG);
       jf.getContentPane().add(BottomTitleB);
       jf.getContentPane().add(button);
       jf.getContentPane().add(txtBottom);
       jf.getContentPane().add(new JLabel());
     
	}
	
	
	
	
	
	
	
}
