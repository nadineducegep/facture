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
		factureDuMardi.listeAchats = lireAchats();
		factureDuMardi = factureDuMardi.preparerFacture();		
		factureDuMardi.afficherFacture();
	}
	
	public static float[] lireAchats()
	{
		float [] listeAchats = new float[5];
		listeAchats[0] = 2.7f;
		listeAchats[1] = 6f;
		listeAchats[2] = 8.2f;
		listeAchats[3] = 4.25f;
		listeAchats[4] = 1.0f;		
		return listeAchats;
	}
	
	
}
