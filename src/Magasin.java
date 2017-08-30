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
		factureDuMardi = preparerFacture(factureDuMardi);		
		afficherFacture(factureDuMardi);
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
	
	public static void afficherFacture(Facture facture)
	{
		for(int numeroAchat = 0; numeroAchat < facture.listeAchats.length; numeroAchat++)
		{
			float achat = facture.listeAchats[numeroAchat];
			System.out.println(achat);
		}
		System.out.println("--------------------");		
		System.out.println("Sous-total:" + facture.sousTotal + "$");
		System.out.println("TPS:" + facture.tps + "$");
		System.out.println("TVQ:" + facture.tvq + "$");
		System.out.println("--------------------");		
		System.out.println("Total:" + facture.total + "$");	
	}
	
	public static Facture preparerFacture(Facture facture)
	{
		facture.sousTotal = calculerSousTotal(facture.listeAchats);
		facture.tps = calculerTaxeFederale(facture.sousTotal);
		facture.tvq = calculerTaxeProvinciale(facture.sousTotal);
		facture.total = facture.sousTotal + facture.tps + facture.tvq;		
		return facture;
	}
	
	public static float calculerSousTotal(float[] listePrix)
	{
		float somme = 0;
		
		for(int position = 0; position < listePrix.length; position++)
		{
			somme += listePrix[position];
		}
		
		return somme;
	}
	
	public static float calculerTaxeFederale(float montant)
	{
		return montant * 0.05f;
	}

	public static float calculerTaxeProvinciale(float montant)
	{
		return montant * 0.09975f;
	}	
}
