public class BubbleSort
{
	public static void main(String [] args)
	{
		int array [] = {7,3,6,4,8,2,10};
		int len = array.length;
		
		for(int i = 0; i < len-1; i++)
		{
			for(int j = 0; j < len-1-i;j++)
			{
				if(array[j] > array[j+1])
				{
					int min = array[j];
					array[j] = array[j+1];
					array[j+1] = min;
				}
			}
		}
		System.out.printf("\n{");
		for(int i = 0; i < len; i++)
		{
			
			System.out.printf("%d, ", array[i]);	
		}
		System.out.printf("}\n");
	}
}