package src;

public class MediatorDesignPattern {

	public static void main(String[] args) {

		 IATCMediator atcMediator = new ATCMediator(); 
	       
		 	Flight sparrow101 = new Flight(atcMediator); 
	        Runway mainRunway = new Runway(atcMediator); 
	      
	        atcMediator.register((Command) sparrow101); 
	        atcMediator.register((Command) mainRunway); 
	        
	        sparrow101.getReady(); 
	    
	        mainRunway.land(); 
	        sparrow101.land();
	}

}
