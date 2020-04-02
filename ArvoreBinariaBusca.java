public class ArvoreBinariaBusca implements ArvoreGenerica {
	// ATRIBUTOS **********************************************************************
	Node raiz; // apontador para o nó raiz
	int size; // quantidade total de nós na árvore
	
	//  CONSTRUTORES **********************************************************************
	public ArvoreBinariaBusca() {
		raiz = null; // quando a árvore é construída não existe raiz
		size = 0; // quando a árvore é construída ela se encontra vazia
	}
	
	// MÉTODOS DA INTERFACE **********************************************************************
	@Override
	public void makeEmpty() {
		// ao apontar a raiz para nulo, o "Garbage Collector" do java
		// limpa todo os nós órfãos (sem referência).
		raiz = null; 
		size = 0;
	}
	@Override
	public boolean isEmpty() {
		return (raiz==null)?true:false;
	}
	@Override
	public void insert(int valor) {
		raiz = insert(valor, raiz); // realiza inserção remontando os a arvore de maneira recursiva
	}
	@Override
	public void remove(int valor) {
		
	}
	@Override
	public int findMin() {
		return 0;
	}
	@Override
	public int findMax() {
		return 0;
	}
	@Override
	public void printTree() {
		if(isEmpty()) {
			System.out.println("Árvore vazia");
		}else {
			// para imprimir os elementos em ordem crescente, basta
			// percorrer a árvore usando o atravessamento "em ordem", onde
			// a "visita" será a impressão da informação contida em cada nó.
			printTree(raiz);
		}
	}
	
	// MÉTODOS PRIVADOS **********************************************************************
	private void printTree(Node node) {
		if(node==null) // caso base
			return;
		// passo recursivo
		printTree(node.esq); // navega pela subárvore da esqueda
		System.out.print(node.info+" - "); // visita o nó
		printTree(node.dir); // navega pela subárvore da direita
	}
	
	private Node insert(int valor, Node node) {
		if(node==null) { // caso base. achou a exata posição de inserção
			node = new Node(valor); // cria um novo nó e o retorna para que ele seja montado na arvore
			size++; // incrementa o tamanho da árvore
		// passo recursivo
		} else if(valor > node.info) { // navegação à direita
			node.dir = insert(valor,node.dir);
		} else if(valor < node.info) {  // navegação à direita
			node.esq = insert(valor,node.esq);
		} else { // valores iguais
			// não faz nada para evitar que sejam inseridos números iguais
		}
		return node;
	}
	
	// CLASSE INTERNA (NO DA ÁRVORE) ******************************************************
	 private class Node{
		int info; // informação que a árvore armazena
		Node dir; // filho esquerdo
		Node esq; // filho direito
		public Node(int info) { // construtor do nó
			this.info = info; // atribui a informação ao nó
			dir = esq = null; // a princípio o nó não está encadeado na árvore
		}
	}
}