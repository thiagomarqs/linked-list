/* TAD Lista
 * 
 * Na instanciação da lista é necessário definir
 * o tipo dela.
 * Exemplo, o código abaixo cria uma lista de String:
 *		Lista<String> exemplo = new Lista<>();
 * Esse código cria uma lista de objetos Pedido:
 * 		Lista<Pedido> pedidos = new Lista<>();
 * */
public class Lista<Type> {

	private Node<Type> head, tail;
	private int size;
	
	public Lista() {
		head = tail = null;
		size = 0;
	}
	
	// Checa se a lista está vazia.
	public boolean isEmpty() {
		return size == 0;
	}

	// Adiciona no final da lista.
	public void append(Type value) {
		Node<Type> node = new Node<>(value);
		if(isEmpty()) {
			head = tail = node;
			size++;
		} else {
			tail.setNext(node);
			tail = node;
			size++;
		}
	}
	
	// Adiciona no início da lista.
	public void prepend(Type value) {
		Node<Type> node = new Node<>(value);
		if(isEmpty()){
			head = tail = node;
			size++;
		} else {
			node.setNext(head);
			head = node;
			size++;
		}
	}
	
	// Remove o head.
	public void removeFirst() {
		if(isEmpty())
			return;
		if(size == 1){
			head = tail = null;
			size--;
			return;
		}
		head = head.getNext();
		size--;
	}
	
	// Remove o head com base no valor passado.
	public void remove(Type value) {
		if(isEmpty())
			return;
		else if(head.getValue().equals(value)) {
			head = head.getNext();
			size--;
			return;
		} else {
			Node<Type> currentNode = head;
			do {
				Node<Type> next = currentNode.getNext();
				// Se o nó a ser removido é o tail
				if(next.getValue().equals(tail.getValue())) {
					tail = currentNode;
					size--;
				}
				else if(next.getValue().equals(value)) {	
					currentNode.setNext(currentNode.getNext().getNext());
					size--;
				}
				else
					currentNode = currentNode.getNext();
			}
			while(currentNode.getNext() != null);
			
		}
	}
	
	// Retorna o primeiro nó.
	public Node<Type> findFirst() {
		return head;
	}
	
	// Retorna um nó se encontrado, caso contrário retorna null.
	public Node<Type> find(Type value) {
		Node<Type> currentNode = head;
		
		do {
			if(currentNode.getValue().equals(value))
				return currentNode;
			else
				currentNode = currentNode.getNext();
		}
		while(currentNode != null);
		
		return null;
		
	}
	
	// Printa a lista.
	public void print() {
		Node<Type> node = head;
		System.out.print("[");
		while(node != null) {
			System.out.print(" ");
			System.out.print(node);
			System.out.print(" ");
			node = node.getNext();
		}
		System.out.println("]");
	}
	
	// Retorna o tamanho da lista.
	public int getSize() {
		return size;
	}

}
