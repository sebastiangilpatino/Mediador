package src;

public interface IATCMediator 
{ 

	public void register(Command c1); 

	public boolean isLandingOk(); 

	public void setLandingStatus(boolean status); 
} 
