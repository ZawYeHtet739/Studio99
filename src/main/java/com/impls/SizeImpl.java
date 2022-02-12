package com.impls;

import com.daos.SizeDao;
import com.models.Size;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class SizeImpl implements SizeDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session session() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Size> getSizesById(int cat_id) {
//        Query query = session().createQuery("from Color where product_id.product_id in (:product_id)");
        Query query = session().createQuery("From Size where cat_id=:cat_id");
        query.setParameter("cat_id", cat_id);
        List<Size> sizes = query.list();
        session().flush();
        return sizes;
    }

}
