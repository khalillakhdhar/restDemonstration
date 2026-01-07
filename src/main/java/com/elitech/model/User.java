package com.elitech.model;

public class User {
private String nom;
private String prenom;
private int age;
private String telephone;


public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
@Override
public String toString() {
	return "User [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", telephone=" + telephone + "]";
}



}
