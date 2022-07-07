package testingil.cleancode.approvaltests.pastamaker;

public class Ingredient {
	boolean isPasta;
	
	public Ingredient(boolean isPastaType)
    {
        this.isPasta= isPastaType;
    }
	
    public boolean isPastaType() { 
    	return isPasta; 
    }
}
