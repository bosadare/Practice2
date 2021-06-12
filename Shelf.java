public class Shelf {
    int height;
    int noOfLayers;

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNoOfLayers() {
        return noOfLayers;
    }

    public void setNoOfLayers(int noOfLayers) {
        this.noOfLayers = noOfLayers;
    }

    public Book getBook(String color, int noOfPages,String category,String author) {

        Book bk = new Book();
        bk.setColor(color);
        bk.setNoOfPages(noOfPages);
        bk.setCategory(category);
        bk.setAuthor(author);

        return bk;


    }

}
