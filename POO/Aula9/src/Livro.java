public class Livro implements Publicacao {
    private String  title;
    private String  author;
    private int     totalPages;
    private int     currentPage;
    private boolean open;
    private Pessoa  reader;

    public Livro (String title, String author, int totalPages, int currentPage, boolean open, Pessoa reader){
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.open = open;
        this.reader = reader;
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
    
    public void details(){
        
    }
}
