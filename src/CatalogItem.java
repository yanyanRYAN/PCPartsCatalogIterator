
public class CatalogItem {
	String partName;
	String description;
	double price;
	
	public CatalogItem(String partName, String description, double price) {
		this.partName = partName;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return partName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Double getPrice() {
		return price;
	}
	
}
