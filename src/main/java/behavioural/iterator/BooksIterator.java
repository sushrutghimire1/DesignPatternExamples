package behavioural.iterator;

public class BooksIterator implements Iterator{

    private final String[] books;

    public BooksIterator(String[] books) {
        this.books = books;
    }

    private int index;

    @Override
    public boolean hasNext() {
        return index < books.length;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return books[index++];
        }
        return null;
    }
}
