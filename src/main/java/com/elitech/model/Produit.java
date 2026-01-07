package com.elitech.model;

public class Produit {
private String titre;
private double prix;
private int quantite;
public Produit(String titre, double prix, int quantite) {
	super();
	this.titre = titre;
	this.prix = prix;
	this.quantite = quantite;
}
public Produit() {
	super();
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public double prixTotale()
{
return this.prix*this.quantite;	
}
@Override
public String toString() {
	return "Produit [titre=" + titre + ", prix=" + prix + ", quantite=" + quantite + ", prixTotale()=" + prixTotale()
			+ "]";
}



}
