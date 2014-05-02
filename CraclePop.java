
public class CraclePop
	{

		public static void main(String[] args)
			{

				for(int i = 1; i <= 100; i++){
					
					if(i % 3 == 0 && i % 5 == 0){
						
						System.out.println("CracklePop");
						
					}
					else if(i % 3 == 0){
						System.out.println("Cracle");
					}
					else if( i % 5 == 0){
						System.out.println("Pop");
					}
					else{
						System.out.println(i);
					}
					
				}
				
				System.out.println("This is now a changed file.");
			}
	}
