
public class AprendendoSobreStringsParte2 {

	public static void main(String[] args) {

		String fraseMotivacional = " Aquele que � mestre na arte de viver faz pouca\r\n"
				+ "distin��o entre seu trabalho e seu tempo livre,\r\n"
				+ "entre sua mente e seu corpo, entre a sua educa��o\r\n"
				+ "e sua recrea��o, entre o seu amor e sua religi�o.";

		char[] frase = new char[fraseMotivacional.length()];

		fraseMotivacional.getChars(0, 36, frase, 0);

		System.out.println(frase);

		fraseMotivacional = fraseMotivacional.replace("viver", "amar loucamente");

		System.out.println(fraseMotivacional);
		
		System.out.println(fraseMotivacional.charAt(14));

	}
}
