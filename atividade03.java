package vetor0506;

import java.util.ArrayList;

public class atividade03 {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList<> ();

		frutas.add("maça verde");
		frutas.add("maça");
		frutas.add("tomate");
		frutas.add("jaca");
		frutas.add("morango");
		frutas.add("pitaya");
		frutas.add("banana");
		frutas.add("manga");
		frutas.add("kiwi");
		frutas.add("maracuja");

		System.out.println(frutas);
		frutas.remove(0);
		frutas.remove(1);
		frutas.remove(2);
		frutas.remove(3);
		frutas.remove(4);

		System.out.println(frutas);
		System.out.println(frutas.size());
	}

}
