import java.util.Iterator;

public class PartsCatalog implements Catalog{
	final int MAX_PARTS = 8;
	int numParts = 0;
	CatalogItem[] catalogItems;
	
	public PartsCatalog() {
		catalogItems = new CatalogItem[MAX_PARTS];
		addItem("Nvidia GTX 1080ti", "High End Nvidia GPU", 699.99);
		addItem("AMD VEGA 64", "High End AMD GPU", 499.99);
		addItem("AMD R7 2700x", "8-core AMD CPU", 299.99);
		addItem("16GB Gskill DDR4 3200Mhz", "High Speed DDR4 2x8GB Kit", 149.99);
		addItem("ASUS x470F Motherboard", "Mid End AMD AM4 x470 Motherboard", 199.99);
		addItem("500GB Samsung 960Evo", "NVME SSD", 149.99);
		addItem("8TB WD REDs", "NAS grade hard drive", 199.99);
		addItem("EVGA SuperNOVA 850 G2", "80+ Gold rated 850watt Power supply", 110.99);
	}
	
	public void addItem(String partsName, String description, double price) {
		CatalogItem catalogItem = new CatalogItem(partsName,description, price);
		
		catalogItems[numParts] = catalogItem;
		numParts++;
		
	}
	
	public CatalogItem[] getCatalogItems() {
		return catalogItems;
	}
	
	
	
	public Iterator<CatalogItem> createIterator() {
		// TODO Auto-generated method stub
		return new CatalogIterator(catalogItems);
	}

}
