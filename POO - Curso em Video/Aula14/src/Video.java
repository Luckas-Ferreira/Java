package Aula14.src;

public class Video implements ActionVideo{
    private String  title;
    private float   avaluation;
    private int     views;
    private int     likes;
    private boolean playing;

    public Video(String title){
        this.title = title;
        avaluation = 1;
        views      = 0;
        likes      = 0;
        playing    = false;
    }
    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void like() {
        // TODO Auto-generated method stub
        
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public float getAvaluation() {
        return avaluation;
    }
    public void setAvaluation(float avaluation) {
        this.avaluation = avaluation;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public boolean isPlaying() {
        return playing;
    }
    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
    
}
