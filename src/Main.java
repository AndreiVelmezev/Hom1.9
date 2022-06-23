public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Lev","Tolstoy");
        System.out.println(author1);
        System.out.println(author1.hashCode());
        //Book book1=new Book("Voyna i mir", author1,1865);
        //System.out.println("Name book "+ book1.getBookName()+ " Name autor "+book1.getAuthor().getName()
                //+ " "+ book1.getAuthor().getSurname()+" god publikacii "+ book1.getPublishingYear());

        System.out.println("----------");
        Author author2 =new Author("Lev","Tolstoy");
        System.out.println(author2);
        System.out.println(author2.hashCode());
        System.out.println(author1.equals(author2));

        Book book1 = new Book("Book", author1,2022);
        System.out.println("----------");
        System.out.println(book1);
        System.out.println(book1.hashCode());

        Book book2 = new Book("Book", author2,2022);
        System.out.println("----------");
        System.out.println(book2);
        System.out.println(book2.hashCode());
        System.out.println(book1.equals(book2));
        //book1.setPublishingYear(1869);

       // System.out.println("Name book "+ book1.getBookName()+ " Name autor "+book1.getAuthor().getName()
              //  + " "+ book1.getAuthor().getSurname()+" god publikacii "+ book1.getPublishingYear());

    }
}