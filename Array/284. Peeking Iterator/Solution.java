// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Integer next=null; 
    Iterator<Integer> iter;
	public PeekingIterator(Iterator<Integer> iterator) {
	    iter=iterator;
        if(iter.hasNext()) next=iter.next();
        else next=null;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer temp = next;
        if(iter.hasNext()) next=iter.next();
        else next=null;
        return temp;
	}
	
	@Override
	public boolean hasNext() {
	    return next!=null;
	}
}