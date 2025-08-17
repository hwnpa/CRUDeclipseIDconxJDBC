package com.ejemplo.entidades;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 public class ejecutarexcluir {

		public static void main(String[] args) {
			SessionFactory factory = new Configuration()
			        .configure("hibernate.cfg.xml")
			        .addAnnotatedClass(datos.class)
			        .buildSessionFactory();
			
			Session session = factory.getCurrentSession();
			
			try {
				
				session.beginTransaction();
				
				datos per = session.get(datos.class, 2);
				per.setUserName("will");
				
				session.createQuery("update datos u set u.userpassword = '123beb'").executeUpdate();
				
				
				session.getTransaction().commit();
				
				System.out.println("proceso finalizado");
				
				
			}finally {
				factory.close();
			}


		}

	}


