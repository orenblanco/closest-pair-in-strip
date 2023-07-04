public interface List <T> extends Iterable<T>{
    //Returns the number of elements in this list.
    public int size();

    //Appends the specified element to the end of this list
    public void add(T element);

    //Removes the first occurrence of the specified element from this list, if it is present
    public boolean remove(T element);
    
    //Returns true if this list contains the specified element.
    public boolean contains(T element);

    //Returns true if this list contains no elements.
    public boolean isEmpty();
}

