public class Zapysk {
    public static void main(String[] args) {
        Author author = new Author("Антон", "Чехов");
        Book book = new Book("Хамелион", 1884, author);
        book.setPoblishDate(1887);
        System.out.println(book);
        System.out.println(author);
        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book("Дубровский", 1881, author2);
        System.out.println(book2);
        System.out.println(author2);
        System.out.println(author.equals(author2));
        System.out.println(author.hashCode() == author2.hashCode());
        System.out.println(book.equals(book2));
        System.out.println(book.hashCode() == book2.hashCode());
    }
}


