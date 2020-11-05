
public class LocalizarCaracter {
	public static void main (String[]args) {
		String letras = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.printf("Ultimo 'c' esta localizado no index %d\n",letras.indexOf('c'));
		System.out.printf("Ultimo 'a' esta localizado no index %d\n",letras.indexOf('a',1));
		
		System.out.printf("'$' esta localizado no index %d\n\n",letras.indexOf('$'));
		
		System.out.printf("Ultimo 'c' esta localizado no index %d\n",letras.indexOf('c'));
		System.out.printf("Ultimo 'a' esta localizado no index %d\n",letras.indexOf('a',5));
		System.out.printf("Ultimo '$' esta localizado no index %d\n",letras.indexOf('$'));
		
		System.out.printf("\"def\" esta localizado no index %d\n",letras.indexOf("def"));

		System.out.printf("\"def\" esta localizado no index %d\n",letras.indexOf("def",7));
		System.out.printf("\"hello\" esta localizado no index %d\n",letras.indexOf("hello"));



		
	}

}
