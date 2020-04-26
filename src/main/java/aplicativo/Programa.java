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
		
//		Finding a object on database by Id:
		Pessoa p1 = em.find(Pessoa.class, 1);
		
		System.out.println(p1);
		

		em.close();
		emf.close();
		
		System.out.println("Operations OK!");

	}

}
