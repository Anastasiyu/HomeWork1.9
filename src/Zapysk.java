public class Zapysk {
    public static void main(String[] args) {
        Author author = new Author("Антон", "Чехов");
        Book chameleon = new Book("Хамелион", 1884, author);
        chameleon.setPoblishDate(1887);
        System.out.println(chameleon);
        System.out.println(author);
        Author author2 = new Author("Александр", "Пушкин");
        Book dybrovsky = new Book("Дубровский", 1881, author2);
        System.out.println(dybrovsky);
        System.out.println(author2);
    }
}


