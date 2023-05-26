

public class Factory {
	//150121036 Hasan Özeren
	//The purpose of this program is to make factory related settings.
	  private String name;//You create string name
      private Employee[] employees;//You create employees array object.
      Storage storage;//You create storage object.
      Payroll[] payrolls;//You create payrolls array object.
      private double itemPrice;//You create item price
      
      
      public Factory(String name , int  capacity, double itemPrice) {//You create factory constructure.
    	 storage=new Storage(capacity);//You assign the capacity to storage.
    	 this.name=name; 
        this.itemPrice=itemPrice;
      }
     
      public void setName(String name) {//You set the string name
			this.name = name;
	  }

 	  public String getName() {//You get the string name
	  return name;
	  }


	   public void setEmployees(Employee[] employees) {
	   this.employees = employees;
	   }

	  public Employee[] getEmployees() {
	  return employees;
	}
 
	public void setStorage(Storage storage) {
		this.storage = storage;
	   }
	
	public Storage getStorage() {
		return storage;
	}

	public void setPayrolls(Payroll[] payrolls) {
		this.payrolls = payrolls;
	}
	
	public Payroll[] getPayrolls() {
		return payrolls;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
     
     public double getRevenue(){//You find total revenue for this method
    	 Item[] numberOfItems = storage.getItems();//You create object array numberofitems.
         if (numberOfItems == null) //We use this line because we escape null point exception.
         	return 0.0;//If doesnt any items we return 0 revenue.
            else 
         	return numberOfItems.length * itemPrice;//You returns revenue of factory.
       		 
     }
    		public double getPaidSalaries() {//You find salaries for use calculate salary method.
    		
    			double total=0;//You create total salary
    			if(payrolls==null)//You write this line because escape null point exception
    				return 0.0;//If doesnt any salaries return 0.
    			else
    			for(int i=0;i<payrolls.length;i++) {//You coppy of array
    				total=total+payrolls[i].calculateSalary();//You calculate the salary of each array.
    			}
    			return total;//Return total salaries.
    			
    		}

         public void addEmployee(Employee employee) {//We add new employe use this method.
                if(employees==null) {//If we doesnt any employee we create new employee and assign new employee.
                	Employee[] newEmployee=new Employee[1];//We create new employee array array
        			newEmployee[0]=employee;//We assign the employee object.
        			employees=newEmployee;//We assign the employee array employees
        			 Item[] newitems=employee.startShift();//We start the factory and produced ýtem
             		for(int i=0;i<newitems.length;i++) {//We addd ýtem order to storage this method
                         storage.addItem(newitems[i]);
                }
                }
                else {//If we have employee we use this line
                	 Employee[] newEmp = new Employee[employees.length + 1];//We resize array
                     for(int i = 0 ; i < employees.length ; i++) {//We copy of new array
                         newEmp[i] = employees[i];
                     }
                     newEmp[employees.length] =employee;//We assign the employee object
                     employees = newEmp;
                     Item[] newitems=employee.startShift();//We start item produced
            		for(int i=0;i<newitems.length;i++) {//We add the item to storage 
                        storage.addItem(newitems[i]);//add storage
           			}
            		
                }
    	 
     }      
         public Employee removeEmployee(int id) {//We remove employee
             if (employees == null) {//We wite this line because employees if doenst have
                 System.out.println("There are no employees!");//We write this
             return null;//We return
             }

             int employeeList = 0;//We describe employee list
             boolean check = false;//We assignt false
             for (int i = 0 ; i < employees.length ; i++) {//We check the employees ýd this line
                 if (employees[i].getId() == id) {
                     check = true;//
                     employeeList = i;
                 }
             }
                  if (!check) {//If check is worng this line write 
             System.out.println("Employee does not exist!");//We write employe doesnt exist
             return null;
                  }

             Employee[]  newArr = new Employee[employees.length - 1];//We create new array
                  for(int i = 0, j = 0 ; i < employees.length ; i++, j++) {//We copy of the new array
                      if (employees[i].getId() == id)//We copy of the order
                          j--;
                      else
                    	  newArr[j] = employees[i];
             }

             addPayroll(employees[employeeList].endShift());//We finis program and pay to money to employee

             employees =  newArr;//We assign the array
             return null;//We return
         }
         
         private void addPayroll(Payroll payroll) {//You create payroll
             if(payrolls == null) {//We write this line because escape null point exception
                 Payroll[] newArr = new Payroll[1];//You create new array if we doesnt payroll array.
                 newArr[0] = payroll;//We assing this object payroll array.
                 payrolls= newArr;//We assign the payrools array new array.
             }
             else {//If we have array we use this conditional.
                 Payroll[] newArr = new Payroll[payrolls.length + 1];//You create new array
                 for(int i = 0 ; i < payrolls.length ; i++) {//We coppy of payrolls 
                     newArr[i] = payrolls[i];
                 }
                 newArr[payrolls.length] = payroll;//You assign payroll object to  this array.
                 payrolls = newArr;//You assign new array to payrolls.
             }
         }
        	 
         }
            
         
         




