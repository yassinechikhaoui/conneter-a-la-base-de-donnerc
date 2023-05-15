package controler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.Client;

/**
 * Servlet implementation class AjouterClientServlet
 */
@WebServlet("/AjouterClientServlet")
public class AjouterClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nom =request.getParameter("nom");
		String adresse =request.getParameter("adresse");
		String email =request.getParameter("email");

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
		}}
        
    

		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
