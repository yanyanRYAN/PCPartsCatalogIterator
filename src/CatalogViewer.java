
import java.util.*;

public class CatalogViewer {
	ArrayList<Catalog> catalog;
	
	public CatalogViewer(ArrayList<Catalog> catalog) {
		this.catalog = catalog;
	}
	
	void printCatalog(Iterator<?> iterator) {
		while(iterator.hasNext()) {
			CatalogItem catalogItem = (CatalogItem)iterator.next();
			System.out.println(catalogItem.getName() + ":");
			System.out.println("$" + catalogItem.getPrice() + "");
			System.out.println(catalogItem.getDescription() + "\n");
			
		}
	}
	
	public void printCatalog() {
		Iterator<?> catalogIterator = catalog.iterator();
		while(catalogIterator.hasNext()) {
			Catalog catalog = (Catalog)catalogIterator.next();
			printCatalog(catalog.createIterator());
		}
	}
	
}
