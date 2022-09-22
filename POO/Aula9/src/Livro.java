public class Livro implements Publicacao {
    private String  title;
    private String  author;
    private int     totalPages;
    private int     currentPage;
    private boolean open;
    private Pessoa  reader;

    public String details() {
        // TODO Auto-generated method stub
        return "Livro{" + "\ntitle=" + title + ", \nauthor=" + author + ", \ntotalPages" + totalPages + ", \nCurrent Pages=" + currentPage + "\nreader" + reader.getName() + "}";
    }
    
    public Livro (String title, String author, int totalPages, int currentPage, Pessoa reader){
        this.title = title;
        this.author = author;
        this.open = false;
        this.currentPage = currentPage;
        this.totalPages = totalPages;
        this.reader = reader;
        this.currentPage = 0;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getTotalPages(){
        return this.totalPages;
    }
    public void setTotalPages(int totalPages){
        this.totalPages = totalPages;
    }
    public int getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(int currentPage){
        this.currentPage = currentPage;
    }
    public boolean getOpen(){
        return this.open;
    }
    public void setOpen(boolean open){
        this.open = open;
    }
    public Pessoa getReader(){
        return this.reader;
    }
    public void setReader(Pessoa reader){
        this.reader = reader;
    }

    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void leafThrough(int p) {
        this.currentPage = p;
    }

    @Override
    public void forwardPages() {
        this.currentPage++;
        
    }

    @Override
    public void backPages() {
        this.currentPage--;
        
    }

}
