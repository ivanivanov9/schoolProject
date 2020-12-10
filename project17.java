package tema17;

public static void main(String[] args) {
	

/* Creates Library */
Library library = new Library();
library.name = "Saint Library";
/* Creates Authors */
Author fiodor = new Author();
fiodor.name = "Fi�dor Dostoi�vski";
Author aristoteles = new Author();
aristoteles.name = "Arist�teles";
/* Creates Books */
Book book1   = new Book();
book1.author = fiodor;
book1.ISBN   = "978-3-16-148410";
Book book2   = new Book();
book2.author = aristoteles;
book2.ISBN   = "789-3-61-123456";
/* Put the books in the library */
library.books = new Arrays.asList(book1, book2);
/* Shows Library Books */
System.out.println("Collection of: "+library.name);
for (Book book : library.books) {
    System.out.println(book.ISBN+" "+book.author.name);
}
}
}