package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
//		Instantiating the EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		Deleting a object on database:
		Pessoa p1 = em.find(Pessoa.class, 3);
		
//		We need open a transaction
		em.getTransaction().begin();

		em.remove(p1);
		
//		Closing the transaction
		em.getTransaction().commit();

		em.close();
		emf.close();
		
		System.out.println("Operations OK!");

	}

}
