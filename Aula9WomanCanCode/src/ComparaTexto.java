
public class ComparaTexto {
	public static void main (String[]args) {
		String texto = "A API de Strings � uma das mais utilizadas na lingagem Java ";
		String linguagem = texto.substring(texto.indexOf("Java"),texto.length());
		
		if(linguagem.compareToIgnoreCase("java") ==0) {
			System.out.println("compareToInoreCase;Encontre a linguagem! Ela �" + linguagem);
		}
		if(linguagem.compareTo("java")==0) {
			System.out.println("compareTo: Encontre a lingagem! Ela �" + linguagem);
		}
	}

}
