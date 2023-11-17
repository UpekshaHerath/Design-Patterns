import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void removeObserver(Observer removingObserver) {
        observers.remove(removingObserver);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this.news);
        }
    }
}
