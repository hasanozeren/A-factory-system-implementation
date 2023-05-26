
public class Employee {
     //Hasan Özeren 150121036
	//This program purpose create start and finish employee.
	//It provides random id assignment to the produced items.
	private  int id;//We creat id
	private String name;//We creat name
	private String surname;//We create surname
	private int workHour; //We creat workhour
	private int speed;//We create speed
	private  Item[] items;//We create items array object.
	private Payroll payroll;//We create payroll array object.
	Employee(int id, String name, String surname,int workHour, int speed){
		//We create consturecture.This constructure use work hour name string speed to employees. 
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.workHour=workHour;
		this.speed=speed;
	}
     Employee(){
    	 
     }
	public Item[] startShift(){//We start produce item and
		
		items=new Item[workHour*speed];//You find size of array.
		for(int i=0;i<workHour*speed;i++) {//Makes the item object array get values ​​in order
			items[i]= new Item((int)(Math.random()*100));//It provides random id assignment to the produced items.	
		}
		return items;//You get items .	
				}
	    
    public void setWorkHour(int workHour) {//Set to number of workhour
        this.workHour = workHour;
    }

    public void setId(int id) {//Set to number of ıd
        this.id = id;
    }

    public void setItems(Item[] items) {//Set to ıtems array.
        this.items = items;
    }

    public void setName(String name) {//Set to string of name.
        this.name = name;
    }

    public void setPayroll(Payroll payroll) {//Set payrolls.
        this.payroll = payroll;
    }

    public void setSpeed(int speed) {//Set to number of speed.
        this.speed = speed;
      }

      public void setSurname(String surname) {//Set to string of surname
        this.surname = surname;
      }
    
		public int getId() {//Get to number of ıd.
			return id;
			
		}
		
     	public int getWorkHour() {//Get to number of workhour
		return workHour;
	    }
	
	    public String getName() {//Get the string name
		return name;
	    }
	
		public String getSurname() {//Get the string surname
		return surname;
	    }
		
		public int getSpeed() {//Get to number of speed
			return speed;
		}
		
		public Item[] getItems(){//Get to ıtems array.
			return items;
		}
		
		public Payroll getPayroll() {//Get payrolls.
			return payroll;
		}
		
		public Payroll endShift() {//You finish produce items and you calculate payroll
			
			payroll=new Payroll(this.workHour,this.speed*this.workHour);//You create payroll object
			return payroll;
			
		}
		public String toString(){//You return to string.
			return "This is the employee with id "+ id + " speed " + speed + ". " + payroll.toString();
		}
	
}
