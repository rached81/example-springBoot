package com.bookstore.springboot.dto;

public class BookDTO {
    private Long id;
    private String titre;
    private String auteur;
    private String description;
    private String type;

    public BookDTO() {}

    public BookDTO(Long id, String title, String author, String description, String genre) {
        this.id = id;
        this.titre = title;
        this.auteur = author;
        this.description = description;
        this.type = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String title) {
        this.titre = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String author) {
        this.auteur = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setGenre(String type) {
        this.type = type;
    }
}
