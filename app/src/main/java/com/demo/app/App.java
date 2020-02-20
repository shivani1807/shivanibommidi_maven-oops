package com.demo.app;

public class App 
{
    public static void main( String[] args )
    {
        gifts g=new chocolates("kitkat","ferroro rocher",20,40);
        gifts p=new sweets("motichoor","kaju katli",800,900);
        
        g.weight();
        p.weight();
        
        g.display();
        p.display();
    }
}
abstract class gifts{
	int cost1,cost2;
	abstract void weight();
	public gifts(int cost1,int cost2) {
		this.cost1=cost1;
		this.cost2=cost2;
	}
	public void display() {
		System.out.println("All the gifts are received");
	}
}
class chocolates extends gifts{
	String choco1;
	String choco2;
	public chocolates(String choco1,String choco2,int cost1,int cost2) {
		super(cost1,cost2);
		this.choco1=choco1;
		this.choco2=choco2;
	}
	public void display() {
		super.display();
		System.out.println("Chocolate are:"+choco1+","+choco2);
	}
	public void weight() {
		System.out.println(cost1+cost2);
	}
}
class sweets extends gifts{
	String s1;
	String s2;
	public sweets(String s1,String s2,int cost1,int cost2) {
		super(cost1,cost2);
		this.s1=s1;
		this.s2=s2;
	}
	public void display() {
		System.out.println("Sweets are"+s1+","+s2);
	}
	public void weight() {
		System.out.println(cost1+cost2);
	}
}





