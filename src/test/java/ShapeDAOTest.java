package lab4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class ShapeDAOTest {
    private static SessionFactory sessionFactory;
    private Session session;

    @BeforeAll
    static void setupSessionFactory() {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    @BeforeEach
    void setupSession() {
        session = sessionFactory.openSession();
        session.beginTransaction();
    }

    @AfterEach
    void tearDownSession() {
        if (session != null) {
            session.getTransaction().commit();
            session.close();
        }
    }

    @AfterAll
    static void tearDownSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    @Test
    void testShapeTableCreation() {
        assertDoesNotThrow(() -> {
            session.getTransaction().commit();
            session.beginTransaction();
        });
    }

    @Test
    void testInsertAndRetrieveTriangle() {
        Triangle triangle = new Triangle(3,4,5, new Color(1, 2, 3, 4));
        session.save(triangle);

        List<Triangle> triangles = session.createQuery("FROM Triangle", Triangle.class).list();
        assertEquals(3.0, triangles.get(0).getA());
        assertEquals(2, triangles.get(0).getColor().getGreen());
    }

    @Test
    void testInsertAndRetrieveRectangle() {
        Rectangle rectangle = new Rectangle(5, 10, new Color(5, 6, 7, 8));
        session.save(rectangle);

        List<Rectangle> rectangles = session.createQuery("FROM Rectangle", Rectangle.class).list();
        assertEquals(5.0, rectangles.get(0).getWidth());
        assertEquals(6, rectangles.get(0).getColor().getGreen());
    }

}
