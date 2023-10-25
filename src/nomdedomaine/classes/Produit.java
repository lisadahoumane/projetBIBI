package src.nomdedomaine.classes;

public class Produit {
    private String nom;
    private String description;
    private double prix;
    private int quantite;
    private Categorie categorie;
    private String[] couleursDisponibles;

    // Constructeur
    public Produit(String nom, String description, double prix, int quantite, Categorie categorie, String[] couleursDisponibles) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
        this.couleursDisponibles = couleursDisponibles;
    }

    // Getter pour le nom du produit
    public String getNom() {
        return nom;
    }

    // Getter pour la description du produit
    public String getDescription() {
        return description;
    }

    // Getter pour le prix du produit
    public double getPrix() {
        return prix;
    }

    // Getter pour la quantité du produit
    public int getQuantite() {
        return quantite;
    }

    // Getter pour la categorie du produit (habit, bijou, poterie)
    public Categorie getCategorie() {
        return categorie;
    }

    // Getter pour les couleurs disponibles du produit
    public String[] getCouleursDisponibles() {
        return couleursDisponibles;
    }


}
