
public class AprendendoSobreStringsParte3 {

	public static void main(String[] args) {

		String metaSucesso = "sucesso";

		String metaFelicidade = "felicidade";

		if (metaSucesso.compareTo(metaFelicidade) > 0) {
			System.out.println("A String " + metaSucesso + " vem depois de " + metaFelicidade);
		}

		System.out.println(metaSucesso.compareTo(metaFelicidade));

		System.out.println(metaFelicidade.compareTo(metaSucesso));
	}

}
