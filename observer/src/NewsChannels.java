public class NewsChannels implements Observer {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        display();
    }

    public void display() {
        System.out.println("News channel : " + this.news);
    }
}
