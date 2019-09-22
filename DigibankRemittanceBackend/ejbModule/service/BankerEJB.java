package service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SessionFactory;

import entities.BankerEntity;

/**
 * Session Bean implementation class BankerEJB
 *
 */
@Stateless
@LocalBean
public class BankerEJB<Banker> {
	SessionFactory sessionFactory;
	@PersistenceContext
	private EntityManager em;

	public BankerEJB() {
		// TODO Auto-generated constructor stub
	}

	public void addNew(BankerEntity bankerEntity) {
		System.out.println("============================");
		System.out.println(bankerEntity.getName());
		em.persist(bankerEntity);
		System.out.println("============================");
	}

	@SuppressWarnings("rawtypes")
	public List findBankers() {
	// TODO Auto-generated method stub
		System.out.println("======Reading Banker=======");

		Query queryObj = em.createQuery("SELECT b FROM banker_tbl b");
		List bankerList =  queryObj.getResultList();
		System.out.println("=======End of Reading Bankers=========");
		if (bankerList != null && bankerList.size() > 0) {
			return bankerList;
		} else {
			return null;
		}

	}
}
