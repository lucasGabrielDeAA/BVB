package br.com.bvb.controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.Scanner;

public class Bvb {

	public static void main(String[] args) throws Exception {

		File arquivo = new File("arquivos/Clientes.txt");
		Scanner teclado = new Scanner(System.in);
		String entrada;

		try {
			if (!arquivo.exists()) {
				//cria um arquivo (vazio)
				arquivo.createNewFile();
			}
			
			//escreve no arquivo
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Reader read = new Reader() {
				public int read(char[] cbuf, int off, int len) throws IOException {
					return 0;
				}
				public void close() throws IOException {
				}
			};
			LineNumberReader lnr = new LineNumberReader(read);

			bw.write("Higor");
			bw.newLine();
			bw.write("12345");

			bw.close();
			fw.close();

			//faz a leitura do arquivo
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			
			System.out.println("Forneça o Usuário:");
			entrada = teclado.nextLine();
			boolean achou = false;
			String login;
			int linha = 0;
			while(br.ready()) {
				login = br.readLine();
				if(entrada.equals(login))
				{
					achou = true;
					break;					
				}
				linha++;
			}
			if(achou)
			{
				System.out.println("Usuário Encontrado!!!");
				System.out.println("Forneça a Senha:");
				entrada = teclado.nextLine();
				
				//Setando a posição do Arquivo para comaçar a leitura
				lnr.setLineNumber(linha+1);
				login = br.readLine();
				if(entrada.equals(login))
					System.out.println("Senha Correta!!!");				
				else
					System.out.println("Senha Incorreta!!!");
			}
			else
				System.out.println("Usuário Não Encontrado!!!");

			br.close();
			fr.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	} //main()

} //class Bvb
