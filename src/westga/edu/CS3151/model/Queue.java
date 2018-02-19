package westga.edu.CS3151.model;

public interface Queue<T> {
	
	void add(T element);
	
	T remove();
	
	T element();
	
	boolean isEmpty();
	
	int size();

}
