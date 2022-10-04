package Sept28;

public class Product {

	int pid;
	String name;
	Double price;
	Double total;
	public Product(int pid, String name, Double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	void display() {
		System.out.println("Product ID " + pid);
		System.out.println("Product Name" + pid);
		System.out.println("Product Price" + pid);
				
	}
	
	}
