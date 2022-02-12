package com.impls;

import com.daos.CategoryDao;
import com.models.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session session() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Category> getAllCategories() {
        Query query = session().createQuery("From Category");
        List<Category> categories = query.list();
        session().flush();
        return categories;
    }

    @Override
    public Category getCategoryById(int id) {
        Category category = session().get(Category.class, id);
        session().flush();
        return category;
    }

}
