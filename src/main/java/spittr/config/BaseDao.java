package spittr.config;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDao<T> {

	private HibernateTemplate hibernateTemplate;

	public T load() {
		return null;
	}

	public List<T> loadAll() {
		return null;
	}

	public T get() {
		return null;
	}

	public List<T> find(String hql) {
		return null;
	}

	public void update(T entity) {
	}

}
