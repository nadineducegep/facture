public class Magasin 
{
	public static void main(String[] args) 
	{
		Facture factureDuLundi = new Facture(); // on crée pour vrai les variabl
		float tpsLundi = factureDuLundi.tps; // Objet En lecture
		factureDuLundi.tps = 5f; // Objet En ecriture
		
		Facture factureDuMardi = new Facture(); // idem
		factureDuMardi.lireAchats();
		factureDuMardi.preparer();		
		factureDuMardi.afficher();
	}

	
}
