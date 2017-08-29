
public class Facture {

	public static void main(String[] args) 
	{
		float [] listeAchats = new float[5];
		listeAchats[0] = 2.7f;
		listeAchats[1] = 6f;
		listeAchats[2] = 8.2f;
		listeAchats[3] = 4.25f;
		listeAchats[4] = 1.0f;
		
		// soustotal =  somme(listeAchat)
		// taxeFederale = sousTotal * 5%
		// taxeProvinciale = (sousTotal + taxeFederale) * 9.5% = sousTotal * 9.975%
		// total = soustotal + taxeFederale + taxeProvinciale;
		
		//System.out.println(calculerSommePrix(listeAchats));
		//System.out.println("La taxe tps de 2 est " + calculerTaxeFederale(2));
		//System.out.println("La taxe tvq de 1 est " + calculerTaxeProvinciale(2));
		float sousTotal = calculerSousTotal(listeAchats);
		float tps = calculerTaxeFederale(sousTotal);
		float tvq = calculerTaxeProvinciale(sousTotal);
		float total = sousTotal + tps + tvq;
		System.out.println("Le sous total est " + sousTotal + "$");
		System.out.println("Le grand total est " + total + "$");
		
		//facture = preparerFacture(listeAchats);
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
