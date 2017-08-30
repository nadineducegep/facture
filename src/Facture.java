public class Facture 
{
	float [] listeAchats = new float[5];
	float sousTotal;
	float tps;
	float tvq;
	float total;

	public void afficherFacture()
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

}
