
public class Facture {

	public static void main(String[] args) 
	{
		float [] listeAchats = new float[5];
		listeAchats[0] = 2.7f;
		listeAchats[1] = 6f;
		listeAchats[2] = 8.2f;
		listeAchats[3] = 4.25f;
		listeAchats[4] = 1.0f;
		
		float[] factureMardi = preparerFacture(listeAchats);		
		afficherFacture(listeAchats, factureMardi);
	}
	
	public static void afficherFacture(float[] listeAchats, float[] facture)
	{
		for(int numeroAchat = 0; numeroAchat < listeAchats.length; numeroAchat++)
		{
			float achat = listeAchats[numeroAchat];
			System.out.println(achat);
		}
		System.out.println("--------------------");		
		System.out.println("Sous-total:" + facture[0] + "$");
		System.out.println("TPS:" + facture[1] + "$");
		System.out.println("TVQ:" + facture[2] + "$");
		System.out.println("--------------------");		
		System.out.println("Total:" + facture[3] + "$");
		
	}
	
	public static float[] preparerFacture(float[] listePrix)
	{
		float sousTotal = calculerSousTotal(listePrix);
		float tps = calculerTaxeFederale(sousTotal);
		float tvq = calculerTaxeProvinciale(sousTotal);
		float total = sousTotal + tps + tvq;
		
		float[] facture = new float[4];
		facture[0] = sousTotal;
		facture[1] = tps;
		facture[2] = tvq;
		facture[3] = total;
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
