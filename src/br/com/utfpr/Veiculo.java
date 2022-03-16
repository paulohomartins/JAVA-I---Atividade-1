package br.com.utfpr;

public class Veiculo extends Motor{
	
	//Atributos
	private String placa = " ";
	private String marca = " ";
	private String modelo = " ";
	private String cor = " ";
	private float velocMax = 0;
	

	//Getters and Setters
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public float getVelocMax() {
		return velocMax;
	}
	
	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}
	
	
	//Método veículo
		public void imprimirVeiculo() {
			System.out.println("Marca: "+this.marca);
			System.out.println("Modelo: "+this.modelo);
			System.out.println("Cor: "+this.cor);
			System.out.println("Placa: "+this.placa);
			System.out.println("Velocidade máxima: "+this.velocMax);
		}
		
		

}
