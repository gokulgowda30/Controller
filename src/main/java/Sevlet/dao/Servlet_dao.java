package Sevlet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Sevlet.dto.Servlet_dto;

public class Servlet_dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String insert(Servlet_dto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
		return "<h1><b>Data Inserted!</b></h1>";
	}

	public String delete(int cid) {
		Servlet_dto dto = em.find(Servlet_dto.class, cid);
		if (dto != null) {
			et.begin();
			em.remove(dto);
			et.commit();
			return "<h1><b>Data Deleted!</b></h1>";
		} else {
			return "<h1><b>Data not found</b></h1>";
		}
	}

	public String deleteall() {
		// select variable_name from table_name(entity of dto) variable name\\JPQL(Java
		// Persistence Query Language)
		Query q = em.createQuery("select data from Servlet_dto data");
		List<Servlet_dto> d1 = q.getResultList();
		if (d1.isEmpty()) {
			return "<h1><b>Data not found</b></h1>";
		} else {
			for (Servlet_dto servlet_dto : d1) {

				et.begin();
				em.remove(servlet_dto);
				et.commit();
			}
			return "all data deleted";
		}
	}

	public Object fetchbyid(int id) {
		Servlet_dto dto = em.find(Servlet_dto.class, id);
		if (dto != null) {
			return dto;
		} else {
			return "<h1><b>Data not found</b></h1>";
		}
	}

	public List<Servlet_dto> fetchall() {
		Query q1 = em.createQuery("select data from Servlet_dto data");
		List<Servlet_dto> d1 = q1.getResultList();
		if (d1.isEmpty()) {
			return null;
		} else {
			return d1;
		}
	}
	public String update(Servlet_dto dto) {
		et.begin();
		em.merge(dto);
		et.commit();
		return "row has been updated";
	}
}
