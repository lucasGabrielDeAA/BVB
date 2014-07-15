package tsi.too.bvb.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.ImageIcon;

public class IgSaque extends JDialog
{//Início do corpo da classe.
 private JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botaoCorrige, botao0, botaoSaque, botaoCancelar;
 private JFormattedTextField saqueFormattedTextField;
 private Font fonte = new Font("Nimbus Sans L", Font.BOLD, 20);
 private IgSaque igSaque;
 
 public IgSaque()
 {
  //A classe MaskFormatter é utilizada para definir máscaras aos objetos onde se deseja padronizar estéticamente.
  MaskFormatter mascaraDeSaque = null;
  try
  {
   mascaraDeSaque = new MaskFormatter("####.##");
  }catch(ParseException e)
  {
  }
  
  saqueFormattedTextField = new JFormattedTextField(mascaraDeSaque);
  saqueFormattedTextField.setFont(fonte);
  saqueFormattedTextField.setBackground(Color.WHITE);
  saqueFormattedTextField.setBounds(9, 114, 150, 64);
  getContentPane().add(saqueFormattedTextField);
  getContentPane().setBackground(SystemColor.control);
  setSize(669, 480);
  setModal(true);
  setLocationRelativeTo(null);
  setResizable(false);
  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  getContentPane().setLayout(null);
  
  botao1 = new JButton();
  botao1.setFont(fonte);
  botao1.setText("1");
  botao1.addActionListener
  (
   new ActionListener()
   {
  	public void actionPerformed(ActionEvent arg0)
  	{
  	 String saque = null;
  	 
  	 saque = saqueFormattedTextField.getText();
  	 
  	 saque += botao1.getText();
  	 
  	 saqueFormattedTextField.setText(saque);
  	}
   }
  );
  botao1.setBackground(new Color(192, 192, 192));
  botao1.setBounds(178, 187, 150, 64);
  getContentPane().add(botao1);
  
  botao2 = new JButton();
  botao2.setFont(fonte);
  botao2.setText("2");
  botao2.addActionListener
  (
   new ActionListener()
   {
  	public void actionPerformed(ActionEvent arg0)
  	{
  	 String saque = null;
  	 
  	 saque = saqueFormattedTextField.getText();
     
  	 saque += botao2.getText();
  		
  	 saqueFormattedTextField.setText(saque);
  	}
   }
  );
  botao2.setBackground(new Color(192, 192, 192));
  botao2.setBounds(340, 187, 150, 64);
  getContentPane().add(botao2);
  
  botao3 = new JButton("3");
  botao3.setFont(fonte);
  botao3.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
  	String saque = "";
  	
  	saque = saqueFormattedTextField.getText();
  	
  	saque += botao3.getText();
  	
  	saqueFormattedTextField.setText(saque);
   }
  });
  botao3.setBackground(new Color(192, 192, 192));
  botao3.setBounds(502, 187, 150, 64);
  getContentPane().add(botao3);
  
  botao4 = new JButton("4");
  botao4.setFont(fonte);
  botao4.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
  	String saque = "";
  	
  	saque = saqueFormattedTextField.getText();
  	
  	saque += botao4.getText();
  	
  	saqueFormattedTextField.setText(saque);
   }
  });
  botao4.setBackground(new Color(192, 192, 192));
  botao4.setBounds(178, 111, 150, 64);
  getContentPane().add(botao4);
  
  botao5 = new JButton("5");
  botao5.setFont(fonte);
  botao5.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
  	String saque = "";
  	
  	saque = saqueFormattedTextField.getText();
  	
  	saque += botao5.getText();
  	
  	saqueFormattedTextField.setText(saque);
   }
  });
  botao5.setBackground(new Color(192, 192, 192));
  botao5.setBounds(340, 111, 150, 64);
  getContentPane().add(botao5);
  
  botao6 = new JButton("6");
  botao6.setFont(fonte);
  botao6.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
  	String saque = "";
  	
  	saque = saqueFormattedTextField.getText();
  	
  	saque += botao6.getText();
  	
  	saqueFormattedTextField.setText(saque);
   }
  });
  botao6.setBackground(new Color(192, 192, 192));
  botao6.setBounds(502, 111, 150, 64);
  getContentPane().add(botao6);
  
  botao7 = new JButton("7");
  botao7.setFont(fonte);
  botao7.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
  	String saque = "";
  	
  	saque = saqueFormattedTextField.getText();
  	
  	saque += botao7.getText();
  	
  	saqueFormattedTextField.setText(saque);
   }
  });
  botao7.setBackground(new Color(192, 192, 192));
  botao7.setBounds(178, 35, 150, 64);
  getContentPane().add(botao7);
  
  botao8 = new JButton("8");
  botao8.setFont(fonte);
  botao8.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
  	String saque = "";
  	
  	saque = saqueFormattedTextField.getText();
  	
  	saque += botao8.getText();
  	
  	saqueFormattedTextField.setText(saque);
   }
  });
  botao8.setBackground(new Color(192, 192, 192));
  botao8.setBounds(340, 35, 150, 64);
  getContentPane().add(botao8);
  
  botao9 = new JButton("9");
  botao9.setFont(fonte);
  botao9.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
  	String saque = "";
  	
  	saque = saqueFormattedTextField.getText();
  	
  	saque += botao9.getText();
  	
  	saqueFormattedTextField.setText(saque);
   }
  });
  botao9.setBackground(new Color(192, 192, 192));
  botao9.setBounds(502, 35, 150, 64);
  getContentPane().add(botao9);
  
  botaoCorrige = new JButton("CORRIGE");
  botaoCorrige.setIcon(new ImageIcon(IgSaque.class.getResource("/tsi/too/bvb/imagens/refresh.png")));
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
  botaoCorrige.setBackground(Color.LIGHT_GRAY);
  botaoCorrige.setBounds(239, 383, 189, 64);
  getContentPane().add(botaoCorrige);
  
  botao0 = new JButton("0");
  botao0.setFont(fonte);
  botao0.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
  	String saque = "";
  	
  	saque = saqueFormattedTextField.getText();
  	
  	saque += botao0.getText();
  	
  	saqueFormattedTextField.setText(saque);
   }
  });
  botao0.setBackground(new Color(192, 192, 192));
  botao0.setBounds(340, 263, 150, 64);
  getContentPane().add(botao0);
  
  botaoSaque = new JButton("SAQUE");
  botaoSaque.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
	String valorSaque = saqueFormattedTextField.getText();
	
	setVisible(false);
	
  	new Confirma(valorSaque, IgSaque.this);
  	
  	//Valida o número de conta e realiza o saque.
   }
  });
  botaoSaque.setIcon(new ImageIcon(IgSaque.class.getResource("/tsi/too/bvb/imagens/next.png")));
  botaoSaque.setFont(fonte);
  botaoSaque.setBackground(Color.LIGHT_GRAY);
  botaoSaque.setBounds(463, 383, 189, 64);
  getContentPane().add(botaoSaque);
  
  botaoCancelar = new JButton("CANCELAR");
  botaoCancelar.setIcon(new ImageIcon(IgSaque.class.getResource("/tsi/too/bvb/imagens/return.png")));
  botaoCancelar.setFont(fonte);
  botaoCancelar.setBounds(9, 383, 189, 64);
  getContentPane().add(botaoCancelar);
  
  setVisible(true);
 }

}//Fim do corpo da classe.
