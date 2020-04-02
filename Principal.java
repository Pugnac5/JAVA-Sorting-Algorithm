import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Digite a quantidade de valores que deseja colocar na árvore");
		Scanner scanner = new Scanner(System.in);
		int v = scanner.nextInt();
		
		ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
		
		for(int i = 0; i < v; i++) {
			System.out.println("Digite o "+(i+1)+"º valor: ");
			int valor = scanner.nextInt();
			arvore.insert(valor);
		}
		
		arvore.printTree();
	}
}
