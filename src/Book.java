public class Book {
    private String title;
    private int poblishDate;
    private Author author;

    public Book(String title, int poblishDate,Author author) {
        this.poblishDate = poblishDate;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPoblishDate() {
        return poblishDate;
    }

    public void setPoblishDate(int poblishDate) {
        this.poblishDate = poblishDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Книга " + title +
                ", дата публикации " + poblishDate + " " + author;
    }
}
