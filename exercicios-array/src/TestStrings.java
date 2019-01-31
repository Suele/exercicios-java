
public class TestStrings {
	public static void main(String[] args) {

		String frase = "Nunca desista de seus sonhos.";

		System.out.println("Caixa alta: " + frase.toUpperCase());

		System.out.println("Caixa baixa: " + frase.toLowerCase());

		System.out.println("Tamanho: " + frase.length());
		
		System.out.println(frase.charAt(0));
		System.out.println(frase);
		
		System.out.println(frase.contains("w"));
		
		System.out.println(String.valueOf("desista"));
		
		String frase2 = "   Nunca desista de seus sonhos.       ";
		System.out.println(frase2);
		System.out.println(frase2.trim());
		
		System.out.println(" ");
		String espacos = " E S P A Ç O S";
		System.out.println(espacos);
		System.out.println(espacos.replaceAll(" ", ""));
		System.out.println(espacos.replaceAll(" ", "").toLowerCase());
		
		
	}
}
