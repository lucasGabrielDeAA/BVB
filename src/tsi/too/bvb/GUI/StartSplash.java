package tsi.too.bvb.GUI;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JProgressBar;

import static javax.swing.JOptionPane.*;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class StartSplash extends JFrame
{//Início do corpo da classe.
 private static JProgressBar barraDeProgresso;
 private static JLabel etapasLabel;
 
 public StartSplash()
 {
 	
 	JLabel wallPaperLabel = new JLabel("");
 	wallPaperLabel.setIcon(new ImageIcon(StartSplash.class.getResource("/tsi/too/bvb/imagens/logo-bvb.jpg")));
 	
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
}//Fim do corpo da classe.
