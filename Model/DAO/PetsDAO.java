package Model.DAO;

public class PetsDAO {
   public String pesquisaPets(String codPetsPesquisa) {
	    String codPets1 = "Akita";
		String codPets2 = "Basset hound";
		String codPets3 = "Beagle";
		String raca;
		if (codPetsPesquisa.equals(codPets1) ) {
			raca = "foi encontrada";
		} else {
			if (codPetsPesquisa.equals(codPets2) ) {
				raca = "foi encontrada";
			} else {
				if (codPetsPesquisa.equals(codPets3) ) {
					raca = "foi encontrada";
				} else {
					raca = "nao foi encontrada";
				}
			}
				
		}
		return raca;
   }
}