package structural.decorator;

public class RedCoverBookDecorator extends BookDecorator {
    public RedCoverBookDecorator(Book book) {
        super(book);
    }

    @Override
    public void read() {
        book.read();
        System.out.println("Added red cover");
    }
}
