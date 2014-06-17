package tsi.too.bvb.validacoes;

import static javax.swing.JOptionPane.*;

public class Validacoes
{//Início do corpo da classe.
	
 private static final String VALIDA_NOME = "Validação de Nome: ", 
		 					 VALIDA_TELEFONE = "Validação de Telefone: ",
		 					 VALIDA_ENDERECO = "Validação de Endereço: ",
		 					 VALIDA_CPF = "Validação de CPF: ";
	
 /** 
  * Método utilizado para realizar a validação do cpf.
  * 
  * @param <code>String</code> cpf
  *
  * @autor technus
  * 
  * @return Um <code>boolean</code> que determina se o cpf foi ou não validado. 
  */
 public static boolean validaCPF(String cpf)
 {
  String novoCPF = "", primeiro, segundo;
	  
  boolean cpfValido;
	  
  int digito1, digito2, soma1 = 0, soma2 = 0, primeiroDigito = 0, segundoDigito = 0, soma = 0, valido1, valido2;
	  
  primeiro = cpf.substring(12,13);
  segundo = cpf.substring(13, cpf.length());
	  
  valido1 = Integer.parseInt(primeiro);
  valido2 = Integer.parseInt(segundo);
	  
  /* Cada posição do cpf é verificada.
   * 0 1 2 3 4 5 6 7 8 9 10 11 12 13
   * 1 2 3 . 1 2 3 . 1 2 3  /  8  7
   */
  for(int i = 0,j = 3;i<cpf.length()-3;i=i+4,j=j+4)
     novoCPF += cpf.substring(i,j);
	  
  /* 1 Passo:
   * 
   * Multiplique cada um dos noves dígitos do CPF, respectivamente, pela sequência de
   * números 10, 9, 8, 7, 6, 5, 4, 3, 2 e some o resultado de cada produto. 
   */
  for(int indice = 0,digito = 10 ;indice<novoCPF.length();indice++, digito--)
	 soma1 += novoCPF.charAt(indice)*digito;
	  
  /* 2 Passo:
   * 
   * Multiplique o resultado da soma obtida no 1 passo por 10 e calcule o resto da
   * divisão inteira deste produto 11. Se este resto for igual a 10 substitua-o por 0 (zero).
   * Este é o 1o dígito verificador do CPF.
   */
  soma1 = soma1*10;
  
  digito1 = soma1%11;
  
  if(digito1==10)
  {
   primeiroDigito = digito1;
   digito1 = 0;
  }
 
  /* 3 Passo:
   * 
   * Multiplique cada um dos noves dígitos do CPF, respectivamente, pela sequência de
   * números 11, 10, 9, 8, 7, 6, 5, 4, 3 e some o resultado de cada produto
   */
  for(int indice = 0, digito = 11;indice<novoCPF.length();indice++, digito--)
	 soma2 += novoCPF.charAt(indice)*digito;
	  
  /* 4 Passo:
   * 
   * Some o valor obtido na soma do 3 Passo com o produto de 2 pelo 1 dígito
   * verificador calculado no 2 Passo.
   */
  soma = soma2 + (primeiroDigito*2);
  
  /* 5 Passo:
   * 
   * Multiplique o resultado da soma obtida no 4 Passo por 10 e calcule o resto da
   * divisão inteira deste produto 11. Se este resto for igual a 10 substitua-o por 0 (zero).
   * Este é o 2o dígito verificador do CPF.
   */
  soma2 = soma*10;
  
  digito2 = soma2%11;
	  
  if(digito2==10)
  {
   segundoDigito = digito2;
   digito2 = 0;
  }
	  
  if(digito1 == valido1 && digito2 == valido2)
  {
   cpfValido = true;
   showMessageDialog(null, "CPF válido", VALIDA_CPF, INFORMATION_MESSAGE);
  }
  else
	  cpfValido = false;
  	  showMessageDialog(null, "CPF " + cpf + " inválido", VALIDA_CPF, ERROR_MESSAGE);
	  
  return cpfValido;
 }
 
 /**
  * Método utilizado para validar nomes.
  * 
  * @param um <code>String</code> que contém o nome a ser validado.
  * 
  * @author technus
  * 
  * @return um <code>boolean</code>> que define se o nome foi ou não validado.
  */
 public static boolean validaNome(String nome)
 {
  boolean nomeValido;
  
  do
  {
   //Realiza a validação do nome inserido pelo usuário.
   if(nome.equals("") || nome==null)
   {
	showMessageDialog(null, "Nome " + nome +  " inválido", VALIDA_NOME, WARNING_MESSAGE);
	nomeValido = false;
   }
   else
   {
    showMessageDialog(null, "Nome Válido", VALIDA_NOME, WARNING_MESSAGE);
	nomeValido = true;
   }
  }while(nomeValido!=true);
		
  return nomeValido;
 }
 
 /**
  * Método utilizado para validar o telefone.
  * 
  * @param um <code>String</code> que contém o telefone a ser validado.
  * 
  * @author technus
  * 
  * @return um <code>boolean</code> que define se o telefone foi validado ou não.
  */
 public static boolean validaTelefone(String telefone)
 {
  boolean telefoneValido = false;
  
  /* O bloco try-catch é utilizado para que só sejam permitidos números
   * decimais nos telefones a serem checados.
   */
  try
  {
   do
   {
	//A validação é realizada.
    if(telefone.equals("") || telefone==null)
    {
     showMessageDialog(null, "Telefone " + telefone + " inválido", VALIDA_TELEFONE, WARNING_MESSAGE);
     telefoneValido = false;
    }
    else
    {
     showMessageDialog(null, "Telefone Válido", VALIDA_TELEFONE, INFORMATION_MESSAGE);
     telefoneValido = true;
     }
     
    }while(telefoneValido!=true);
   
   }catch(NumberFormatException exception)
   {
	showMessageDialog(null, "Telefone Inválido\nApenas números são permitidos", VALIDA_TELEFONE, ERROR_MESSAGE);
   }
    
  return telefoneValido;
 }
 
 /**
  * Método utilizado para validar o endereço
  * 
  * @param um <code>String</code> que contém o endereço a ser validado.
  * 
  * @author technus
  * 
  * @return um <code>boolean</code> que define se o endereço foi ou não validado.
  */
 public static boolean validaEndereco(String endereco)
 {
  boolean enderecoValido;
  
  do
  {
   if(endereco.equals("")||endereco==null)
   {
    showMessageDialog(null, "Endereço " + endereco + " inválido", VALIDA_ENDERECO, ERROR_MESSAGE);
    enderecoValido = false;
   }
   else
   {
    showMessageDialog(null, "Endereço Válido", VALIDA_ENDERECO, INFORMATION_MESSAGE);
    enderecoValido = true;
   }
  }while(enderecoValido!=true);
  
  return enderecoValido;
 }

}//Fim do corpo da classe.
