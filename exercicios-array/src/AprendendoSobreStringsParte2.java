
public class AprendendoSobreStringsParte2 {

	public static void main(String[] args) {

		String fraseMotivacional = " Aquele que é mestre na arte de viver faz pouca\r\n"
				+ "distinção entre seu trabalho e seu tempo livre,\r\n"
				+ "entre sua mente e seu corpo, entre a sua educação\r\n"
				+ "e sua recreação, entre o seu amor e sua religião.";

		char[] frase = new char[fraseMotivacional.length()];

		fraseMotivacional.getChars(0, 36, frase, 0);

		System.out.println(frase);

		fraseMotivacional = fraseMotivacional.replace("viver", "amar loucamente");

		System.out.println(fraseMotivacional);
		
		System.out.println(fraseMotivacional.charAt(14));

	}
}
