public class BookMain {
    public static void main(String[] args) {
        String author_name = "Malee Aroina";
        String nationality = "Thai";
        int birthyear = 2005;
        Author author = new Author(author_name, nationality);
        System.out.println(author.showAuthorInfo());
        System.out.println();

        String title = "Java Programming";
        String category = "Programing Language";
        double price = 375.25;
        Book book = new Book(title, category, price, author);
        System.out.println(book);
    }
}
