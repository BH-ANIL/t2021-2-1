class Program4 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,8,9,12,46,76,82,15,20,30};
		for(int i=1;i<10;i++)
		{
			int count=0;
			for(int j=0; j< arr.length;j++)
			{
				if(arr[j]%i==0)
				{
					count++;
				}
			}
		System.out.println(" "+i+":"+count);
		}
	}
}
