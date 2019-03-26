package Testing;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import domain.*;
import exceptions.BadDates;
import exceptions.OverlappingOfferExists;
import businessLogic.*;
import configuration.ConfigXML;
import gui.*;
import dataAccess.*;

public class TestCreateBook {

	static FacadeImplementationWS facade = new FacadeImplementationWS();
	static RuralHouse rh1 = DataAccess.rh3;
	RuralHouse rh2 = new RuralHouse();
	@SuppressWarnings("deprecation")
	static
	Date fecha1 = new Date(2018-1900, 10, 23);
	@SuppressWarnings("deprecation")
	static
	Date fecha2 = new Date(2018-1900, 10, 27);
	static Offer offer;
	
	
	@BeforeClass
	public static void crearOferta() throws OverlappingOfferExists, BadDates {
		offer = facade.createOffer(rh1, fecha1, fecha2, 30);
		System.out.println("Oferta creada");
	}

	@AfterClass
	public static void borrarOferta() {
		facade.deleteOffer(offer);
		facade.deleteOffer(rh1);
		System.out.println("Oferta borrada");
	}
	
	@After
	public void borrarTelefono() {
		facade.deletePhone(offer);
	}
	
	@Test
	public void test1TodoCorrecto() {
		boolean esperado = true;
		String b = "678587478";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test1");
		
	}

	@Test
	public void test2LongitudTelefono() {
		boolean esperado = false;
		String b = "67858747";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test2");
		
	}

	@Test
	public void test3TipoTelefono() {
		boolean esperado = false;
		String b = "A78587478";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test3");
	}

	@Test
	public void test4PrimerValorTelefono() {
		boolean esperado = false;
		String b = "278587478";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test4");
	}
	
	@Test
	public void testOfertaAlquilada() {
		boolean esperado = false;
		String b = "678587478";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test4");
	}

	@Test
	public void test5OfertaEnBD() {
		boolean esperado = false;
		try {
		Offer a = facade.getOffers(rh2, fecha1, fecha2).get(0);
		String b = "678587478";
		boolean resultado = facade.createBook(a, b);
		assertEquals(esperado, resultado);
		}catch (Exception e) {
			assertTrue(true);
		}
		System.out.println("He acabdo el test5");
	}
	@Test
	public void ValorLimite1() {
		boolean esperado = false;
		String b = "599999999";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test6");
	}
	@Test
	public void ValorLimite2() {
		boolean esperado = true;
		String b = "600000000";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test7");
	}
	@Test
	public void ValorLimite3() {
		boolean esperado = true;
		String b = "600000001";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test8");
	}
	@Test
	public void ValorLimite4() {
		boolean esperado = true;
		String b = "699999999";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test9");
	}
	@Test
	public void ValorLimite5() {
		boolean esperado = false;
		String b = "700000000";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		
		System.out.println("He acabdo el test10");
	}
	@Test
	public void ValorLimite6() {
		boolean esperado = false;
		String b = "700000001";
		boolean resultado = facade.createBook(offer, b);
		assertEquals(esperado, resultado);
		System.out.println("He acabdo el test11");
	}

}
