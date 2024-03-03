package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KillController {
	
	private String os() {
		String soNome = System.getProperty("os.name");
		return soNome;
	}
	
	public void listaProcessos() {
		String soNome = os();
		String exec = "";
		
		if(soNome.contains("Windows")) {
			exec = "TASKLIST /FO TABLE";
		} else if(soNome.contains("Linux")) {
			exec = "ps -ef";
		}
		
		try {
			Process p = Runtime.getRuntime().exec(exec);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			fluxo.close();
			leitor.close();
			buffer.close();
			
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		
	}

	public void mataPID(int pid) {
		String soNome = os();
		StringBuffer pidBuffer = new StringBuffer();
		String soPid;
		if(soNome.contains("Windows")) {
			soPid = "TASKKILL /PID";
			pidBuffer.append(soPid);
			pidBuffer.append(" ");
			pidBuffer.append(pid);
		} 
		else if (soNome.contains("Linux")) {
			soPid = "kill -9";
			pidBuffer.append(soPid);
			pidBuffer.append(" ");
			pidBuffer.append(pid);
		}
		try {
			Process p = Runtime.getRuntime().exec(pidBuffer.toString());
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}		
		System.out.println("Processo de PID " + pid + ", foi morto!");
	}

	public void mataNome(String nomeProcesso) {
		String soNome = os();
		String comando;
		StringBuffer comandoBuffer = new StringBuffer();
		
		if(soNome.contains("Windows")) {
			comando = "TASKKILL /IM ";
			comandoBuffer.append(comando);
			comandoBuffer.append(nomeProcesso);
		}
		else if (soNome.contains("Linux")) {
			comando = "pkill -f ";
			comandoBuffer.append(comando);
			comandoBuffer.append(nomeProcesso);
		}
		try {
			Runtime.getRuntime().exec(comandoBuffer.toString());
		} catch(IOException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Processo: " + nomeProcesso + ", foi morto!");
		
	}
}
