package tsi.too.bvb.app;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import tsi.too.bvb.GUI.IgBoasVindas;
import tsi.too.bvb.GUI.StartSplash;
import static tsi.too.bvb.GUI.StartSplash.*;

public class BVBApp extends JFrame
{//Início do corpo da classe.

 private static UIManager.LookAndFeelInfo looksAndFeel[];
 private static final String LOOK_AND_FEEL_NAME = "Nimbus";
 
 public BVBApp()
 {
  //Utiliza o método alterarVisual para definir o look-and-feel da interface.
  alterarVisual(LOOK_AND_FEEL_NAME);
 }
	
 public static void main(String[] args)
 {//Início do corpo do método main.

  //Exibe a tela de Splash.
  StartSplash telaDeSplash = new StartSplash();
  carregar();
  
  //Libera os recursos da tela de Splash para exibir as janelas seguintes.
  telaDeSplash.dispose();
	 
  //Exibe a janela de Boas Vindas.
  IgBoasVindas bemVindo = new IgBoasVindas();
  
  //O botão "Iniciar" do objeto bemVindo, chama a tela de login para que o programa puramente se inicies.
  
  /* De acordo com o Login, verificando no arquivo de login qual o tipo de
   * usuário e exibindo a janela referente a cada usuário.
   */

 }//Fim do corpo do método main.
 
 /** Método utilizado para definir a aparência e o comportamento (look-and-feel) da interface gráfica.
  *  
  *  @param um <code>String</code> que contém o nome do look-and-feel da interface a ser utilizada.
  *  
  *  @author technus
  */   
 private void alterarVisual(String lookAndFell)
 {
  try
  {
   //Localiza o look-and-feel selecionado pelo usuário. 
   for(int lf = 0; lf < looksAndFeel.length; lf++)
	if (lookAndFell.equalsIgnoreCase(looksAndFeel[lf].getName())) 
	{
	 //Configura o novo look-and-feel carregando a classe de aparência e comportamento através do método getClassName.
	 UIManager.setLookAndFeel(looksAndFeel[lf].getClassName());
   	 break;
	}
   
   /* Altera a aparência e o comportamento de cada componente anexado ao argumento do método 
    * updateComponentTreeUI da classe SwingUtilities para a nova aparência e o novo comportamento 
    * escolhido pelo usuário. 
    */
   SwingUtilities.updateComponentTreeUI(this);

  //A partir da versão Java 7 (1.7) é possível usar um único catch para tratar várias exceções.
  }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
  {
   showMessageDialog(null, "Look And Feel não encontrado!", "Definição de visual", ERROR_MESSAGE);
  }
 }

}//Fim do corpo da classe.
