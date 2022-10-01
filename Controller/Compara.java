package Controller;

import Model.Pets.Pets;
import View.Tela;

public class Compara {
	public static void main(String[] args) {
			Tela tela = new Tela();
			tela.entraSistema();
			
			String petsInformado = tela.obtemRaca();
			
			Pets pets = new Pets();
			
			String mensagem = pets.verificaPets(petsInformado);
			
			tela.informaRaca(mensagem);
	
	}
}