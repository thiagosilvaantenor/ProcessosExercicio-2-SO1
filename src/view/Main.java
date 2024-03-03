package view;

import javax.swing.JOptionPane;

import controller.KillController;

public class Main {

	public static void main(String[] args) {
		KillController killC = new KillController();
		int opc = 0;
		while(opc != 4) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Ola, digite o número da opção que quer selecionar\n1 - Listar Processos\n2 - Matar processo por PID\n3 - Matar processo por nome\n4 - Sair"));
			switch(opc) {
				case 1: JOptionPane.showMessageDialog(null, "A lista de processos será mostrada no terminal");
						killC.listaProcessos();
						break;
				case 2: int pid = Integer.parseInt(JOptionPane.showInputDialog("Informe o PID do processo que deseja matar"));
						killC.mataPID(pid);
						break;
				case 3: String nome = JOptionPane.showInputDialog("Informe o nome do processo que deseja matar");
						killC.mataNome(nome);
						break;
				case 4: JOptionPane.showMessageDialog(null, "Saindo ...");
						break;
				default: JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
			}
		}
		

	}

}
