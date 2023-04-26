package entidades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class probandoJPA {
	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("JPA_GestorVIdeojuegos");
		EntityManager em=emFactory.createEntityManager();
				
		EntityTransaction trans=em.getTransaction();
		trans.begin();
		videojuego j1=new videojuego("Star Wars Jedi Survivor", "Electronic Arts", 2023 );
		em.persist(j1);
		trans.commit();
	}

}
