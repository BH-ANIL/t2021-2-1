class  Program1
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the operation to be performed");
		String operation=sc.next();
		switch(operation)
		{
			case"Addition":System.out.print("the sum of two numbers a and b is"+(a+b));
			break;
			case"substraction":System.out.println("the substraction of two numbers is"+(a-b));
			break;
			case"multiplication":System.out.println("the pmultilplication of two numbers is"+(a*b));
			break;
			case"division":System.out.println("the division of two numbers a and b is"+(a/b));
			break;
			dafault:System.out.println("invalid operation");
			break;
		}

	}
}
