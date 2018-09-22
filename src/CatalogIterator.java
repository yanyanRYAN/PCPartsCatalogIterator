
import java.util.Iterator;

public class CatalogIterator implements Iterator<CatalogItem> {
	
	CatalogItem[] itemList;
	int pos = 0;
	
	public CatalogIterator(CatalogItem[] itemList) {
		this.itemList = itemList;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(pos >= itemList.length || itemList[pos] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public CatalogItem next() {
		// TODO Auto-generated method stub
		CatalogItem catalogItem = itemList[pos];
		pos++;
		return catalogItem;
	}

}
