Como criar um projeto com hibernate:

1 - Open the STS and create a "Maven Project" fro "Others" submenu on "fle -> new";

2 - on "pom.xml", add the <dependencies> node, and especify the "hibernate-core", "hibernate-entitymanager" and "mysql- connector - java" dependencies;

3 - Create the "META-INF" folder on the src/main/resource path;

4 - Create the "persistence.xml" file on the META-INF Folder;

5 - Setup the database configuration on a <persistence-unit> node;

6 - Create a Data class like "Person.java", and anotate this with "@Entity". the fields.

7 - If the class property is a id related to a autogenerated column on the database table, anitate with "@Id" and "@GeneratedValue(strategy = GenerationType.IDENTITY)".

------------To persist a Object on Database------------

8 - Instantiate the object like bellow: 
	Pessoa p1 = new Pessoa(null, "Ana", "Ana@email.com");
	
9 - Instantiate the EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
10 - Start a transaction:
	em.getTransaction().begin();
	
11 - Persist the object:
	em.persist(p1);
	
12 - Close the transaction:
	em.getTransaction().commit();
	em.close;
	emf.close;
