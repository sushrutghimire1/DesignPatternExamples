package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Book gofBook = new GofBook();
        Book blueGofBook = new BlueBookCoverDecorator(gofBook);
        Book cleanCodeBook = new CleanCodeBook();
        Book redCleanCodeBook = new RedCoverBookDecorator(cleanCodeBook);
        blueGofBook.read();
        redCleanCodeBook.read();
    }
}
