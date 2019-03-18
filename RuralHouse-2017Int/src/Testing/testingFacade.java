package Testing;

import static org.junit.Assert.*;
import businessLogic.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import org.junit.Test;

import dataAccess.DataAccess;
import domain.Offer;
import domain.RuralHouse;

public class testingFacade {

	FacadeImplementationWS facade = new FacadeImplementationWS();
	RuralHouse rh= new RuralHouse();		
	
	@Test
	public void testCreateOfferDateError() {
		Date fecha1 = new Date(2018-1900,9,25);
		Date fecha2 = new Date(2018-1900,9,22);
		rh= facade.getAllRuralHouses().firstElement();
		
		FacadeImplementationWS facade = new FacadeImplementationWS();
	  	
	  	try {
	  		
	  		facade.createOffer(rh, fecha1, fecha2, 140); 
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}

	}
	@Test
	public void testCreateOffer() {
		Date fecha1 = new Date(2018-1900,9,26);
		Date fecha2 = new Date(2018-1900,9,27);
	  	FacadeImplementationWS facade = new FacadeImplementationWS();	
		rh= facade.getAllRuralHouses().firstElement();
		try {
			facade.createOffer(rh, fecha1, fecha2, 140);
		
		} catch (Exception e) {
			assertTrue(false);
		}

	}
	
	@Test
	public void testCreateOfferRHerror() {
		Date fecha1 = new Date(2018-1900,9,26);
		Date fecha2 = new Date(2018-1900,9,27);
		RuralHouse rh1=new RuralHouse();
		
		try {
			Offer o = facade.createOffer(rh1, fecha1, fecha2, 140); 
			Offer r = null;
			assertEquals(o, r) ;
		} catch (Exception e) {
			assertTrue(false);
		}

	}


}
