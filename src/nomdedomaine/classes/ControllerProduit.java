import java.util.ArrayList;
import java.util.List;

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

    
}
