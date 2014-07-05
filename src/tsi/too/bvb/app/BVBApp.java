package tsi.too.bvb.app;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import tsi.too.bvb.GUI.IgBoasVindas;
import tsi.too.bvb.GUI.IgCaixaEletronico;
import tsi.too.bvb.GUI.StartSplash;
import static tsi.too.bvb.GUI.StartSplash.*;

public class BVBApp extends JFrame
{//Início do corpo da classe.

 public static void main(String[] args)
 {//Início do corpo do método main.
	
  //Exibe a tela de Splash.
  StartSplash telaDeSplash = new StartSplash();
  carregar();
  
  //Libera os recursos da tela de Splash para exibir as janelas seguintes.
  telaDeSplash.dispose();
  
  IgCaixaEletronico caixa = new IgCaixaEletronico();
	 
  //Exibe a janela de Boas Vindas.
  //IgBoasVindas bemVindo = new IgBoasVindas();
  
  //O botão "Iniciar" do objeto bemVindo, chama a tela de login para que o programa puramente se inicies.
  
  /* De acordo com o Login, verificando no arquivo de login qual o tipo de
   * usuário e exibindo a janela referente a cada usuário.
   */

 }//Fim do corpo do método main.
}//Fim do corpo da classe.
