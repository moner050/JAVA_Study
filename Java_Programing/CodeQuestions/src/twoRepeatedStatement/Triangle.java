package twoRepeatedStatement;

public class Triangle {

	public static void main(String[] args) {

		/*
		 * 巩力 1)
		 * #
		 * ##
		 * ###
		 */
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j <= i; j++) 
			{
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println("=======");
		
		/*
		 * 巩力 2)
		 * ###
		 * ##
		 * #
		 */
		for(int i = 2; i >= 0; i--) 
		{
			for(int j = 0; j <= i; j++) 
			{
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println("=======");
		
		/*
		 * 巩力 3)
		 * @##
		 * @@#
		 * @@@
		 */
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j <= i; j++) 
			{
				System.out.print("@");
			}
			for(int k = 2; k > i; k--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println("=======");
		
		/*
		 * 巩力 4)
		 *   #
		 *  ###
		 * #####
		 */
		for(int i = 0; i < 3; i++)
		{
			for(int j = i; j <= 3-1; j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k <= (i*2); k++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
