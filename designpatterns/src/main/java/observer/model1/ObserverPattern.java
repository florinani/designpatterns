package observer.model1;

public class ObserverPattern {

    public static void main(String[] args) {

        NewsAgency bbc = new NewsAgency();

        Channel cnn = new Channel("CNN", bbc);
        Channel fox = new Channel("FOX", bbc);
        Channel cnbc = new Channel("CNBC", bbc);
        Channel nytimes = new Channel("NYTIMES", bbc);

        bbc.attach(cnn);
        bbc.attach(fox);
        bbc.attach(cnbc);
        bbc.attach(nytimes);

        bbc.postArticle("Trump will be impeached!");



    }

}
