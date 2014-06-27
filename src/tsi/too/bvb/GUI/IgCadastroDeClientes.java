package tsi.too.bvb.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.awt.SystemColor;

public class IgCadastroDeClientes extends JDialog
{
 private JPasswordField senhaField;
 private JFormattedTextField cpfTextFormatted;
 private JFormattedTextField telefoneFixoFormatted;
 private JTextField numeroTextField;
 private JTextField cidadeTextField;
 private JTextField bairroTextField;
 private JTextField complementoTextField;
 private JTextField logradouroTextField;
 private JTextField nomeTextfield;
 private JFormattedTextField movelFormatted;

 public IgCadastroDeClientes() throws Exception
 {
  setTitle("Cadastro de Clientes");
  setModal(true);
  getContentPane().setLayout(null);
  
  JPanel painel = new JPanel();
  painel.setBackground(SystemColor.control);
  setBounds(100, 100, 450, 360);
  getContentPane().setLayout(new BorderLayout());
  painel.setBorder(new EmptyBorder(5, 5, 5, 5));
  getContentPane().add(painel, BorderLayout.CENTER);
  painel.setLayout(null);
  
  //A classe javax.swing.text.MaskFormatter é utilizada para definir máscaras aos objetos onde se deseja padronizar estéticamente.
  MaskFormatter mascara = new MaskFormatter("###.###.###-##"), //Máscara para o CPF.
                mascara1 = new MaskFormatter("(##)####-####"); //Máscara para o Telefone.
  
  JPanel panel = new JPanel();
  panel.setBackground(SystemColor.control);
  panel.setBounds(0, 287, 444, 33);
  painel.add(panel);
  
  JLabel cpfLabel = new JLabel("CPF:");
  cpfLabel.setBounds(10, 11, 41, 14);
  painel.add(cpfLabel);
  cpfTextFormatted = new JFormattedTextField(mascara);
  cpfTextFormatted.setBounds(50, 5, 85, 27);
  painel.add(cpfTextFormatted);
  
  JLabel nomeLabel = new JLabel("Nome:");
  nomeLabel.setBounds(10, 42, 41, 14);
  painel.add(nomeLabel);
  
  nomeTextfield = new JTextField();
  nomeTextfield.setBounds(50, 39, 351, 27);
  painel.add(nomeTextfield);
  nomeTextfield.setColumns(10);
  
  JLabel logradouroLabel = new JLabel("Logradouro:");
  logradouroLabel.setBounds(10, 73, 85, 14);
  painel.add(logradouroLabel);
  
  logradouroTextField = new JTextField();
  logradouroTextField.setBounds(97, 70, 304, 27);
  painel.add(logradouroTextField);
  logradouroTextField.setColumns(10);
  
  JLabel complementoLabel = new JLabel("Complemento:");
  complementoLabel.setBounds(10, 103, 93, 14);
  painel.add(complementoLabel);
  
  complementoTextField = new JTextField();
  complementoTextField.setBounds(97, 100, 57, 27);
  painel.add(complementoTextField);
  complementoTextField.setColumns(10);
  
  JLabel bairroLabel = new JLabel("Bairro:");
  bairroLabel.setBounds(10, 131, 46, 14);
  painel.add(bairroLabel);
  
  bairroTextField = new JTextField();
  bairroTextField.setBounds(97, 128, 304, 27);
  painel.add(bairroTextField);
  bairroTextField.setColumns(10);
  
  JLabel cidadeLabel = new JLabel("Cidade:");
  cidadeLabel.setBounds(10, 159, 57, 14);
  painel.add(cidadeLabel);
  
  cidadeTextField = new JTextField();
  cidadeTextField.setBounds(97, 156, 304, 27);
  painel.add(cidadeTextField);
  cidadeTextField.setColumns(10);
  
  JLabel numeroLabel = new JLabel("Número:");
  numeroLabel.setBounds(10, 187, 57, 14);
  painel.add(numeroLabel);
  
  numeroTextField = new JTextField();
  numeroTextField.setBounds(97, 184, 304, 27);
  painel.add(numeroTextField);
  numeroTextField.setColumns(10);
  
  JLabel telefoneFixoLabel = new JLabel("Telefone Fixo:");
  telefoneFixoLabel.setBounds(10, 216, 93, 14);
  painel.add(telefoneFixoLabel);
  
  telefoneFixoFormatted = new JFormattedTextField(mascara1);
  telefoneFixoFormatted.setBounds(117, 210, 93, 27);
  painel.add(telefoneFixoFormatted);
  
  JLabel telefoneMovelLabel = new JLabel("Telefone Móvel:");
  telefoneMovelLabel.setBounds(10, 242, 98, 14);
  painel.add(telefoneMovelLabel);
  
  movelFormatted = new JFormattedTextField(mascara1);
  movelFormatted.setBounds(117, 239, 93, 27);
  painel.add(movelFormatted);
  
  JLabel senhaLabel = new JLabel("Senha:");
  senhaLabel.setBounds(248, 235, 57, 21);
  painel.add(senhaLabel);
  
  senhaField = new JPasswordField();
  senhaField.setBounds(307, 229, 93, 27);
  painel.add(senhaField);
  
  JButton btnOk = new JButton("OK");
  panel.add(btnOk);
  
  JButton btnCancelar = new JButton("Cancelar");
  
  //Define o tratador de evento para voltar à tela anterior, quando o botão "Cancelar" for clicado.
  btnCancelar.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
	IgCadastroDeClientes.this.dispose();
   }
  });
  panel.add(btnCancelar);
  
  setResizable(false);
  setLocationRelativeTo(null);
  setVisible(true);
 }

}//Fim do corpo da classe.
