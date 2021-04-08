package structural.decorator;

public class BlueBookCoverDecorator extends BookDecorator {
    public BlueBookCoverDecorator(Book book) {
        super(book);
    }

    @Override
    public void read() {
        book.read();
        System.out.println("Added blue cover");
    }
}
