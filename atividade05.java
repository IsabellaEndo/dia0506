package vetor0506;
import java.util.ArrayList;
import java.util.Scanner;
public class atividade05 {

	public static void main(String[] args) {
		ArrayList<String> acaiingredientes = new ArrayList<> ();
		Scanner ler = new Scanner(System.in);
		
		acaiingredientes.add("Acai");
		acaiingredientes.add("Banana");
		acaiingredientes.add("leite em po");
		acaiingredientes.add("leite condensado");
		acaiingredientes.add("morango");
		acaiingredientes.add("chocolate");
		acaiingredientes.add("confetti");
		
		for(String ing : acaiingredientes) {
		System.out.println(ing);
		}
		
		System.out.println("O que deseja fazer? :");
		System.out.println("[1] Adicionar ingrediente ");
		System.out.println("[2] Remover ingrediente ");
		System.out.println("[3] Manter ");
		int opcao = ler.nextInt();
		switch (opcao) {
		case 1:
		System.out.println("Qual ingrediente deseja adicionar: ");
		acaiingredientes.add(ler.next());
		System.out.println("Nova lista de ingredientes: "+acaiingredientes);
		break;
		case 2:
		System.out.println("Qual ingrediente ddeseja remover [0 - 6]");
		acaiingredientes.remove(ler.nextInt());
		System.out.println("Nova lista de ingredientes: "+acaiingredientes);
		break;
		default:
		System.out.println("Lista de ingredientes : "+acaiingredientes);
		}
		ler.close();
		
		}
		}


	


