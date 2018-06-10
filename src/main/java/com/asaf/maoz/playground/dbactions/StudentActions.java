package com.asaf.maoz.playground.dbactions;

import com.asaf.maoz.playground.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class StudentActions {


    public static void main(String[] args) {
            customQuery();
    }

    public static void customQuery() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select st.user_name " +
                "from Student as st " +
                "group by st.user_name ";
        List<?> list = session.createQuery(hql).list();
    }
}
