package src.nomdedomaine.classes;
import java.util.ArrayList;
import java.util.List;

public class ProduitController {
    private List<Produit> produits;

    public ProduitController() {
        produits = new ArrayList<>();
    }

    // Méthode pour ajouter un produit
    public void ajouterProduit(Produit produit) {
        if (!produits.contains(produit)) {
            produits.add(produit);
        } else {
            System.out.println("Ce produit est déjà dans la liste.");
        }
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
    //fait la meme chose que produitExiste proposée par chatGPT jsp si elle est mieux 
    /* public boolean produitExiste(String nom) {
        return produits.stream().anyMatch(produit -> produit.getNom().equals(nom));
    }
    */
    
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

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}



}
