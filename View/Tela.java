package View;

import javax.swing.JOptionPane;

public class Tela {
  public void  entraSistema() {
	  JOptionPane.showMessageDialog(null,
				"\nBem-Vindo\nSistema x");
  }
  public String  obtemRaca() {
	  String nomeRaca = JOptionPane.showInputDialog("Digite nome da raca");
	  return nomeRaca;
  }
  public void informaRaca(String mensagem) {
	  JOptionPane.showMessageDialog(null,mensagem);
  }
}