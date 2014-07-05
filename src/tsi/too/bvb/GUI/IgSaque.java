package tsi.too.bvb.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class IgSaque extends JDialog
{//Início do corpo da classe.
 private JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botaoCorrige, botao0, botaoSaque;
 private JFormattedTextField saqueFormattedTextField;
 private Font fonte = new Font("Nimbus Sans L", Font.BOLD, 20);
 
 public IgSaque() throws Exception
 {
  //A classe javax.swing.text.MaskFormatter é utilizada para definir máscaras aos objetos onde se deseja padronizar estéticamente.
  MaskFormatter mascaraDeSaque = new MaskFormatter("####,##");
  getContentPane().setBackground(SystemColor.control);
  setSize(669, 400);
  setTitle("Saque");
  setModal(true);
  setLocationRelativeTo(null);
  setResizable(false);
  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  getContentPane().setLayout(null);
  
  botao1 = new JButton("1");
  botao1.setFont(fonte);
  botao1.addActionListener
  (
   new ActionListener()
   {
  	public void actionPerformed(ActionEvent arg0)
  	{
  	 String valor = saqueFormattedTextField.getText() + botao1.getText();
  	 
  	 saqueFormattedTextField.setText(valor);
  	}
   }
  );
  botao1.setBackground(new Color(192, 192, 192));
  botao1.setBounds(178, 187, 150, 64);
  getContentPane().add(botao1);
  
  botao2 = new JButton("2");
  botao2.setFont(fonte);
  botao2.setBackground(new Color(192, 192, 192));
  botao2.setBounds(340, 187, 150, 64);
  getContentPane().add(botao2);
  
  botao3 = new JButton("3");
  botao3.setFont(fonte);
  botao3.setBackground(new Color(192, 192, 192));
  botao3.setBounds(502, 187, 150, 64);
  getContentPane().add(botao3);
  
  botao4 = new JButton("4");
  botao4.setFont(fonte);
  botao4.setBackground(new Color(192, 192, 192));
  botao4.setBounds(178, 111, 150, 64);
  getContentPane().add(botao4);
  
  botao5 = new JButton("5");
  botao5.setFont(fonte);
  botao5.setBackground(new Color(192, 192, 192));
  botao5.setBounds(340, 111, 150, 64);
  getContentPane().add(botao5);
  
  botao6 = new JButton("6");
  botao6.setFont(fonte);
  botao6.setBackground(new Color(192, 192, 192));
  botao6.setBounds(502, 111, 150, 64);
  getContentPane().add(botao6);
  
  botao7 = new JButton("7");
  botao7.setFont(fonte);
  botao7.setBackground(new Color(192, 192, 192));
  botao7.setBounds(178, 35, 150, 64);
  getContentPane().add(botao7);
  
  botao8 = new JButton("8");
  botao8.setFont(fonte);
  botao8.setBackground(new Color(192, 192, 192));
  botao8.setBounds(340, 35, 150, 64);
  getContentPane().add(botao8);
  
  botao9 = new JButton("9");
  botao9.setFont(fonte);
  botao9.setBackground(new Color(192, 192, 192));
  botao9.setBounds(502, 35, 150, 64);
  getContentPane().add(botao9);
  
  botaoCorrige = new JButton("CORRIGE");
  botaoCorrige.setFont(fonte);
  botaoCorrige.addActionListener
  (
   new ActionListener()
   {
    public void actionPerformed(ActionEvent arg0)
    {
  	 saqueFormattedTextField.setText("");
    }
   }
  );
  botaoCorrige.setBackground(Color.RED);
  botaoCorrige.setBounds(178, 263, 150, 64);
  getContentPane().add(botaoCorrige);
  
  botao0 = new JButton("0");
  botao0.setFont(fonte);
  botao0.setBackground(new Color(192, 192, 192));
  botao0.setBounds(340, 263, 150, 64);
  getContentPane().add(botao0);
  
  botaoSaque = new JButton("SAQUE");
  botaoSaque.setFont(fonte);
  botaoSaque.setBackground(new Color(50, 205, 50));
  botaoSaque.setBounds(502, 263, 150, 64);
  getContentPane().add(botaoSaque);
  
  saqueFormattedTextField = new JFormattedTextField(mascaraDeSaque);
  saqueFormattedTextField.setBackground(Color.WHITE);
  saqueFormattedTextField.setEditable(false);
  saqueFormattedTextField.setBounds(6, 114, 150, 64);
  getContentPane().add(saqueFormattedTextField);

  setVisible(true);
 }
}//Fim do corpo da classe.
