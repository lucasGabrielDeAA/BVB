package tsi.too.bvb.GUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Extrato extends JDialog
{//Início do corpo da classe.
	
 private Font fonte = new Font("Nimbus Sans L", Font.BOLD, 20);
 private JButton botaoSaque, botaoVoltar;
 private JTextArea extratoTextArea;

 public Extrato(final JDialog tela,String extrato)
 {
  setResizable(false);
  setTitle("Saque");
  getContentPane().setLayout(null);
 	
  botaoVoltar = new JButton("VOLTAR");
  botaoVoltar.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
	tela.setVisible(true);
	   
	dispose();
   }
  });
  botaoVoltar.setIcon(new ImageIcon(Extrato.class.getResource("/tsi/too/bvb/imagens/return.png")));
  botaoVoltar.setFont(fonte);
  botaoVoltar.setBounds(6, 347, 162, 64);
  getContentPane().add(botaoVoltar);
 	
  botaoSaque = new JButton("SAQUE");
  botaoSaque.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
  	setVisible(false);
  	
  	new IgSaque(Extrato.this);
   }
  });
  botaoSaque.setIcon(new ImageIcon(Extrato.class.getResource("/tsi/too/bvb/imagens/next.png")));
  botaoSaque.setFont(fonte);
  botaoSaque.setBounds(426, 347, 162, 64);
  getContentPane().add(botaoSaque);
 	
  extratoTextArea = new JTextArea();
  extratoTextArea.setEditable(false);
  extratoTextArea.setBounds(122, 6, 345, 314);
  extratoTextArea.setText(extrato);
  getContentPane().add(extratoTextArea);
  
  setLocationRelativeTo(null);
  setVisible(true);
 }
}//Fim do corpo da classe.
