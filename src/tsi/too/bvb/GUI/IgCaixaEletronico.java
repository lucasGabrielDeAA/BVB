package tsi.too.bvb.GUI;

import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class IgCaixaEletronico extends JFrame
{//Início do corpo da classe.
	
 public IgCaixaEletronico()
 {
 	setFont(new Font("Nimbus Sans L", Font.BOLD, 12));
  setTitle("Caixa Eletrônico");
  getContentPane().setFont(new Font("Nimbus Sans L", Font.BOLD, 12));
  getContentPane().setLayout(null);
  
  JLabel wallPaperLabel = new JLabel("");
  wallPaperLabel.setIcon(null);
  wallPaperLabel.setBounds(6, 6, 782, 561);
  getContentPane().add(wallPaperLabel);
  
  JButton saqueButton = new JButton("SAQUE");
  saqueButton.setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  saqueButton.setBounds(73, 147, 190, 64);
  wallPaperLabel.add(saqueButton);
  
  JButton depositoButton = new JButton("DEPÓSITO");
  depositoButton.setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  depositoButton.setBounds(73, 223, 190, 64);
  wallPaperLabel.add(depositoButton);
  
  JButton saldoButton = new JButton("SALDO");
  saldoButton.setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  saldoButton.setBounds(73, 299, 190, 64);
  wallPaperLabel.add(saldoButton);
  
  JButton extratoSimplesButton = new JButton("EXTRATO");
  extratoSimplesButton.setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  extratoSimplesButton.setBounds(533, 147, 190, 64);
  wallPaperLabel.add(extratoSimplesButton);
  
  JButton tranfButton = new JButton("TRANFERÊNCIA");
  tranfButton.setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  tranfButton.setBounds(533, 223, 190, 64);
  wallPaperLabel.add(tranfButton);
  
  JButton resgateButton = new JButton("RESGATE");
  resgateButton.setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  resgateButton.setBounds(533, 299, 190, 64);
  wallPaperLabel.add(resgateButton);
  
  setSize(800, 600);
 }
}//Fim do corpo da classe.
