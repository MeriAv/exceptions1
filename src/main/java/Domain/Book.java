package Domain;

public class Book extends Product {
    private String author;

    public Book(String name, String author) {
        super(name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean matches(String search) {
        if (super.matches(search))
            return true;
        if (getAuthor().equalsIgnoreCase(search)) {
            return true;
        } else return false;
    }
}

