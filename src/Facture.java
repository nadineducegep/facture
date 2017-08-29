
public class Facture 
{	
	public enum FACTURE{SOUS_TOTAL, TPS, TVQ, TOTAL};

	public static void main(String[] args) 
	{
		float[] listeAchatsMardi = lireAchats();
		float[] factureMardi = preparerFacture(listeAchatsMardi);		
		afficherFacture(listeAchatsMardi, factureMardi);
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
	
	public static void afficherFacture(float[] listeAchats, float[] facture)
	{
		for(int numeroAchat = 0; numeroAchat < listeAchats.length; numeroAchat++)
		{
			float achat = listeAchats[numeroAchat];
			System.out.println(achat);
		}
		System.out.println("--------------------");		
		System.out.println("Sous-total:" + facture[FACTURE.SOUS_TOTAL.ordinal()] + "$");
		System.out.println("TPS:" + facture[FACTURE.TPS.ordinal()] + "$");
		System.out.println("TVQ:" + facture[FACTURE.TVQ.ordinal()] + "$");
		System.out.println("--------------------");		
		System.out.println("Total:" + facture[FACTURE.TOTAL.ordinal()] + "$");	
	}
	
	public static float[] preparerFacture(float[] listePrix)
	{
		float sousTotal = calculerSousTotal(listePrix);
		float tps = calculerTaxeFederale(sousTotal);
		float tvq = calculerTaxeProvinciale(sousTotal);
		float total = sousTotal + tps + tvq;
		
		float[] facture = new float[4];
		facture[FACTURE.SOUS_TOTAL.ordinal()] = sousTotal;
		facture[FACTURE.TPS.ordinal()] = tps;
		facture[FACTURE.TVQ.ordinal()] = tvq;
		facture[FACTURE.TOTAL.ordinal()] = total;
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
