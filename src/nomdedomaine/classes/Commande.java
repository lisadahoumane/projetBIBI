package src.nomdedomaine.classes;
import java.util.Date;
import java.util.List;

public class Commande {
    private int numeroCommande;
    private Date dateCommande;
    private Utilisateur utilisateur;
    private List<Produit> produits;
    private double montantTotal;

    public commande(int numeroCommande, Utilisateur utilisateur, List<Produit> produits) {
        this.numeroCommande = numeroCommande;
        this.utilisateur = utilisateur;
        this.produits = produits;
        this.dateCommande = new Date(); // La date de la commande est automatiquement définie à la date actuelle
        calculerMontantTotal();
    }

    private void calculerMontantTotal() {
        montantTotal = 0;
        for (Produit produit : produits) {
            montantTotal += produit.getPrix();
        }
    }

    // Getters pour les détails de la commande
    public int getNumeroCommande() {
        return numeroCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    // Affiche les détails de la commande
    public void afficherDetailsCommande() {
        System.out.println("Numéro de commande : " + numeroCommande);
        System.out.println("Date de commande : " + dateCommande);
        System.out.println("Utilisateur : " + utilisateur.getNom());
        System.out.println("Produits commandés :");
        for (Produit produit : produits) {
            System.out.println("- " + produit.getNom() + " : " + produit.getPrix() + "€");
        }
        System.out.println("Montant total : " + montantTotal + "€");
    }
}

    
}
