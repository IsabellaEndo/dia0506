package vetor0506;
import java.util.ArrayList;
import java.util.Random;
public class atividade01 {

	public static void main(String[] args) {
		int negativo = 0;
		ArrayList<Integer> num = new ArrayList<Integer>();

		Random random = new Random();
		for(int i = 0; i < 5; i++) {
			int numeroAle = random.nextInt();
			num.add(numeroAle);
		}
		for(Integer numero:num) {
			if (numero < 0) {
				negativo++;
				System.out.println(numero);
				System.out.println("a soma é "+ negativo);
			}
		}
	}
}