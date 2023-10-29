package src.nomdedomaine.classes.categorie;
import java.util.ArrayList;
import java.util.List;

import src.nomdedomaine.classes.Produit;

public class ProduitController {
    private List<Produit> produits;

    public ProduitController() {
        produits = new ArrayList<>();
    }

    // Méthode pour ajouter un produit
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Méthode pour supprimer un produit
    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
    }

    // Méthode pour afficher la liste des produits
    public void afficherProduits() {
        for (Produit produit : produits) {
            System.out.println("Nom: " + produit.getNom());
            System.out.println("Description: " + produit.getDescription());
            System.out.println("Prix: " + produit.getPrix());
            System.out.println("Quantité disponible: " + produit.getQuantite());
            System.out.println("Catégorie: " + produit.getCategorie());
            System.out.println("Couleurs disponibles: " + produit.getCouleursDisponibles());
            System.out.println("----------------------");
        }
    }

// Méthode pour récupérer un produit par son nom
    public Produit getProduitParNom(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom().equals(nom)) {
                return produit;
            }
        }
        return null; // Retourne null si le produit n'est pas trouvé
    }

// Méthode pour mettre à jour les détails d'un produit existant
    public void mettreAJourProduit(Produit produitExist, Produit nouveauProduit) {
        produitExist.setNom(nouveauProduit.getNom());
        produitExist.setDescription(nouveauProduit.getDescription());
        produitExist.setPrix(nouveauProduit.getPrix());
        produitExist.setQuantite(nouveauProduit.getQuantite());
        produitExist.setCategorie(nouveauProduit.getCategorie());
        produitExist.setCouleursDisponibles(nouveauProduit.getCouleursDisponibles());
    }

    // Méthode pour vérifier l'existence d'un produit par son nom
    public boolean produitExiste(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour filtrer les produits par catégorie
    public List<Produit> filtrerProduitsParCategorie(Produit.Categorie categorie) {
        List<Produit> produitsFiltres = new ArrayList<>();
        for (Produit produit : produits) {
            if (produit.getCategorie() == categorie) {
                produitsFiltres.add(produit);
            }
        }
        return produitsFiltres;
    }

    // Méthode pour obtenir la quantité totale en stock de tous les produits
    public int obtenirQuantiteTotaleEnStock() {
        int quantiteTotale = 0;
        for (Produit produit : produits) {
            quantiteTotale += produit.getQuantite();
        }
        return quantiteTotale;
    }

    // Méthode pour trier les produits par prix (croissant ou décroissant)
    public void trierProduitsParPrix(boolean croissant) {
        produits.sort((produit1, produit2) -> {
            if (croissant) {
                return Double.compare(produit1.getPrix(), produit2.getPrix());
            } else {
                return Double.compare(produit2.getPrix(), produit1.getPrix());
            }
        });
    }

    // Méthode pour obtenir le produit le moins cher dans la liste
    public Produit obtenirProduitMoinsCher() {
        if (produits.isEmpty()) {
            return null;
        }

        Produit produitMoinsCher = produits.get(0);
        for (Produit produit : produits) {
            if (produit.getPrix() < produitMoinsCher.getPrix()) {
                produitMoinsCher = produit;
            }
        }
        return produitMoinsCher;
    }
}



}
