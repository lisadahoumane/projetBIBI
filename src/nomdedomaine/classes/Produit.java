package src.nomdedomaine.classes;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private String nom;
    private String description;
    private double prix;
    private int quantite;
    private Categorie categorie;
    private List<String> couleursDisponibles;



    // Constructeur
    public Produit(String nom, String description, double prix, int quantite, Categorie categorie, List<String> couleursDisponibles) {
        // Validation des données
        if (prix <= 0 || quantite <= 0) {
            throw new IllegalArgumentException("Le prix et la quantité doivent être des valeurs positives.");
        }

        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
        this.couleursDisponibles = new ArrayList<>(couleursDisponibles);
    }
// Méthode pour ajouter une couleur disponible
    public void ajouterCouleur(String couleur) {
        if (!couleursDisponibles.contains(couleur)) {
            couleursDisponibles.add(couleur);
        } else {
            System.out.println("Cette couleur est déjà disponible pour ce produit.");
        }
    }
    

    // Méthode pour retirer une couleur disponible
    public void retirerCouleur(String couleur) {
        if (couleursDisponibles.contains(couleur)) {
            couleursDisponibles.remove(couleur);
        } else {
            System.out.println("Cette couleur n'est pas disponible pour ce produit.");
        }
    }
    

    // Méthode pour vérifier la disponibilité du produit
    public boolean estDisponible() {
        return quantite > 0;
    }
 

    // Méthode pour afficher les détails d un produit 
    public void afficherDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Description: " + description);
        System.out.println("Prix: " + prix);
        System.out.println("Quantité disponible: " + quantite);
        System.out.println("Catégorie: " + categorie);
        System.out.println("Couleurs disponibles: " + couleursDisponibles);
    }
    
    // Getters et setters
    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public List<String> getCouleursDisponibles() {
        return new ArrayList<>(couleursDisponibles);
    }


     // Setters
       public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void setCouleursDisponibles(List<String> couleursDisponibles) {
        this.couleursDisponibles = new ArrayList<>(couleursDisponibles);
    }

}
