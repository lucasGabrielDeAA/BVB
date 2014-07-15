package tsi.too.bvb.GUI;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class StartSplash extends JFrame
{//Início do corpo da classe.
 private static JProgressBar barraDeProgresso;
 private static JLabel etapasLabel;
 private UIManager.LookAndFeelInfo looksAndFeel[];
 private static String lookAndFeel = "Nimbus";
 
 public StartSplash()
 {
 	
 	JLabel wallPaperLabel = new JLabel("");
 	wallPaperLabel.setIcon(new ImageIcon(StartSplash.class.getResource("/tsi/too/bvb/imagens/logo-bvb.jpg")));
 	
 	looksAndFeel = UIManager.getInstalledLookAndFeels();
 	
 	barraDeProgresso = new JProgressBar();
 	barraDeProgresso.setStringPainted(true);
 	barraDeProgresso.setMaximum(11);
 	barraDeProgresso.setBackground(new Color(0, 102, 51));
 	barraDeProgresso.setForeground(new Color(0, 204, 0));
 	
 	etapasLabel = new JLabel("");
 	GroupLayout groupLayout = new GroupLayout(getContentPane());
 	groupLayout.setHorizontalGroup(
 		groupLayout.createParallelGroup(Alignment.LEADING)
 			.addGroup(groupLayout.createSequentialGroup()
 				.addGap(12)
 				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
 					.addGroup(groupLayout.createSequentialGroup()
 						.addComponent(wallPaperLabel, GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
 						.addContainerGap())
 					.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
 						.addComponent(barraDeProgresso, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
 						.addContainerGap())
 					.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
 						.addComponent(etapasLabel, GroupLayout.PREFERRED_SIZE, 566, GroupLayout.PREFERRED_SIZE)
 						.addGap(16))))
 	);
 	groupLayout.setVerticalGroup(
 		groupLayout.createParallelGroup(Alignment.LEADING)
 			.addGroup(groupLayout.createSequentialGroup()
 				.addContainerGap()
 				.addComponent(wallPaperLabel, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
 				.addPreferredGap(ComponentPlacement.RELATED)
 				.addComponent(etapasLabel)
 				.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
 				.addComponent(barraDeProgresso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addContainerGap())
 	);
 	getContentPane().setLayout(groupLayout);
 	
 	alterarVisual(lookAndFeel);
 	
 	setLocation(350, 200);
 	setSize(600, 308);
 	setResizable(false);
 	setVisible(true);
 }
 
 /** Método utilizado para carregar a barra do JProgressBar
  * 
  * @author technus
  */
 public static void carregar()
 {
  String etapas[] = {"Carregando Arquivos de Log...","Criando Interfaces...","Carregando Interfaces...",
		  			 "Verificando disponibilidade do Serviço...","Contando Cédulas do Caixa...",
		  			 "Atualizando Dados De Clientes...","Atualizando Dados de Funcionários...",
		  			 "Verificando Conexão com a Rede...","Verificando Por Atualizações do BVB...",
		  			 "Atualizando dados do BVB...","Iniciando Aplicação...","OK"};
  
  for(int barra=0;barra<=11;barra++)
  {
   try
   {
	Thread.sleep(barra*60);
	
	barraDeProgresso.setValue(barra);
	etapasLabel.setText(etapas[barra]);
	
	if(etapasLabel.getText()==etapas[11])
	  Thread.sleep(1000);
	
   }catch(InterruptedException e)
   {
	showMessageDialog(null, "Não foi possível carregar o programa", "Start", ERROR_MESSAGE);
   }
  }
 }
 
 /**
	 * Altera a aparência e o comportamento (look-and-feel) da interface gráfica usando o nome do 
	 * lookAndFell. Ativa o item de menu correspondente ao look-and-feel.
	 */
	private void alterarVisual(String lookAndFeel)
	{
	 try
	 {
	  //Localiza o look-and-feel selecionado pelo usuário. 
	  for(int lf = 0; lf < looksAndFeel.length; lf++)
		if(lookAndFeel.equalsIgnoreCase(looksAndFeel[lf].getName())) 
		{
		 //Configura o novo look-and-feel carregando a classe de aparência e comportamento através do método getClassName.
		 UIManager.setLookAndFeel(looksAndFeel[lf].getClassName());
		 break;
		}
		
	    /*
		 * Altera a aparência e o comportamento de cada componente anexado ao argumento do método 
		 * updateComponentTreeUI da classe SwingUtilities para a nova aparência e o novo comportamento 
		 * escolhido pelo usuário. 
		 */
		SwingUtilities.updateComponentTreeUI(this);
	 } 
	 //A partir da versão Java 7 (1.7) é possível usar um único catch para tratar várias exceções. 
	 catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
	 {
	  ex.printStackTrace();
	 }
	}
}//Fim do corpo da classe.
