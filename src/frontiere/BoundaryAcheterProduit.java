package frontiere;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		if (nomAcheteur existe pas) {
			System.out.println("Je suis d�sol�e"nomAcheteur"mais il faut �tre un habitant de notre village pour commercer ici.");
		}else {
			String produit=Clavier.entrerChaine("Quelle produit voulez vous acheter?");
			//String produitExist= trouver produit;
			if (produitExist==null) {
				System.out.println("D�sol�, personne ne vend ce produit au march�");
			}
			else {
				System.out.println(nomAcheteur+" se d�place jusqu'� l'�tal du vendeur "+vendeur);
				System.out.println("Bonjour"+nomAcheteur);
				int quantite=Clavier.entrerEntier("Combien de fleur voulez-vous acheter?");
				if (quantit� ok) {
					System.out.println("Panoramix ach�te " +quantite+produit+" � "+nomVendeur);
					//-5fleurs au vendeur
				}else {
					if(quantit� >0 mais quantite>nbFleur){
					System.out.println(nomAcheteur" veut acheter "+quantite+ produit+", malheureusement"+nomVendeur+" n'en a plus que 3."+nomAcheteur+" ach�te tout le stock de "+nomVendeur);
					}else {
						System.out.println(nomAcheteur"ach�te "+quantite+produit+", malheureusement il n'y en a plus !");
					}
				}
			}
		}	
	}
}
