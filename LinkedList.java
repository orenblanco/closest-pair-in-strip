import java.util.Iterator;

public class LinkedList<T> implements List<T> {
	
	// ---------------------- fields ---------------------- 
	private Link<T> first;
	private Link<T> last;
	// ---------------------- constructors ----------------------
	public LinkedList(){		
		first = null;
		last = first;
	}

	// ---------------------- methods ----------------------

	//Returns the number of elements in this list
	public int size() {
		int counter = 0;
		for(Link<T> curr = first; curr != null; curr = curr.getNext())
			counter = counter + 1;
		return counter;
	}
	
	//Returns true if this list contains no elements.
	public boolean isEmpty() {
		return first == null;
	}
	
	//Adds element to the beginning of this list
	public void addFirst(T element) {
		if (element == null)
			throw new IllegalArgumentException("input argument is null");
		Link<T> newFirst = new Link<T>(element, first, null);
		if (last==first)
			last.setPrev(newFirst);
		first = newFirst;
			}
		
	//Returns a String representing this object
	public String toString() {
	    String output = "<";
	    Link<T> current = first;
	    while (current != null) {
	        output = output + current.toString();
	        current = current.getNext();
	        if(current != null)
	        	output = output + ", ";
	    }
	    output = output + ">";
	    return output;
	}
	
	//Remove the first Link which contains toRemove, if such one exists
	public boolean remove(Object toRemove) {
		if (toRemove == null)
			throw new IllegalArgumentException("input argument is null");
		Link<T> current = first;
		Link<T> prev = current;
		boolean removed = false;
		while (current != null & !removed) {
			if ((current.getData()).equals(toRemove)) {
				// if the first link should be removed
				if (current == first) {
					first = first.getNext();
					first.setPrev(null);
				}
				else {
					prev.setNext(current.getNext());
					current.getNext().setPrev(current.getPrev());
				}
				removed = true;
				
				if(current == last)
					last=last.getPrev();
					last.setNext(null);
			}
			else {
				prev = current;
				current = current.getNext();
			}
		}
		return removed;
	}
	
	//Returns true if this list contains the specified element
	public boolean contains(Object element){
		if (element == null)
			throw new IllegalArgumentException("input argument is null");
		boolean output = false;
		for(Link<T> curr = first; curr != null & !output; curr = curr.getNext())
			output = element.equals(curr.getData());
		return output;		
	}
	
	//Appends the specified element to the end of this list
	public void add(T element) {
		   if(element == null)
			   throw new IllegalArgumentException("input argument is null");
		   Link<T> newLink = new Link<>(element); 
		   if(isEmpty()){
			   first = newLink;
			   last = newLink;
		   }
		   else {
			 	last.setNext(newLink); 
			 	newLink.setPrev(last);
			 	last= newLink;
			   }			 
		   }
	
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>(first);
	}
	
	public Iterator<T> reverseIterator() {
		return new LinkedListReverseIterator<T>(last);
	}
}
