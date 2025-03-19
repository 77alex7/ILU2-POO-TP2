package frontiere;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		if (nomAcheteur existe pas) {
			System.out.println("Je suis désolée"nomAcheteur"mais il faut être un habitant de notre village pour commercer ici.");
		}else {
			String produit=Clavier.entrerChaine("Quelle produit voulez vous acheter?");
			//String produitExist= trouver produit;
			if (produitExist==null) {
				System.out.println("Désolé, personne ne vend ce produit au marché");
			}
			else {
				System.out.println(nomAcheteur+" se déplace jusqu'à l'étal du vendeur "+vendeur);
				System.out.println("Bonjour"+nomAcheteur);
				int quantite=Clavier.entrerEntier("Combien de fleur voulez-vous acheter?");
				if (quantité ok) {
					System.out.println("Panoramix achète " +quantite+produit+" à "+nomVendeur);
					//-5fleurs au vendeur
				}else {
					if(quantité >0 mais quantite>nbFleur){
					System.out.println(nomAcheteur" veut acheter "+quantite+ produit+", malheureusement"+nomVendeur+" n'en a plus que 3."+nomAcheteur+" achète tout le stock de "+nomVendeur);
					}else {
						System.out.println(nomAcheteur"achète "+quantite+produit+", malheureusement il n'y en a plus !");
					}
				}
			}
		}	
	}
}
