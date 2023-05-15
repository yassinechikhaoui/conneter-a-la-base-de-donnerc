package modele;
import java.sql.*;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.DriverManager;


public class Client {
	 private String nom;
	 private String adresse;
	 private String email;
	 
	 
	 public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void ajouter(){
	 
	  
		try{
			
			  Class.forName("com.mysql.jdbc.Driver");
			    
			   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root",""); 
		       PreparedStatement pst = con.prepareStatement("insert into client(nom,adresse,email)values(?,?,?) ");
		       pst.setString(1, nom);
		       pst.setString(2, adresse);
		       pst.setString(3, email);
		       
		       int x =pst.executeUpdate();
if(x>0){
		    	   
		    	   System.out.println("<b>Client Eng</b>"); 
		       }else{
		    	   
		    	   System.out.println("<b>Client ne pas Eng</b>"); 
		       }
		       
		     /*  // étape 5 : afficher les données
		       while (res.next()) {
		         // récupérer par nom de colonne
		         int id = res.getInt("id");
		         String nomClient = res.getString("nom");
		         String adresseClient = res.getString("adresse");
		         String emailClient = res.getString("email");

		         // afficher les valeurs
		         System.out.print("ID: " + id);
		         System.out.print(", Nom: " + nomClient);
		         System.out.print(", adresse: " + adresseClient);
		         System.out.println(", email: " + emailClient);
		       }
		       // étape 6 : fermer l'objet de connexion
		       con.close();*/
		       
		       
		}
		catch(Exception e){
			System.out.println(e);
		}}}
        