public interface ArvoreGenerica{
	
	/** Remove todos os elementos da �rvore*/
	public void makeEmpty();
	
	/** Retorna "true" se a arvore estiver vazia e "false" se n�o estiver*/
	public boolean isEmpty();
	
	/** Insere o elemento "valor" na arvore*/
	public void insert(int valor);
	
	/** Remove da �rvore o elemento "valor"*/
	public void remove(int valor);
	
	/** Retorna o menor valor da �rvore*/
	public int findMin();
	
	/** Retorna o maior valor da �rvore*/
	public int findMax();
	
	/** Imprime os elementos da �rvore*/
	public void printTree();
}