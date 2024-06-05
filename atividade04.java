package vetor0506;

import java.util.ArrayList;
import java.util.Scanner;
public class atividade04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> carros = new ArrayList<> ();
		int i=0;
		
		carros.add("HB20");
		carros.add("RAM 1500");
		carros.add("F40");
		carros.add("HB20");
		carros.add("FUSCA");
		carros.add("KWID");
		carros.add("RANGE ROVER");
		carros.add("TORO");
		carros.add("MONTANA");
		carros.add("HRV");
		
		System.out.println(carros);
		System.out.println("qual carro deseja ver?");
		i = ler.nextInt();
		System.out.println(carros.get(i));
		


	}

}
