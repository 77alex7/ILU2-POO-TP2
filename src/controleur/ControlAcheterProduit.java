package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public String verifieAcheteur(String nomAcheteur) {
		Gaulois acheteur=(village.trouverHabitant(nomAcheteur));
		return acheteur.toString();
	}
	public Gaulois[] verifieProduit(String produit) {
		Gaulois[] vendeurProduit=village.rechercherVendeursProduit(produit);
		return vendeurProduit;
	}
	public int donneeQuantite(Gaulois vendeur) {
		Etal etal=village.rechercherEtal(vendeur);
		int quantite=etal.getQuantite();
		return quantite;
	}
	public int acheterProduit(String vendeur, int quantiteAAcheter) {
		Gaulois sVendeur=village.trouverHabitant(vendeur);
		Etal etal=village.rechercherEtal(sVendeur);
		int quantiteAcheter=etal.acheterProduit(quantiteAAcheter);
		return quantiteAcheter;
		//dans etal.acheterProduit on a pas le cas ou la quantité a acheter = quantité présente et on a pas la cas ou la quantité est supp a la quantite
	}
}
