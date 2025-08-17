package ejemplo.demostr;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ejemplo.entidades.datos;

public class consultasdemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(datos.class)
		        .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			datos resultado = session.get(datos.class, 1);
			System.out.println("registro obtenido: "+resultado);
			
			List<datos> resultados = session.createQuery("from datos").list();
			System.out.println("nConsulta general");
			for(datos u: resultados) {
				System.out.println(u);
				
			}
			
			
			session.getTransaction().commit();
			
			System.out.println("proceso finalizado");
			
			
		}finally {
			factory.close();
		}

	}

}
