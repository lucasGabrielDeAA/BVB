package tsi.too.bvb.GUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class EscolheExtrato extends JDialog
{//Início do corpo da classe.
	
 private Font fonte = new Font("Nimbus Sans L", Font.BOLD, 20);
 private JButton simplesBotao;
 private JButton periodicoBotao;
 private JButton voltarBotao;

 public EscolheExtrato(final JDialog tela)
 {
  setTitle("Tipo de Extrato Desejado");
  setSize(450, 240);
  setResizable(false);
  setLocationRelativeTo(null);
  getContentPane().setLayout(null);
  
  simplesBotao = new JButton("SIMPLES");
  simplesBotao.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
	/* Faz a busca do saldo, joga em uma String e inicia a tela de extrato.
	 * String extrato = extrato(numeroConta);
	 * 
	 * new Extrato(EscolheExtrato.this,extrato);
	 */
   }
  });
  simplesBotao.setBounds(45, 25, 150, 64);
  simplesBotao.setFont(fonte);
  getContentPane().add(simplesBotao);
  
  periodicoBotao = new JButton("PERIÓDICO");
  periodicoBotao.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
	/* Exibe a tela para seleção do intervalo de tempo
	 * 
	 * Faz a busca do saldo, joga em uma String e inicia a tela de extrato.
	 * String extrato = extrato(numeroConta);
	 * 
	 * new Extrato(EscolheExtrato.this,extrato);
	 */
   }
  });
  periodicoBotao.setBounds(238, 25, 150, 64);
  periodicoBotao.setFont(fonte);
  getContentPane().add(periodicoBotao);
  
  voltarBotao = new JButton("VOLTAR");
  voltarBotao.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
	tela.setVisible(true);
	   
  	dispose();
   }
  });
  voltarBotao.setIcon(new ImageIcon(EscolheExtrato.class.getResource("/tsi/too/bvb/imagens/return.png")));
  voltarBotao.setFont(fonte);
  voltarBotao.setBounds(139, 114, 162, 64);
  getContentPane().add(voltarBotao);
  
  setVisible(true);
 }

}//Fim do corpo da classe.
