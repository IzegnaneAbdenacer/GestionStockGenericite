package gn;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Saisir votre choix :");
            System.out.println("1. Afficher la liste des produits: ");
            System.out.println("2. Rechercher un produit par son id : ");
            System.out.println("3. Ajouter un nouveau produit dans la liste : ");
            System.out.println("4. Supprimer un produit par id : ");
            System.out.println("Saisir votre choix");
            System.out.println("5. Quitter ce programme : ");
            int choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("Listes des produits : ");
                    for (Produit produit : metier.getAll()) {
                        System.out.println(produit);
                    }
                    break;
                case 2:
                    System.out.println("Entrez l'id du produit à rechercher :");
                    int idRecherche = sc.nextInt();
                    Produit produitTrouve = metier.findById(idRecherche);
                    if (produitTrouve != null) {
                        System.out.println("Produit trouve : " + produitTrouve);
                    } else {
                        System.out.println("Produit introuvable");
                    }
                    break;
                case 3:
                    System.out.println("Entrez l'id du produit");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entrez le nom du produit");
                    String nom = sc.next();
                    sc.nextLine();
                    System.out.println("Entrez la marque du produit");
                    String marque = sc.next();
                    sc.nextLine();
                    System.out.println("Entrez le prix du produit");
                    int prix = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entrez la description du produit");
                    String description = sc.next();
                    sc.nextLine();
                    System.out.println("Entrez la quantite en stock");
                    int nombreEnStock = sc.nextInt();
                    Produit produit = new Produit(id, nom, marque, prix, description, nombreEnStock);
                    metier.add(produit);
                    System.out.println("Produit ajoute avec succes");
                    break;
                case 4:
                    System.out.println("Entrez l'id du produit à supprimer :");
                    int idSupprimer = sc.nextInt();
                    metier.delete(idSupprimer);
                    System.out.println("Produit supprimer avec succes.");
                    break;
                case 5 :
                    System.out.println("au revoir");
                    sc.close();
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez ressayer");
            }
        }
    }
}
