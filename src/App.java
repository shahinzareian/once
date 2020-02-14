public class App {
    public static void main(String[] args) {
        Author author=new Author("koen Griffion","koen.griffion@capgemini.com",26,"m");
        Author author1=new Author("Alice Munro","alicamunro.gmail.com",88,"f");
        Book book=new Book("Selected Stories",16.99,15000000,author1,1996);
        Book book1=new Book("The moons of jupiter",14.99,1000000,author1,1988);
        Book book2=new Book("Thoughts on Java",1.99,1,author,2020);
        Book book3=new Book("Thoughts on Dotnet",4.99,2,author,2020);
        System.out.println(author.toString());
        System.out.println(author1.toString());
        System.out.println(book.toString());
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());




    }


}
