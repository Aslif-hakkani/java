public class Account extends Customer2{
	private int id ;
	private double balance = 0.0;
	
	public Account (int cid , String name , char gender , int id , double balance){
		super (cid ,name ,gender);
		this.id = id;
		this.balance = balance;
	}
	public Account (int cid , String name , char gender , int id){
		super (cid ,name ,gender);
		this.id = id;
		this.balance = 0.0;
	}
	public int getId(){
		return this.id;
	}
	public double getBalence(){
		return this.balance;
	}
	public void setBalence(double balance){
		this.balance = balance;
	}
	public String toString (){
		return super.toString()+" Balence = $"+this.getBalence();
	}
	
	public Account deposit(double amount){
		this.balance += amount;
		return this;
	}
	
	public Account withraw (double amount){
		if (this.balance >= amount){
			this.balance -= amount;
		}
		else {
			System.out.println("amount withdrawn exceeds the current balance!");
		}
		return this;
	}
	
}