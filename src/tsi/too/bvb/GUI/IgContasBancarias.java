package tsi.too.bvb.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;

public class IgContasBancarias extends JDialog
{//Início do corpo da classe.
	
 public IgContasBancarias()
 {
  setTitle("Controle de Clientes");
  setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  setSize(1000, 800);
  getContentPane().setLayout(null);
  
  JDesktopPane desktopPane = new JDesktopPane();
  desktopPane.setBounds(6, 6, 982, 704);
  getContentPane().add(desktopPane);
  desktopPane.setLayout(null);
  
  JButton addUserButton = new JButton("");
  addUserButton.setToolTipText("Cadastrar Clientes");
  addUserButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/add_user.png"));
  addUserButton.addActionListener(new ActionListener()
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
  addUserButton.setBounds(6, 6, 135, 121);
  desktopPane.add(addUserButton);
  
  JButton searchUserButton = new JButton("");
  searchUserButton.setToolTipText("Pesquisar Cliente");
  searchUserButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/search_user.png"));
  searchUserButton.setBounds(6, 129, 135, 121);
  desktopPane.add(searchUserButton);
  
  JButton removeUserButton = new JButton("");
  removeUserButton.setToolTipText("Excluir Cliente");
  removeUserButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/remove_user.png"));
  removeUserButton.setBounds(6, 375, 135, 121);
  desktopPane.add(removeUserButton);
  
  JButton updateUserButton = new JButton("");
  updateUserButton.setToolTipText("Alterar Dados do Cliente");
  updateUserButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/update_user.png"));
  updateUserButton.setBounds(6, 252, 135, 121);
  desktopPane.add(updateUserButton);
  
  JButton reportUserButton = new JButton("");
  reportUserButton.setToolTipText("Relatório de Clientes");
  reportUserButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/report_user.png"));
  reportUserButton.setBounds(6, 500, 135, 121);
  desktopPane.add(reportUserButton);
  
  JButton addAgencyButton = new JButton("");
  addAgencyButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/add_agency.png"));
  addAgencyButton.setToolTipText("Cadastrar Agências");
  addAgencyButton.setBounds(890, 6, 86, 86);
  desktopPane.add(addAgencyButton);
  
  JButton searchAgencyButton = new JButton("");
  searchAgencyButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/search_agency.png"));
  searchAgencyButton.setToolTipText("Procurar Agências");
  searchAgencyButton.setBounds(890, 95, 86, 86);
  desktopPane.add(searchAgencyButton);
  
  JButton updateAgencyButton = new JButton("");
  updateAgencyButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/update_agency.png"));
  updateAgencyButton.setToolTipText("Alterar Dados da Agência");
  updateAgencyButton.setBounds(890, 185, 86, 86);
  desktopPane.add(updateAgencyButton);
  
  JButton removeAgencyButton = new JButton("");
  removeAgencyButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/remove_agency.png"));
  removeAgencyButton.setToolTipText("Excluir Agência");
  removeAgencyButton.setBounds(890, 275, 86, 86);
  desktopPane.add(removeAgencyButton);
  
  JButton reportAgencyButton = new JButton("");
  reportAgencyButton.setIcon(new ImageIcon("/home/technus/Área de Trabalho/BancoVirtualDeBarbacena/icones/report_agency.png"));
  reportAgencyButton.setToolTipText("Relatório de Agências");
  reportAgencyButton.setBounds(890, 365, 86, 86);
  desktopPane.add(reportAgencyButton);
  
  setResizable(false);
  setLocationRelativeTo(null);
  setVisible(true);
 }
}//Fim do corpo da classe.
