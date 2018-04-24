package by.epam.jb24.less08.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<goodItem> goods = new ArrayList<goodItem>();
	
	public List<goodItem> getGoods() {
		return goods;
	}
	
	public void printList() {
		for(goodItem item : goods){
			System.out.println(item.toString());
		}
	}
	
	public boolean add(goodItem item) {
		return goods.add(item);
	}
	
	public boolean delete(goodItem item) {
		return goods.remove(item);
	}
	
	public goodItem findByDescription(String desc){
		for(goodItem item : goods){
			if (item.getDescription().equals(desc)){
				return item;
			}
		}
		return null;
	}
}
