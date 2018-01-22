package magasin;
import magasin.modele.Facture;

public class Magasin 
{
	public static void main(String[] args) 
	{
		Facture factureDuLundi = new Facture(); // on crée pour vrai les variabl
		//float tpsLundi = factureDuLundi.tps; // Objet En lecture
		//factureDuLundi.tps = 5f; // Objet En ecriture
		
		Facture factureDuMardi = new Facture(); 
		factureDuMardi.preparer();		
		factureDuMardi.journaliser();
	}

	
}
