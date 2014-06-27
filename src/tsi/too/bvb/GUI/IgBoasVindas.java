package tsi.too.bvb.GUI;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IgBoasVindas extends JDialog
{//Início do corpo da classe.
	
 public IgBoasVindas()
 {
  getContentPane().setLayout(null);
	
  JLabel wallPaperLabel = new JLabel("");
  wallPaperLabel.setIcon(null);
  wallPaperLabel.setBounds(0, 0, 794, 573);
  getContentPane().add(wallPaperLabel);
	
  JButton iniciarButton = new JButton("INICIAR");
  iniciarButton.setIcon(null);
  iniciarButton.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
	//Cria a tela de Login.
	   
	//Libera os recursos da janela de boas vindas.
	dispose();
	
	//Exibe a tela de Login.
   }
  });
  iniciarButton.setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  iniciarButton.setBounds(340, 445, 125, 39);
  wallPaperLabel.add(iniciarButton);
  
  setSize(800, 640);
  setResizable(false);
  setLocation(280, 80);
  setVisible(true);
 }
}//Fim do corpo da classe.
