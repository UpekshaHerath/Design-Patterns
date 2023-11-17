public interface Observer {
    /**
     * Observers are new channels. Because they are looking for the notifications.
     */
    void update(String message);
}
