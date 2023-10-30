package src.nomdedomaine.classes;

import java.util.List;

public class GestionnairePaiement {
    public boolean effectuerPaiement(Utilisateur utilisateur, Panier panier) {
        // Simuler le processus de paiement ici
        // Si le paiement est réussi, créer une commande et vider le panier
        if (processusPaiement(utilisateur, panier)) {
            List<Produit> produits = panier.getProduits();
            Commande commande = new Commande(genererNumeroCommande(), utilisateur, produits);
            panier.viderPanier(); // Vider le panier après la commande
            return true; // Paiement réussi
        } else {
            return false; // Paiement échoué
        }
    }
   // Retourne true si le paiement est réussi, sinon false
    private boolean processusPaiement(Utilisateur utilisateur, Panier panier) {

        return true; // Simulation de paiement réussi
    }

     // Générer un numéro de commande unique 
    private int genererNumeroCommande() {
        return (int) (Math.random() * 10000) + 1;
    }
}


