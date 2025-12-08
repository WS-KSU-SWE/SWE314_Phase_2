package swe314_project_phase2;

public class Node<T> {

	public T data;
	
	public Node<T> next;
	public Node<T> prevoius;
	
	
	public Node(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	
}
