package src.nomdedomaine.classes;

import java.util.ArrayList;
import java.util.List;


public class Panier {
    private List<Produit> produits;

    public Panier() {
        produits = new ArrayList<>();
    }

    // Méthode pour ajouter un produit au panier
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
        System.out.println("Produit ajouté au panier : " + produit.getNom());
    }

    // Méthode pour supprimer un produit du panier 
    public void supprimerProduit(Produit produit) {
        if (produits.contains(produit)) {
            produits.remove(produit);
            System.out.println("Produit retiré du panier : " + produit.getNom());
        } else {
            System.out.println("Ce produit n'est pas dans le panier.");
        }
    }

    // Méthode pour afficher les détails du panier
    public void afficherDetailsPanier() {
        if (produits.isEmpty()) {
            System.out.println("Le panier est vide.");
        } else {
            System.out.println("Détails du panier :");
            for (Produit produit : produits) {
                produit.afficherDetails();
                System.out.println("----------------------");
            }
        }
    }

    // Méthode pour obtenir le montant total du panier
    public double obtenirMontantTotal() {
        double montantTotal = 0;
        for (Produit produit : produits) {
            montantTotal += produit.getPrix();
        }
        return montantTotal;
    }

    // Méthode pour vider le panier
    public void viderPanier() {
        produits.clear();
        System.out.println("Le panier a été vidé.");
    }

    public List<Produit> getProduits() {
        return null;
    }
}
