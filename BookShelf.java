public class BookShelf {

    public static void main(String args[]){
        Book book1 = new Book();
        book1.setColor("blue");
        book1.setNoOfPages(100);
        book1.setCategory("religion");
        book1.setAuthor("Kathryn Kuhlman");
        System.out.println(book1.getAuthor());
        Shelf s= new Shelf();
        s.setHeight(10);
        s.setNoOfLayers(5);
        System.out.println(s.getNoOfLayers());
       Book b = s.getBook("red", 12, "educative", "java");
        System.out.println(b.getAuthor());
    }


}
