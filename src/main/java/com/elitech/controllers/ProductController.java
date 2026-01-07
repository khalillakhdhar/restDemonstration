package com.elitech.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.model.Produit;

@RestController
public class ProductController {
@PostMapping("/product")
public String addProduit(@RequestBody Produit produit)
{
return produit.toString();	

}
@GetMapping("getPrix")
public double getPrixTotale(@RequestParam(defaultValue = "1") int quantite,@RequestParam(defaultValue = "0") double prix)
{
Produit prod=new Produit();
prod.setPrix(prix);
prod.setQuantite(quantite);
return prod.prixTotale();
}
	
	
}
