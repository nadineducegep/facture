
public class Magasin 
{
	interface ConstanteFacture
	{
		public static final int SOUS_TOTAL = 0;
		public static final int TPS = 1;
		public static final int TVQ = 2;
		public static final int TOTAL = 3;		
	}
	
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
		System.out.println("Sous-total:" + facture[ConstanteFacture.SOUS_TOTAL] + "$");
		System.out.println("TPS:" + facture[ConstanteFacture.TPS] + "$");
		System.out.println("TVQ:" + facture[ConstanteFacture.TVQ] + "$");
		System.out.println("--------------------");		
		System.out.println("Total:" + facture[ConstanteFacture.TOTAL] + "$");	
	}
	
	public static float[] preparerFacture(float[] listePrix)
	{
		float sousTotal = calculerSousTotal(listePrix);
		float tps = calculerTaxeFederale(sousTotal);
		float tvq = calculerTaxeProvinciale(sousTotal);
		float total = sousTotal + tps + tvq;
		
		float[] facture = new float[4];
		facture[ConstanteFacture.SOUS_TOTAL] = sousTotal;
		facture[ConstanteFacture.TPS] = tps;
		facture[ConstanteFacture.TVQ] = tvq;
		facture[ConstanteFacture.TOTAL] = total;
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
