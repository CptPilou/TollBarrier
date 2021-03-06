/*package tollBarrier.vehicule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import tollBarrier.bornes.BoAutomatique;
import tollBarrier.bornes.BoManuelle;
import tollBarrier.bornes.BoTelePeage;
import tollBarrier.bornes.Borne;

public class FileDAttente {

	private ArrayList<Vehicule> file;
	
	public FileDAttente () {
		file = new ArrayList<Vehicule>();
	}
	
	public void ajouterVehicule (Vehicule v) {
		file.add(v);
	}
	
	public Vehicule recupererVehicule (Borne borne) throws PasDeVehiculeTrouveException {
		
		// Recupération des moyens de paiement acceptés par la borne demandeuse de véhicule
		Set<MoyenDePaiment> bmdp = borne.getMoyenDePaiment();

		// Récupération des modèles de véhicules acceptés par la borne demandeuse de véhicule
		Set<String> typev = new HashSet<String>();
		typev.add("Voiture");
		if(borne instanceof BoManuelle) {
			typev.add("DeuxRoues");
			typev.add("Camions");
		}
			
		
		// Pour chaque véhicule dans la file
		for (int i = 0; i < file.size(); i++) {
			
			// On récupère ses moyens de paiement possibles
			Set<MoyenDePaiment> vmdp = file.get(i).getMoyensDePaiment();
			
			
			// On vérifie si ce véhicule peut aller dans la borne demandeuse
			if(typev.contains(file.get(i).getClass().getName())){
				for (MoyenDePaiment mv: vmdp)				

					// Si le véhicule correpsond, on l'envoie à la borne
					if (bmdp.contains(mv)) {
						Vehicule v = file.get(i);
						file.remove(i);
						return v;
					}
			}
		}
		
		// Si aucun véhicule dans la file ne correspond, on renvoie une exception
		String s = "Pas de Véhicule avec moyen de paiment: " + bmdp;
		
		throw new PasDeVehiculeTrouveException(s);
	}
	
	public int getLongueurFileDAttente() {
		return file.size();
	}
}*/
