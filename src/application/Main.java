package application;
import javax.swing.JOptionPane;
import entidade.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account;
		
		//ENTRADA DE DADOS
		int    numero    = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite sua conta: "));
		String titular   = JOptionPane.showInputDialog(null, "Digite o nome do Titular: ");
		char   response  = JOptionPane.showInputDialog(null, "Tera deposito Inicial? (y/n) ").charAt(0);
		
		// VALIDAR SE TEM DEPOSITO INICIAL
		if(response == 'y') {
			int depositoInicial = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o valor do deposito inicial: "));
			account = new Account(numero, titular, depositoInicial);
		}else {
			account = new Account(numero, titular);
		}
		//VALIDAR SE VAI DEPOSITAR OU NAO
		int op = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o valor correspondente para a operacao desejada: " + "\n"+
																	"1 - Deposito em C/C"+"\n"+
																	"2 - Saque C/C "));

		switch(op) {
		case 1:{
			int deposito = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o valor do dep�sito: "));	
			account.deposito(deposito);
			account.exibirDados();
			break;
		}
		
		case 2:{
			double saque = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o valor do seu saque: "));
			if(account.getBalanco() == 0) {
				JOptionPane.showMessageDialog(null, "Sem saldo em conta");
			}else
				account.saque(saque);
				account.exibirDados();
			break;
		}
		
		}
		
	}

}
