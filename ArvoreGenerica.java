public interface ArvoreGenerica{
	
	/** Remove todos os elementos da árvore*/
	public void makeEmpty();
	
	/** Retorna "true" se a arvore estiver vazia e "false" se não estiver*/
	public boolean isEmpty();
	
	/** Insere o elemento "valor" na arvore*/
	public void insert(int valor);
	
	/** Remove da árvore o elemento "valor"*/
	public void remove(int valor);
	
	/** Retorna o menor valor da árvore*/
	public int findMin();
	
	/** Retorna o maior valor da árvore*/
	public int findMax();
	
	/** Imprime os elementos da árvore*/
	public void printTree();
}