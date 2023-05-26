
public class Storage {
	//Hasan Özeren 150121036
	//The purpose of the program is to store the produced items.
	private  int capacity;//You create capacity
	  private Item[] items;//You create ýtem arrays.
	  
	  Storage(int capacity){//You create constructure and this constructure use capacity.
		  this.capacity=capacity;
		  getItems();
	  }
	  public void setCapacity(int capacity) {//Set the number of capacity
		  this.capacity=capacity;
	  }
	  public int getCapacity() {//Get the number of capacity
		  return capacity;
	  }
	  public void setItems(Item[] items) {//Set the number of items object array
		  this.items=items;
	  }
	  public Item[] getItems() {//Get the number of items object array
		  
		  return items;
		  
	  }
	  
	public void addItem(Item item) {//Thi methos add ýtem storage.
		if(items==null) {//This line escape null point exception
			Item[] newItem=new Item[1];//We array copy 29 30 31 line
			newItem[0]=item;
			items=newItem;
		}
		else {	//We resize array and add ýtem.
			 Item[] newArr = new Item[items.length + 1];//We create new array
		        for(int i = 0 ; i < items.length ; i++) {//We copy of array
		            newArr[i] = items[i];
		        }
		        
		        newArr[items.length] = item;//We add this item array
		        items=newArr;//We assigned new array normal items.
		}
	}
}
