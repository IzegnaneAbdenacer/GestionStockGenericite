package gn;

public class Produit {
    private int id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nombreEnStock;

    public Produit(int id, String marque, String nom, double prix, String description, int nombreEnStock) {
        this.id = id;
        this.marque = marque;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.nombreEnStock = nombreEnStock;
    }

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNombreEnStock() {
        return nombreEnStock;
    }

    public void setNombreEnStock(int nombreEnStock) {
        this.nombreEnStock = nombreEnStock;
    }
    public String toString() {
        return id + " " + " " + nom + " " + marque + " " + prix + " " + description + " " + nombreEnStock;
    }
}
