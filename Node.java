/* 
 * Classe que representa um nó e serve apenas de
 * uso para a Lista.
 * 
 * O valor em si está na variável value.
 * 
 * O tipo (Type) do Node é definido pela Lista, sendo o mesmo
 * tipo dela. Se a Lista for de String, o Node trabalhará com String.
 */

public class Node <Type>{
	private Type value;
	private Node<Type> next;
	
	public Node(Type value, Node<Type> next) {
		this.value = value;
		this.next = next;
	}
	
	public Node(Type value) {
		this.value = value;
	}
	
	public Type getValue() {
		return value;
	}

	public void setValue(Type value) {
		this.value = value;
	}

	public Node<Type> getNext() {
		return next;
	}

	public void setNext(Node<Type> next) {
		this.next = next;
	}

	public String toString() {
		return this.value.toString();
	}
}
