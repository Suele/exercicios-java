
public class ExercicioSete {
	public static void main(String[] args) {

		int[] v = { 12, 34, 56, 11, 33, 68, 2, 90, 23, 12, 21, 71, 38, 34, 19, 19 };

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (v[i] == v[j] && i != j) {
					System.out.println(v[i]);
				}
			}

		}
	}
}
