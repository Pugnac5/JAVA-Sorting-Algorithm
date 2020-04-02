public class ArvoreBinariaBusca implements ArvoreGenerica {
	// ATRIBUTOS **********************************************************************
	Node raiz; // apontador para o n� raiz
	int size; // quantidade total de n�s na �rvore
	
	//  CONSTRUTORES **********************************************************************
	public ArvoreBinariaBusca() {
		raiz = null; // quando a �rvore � constru�da n�o existe raiz
		size = 0; // quando a �rvore � constru�da ela se encontra vazia
	}
	
	// M�TODOS DA INTERFACE **********************************************************************
	@Override
	public void makeEmpty() {
		// ao apontar a raiz para nulo, o "Garbage Collector" do java
		// limpa todo os n�s �rf�os (sem refer�ncia).
		raiz = null; 
		size = 0;
	}
	@Override
	public boolean isEmpty() {
		return (raiz==null)?true:false;
	}
	@Override
	public void insert(int valor) {
		raiz = insert(valor, raiz); // realiza inser��o remontando os a arvore de maneira recursiva
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
			System.out.println("�rvore vazia");
		}else {
			// para imprimir os elementos em ordem crescente, basta
			// percorrer a �rvore usando o atravessamento "em ordem", onde
			// a "visita" ser� a impress�o da informa��o contida em cada n�.
			printTree(raiz);
		}
	}
	
	// M�TODOS PRIVADOS **********************************************************************
	private void printTree(Node node) {
		if(node==null) // caso base
			return;
		// passo recursivo
		printTree(node.esq); // navega pela sub�rvore da esqueda
		System.out.print(node.info+" - "); // visita o n�
		printTree(node.dir); // navega pela sub�rvore da direita
	}
	
	private Node insert(int valor, Node node) {
		if(node==null) { // caso base. achou a exata posi��o de inser��o
			node = new Node(valor); // cria um novo n� e o retorna para que ele seja montado na arvore
			size++; // incrementa o tamanho da �rvore
		// passo recursivo
		} else if(valor > node.info) { // navega��o � direita
			node.dir = insert(valor,node.dir);
		} else if(valor < node.info) {  // navega��o � direita
			node.esq = insert(valor,node.esq);
		} else { // valores iguais
			// n�o faz nada para evitar que sejam inseridos n�meros iguais
		}
		return node;
	}
	
	// CLASSE INTERNA (NO DA �RVORE) ******************************************************
	 private class Node{
		int info; // informa��o que a �rvore armazena
		Node dir; // filho esquerdo
		Node esq; // filho direito
		public Node(int info) { // construtor do n�
			this.info = info; // atribui a informa��o ao n�
			dir = esq = null; // a princ�pio o n� n�o est� encadeado na �rvore
		}
	}
}