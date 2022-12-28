 class Publication
{
    String title;
	int copies, price;
	void saleCopy()
	{
		System.out.println("Total Sale of Publication is: "+(copies*price));
	}
}

class Book extends Publication
{
	String author;
	Book(String n, String t, int c, int p)
	{
		this.author=n;
		this.title=t;
		this.copies=c;
		this.price=p;
	}
	void orderCopies()
	{
		System.out.println("No of ordered book copies"+this.copies);
	}
	void saleCopy()
	{
		int total=this.price*this.copies;
		System.out.println("Amount generated from sale of books "+total);
	}
}

class Magazine extends Publication
{
	int orderqty, issue,receiveissue;
	Magazine(String t, int c, int p, int ri, int i)
	{
		this.title=t;
		this.copies=c;
		this.price=p;
		receiveissue=ri;

	}
	void orderCopies()
	{
		System.out.println("No of magazines ordered "+this.copies);
	}
	void saleCopy()
	{
		int total=this.price*this.copies;
		System.out.println("Total amount generated from sale of magazines "+total);
	}
	
}

 public class Total
{
	public static void main(String args[])
	{
		Book b1= new Book("ABC","XYZ",2,240);
		b1.orderCopies();b1.saleCopy();

		Magazine m=new Magazine("XYZ",10,200,10,15);
		m.orderCopies();m.saleCopy();
	}
}