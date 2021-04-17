package behavioural.iterator;

public class Books implements Container{
    public String[] books = {"GoF" , "Clean Code" ,"Lean Startup" , "Rich Dad Poor Dad"};

    @Override
    public Iterator getIterator() {
        return new BooksIterator(books);
    }
}
