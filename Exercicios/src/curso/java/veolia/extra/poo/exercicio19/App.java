package curso.java.veolia.extra.poo.exercicio19;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		Conta conta = new Conta();
		int opcao = 0;
		
		conta.setCliente(JOptionPane.showInputDialog("Nome do Cliente: "));
		conta.setNumeroConta(JOptionPane.showInputDialog("Número da Conta:"));
		conta.setTipoConta(Integer.parseInt(JOptionPane.showInputDialog("Tipo de Conta: \n1 - Simples \n2 - Especial \n")));
		conta.setLimiteCredito(Double.parseDouble(JOptionPane.showInputDialog("Informe o limite da conta: ")));
		conta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo inicial: ")));
		
		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"
					+ "1 - Saque \n"
					+ "2 - Deposito \n"
					+ "3 - Extrato \n"
					+ "9 - Sair"));
			
			switch (opcao) {
			case 1:
				conta.saque(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque:")));			
				break;
			case 2:
				conta.deposito(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito:")));			
				break;
			case 3:
				JOptionPane.showMessageDialog(null, conta.extrato()); 
				
				break;
			}
			
		} while (opcao != 9);
		

		
	}

}
