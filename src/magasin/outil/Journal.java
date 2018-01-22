package magasin.outil;

public class Journal {
	
	private static boolean actif = true;
	
	public static void memoriser(String message)
	{
		if(Journal.actif) System.out.println(message);	
	}

}
