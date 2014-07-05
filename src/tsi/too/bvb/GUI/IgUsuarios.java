package tsi.too.bvb.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class IgUsuarios extends JFrame
{//Início do corpo da classe.

 public IgUsuarios()
 {
  getContentPane().setLayout(null);
  
  JButton btnGerente = new JButton("Gerente");
  btnGerente.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
	//Login de gerente.
   }
  });
  btnGerente.setIcon(new ImageIcon(IgUsuarios.class.getResource("/tsi/too/bvb/imagens/gerente.png")));
  btnGerente.setBounds(22, 23, 282, 211);
  getContentPane().add(btnGerente);
  
  JButton btnFuncionario = new JButton("Funcionário");
  btnFuncionario.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
	//Login de funcionários.
   }
  });
  btnFuncionario.setIcon(new ImageIcon(IgUsuarios.class.getResource("/tsi/too/bvb/imagens/funcionario.png")));
  btnFuncionario.setBounds(316, 23, 282, 211);
  getContentPane().add(btnFuncionario);
  
  JButton btnCaixaEletrnico = new JButton("Caixa Eletrônico");
  btnCaixaEletrnico.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
  	//Login de clientes.
   }
  });
  btnCaixaEletrnico.setIcon(new ImageIcon(IgUsuarios.class.getResource("/tsi/too/bvb/imagens/atm.png")));
  btnCaixaEletrnico.setBounds(610, 23, 282, 211);
  getContentPane().add(btnCaixaEletrnico);
  
  setSize(920, 286);
  setResizable(false);
  setLocation(200, 250);
  setVisible(true);
 }
}//Fim do corpo da classe.
