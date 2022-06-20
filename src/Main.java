public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Lev","Tolstoy");
        Book book1=new Book("Voyna i mir", author1,1865);
        System.out.println("Name book "+ book1.getBookName()+ " Name autor "+book1.getAuthor().getName()
                + " "+ book1.getAuthor().getSurname()+" god publikacii "+ book1.getPublishingYear());

        book1.setPublishingYear(1869);

        System.out.println("Name book "+ book1.getBookName()+ " Name autor "+book1.getAuthor().getName()
                + " "+ book1.getAuthor().getSurname()+" god publikacii "+ book1.getPublishingYear());

    }
}