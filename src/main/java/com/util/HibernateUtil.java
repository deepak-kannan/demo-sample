package com.util;

public class HibernateUtil {
	private static SessionFactoryLocal	sessionFactory = null;
	

	public static SessionFactoryLocal getSessionFactory() {
		if (sessionFactory == null) {
			try {
				/*
				 * Configuration configuration = new Configuration(); // Hibernate settings
				 * equivalent to hibernate.cfg.xml's properties Properties settings = new
				 * Properties(); settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				 * settings.put(Environment.URL,
				 * "jdbc:mysql://192.168.0.104:3306/hibernate_db?useSSL=false");
				 * settings.put(Environment.USER, "root"); settings.put(Environment.PASS,
				 * "root"); settings.put(Environment.DIALECT,
				 * "org.hibernate.dialect.MySQL5Dialect"); settings.put(Environment.SHOW_SQL,
				 * "true"); settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				 * settings.put(Environment.HBM2DDL_AUTO, "create-drop");
				 * configuration.setProperties(settings);
				 * configuration.addAnnotatedClass(Student.class); ServiceRegistry
				 * serviceRegistry = new StandardServiceRegistryBuilder()
				 * .applySettings(configuration.getProperties()).build(); sessionFactory =
				 * configuration.buildSessionFactory(serviceRegistry);
				 */
				sessionFactory = new SessionFactoryLocal();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}