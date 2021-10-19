package entidade;

import javax.swing.JOptionPane;

public class Account {
	private int numero;
	private String titular;
	private double balanco;
	
	public Account(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public Account(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getBalanco() {
		return balanco;
	}
	
	public void deposito(double valor) {
		balanco+= valor;
	}
	
	public void saque(double valor) {
		balanco-= valor + 5.0;
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Nome do Titular: " + this.titular + "\n" +
											"Numero da Conta: " + this.numero  + "\n" +
											"Saldo Atual: " +  String.format("%.2f", balanco));
	}
	
}
