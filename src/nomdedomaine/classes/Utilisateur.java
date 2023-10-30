

package src.nomdedomaine.classes;

import java.util.Objects;

public class Utilisateur {
    private String nom;
    private String email;
    private String adresse;

    public Utilisateur(String nom, String email, String adresse) {
        this.nom = nom;
        this.email = email;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void afficherDetailsUtilisateur() {
        System.out.println("Nom : " + nom);
        System.out.println("Email : " + email);
        System.out.println("Adresse : " + adresse);
    }

    // Méthodes equals() et hashCode() pour la comparaison d'objets Utilisateur
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(nom, that.nom) &&
               Objects.equals(email, that.email) &&
               Objects.equals(adresse, that.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, email, adresse);
    }
}



