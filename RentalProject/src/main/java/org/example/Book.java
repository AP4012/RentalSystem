package org.example;

class Book extends Item {
    private String author;
    private String publisher;
   public Book(int id, String title, String genre, int releaseDate, double rentalFee, String author, String publisher) {
        super(id, title, genre, releaseDate);
        this.author = author;
        this.publisher = publisher;
        this.available = true;
    }

    public String getAuthor() {
        return author;
     }

    public String getPublisher() {
        return publisher;
    }

    public void rent() {
        // برای اجاره کردن کتاب 
    }

    public void returnItem() {
        // برای برگردوندن یک کتاب
    }
}
