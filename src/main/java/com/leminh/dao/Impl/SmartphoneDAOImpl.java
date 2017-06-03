package com.leminh.dao.Impl;

import java.util.List;
 
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.leminh.dao.SmartphoneDAO;
import com.leminh.entity.Smartphone;
import com.leminh.model.SmartphoneInfo;
import org.springframework.beans.factory.annotation.Autowired;

public class SmartphoneDAOImpl implements SmartphoneDAO {
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public Smartphone findSmartphone(int id) {
		Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(Smartphone.class);
        crit.add(Restrictions.eq("id", id));
        return (Smartphone) crit.uniqueResult();
    }
	
	@Override
	public List<SmartphoneInfo> listSmartphoneInfos() {
		String sql = "Select new " + SmartphoneInfo.class.getName()
                + "(a.id, a.name, a.brand, a.price, a.year, a.detail) "
                + " from " + Smartphone.class.getName() + " a ";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(sql);
        return query.list();
	}

	@Override
	public void saveSmartphone(SmartphoneInfo smartphoneInfo) {
		int id = smartphoneInfo.getId();
		Smartphone smartphone = null;        
        smartphone = this.findSmartphone(id);
        boolean isNew = false;
        if (smartphone == null) {
            isNew = true;
            smartphone = new Smartphone();
        }
        smartphone.setName(smartphoneInfo.getName());
        smartphone.setBrand(smartphoneInfo.getBrand());
        smartphone.setPrice(smartphoneInfo.getPrice());   
        smartphone.setYear(smartphoneInfo.getYear());
        smartphone.setDetail(smartphoneInfo.getDetail());
        smartphone.setImage(smartphoneInfo.getImage());
        if (isNew) {
            Session session = this.sessionFactory.getCurrentSession();
            session.persist(smartphone);
        }
	}

	@Override
	public SmartphoneInfo findSmartphoneInfo(int id) {
		Smartphone smartphone = this.findSmartphone(id);
        if (smartphone == null) {
            return null;
        }
        return new SmartphoneInfo(smartphone.getId(), smartphone.getName(),
        		smartphone.getBrand(), smartphone.getPrice(),
        		smartphone.getYear(), smartphone.getDetail(), smartphone.getImage());
    }

	@Override
	public void deleteSmartphone(int id) {
		Smartphone smartphone = this.findSmartphone(id);
        if (smartphone != null) {
            this.sessionFactory.getCurrentSession().delete(smartphone);
        }
	}

}
