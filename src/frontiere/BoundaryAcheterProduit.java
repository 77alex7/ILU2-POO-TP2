package frontiere;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		if ((controlAcheterProduit.verifieAcheteur(nomAcheteur)) == null) {
			System.out.println("Je suis d�sol�e" + nomAcheteur
					+ "mais il faut �tre un habitant de notre village pour commercer ici.");
		} else {
			String produit = Clavier.entrerChaine("Quelle produit voulez vous acheter?");
			Gaulois[] vendeurProduit = controlAcheterProduit.verifieProduit(produit);
			if (vendeurProduit == null) {
				System.out.println("D�sol�, personne ne vend ce produit au march�");
			} else {
				System.out.println("Chez quelle commerçant voulez-vous acheter des fleurs ?");
				for (int i = 0; i < vendeurProduit.length; i++) {
					System.out.println("-" + vendeurProduit[i]);
				}
				int indiceVendeur = Clavier.entrerEntier("");
				Gaulois vendeur = vendeurProduit[indiceVendeur];
	
				System.out.println(nomAcheteur + " se d�place jusqu'� l'�tal du vendeur " + vendeur);
				System.out.println("Bonjour" + nomAcheteur);
				int quantiteAAcheter = Clavier.entrerEntier("Combien de fleur voulez-vous acheter?");
				int quantiteAVendre = controlAcheterProduit.donneeQuantite(vendeur);
				if (quantiteAVendre >= quantiteAAcheter) {
					int quantiteVendu=controlAcheterProduit.acheterProduit(vendeur.toString(), quantiteAAcheter);
					System.out.println("Panoramix ach�te " + quantiteVendu + produit + " � " + vendeur);
				} else {
					if (quantiteAVendre > 0 && quantiteAAcheter > quantiteAVendre) {
						int quantiteVendu=controlAcheterProduit.acheterProduit(vendeur.toString(), quantiteAAcheter);
						System.out.println(nomAcheteur + " veut acheter " + quantiteVendu + produit + ", malheureusement"
								+ vendeur + " n'en a plus que " + quantiteAVendre + "." + nomAcheteur
								+ " ach�te tout le stock de " + vendeur);
					} else {
						int quantiteVendu=controlAcheterProduit.acheterProduit(vendeur.toString(), quantiteAAcheter);
						System.out.println(
								nomAcheteur + " ach�te " + quantiteVendu + produit + ", malheureusement il n'y en a plus !");
					}
				}
			}
		}
	}
}
