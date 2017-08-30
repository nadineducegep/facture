public class Facture 
{
	float [] listeAchats = new float[5];
	float sousTotal;
	float tps;
	float tvq;
	float total;

	public void afficher()
	{
		for(int numeroAchat = 0; numeroAchat < this.listeAchats.length; numeroAchat++)
		{
			float achat = this.listeAchats[numeroAchat];
			System.out.println(achat);
		}
		System.out.println("--------------------");		
		System.out.println("Sous-total:" + this.sousTotal + "$");
		System.out.println("TPS:" + this.tps + "$");
		System.out.println("TVQ:" + this.tvq + "$");
		System.out.println("--------------------");		
		System.out.println("Total:" + this.total + "$");	
	}
	
	public Facture preparer()
	{
		this.sousTotal = calculerSousTotal(this.listeAchats);
		this.tps = calculerTaxeFederale(this.sousTotal);
		this.tvq = calculerTaxeProvinciale(this.sousTotal);
		this.total = this.sousTotal + this.tps + this.tvq;		
		return this;
	}

	
	public static float calculerTaxeFederale(float montant)
	{
		return montant * 0.05f;
	}

	public static float calculerTaxeProvinciale(float montant)
	{
		return montant * 0.09975f;
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

	public void lireAchats()
	{
		float [] listeAchats = new float[5];
		listeAchats[0] = 2.7f;
		listeAchats[1] = 6f;
		listeAchats[2] = 8.2f;
		listeAchats[3] = 4.25f;
		listeAchats[4] = 1.0f;		
		this.listeAchats = listeAchats;
	}
	
}
