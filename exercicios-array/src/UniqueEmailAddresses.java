import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueEmailAddresses {

	public static void main(String[] args) throws Exception {

		String regex = "^[_A-Za-z0-9-+\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Scanner input = new Scanner(System.in);

		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };

		for (int i = 0; i < emails.length; i++) {
			Pattern p = Pattern.compile(regex);
			Matcher matcher = p.matcher(emails[i]);

			if (matcher.matches()) {
				System.out.println("Tudo certo");
			} else {
				System.out.println("O formato invalido de email, exemplo: seuNome@dominio.com");
			}
		}
	}

}
