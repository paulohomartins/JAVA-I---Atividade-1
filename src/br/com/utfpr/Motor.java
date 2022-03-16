package br.com.utfpr;

public class Motor {
	
	//Atributos
	private int qtdPist = 0;
	private int potencia = 0;
		
	//Getters and Setters
	public int getQtdPist() {
		return qtdPist;
		}
	
	public void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
		}
	
	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
		
	//Método motor
	public void Motor() {
		System.out.println("Acelera Ayrton! Vrummmm");
	}

}
