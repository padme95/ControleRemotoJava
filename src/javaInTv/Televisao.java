package javaInTv;

public class Televisao {
	
	private int numVolume;
	private int volumeMax = 10;
	private int volumeAtual;
	private int numCanal;
	private int canalAtual;
	
	public void ligarTv(int numCanal) {
		if(numCanal>=1) {
			canalAtual = 0;
			volumeAtual = 0;
			this.numCanal = numCanal;
			System.out.println("TV Ligada!");
			System.out.println("Escolha seu canal!");
			System.out.println("Canal escolhido: " + numCanal);
			System.out.println("----------------------------------------------------");
		}else {
			System.out.println("Erro ao ligar a TV"
					+ "escolha o canal e o volume");
		}
	}
	
	
	
	public void selecionarCanal(int numCanal) {
		if( this.numCanal>=1) {
			canalAtual = 0;
			volumeAtual = 0;
			this.numCanal = numCanal;
			System.out.println("Canal escolhido: " + this.numCanal);
			System.out.println("----------------------------------------------------");
		}else {
			System.out.println("Erro ao trocar de canal"
					+ "escolha um canal v�lido");
		}
	}
	
	public void subirCanal() {
		if(this.numCanal == canalAtual) {
			System.out.println("Canal atual: " + canalAtual);
			System.out.println("Voc� j� est� neste canal");
		}else {
			numCanal++;
			System.out.println("Subindo um canal...");
			System.out.println("Canal atual: " + this.numCanal);
			}
			System.out.println("----------------------------------------------------------------");
		}
	public void descerCanal() {
		if(this.numCanal == 0) {
			System.out.println("Esse � o �ltimo canal");
		}else {
			numCanal--;
			System.out.println("Descendo um canal...");
			System.out.println("Canal atual: " + this.numCanal);
			}
			System.out.println("----------------------------------------------------------------");
		}

	
	public void aumentarVolume() {
		if(this.numVolume == this.volumeMax) {
			System.out.println("Volume atual: " + volumeAtual);
			System.out.println("Voc� est� no volume m�ximo");
		}else {
			numVolume++;
			System.out.println("Aumentando o volume...");
			System.out.println("Volume atual: " + this.numVolume);
			}
			System.out.println("A TV suporta o volume m�ximo de: " + this.volumeMax);
			System.out.println("----------------------------------------------------------------");
		}
	
	public void diminuirVolume() {
		if(this.numVolume == 0) {
			System.out.println("Estamos no volume m�nimo!");
		}else {
			numVolume--;
			System.out.println("Diminuimos um volume!");
			System.out.println("Volume atual: " + this.numVolume);
			}
			System.out.println("A TV suporta o volume m�ximo de: " + volumeMax);
			System.out.println("----------------------------------------------------------------");
		}
	
	public void consultaTv() {
		System.out.println("O volume atual �: " + numVolume);
		System.out.println("O canal atual � :  " + numCanal);
	}
	
	
}
