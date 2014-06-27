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
  wallPaperLabel.setIcon(null);
  wallPaperLabel.setBounds(10, 22, 982, 681);
  getContentPane().add(wallPaperLabel);
  
  JButton addButton = new JButton("");
  addButton.setToolTipText("Cadastrar Funcionários");
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
  searchButton.setToolTipText("Pesquisar Funcionários");
  searchButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/search_user.png")));
  searchButton.setBounds(6, 303, 135, 121);
  wallPaperLabel.add(searchButton);
  
  JButton removeButton = new JButton("");
  removeButton.setToolTipText("Excluir Funcionários");
  removeButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/remove_user.png")));
  removeButton.setBounds(6, 431, 135, 121);
  wallPaperLabel.add(removeButton);
  
  JButton updateButton = new JButton("");
  updateButton.setToolTipText("Alterar Dados de Funcionários");
  updateButton.setIcon(new ImageIcon(IgGerente.class.getResource("/tsi/too/bvb/imagens/update_user.png")));
  updateButton.setBounds(6, 175, 135, 121);
  wallPaperLabel.add(updateButton);
  
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
  updateAgencyButton.setToolTipText("Alterar Dados de Agências");
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
