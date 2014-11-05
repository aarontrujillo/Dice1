public class lab92Main {
		  public static void main(String[] args  )
		   {
			  lab92 dice;
			  dice = new lab92();
		 
			  do{
					dice.Throw();
					
			  System.out.println("You rolled " + dice.Value1()  + 
					  " and " +   dice.Value2());
			  }
			  while(dice.getTotal() == 0);
			  {
				  
				  System.out.println("Total " + dice.getTotal());
				  
			  }
				
	}

	}  