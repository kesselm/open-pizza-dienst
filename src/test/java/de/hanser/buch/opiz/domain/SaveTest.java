package de.hanser.buch.opiz.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * @project open-pizza-dienst
 * @author${user} on ${Date}.
 */
public class SaveTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void setUp() {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }


    @Test
    public void testSave(){

        Pizza pizza = new Pizza();
        pizza.setName("Thunfisch");

        session.save(pizza);

        assertNotNull(pizza.getId());

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}

