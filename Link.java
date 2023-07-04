public class Link <E>{
	// ---------------------- fields ---------------------- 
	private E data;
	private Link<E> next;
	private Link<E> prev;

	
	// ---------------------- constructors ----------------------
	public Link(E data, Link<E> next,  Link<E> prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	public Link(E data) {
		this(data, null, null);
	}

	// ---------------------- Methods ----------------------
	public Link<E> getNext() { 
		return next;
	}
	
	public Link<E> getPrev() { 
		return prev;
	}
	
	public void setNext(Link<E> next){
		this.next = next;
	}
	
	public void setPrev(Link<E> prev){
		this.prev = prev;
	}
	
	
	public E getData() {
	    return data;
	}
	
	public E setData(E data) {
	    E tmp = this.data;
	    this.data = data;
		return tmp;
	}
	
	public String toString() {
	    return data.toString();
	}

}