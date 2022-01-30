package br.com.Servlet;

public class Calcular {
	//Definindo Atributos
	private int val1;
	private int val2;
	
	//Método Construtor
	public Calcular(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}
	
	//Método que calcula as operações
	public int somar() {
		return this.val1 + this.val2;
	}
	
	public int subtrair() {
		return this.val1 - this.val2;
	}
	
	public int multiplicar() {
		return this.val1 * this.val2;
	}
	public int dividir() {
		return this.val1 / this.val2;
	}
}
