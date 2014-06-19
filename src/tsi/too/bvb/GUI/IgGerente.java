package tsi.too.bvb.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

public class IgGerente extends JDialog
{//Início do corpo da classe.
	
 public IgGerente()
 {
  setTitle("Área do Gerente");
  setFont(new Font("Nimbus Sans L", Font.BOLD, 20));
  setSize(1000, 730);
  getContentPane().setLayout(null);
  
  JMenuBar barraDeMenu = new JMenuBar();
  barraDeMenu.setBounds(10, 0, 85, 23);
  getContentPane().add(barraDeMenu);
  
  JMenu sobreItem = new JMenu("Ajuda");
  barraDeMenu.add(sobreItem);
  JMenuItem mntmSobre = new JMenuItem("Sobre");
  sobreItem.add(mntmSobre);
  
  JLabel wallPaperLabel = new JLabel("");
  wallPaperLabel.setBounds(10, 22, 982, 739);
  getContentPane().add(wallPaperLabel);
  
  JButton addUserButton = new JButton("");
  addUserButton.setToolTipText("Cadastrar Clientes");
  addUserButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/add_user.png")));
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
  addUserButton.setBounds(6, 47, 135, 121);
  wallPaperLabel.add(addUserButton);
  
  JButton searchUserButton = new JButton("");
  searchUserButton.setToolTipText("Pesquisar Cliente");
  searchUserButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/search_user.png")));
  searchUserButton.setBounds(6, 308, 135, 121);
  wallPaperLabel.add(searchUserButton);
  
  JButton removeUserButton = new JButton("");
  removeUserButton.setToolTipText("Excluir Cliente");
  removeUserButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/remove_user.png")));
  removeUserButton.setBounds(6, 431, 135, 121);
  wallPaperLabel.add(removeUserButton);
  
  JButton updateUserButton = new JButton("");
  updateUserButton.setToolTipText("Alterar Dados do Cliente");
  updateUserButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/update_user.png")));
  updateUserButton.setBounds(6, 175, 135, 121);
  wallPaperLabel.add(updateUserButton);
  
  JButton reportUserButton = new JButton("");
  reportUserButton.setToolTipText("Relatório de Clientes");
  reportUserButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/report_user.png")));
  reportUserButton.setBounds(6, 559, 135, 121);
  wallPaperLabel.add(reportUserButton);
  
  JButton addAgencyButton = new JButton("");
  addAgencyButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/add_agency.png")));
  addAgencyButton.setToolTipText("Cadastrar Agências");
  addAgencyButton.setBounds(841, 47, 135, 121);
  wallPaperLabel.add(addAgencyButton);
  
  JButton searchAgencyButton = new JButton("");
  searchAgencyButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/search_agency.png")));
  searchAgencyButton.setToolTipText("Procurar Agências");
  searchAgencyButton.setBounds(841, 303, 135, 121);
  wallPaperLabel.add(searchAgencyButton);
  
  JButton updateAgencyButton = new JButton("");
  updateAgencyButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/update_agency.png")));
  updateAgencyButton.setToolTipText("Alterar Dados da Agência");
  updateAgencyButton.setBounds(841, 175, 135, 121);
  wallPaperLabel.add(updateAgencyButton);
  
  JButton removeAgencyButton = new JButton("");
  removeAgencyButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/remove_agency.png")));
  removeAgencyButton.setToolTipText("Excluir Agência");
  removeAgencyButton.setBounds(841, 431, 135, 121);
  wallPaperLabel.add(removeAgencyButton);
  
  JButton reportAgencyButton = new JButton("");
  reportAgencyButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/report_agency.png")));
  reportAgencyButton.setToolTipText("Relatório de Agências");
  reportAgencyButton.setBounds(841, 559, 135, 121);
  wallPaperLabel.add(reportAgencyButton);
  
  setResizable(false);
  setLocationRelativeTo(null);
  setVisible(true);
 }
}//Fim do corpo da classe.
