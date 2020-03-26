package src;

class ATCMediator implements IATCMediator 
{ 
	private Flight flight; 
	private Runway runway; 
	public boolean land; 

	private void registerRunway(Runway runway) 
	{ 
		this.runway = runway; 
	} 

	private void registerFlight(Flight flight) 
	{ 
		this.flight = flight; 
	} 

	public boolean isLandingOk() 
	{ 
		return land; 
	} 

	@Override
	public void setLandingStatus(boolean status) 
	{ 
		land = status; 
	}

	@Override
	public void register(Command c1) {
		if ( c1.getClass()==Flight.class) {registerFlight((Flight) c1);}
		else if(c1.getClass()==Runway.class) {registerRunway((Runway) c1);}
	} 
} 
