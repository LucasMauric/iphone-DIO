package iphoneUML.dispositivos.telefone;

public class Telefone implements DispositivoDeLigacao {

	@Override
	public void fazerLigacao() {
		// TODO Auto-generated method stub
		System.out.println("Fazendo Ligacao");
	}

	@Override
	public void desligarLigacao() {
		// TODO Auto-generated method stub
		System.out.println("Desligando ligacao");
	}

	@Override
	public void trocarLigacao() {
		// TODO Auto-generated method stub
		System.out.println("Trocando ligacao");
	}

	@Override
	public void deixarRecado() {
		// TODO Auto-generated method stub
		System.out.println("Deixando recado");
	}

}
