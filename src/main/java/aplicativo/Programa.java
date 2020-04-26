package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		
//		The id is unnecessary because the database will automatically create this
		Pessoa p1 = new Pessoa(null, "Ana", "Ana@email.com");
		Pessoa p2 = new Pessoa(null, "Bernardo", "Bernardo@email.com");
		Pessoa p3 = new Pessoa(null, "Carlos", "Carlos@email.com");
		
//		Instantiating the EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		Is required start a transaction
		em.getTransaction().begin();
		
//		Persisting the objects
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
//		Closing the transaction
		em.getTransaction().commit();
		
		System.out.println("Operations OK!");

	}

}
