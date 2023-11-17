public interface Subject {
    /**
     * Subject is the news agency. Because they will send the notification to news channels.
     */
    void addObserver(Observer newObserver);
    void removeObserver(Observer removingObserver);
    void notifyObservers();
}
