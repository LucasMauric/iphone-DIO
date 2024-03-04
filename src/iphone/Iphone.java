package iphone;

import iphoneUML.dispositivos.navegador.Web;
import iphoneUML.dispositivos.reprodutorMusical.DispositivoDeAudio;
import iphoneUML.dispositivos.telefone.DispositivoDeLigacao;

public class Iphone implements Web, DispositivoDeAudio, DispositivoDeLigacao {
	
	private String  Modelo;
	private String Versao;


	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getVersao() {
		return Versao;
	}

	public void setVersao(String versao) {
		Versao = versao;
	}

	@Override
	public void fazerLigacao() {
		// TODO Auto-generated method stub
		System.out.println("Fazendo ligacao ");
	}

	@Override
	public void desligarLigacao() {
		// TODO Auto-generated method stub
		System.out.println("Desligando ligacao");
	}

	@Override
	public void trocarLigacao() {
		// TODO Auto-generated method stub
		System.out.println("Tocando ligacao");
	}

	@Override
	public void deixarRecado() {
		// TODO Auto-generated method stub
		System.out.println("Deixando recado");
	}

	@Override
	public void tocarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Trocando a Musica");
	}

	@Override
	public void pausarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Pausando a  musica");
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		System.out.println("Pesquisando");
	}

	@Override
	public void baixarDados() {
		// TODO Auto-generated method stub
		System.out.println("Baixando dados");
	}



}
