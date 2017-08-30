public class Magasin 
{
	public static void main(String[] args) 
	{
		// Des objets instanciés selon la recette de la structure/classe
		Facture factureDuLundi = new Facture(); // on crée pour vrai les variables de la recettes (listePrix, soustotal, etc.)		
		// Facture.tps - incorrect - car la facture ne reserve pas d'espace		
		float tpsLundi = factureDuLundi.tps; // Objet En lecture
		factureDuLundi.tps = 5f; // Objet En ecriture
		
		Facture factureDuMardi = new Facture(); // idem
		factureDuMardi.lireAchats();
		factureDuMardi = factureDuMardi.preparerFacture();		
		factureDuMardi.afficherFacture();
	}

	
}
