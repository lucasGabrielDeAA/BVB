package tsi.too.bvb.GUI;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IgCaixaEletronico extends JDialog
{//Início do corpo da classe.
	
 private Font fonte = new Font("Nimbus Sans L", Font.BOLD, 20); 
	
 public IgCaixaEletronico()
 {
  setFont(fonte);
  setTitle("Caixa Eletrônico");
  getContentPane().setFont(fonte);
  getContentPane().setLayout(null);
  
  JLabel wallPaperLabel = new JLabel("");
  wallPaperLabel.setIcon(null);
  wallPaperLabel.setBounds(6, 6, 782, 561);
  getContentPane().add(wallPaperLabel);
  
  JButton saqueButton = new JButton("SAQUE");
  saqueButton.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
	try
	{
	 setVisible(false);
		
	 new IgSaque(IgCaixaEletronico.this);
	}catch (Exception e)
	{
 	 e.printStackTrace();
	}
   }
  });
  saqueButton.setFont(fonte);
  saqueButton.setBounds(73, 147, 190, 64);
  wallPaperLabel.add(saqueButton);
  
  JButton depositoButton = new JButton("DEPÓSITO");
  depositoButton.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
	try
	{
	 setVisible(false);
		   
	 new Deposito(IgCaixaEletronico.this);
	}catch (Exception e)
	{
	 e.printStackTrace();
	}	
   }
  });
  depositoButton.setFont(fonte);
  depositoButton.setBounds(73, 223, 190, 64);
  wallPaperLabel.add(depositoButton);
  
  JButton saldoButton = new JButton("SALDO");
  saldoButton.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
  	setVisible(false);
  	
  	//new Saque(IgCaixaEletronico.this);
   }
  });
  saldoButton.setFont(fonte);
  saldoButton.setBounds(73, 299, 190, 64);
  wallPaperLabel.add(saldoButton);
  
  JButton extratoButton = new JButton("EXTRATO");
  extratoButton.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
	setVisible(false);
	
  	new EscolheExtrato(IgCaixaEletronico.this);
   }
  });
  extratoButton.setFont(fonte);
  extratoButton.setBounds(533, 147, 190, 64);
  wallPaperLabel.add(extratoButton);
  
  JButton tranfButton = new JButton("TRANFERÊNCIA");
  tranfButton.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
  	setVisible(false);
  	
  	//new Transferencia(IgCaixaEletronico.this);
   }
  });
  tranfButton.setFont(fonte);
  tranfButton.setBounds(533, 223, 190, 64);
  wallPaperLabel.add(tranfButton);
  
  JButton resgateButton = new JButton("RESGATE");
  resgateButton.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
  	setVisible(false);
  	
  	//new Resgate(IgCaixaEletronico.this);
   }
  });
  resgateButton.setFont(fonte);
  resgateButton.setBounds(533, 299, 190, 64);
  wallPaperLabel.add(resgateButton);
  
  setSize(800, 600);
  setLocationRelativeTo(null);
  setResizable(false);
  setVisible(true);
 }
}//Fim do corpo da classe.
