
public class Item {
	//Hasan �zeren 150121036.
	//This program purppose get �tem and �d and find of total number of items.
	private int id;//We create id.
	public static int numberOfItems;//We create items number static because we use all classes.
	Item(int id){//We create constructure to use id.
		this.id=id;//If we create items this id we get. 
		numberOfItems++;//If we create items we increase number of items.
	}
	public int getNumberOfItems() {//get to number of �tems.
        return numberOfItems;
    }
	  public void setNumberOfItems(int numberOfItems) {//Set to number of �tems.
	        this.numberOfItems = numberOfItems;
	    }
	public int getId() {//get to number of �d.
		return id;
	}
	public void setId(int id) {//Set to number of �d.
		this.id=id;
	}
}
