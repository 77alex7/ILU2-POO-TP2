package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("Le village des irréductibles",10,5);
		abraracourcix=new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testControlEmmenager() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		assertNotNull(controlEmmenager,"Constructeur ne renvoie pas null");
	}

	@Test
	void testIsHabitant() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonemine", 10);
		System.out.println();
		assertTrue(controlEmmenager.isHabitant("Abraracourcix"));
		assertTrue(controlEmmenager.isHabitant("Bonemine"));
		assertFalse(controlEmmenager.isHabitant("Existe pas"));
		controlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
		assertTrue(controlEmmenager.isHabitant("Panoramix"));
	}

	@Test
	void testAjouterDruide() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
	}

	@Test
	void testAjouterGaulois() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonemine1", 10);
		controlEmmenager.ajouterGaulois("Bonemine2", 10);
		controlEmmenager.ajouterGaulois("Bonemine3", 10);
		controlEmmenager.ajouterGaulois("Bonemine4", 10);
		controlEmmenager.ajouterGaulois("Bonemine5", 10);
		controlEmmenager.ajouterGaulois("Bonemine6", 10);
		controlEmmenager.ajouterGaulois("Bonemine7", 10);
		controlEmmenager.ajouterGaulois("Bonemine8", 10);
		controlEmmenager.ajouterGaulois("Bonemine9", 10);
		controlEmmenager.ajouterGaulois("Bonemine10", 10);
		controlEmmenager.ajouterGaulois("Bonemine11", 10);
		assertTrue(controlEmmenager.isHabitant("Bonemine10"));
		assertFalse(controlEmmenager.isHabitant("Bonemine11"));
	}
	
}
