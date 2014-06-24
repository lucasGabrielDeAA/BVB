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
{
 private static JProgressBar barraDeProgresso;//Início do corpo da classe.
 public StartSplash()
 {
  barraDeProgresso = new JProgressBar();
  barraDeProgresso.setForeground(new Color(50, 205, 50));
		
  JLabel wallPaperLabel = new JLabel("");
  GroupLayout groupLayout = new GroupLayout(getContentPane());
  groupLayout.setHorizontalGroup
  (
   groupLayout.createParallelGroup(Alignment.LEADING)
   .addGroup(groupLayout.createSequentialGroup()
   .addContainerGap()
   .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
   .addComponent(barraDeProgresso, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
   .addComponent(wallPaperLabel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 432, Short.MAX_VALUE))
   .addContainerGap())
  );

  groupLayout.setVerticalGroup
  (
   groupLayout.createParallelGroup(Alignment.LEADING)
   .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
   .addComponent(wallPaperLabel, GroupLayout.PREFERRED_SIZE, 247, Short.MAX_VALUE)
   .addPreferredGap(ComponentPlacement.RELATED)
   .addComponent(barraDeProgresso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
   .addContainerGap())
  );

  getContentPane().setLayout(groupLayout);
  setLocation(350,200);
  setSize(600, 300);
  setResizable(false);
  setVisible(true);
 }
 
 public static void main(String args[])
 {//Início do corpo do método main.
  StartSplash telaDeSplash = new StartSplash();
  
  carregar();
 }//Fim do corpo do método main.
 
 /** Método utilizado para carregar a barra do JProgressBar
  * 
  * @author technus
  */
 public static void carregar()
 {
  for(int barra=0;barra<=100;barra++)
  {
   try
   {
	Thread.sleep(50);
	
	barraDeProgresso.setValue(barra);
   }catch(InterruptedException e)
   {
	showMessageDialog(null, "Não foi possível carregar o programa", "Start", ERROR_MESSAGE);
   }
   
  }
 }
}//Fim do corpo da classe.
