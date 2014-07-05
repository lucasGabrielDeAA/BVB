package tsi.too.bvb.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class IgContasBancarias extends JDialog
{//Início do corpo da classe.
	
 public IgContasBancarias()
 {
  setTitle("Área do Funcionário");
  setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  setSize(1000, 730);
  getContentPane().setLayout(null);
  
  JLabel wallPaperLabel = new JLabel("");
  wallPaperLabel.setBounds(10, 22, 982, 739);
  getContentPane().add(wallPaperLabel);
  
  JButton addButton = new JButton("");
  addButton.setToolTipText("Cadastrar Clientes");
  addButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/add_user.png")));
  addButton.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
	try
	{
	 IgCadastroDeClientes cadastroDeClientes = new IgCadastroDeClientes();	
	}
	catch(Exception excecao)
	{
	}
   }
  }
  );
  addButton.setBounds(6, 47, 135, 121);
  wallPaperLabel.add(addButton);
  
  JButton searchButton = new JButton("");
  searchButton.setToolTipText("Pesquisar Clientes");
  searchButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/search_user.png")));
  searchButton.setBounds(6, 303, 135, 121);
  wallPaperLabel.add(searchButton);
  
  JButton removeButton = new JButton("");
  removeButton.setToolTipText("Excluir Clientes");
  removeButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/remove_user.png")));
  removeButton.setBounds(6, 431, 135, 121);
  wallPaperLabel.add(removeButton);
  
  JButton updateButton = new JButton("");
  updateButton.setToolTipText("Alterar Dados de Clientes");
  updateButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/update_user.png")));
  updateButton.setBounds(6, 175, 135, 121);
  wallPaperLabel.add(updateButton);
  
  JButton reportUserButton = new JButton("");
  reportUserButton.setToolTipText("Relatório de Clientes");
  reportUserButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/report_user.png")));
  reportUserButton.setBounds(6, 559, 135, 121);
  wallPaperLabel.add(reportUserButton);
  
  setResizable(false);
  setLocationRelativeTo(null);
  setVisible(true);
 }
}//Fim do corpo da classe.
