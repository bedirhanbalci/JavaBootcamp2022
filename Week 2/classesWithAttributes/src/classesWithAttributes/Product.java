package classesWithAttributes;

public class Product {

	//Constructor ve overloading oluşturduk
	public Product(int id, String name, String description, double price , int stockAmount, String renk){
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount = stockAmount;
		this.renk=renk;
		
	}
	public Product() {
		
	}


	// attribute | field
	private int id;
	private int stockAmount;
	private double price;
	private String name;
	private String description;
	private String renk;
	private String kod;
	

	/*	// getter getter setter yapısında this olmadan böyle kullanılabilir
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		_id = id; // this.id -> this.id product class'ının id'si / _id dediğimiz değişken ismi
	}*/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0,1) + id;
	}

}
