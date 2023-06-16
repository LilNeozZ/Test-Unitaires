package com.example;

public class Book {
    private String title;
    private String author;
    private String publicationDate;

    /** Constructeur de la classe Book
     * @param title
     * @param author
     * @param publicationDate
     */
    public Book(String title, String author, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    /** Méthode pour obtenir le titre du livre
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /** Méthode pour obtenir l'auteur du livre
     *
     * @return
     */
    public String getAuthor() {
        return author;
    }

    /** Méthode pour obtenir la date de publication du livre
     *
     * @return
     */
    public String getPublicationDate() {
        return publicationDate;
    }

}
