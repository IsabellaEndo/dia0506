package vetor0506;
import java.util.ArrayList;
import java.util.Random;
public class atividade02 {

	public static void main(String[] args) {
		int soma = 0;
		ArrayList<Integer> numeros = new ArrayList<> ();
		Random random = new Random ();
		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt(100);
			numeros.add(numeroAleatorio);
		}
		for (int num:numeros ) {
			if (num %2 == 0) {
				soma =+ num;
				System.out.println(num);
			}
		}
		System.out.println("A soma é: " + soma);



	}
}


