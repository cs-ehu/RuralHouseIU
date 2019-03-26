package businessLogic;

import java.io.File;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebService;

import configuration.ConfigXML;
import dataAccess.DataAccess;

//import domain.Booking;
import domain.Offer;
import domain.RuralHouse;
import exceptions.BadDates;
import exceptions.OverlappingOfferExists;

//Service Implementation
@WebService(endpointInterface = "businessLogic.ApplicationFacadeInterfaceWS")
public class FacadeImplementationWS  implements ApplicationFacadeInterfaceWS {

	/**
	 * 
	 */

	//Vector<Owner> owners;
	//Vector<RuralHouse> ruralHouses;
	//DataAccessInterface dB4oManager;
 

	public FacadeImplementationWS()  {
		
		System.out.println("Se esta ejecutando el constructor de FacadeImplementationWS");
		ConfigXML c=ConfigXML.getInstance();
		
		DataAccess dbManager=new DataAccess(c.getDataBaseOpenMode().equals("initialize"));
		if (c.getDataBaseOpenMode().equals("initialize")) {
			dbManager.initializeDB();
			}
		else {// check if it is opened
			 //Vector<Owner> owns=dataAccess.getOwners();
		}
		dbManager.close();
		

	}
	

	/**
	 * This method creates an offer with a house number, first day, last day and price
	 * 
	 * @param House
	 *            number, start day, last day and price
	 * @return the created offer, or null, or an exception
	 */
	public Offer createOffer(RuralHouse ruralHouse, Date firstDay, Date lastDay,
			float price) throws OverlappingOfferExists, BadDates {
		System.out.println("se esta ejecutando: createOffer");
		System.out.println(firstDay);
		System.out.println(lastDay);

		
		DataAccess dBManager=new DataAccess(false);
		Offer o=null;
		if (firstDay.compareTo(lastDay)>=0) throw new BadDates();
		
		boolean b = dBManager.existsOverlappingOffer(ruralHouse,firstDay,lastDay); // The ruralHouse object in the client may not be updated
		
		if (!b) o=dBManager.createOffer(ruralHouse,firstDay,lastDay,price);		

		dBManager.close();
		
		return o;
	}
 

	
		
	public Vector<RuralHouse> getAllRuralHouses()  {
		System.out.println("Start Metodo getAllRuralHouses");

		DataAccess dbManager=new DataAccess(false);

		Vector<RuralHouse>  ruralHouses=dbManager.getAllRuralHouses();
		dbManager.close();
		System.out.println("End Metodo getAllRuralHouses");

		return ruralHouses;

	}
	
	/**
	 * This method obtains the  offers of a ruralHouse in the provided dates 
	 * 
	 * @param ruralHouse, the ruralHouse to inspect 
	 * @param firstDay, first day in a period range 
	 * @param lastDay, last day in a period range
	 * @return the first offer that overlaps with those dates, or null if there is no overlapping offer
	 */

	@WebMethod public Vector<Offer> getOffers( RuralHouse rh, Date firstDay,  Date lastDay) {
		
		DataAccess dbManager=new DataAccess(false);
		Vector<Offer>  offers=new Vector<Offer>();
		  offers=dbManager.getOffers(rh,firstDay,lastDay);
		dbManager.close();

		return offers;
	}	
	/*@WebMethod public Offer getOffer( RuralHouse rh, Date firstDay,  Date lastDay) {
		
		DataAccess dbManager=new DataAccess(false);
		Offer offers=new Offer();
		offers=dbManager.getOffer(rh,firstDay,lastDay);
		dbManager.close();

		return offers;
	}	
	@WebMethod public RuralHouse getMiRuralHouse() {
		
		DataAccess dbManager=new DataAccess(false);
		RuralHouse rh=new RuralHouse();
		rh=dbManager.getMiRuralHouse();
		dbManager.close();

		return rh;
	}*/
	@WebMethod public void deletePhone(Offer of) {
		
		DataAccess dbManager=new DataAccess(false);
		dbManager.deletePhone(of);
		dbManager.close();

	}
	
	@WebMethod public void deleteOffer(Offer rh) {
		
		DataAccess dbManager=new DataAccess(false);
		dbManager.deleteOffer(rh);
		dbManager.close();

	}
	
	@WebMethod public void deleteOffer(RuralHouse rh) {
		
		DataAccess dbManager=new DataAccess(false);
		dbManager.deleteOffer(rh);
		dbManager.close();

	}
	
	/**
	 * This method creates a book for a client telephoneNumber 
	 * 
	 * @param offer, the the offer to be booked 
	 * @param telephoneNumber, the telephone of the person who book the offer 
	 * @return true if the offer has been booked, false in other case
	 */

	@WebMethod public boolean createBook( Offer off, String telephoneNumber) {
		boolean isBooked=false;
		if (off!=null && telephoneNumber!=null && isNumeric(telephoneNumber) ){
			DataAccess dbManager=new DataAccess(false);
				 isBooked=dbManager.createBook(off,telephoneNumber);
			dbManager.close();
		}
		return isBooked;
	}
		
		
	public  boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	public void close() {
		DataAccess dB4oManager=new DataAccess(false);

		dB4oManager.close();

	}


	 public void initializeBD(){
		
		DataAccess dBManager=new DataAccess(false);
		dBManager.initializeDB();
		dBManager.close();

	}



	 

	}

