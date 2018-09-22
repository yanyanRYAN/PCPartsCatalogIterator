
import java.util.*;

public class PCPartsCatalogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Major League Gaming PC Catalog \n\n");
		PartsCatalog partsCatalog = new PartsCatalog();
		ArrayList<Catalog> catalogs = new ArrayList<Catalog>();
		catalogs.add(partsCatalog);
		CatalogViewer catalogViewer = new CatalogViewer(catalogs);
		catalogViewer.printCatalog();
		
		
	}

}
