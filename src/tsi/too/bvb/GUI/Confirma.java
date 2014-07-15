package tsi.too.bvb.GUI;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import static javax.swing.JOptionPane.*;

public class Confirma extends JDialog
{//Início do corpo da classe.
	
 private JTextField numeroContaTextField;
 private JButton botaoConfirmar;
	
 public Confirma(String valor, JDialog tela)
 {
  setResizable(false);
  setTitle("Confirmar Conta");
  setSize(350, 175);
  setLocationRelativeTo(null);
  getContentPane().setLayout(null);
  
  JLabel lblConta = new JLabel("Conta:");
  lblConta.setBounds(63, 48, 53, 15);
  getContentPane().add(lblConta);
 	
  numeroContaTextField = new JTextField();
  numeroContaTextField.setBounds(112, 42, 122, 27);
  getContentPane().add(numeroContaTextField);
  numeroContaTextField.setColumns(10);
 	
  botaoConfirmar = new JButton("CONFIRMAR");
  botaoConfirmar.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
    String numeroConta = numeroContaTextField.getText();
    
    
    /* boolean contaValida = ValidaNumeroConta(numeroConta);
     * 
     * setVisible(false);
     * 
     * if(contaValida)
     * {
     *  if(tela instanceof IgSaque)
     *  {
     *   saque(valor, Double.ParseDouble(numeroConta));
     *  }
     *  if(tela instanceof Deposito)
     *  {
     *   deposito(valor, Double.ParseDouble(numeroConta))
     *   }
     * }
     * else
     * 	   showMessageDialog(null,"Conta não encontrada, Operação não permitida","Verificação de número de Conta",ERROR_MESSAGE);
     */
   }
  });
  botaoConfirmar.setBounds(232, 109, 100, 27);
  getContentPane().add(botaoConfirmar);
 	
  JButton botaoCancelar = new JButton("CANCELAR");
  botaoCancelar.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent arg0)
   {
	//Pegar a referência da tela anterior e retorná-la após liberar os recursos da janela de confirmação.
	   
	Confirma.this.dispose();
   }
  });
  botaoCancelar.setBounds(12, 109, 100, 27);
  getContentPane().add(botaoCancelar);
 
  setVisible(true);
 }
}//Fim do corpo da classe.
