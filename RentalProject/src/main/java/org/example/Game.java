package org.example;


class Game extends Item {
    private String platform;
    private String publisher;

    public Game(int id, String title, String genre, int releaseDate, String platform, String publisher) {
        super(id, title, genre, releaseDate);
        this.platform = platform;
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public void rent() {
        // برای قرض گرفتن یک بازی
    }

    public void returnItem() {
        // برای پس دادن یک بازی
    }
}