package ejemplo.demostr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ejemplo.entidades.datos;

public class demostracinsert {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(datos.class)
		        .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			datos user = new datos("mabel","ln102");
			
			session.save(user);
			
			session.getTransaction().commit();
			
			System.out.println("Registro fue almacenado!!");
			
			
		}finally {
			factory.close();
		}
		
	}

}