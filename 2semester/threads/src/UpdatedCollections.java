import java.util.AbstractCollection;
import java.util.Iterator;

public class UpdatedCollections<E> extends AbstractCollection<E>{
    public volatile int size ;
    private volatile E[] elementData = (E[]) new Object[10];




    private void ensureCapacity( int minCapacity  ){
        int newCapacity = (minCapacity*3)/2 + 1;
        elementData = (E[])new Object[newCapacity];
        Object[] oldData = elementData ;
        System.arraycopy(oldData, 0, elementData, 0, size);
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }
    public class MCIterator<E> implements Iterator<E>{
        private int currentElement = 0;

        @Override
        public synchronized boolean hasNext() {
            if (currentElement < size ){
                return true;
            }
            else{
                return false ;
            }
        }

        @Override
        public synchronized E next() {
            E value = (E) elementData[currentElement];
            currentElement ++;
            return value;
        }


    }

    @Override
    public synchronized int size() {
        return size ;
    }

    @Override
    public synchronized boolean add(E element) {

        ensureCapacity(size + 1);
        elementData[size++] = element;
        return true ;
    }

    @Override
    public synchronized boolean remove( Object e ){
        for ( int i = 0 ; i < size ; i++){
            if( elementData[i].equals(e)){
                elementData[i] = null ;
                for ( int j = i ; j < size ; j ++  ){
                    elementData[j] = elementData[i+1];
                }
            }
        }
        return false ;
    }
    @Override
    public synchronized void clear() {
        for (int i = 0; i < size; i++)
            elementData[i] = null;

        size = 0;
    }
}
