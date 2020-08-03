/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_triangulo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author accurate
 */
public class TrianguloTest {
    
    public TrianguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ehTriangulo method, of class Triangulo.
     */
    @Test
    public void testEhTriangulo() {
        System.out.println("ehTriangulo");
        assertEquals(true, Triangulo.ehTriangulo(5, 6, 10));
        assertEquals(false, Triangulo.ehTriangulo(5, 6, 20));
    }

    /**
     * Test of obterTipo method, of class Triangulo.
     */
    @Test
    public void testObterTipo() {
        System.out.println("obterTipo");
        assertEquals("nao eh um triangulo", Triangulo.obterTipo(5, 6, 20));
        assertEquals("EQUILATERO", Triangulo.obterTipo(5, 5, 5));
        assertEquals("ESCALENO", Triangulo.obterTipo(5, 6, 10));
        assertEquals("ISOSCELES", Triangulo.obterTipo(6, 6, 10));
    }
    
}
