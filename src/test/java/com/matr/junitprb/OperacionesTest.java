package com.matr.junitprb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.List;

public class OperacionesTest {

    /* assertEquals(15,resultado);  Evaluar un valor esperado con un valor actual
        assertTrue(resultado > 1);
        assertFalse(resultado == 0);
         assertNotNull(resultado);
      assertInstanceOf(Integer.class, resultado); estamos esperando que la respuesta sea un numero
      assertInstanceOf(String.class, resultado); estamos esperando que la respuesta sea un string
     */

    private Operaciones ope;

    @BeforeEach
    public void init() {
        this.ope = new Operaciones();
    }

    @Test
    public void testSumar() {
        //Given - Teniendo
        int a = 10;
        int b = 5;

        //When - Cuando
        int resultado = ope.Sumar(a, b);


        //Then - Entonces
        assertEquals(15, resultado);
        assertInstanceOf(Integer.class, resultado);


    }

    @Test
    public void testcheckPositivo() {
        int a = 3;

        boolean result = ope.checkPositivo(a);


        assertTrue(result);
    }

    @Test
    public void testcheckNegativoError() {
        int a = -3;
        assertThrows(IllegalArgumentException.class, () -> {
            ope.checkPositivo(a);
        });
    }

    @Test
    public void testcontarLestrasA() {
        String a = "Maria";

        int result = ope.contarLetrasA(a);

        assertEquals(2, result);
    }

    @Test
    public void testContieneElemento() {
        List<String> paises = List.of("Mexico", "colombia", "españa");
        String pais = "colombia";

        boolean result = ope.contieneElemento(paises, pais);

        assertTrue(result);
    }

    @Test
    public void testrevertirCadena() {

        String cad = "milton";
        String result = ope.revertirCadena(cad);
        System.out.println("result --> " + result);

        assertEquals("notlim", result);
    }

    @Test
    public void testfactorial() {
        int numero = 5;

        long factorial = ope.factorial(numero);

        assertEquals(120, factorial);
    }

    @Test
    public void testFactorialError() {
        int numero = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            ope.factorial(numero);
        });
    }

    @Test
    public void testNumPrimo() {
        int numero = 37;
        boolean primo = ope.numPrimo(numero);
        System.out.println(numero+" es primo --> " + primo);
        assertTrue(primo);
    }

    @Test
    public void testNumPrimoError() {
        int numero = -5;
        boolean primo = ope.numPrimo(numero);
        System.out.println(numero+" es primo --> " + primo);

        assertFalse(primo);
    }

    @Test
    public void testNumPrimoError2() {
        int numero = 10;
        boolean primo = ope.numPrimo(numero);
        System.out.println(numero+" es primo --> " + primo);

        assertFalse(primo);
    }

    @Test
    public void testmensajeConRetraso() throws InterruptedException {

        String result = ope.mensajeConRetraso();
        System.out.println("result: " + result) ;
        assertEquals("listo despues del retraso", result);
    }

    @Test
    public void testconveritAString(){
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> listring = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9","10");
        List<String> lista = ope.converitAString(list);
        System.out.println(lista);

       //assertEquals(listring,lista);
        assertEquals(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9","10"),lista);


    }
}
