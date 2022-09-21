public class Livro implements Publicacao {
    private String  title;
    private String  author;
    private int     totalPages;
    private boolean open;
    private Pessoa  reader;

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
