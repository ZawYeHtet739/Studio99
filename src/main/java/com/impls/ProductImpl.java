package com.impls;

import com.daos.ProductDao;
import com.models.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Repository
@Transactional
public class ProductImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session session() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Product getProductById(int id) {
        Product product = session().get(Product.class,id);
        session().flush();
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        Query query = session().createQuery("From Product");
        List<Product> products = query.list();
//        Collections.sort(products, Collections.reverseOrder());
        session().flush();
        return products;
    }


}
