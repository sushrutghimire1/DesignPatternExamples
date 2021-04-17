package behavioural.iterator;

public class Main {
    public static void main(String[] args) {

            Books book = new Books();

            for(Iterator iter = book.getIterator(); iter.hasNext();){
                String bookName = (String)iter.next();
                System.out.println("Book : " + bookName);
            }
    }
}
