package Model.Pets;

import Model.DAO.PetsDAO;

public class Pets {
   public String verificaPets(String codP) {
	   
	   PetsDAO  pets = new PetsDAO();
	   	  
	   String encontrada = pets.pesquisaPets(codP);
	   
	   String mensagemFormatada = "A raca " + encontrada;
	   
	   return  (mensagemFormatada); 
	   
   }
}