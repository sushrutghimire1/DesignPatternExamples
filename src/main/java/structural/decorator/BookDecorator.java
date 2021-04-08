package structural.decorator;

public abstract class BookDecorator implements Book {
    protected Book book;

    public BookDecorator(Book book) {
        this.book = book;
    }

    public void read() {
        book.read();
    }
}
