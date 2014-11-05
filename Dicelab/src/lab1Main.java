
public class lab1Main {
	  public static void main(String[] args  )
	   {
		  lab1 dice;
		  dice = new lab1();
	 
		  do{
				dice.Throw();
				
		  System.out.println("Rolled " + dice.Value1()  + 
				  " and " +   dice.Value2());
		  }
		  while (dice.getTotal()%2 == 0);
		  {
			  
			  System.out.println("Dice rolled " + dice.getTotal());
			  
			  
		  }
			
}

}
