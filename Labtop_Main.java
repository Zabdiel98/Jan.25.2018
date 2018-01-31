
public class Labtop_Main {
public static void main(String[]args) {
	
	Laptop laptop=new Laptop("Apple", "Mac", 2016);
	Laptop laptop2=new Laptop("Dell", "Windows", 2011);
	
	System.out.println(laptop.name+" "+laptop.system+" "+laptop.year);
	System.out.println(laptop2.name+" "+laptop2.system+" "+laptop2.year);
}}
