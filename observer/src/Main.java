public class Main {
    public static void main(String[] args) {
        /**
         * We have a news agency and few news channels. If agency gets a new news then the agencies also
         * have to notify about that new news.
         */
        NewsAgency SLnewsAgency = new NewsAgency();

        NewsChannels newsChannel1 = new NewsChannels();
        NewsChannels newsChannel2 = new NewsChannels();

        SLnewsAgency.addObserver(newsChannel1);
        SLnewsAgency.addObserver(newsChannel2);

        SLnewsAgency.setNews("New president has arrived to Colombo.");

        SLnewsAgency.removeObserver(newsChannel2);

        SLnewsAgency.setNews("new one");
    }
}
