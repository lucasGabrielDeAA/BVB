package tsi.too.bvb.app;


import javax.swing.JFrame;

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
  
  /* De acordo com o Login, verificando no arquivo de login qual o tipo de
   * usuário e exibindo a janela referente a cada usuário.
   */

 }//Fim do corpo do método main.
}//Fim do corpo da classe.
