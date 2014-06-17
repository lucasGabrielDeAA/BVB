package tsi.too.bvb.GUI;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static javax.swing.JOptionPane.*;

public class FuncoesGUI
{//Início do corpo da classe.
	
 private static UIManager.LookAndFeelInfo looksAndFeel[];

	
 /** Método utilizado para definir a aparência e o comportamento (look-and-feel) da interface gráfica.
  *  
  *  @param um <code>String</code> que contém o nome do look-and-feel da interface a ser utilizada.
  *  
  *  @author technus
  */   
 public static void alterarVisual(String lookAndFeel)
 {
  try
  { 
   /* Configura o novo look-and-feel carregando (se ainda não estiver) a classe de aparência e comportamento 
	* através do método getClassName.
	*/
   for(int lf = 0; lf < looksAndFeel.length; lf++)
	  if(lookAndFeel.equalsIgnoreCase(looksAndFeel[lf].getName()))
	  {
	   UIManager.setLookAndFeel(looksAndFeel[lf].getClassName());
	   break;
	  }
	
   //A partir da versão Java 7 (1.7) é possível usar um único catch para tratar várias exceções.
  }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
  {
   showMessageDialog(null, "Look And Feel não encontrado!", "Definição de visual", ERROR_MESSAGE);
  }
 }
	
}//Fim do corpo da classe.
