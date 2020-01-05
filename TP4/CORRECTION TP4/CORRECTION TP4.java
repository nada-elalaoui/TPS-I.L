public class Methodes {
	
	
	public static int somme(int nombre1, int nombre2){
		   return (nombre1 + nombre2) ;
		}
	
	public static int produit(int nmb1, int nmb2)
	{
		return nmb1*nmb2;
	}
	
	public static int fact(int n)
	{
		for(int i=n-1;i>=1;i--)
		{
		  	n=n*i;
		}
		
		return n;
	}
	
	

	public static void main(String[] args) {
		System.out.println(somme(2,2));
		System.out.println(produit(5,5));
		System.out.println(fact(5));
	}

}



-------------javadoc-----------
ouvrir eclipse
window
preferences
java
installed JREs
selectioner le jre
apply