
public class Payroll {
      //Hasan Özeren 150121036
	  //This program purpose find the payroll for employes and find item count.
	 private int workHour;//We creat workhour.
	   private int itemCount;//We create item count.
	   Payroll(int workHour,int itemCount){//We create constructure .
		      this.workHour=workHour;//We find workhour 
			   this.itemCount=itemCount;//We find item count
		   }
	   public void setWorkHour(int workHour){//Set to number of workhour
		   this.workHour=workHour;
	   }
	   public int getWorkHour() {//Get to number of workhour
		   return workHour;
	   }
	   public void setItemCount(int itemCount) {//Set to number of ýtem count.
		   this.itemCount=itemCount;
	   }
	   public int getWorkhour() {//Get to number of work hour.
		   return workHour;
	   }
		  public int calculateSalary(){//We find salary to use item count and work hour.
			  return (workHour*3)+(itemCount*2);
			   
		   }
		   
			 public int getItemCount() {//Get to number of ýtem COUNT
			return itemCount;
		}
			public String toString() {//We write string use workhour and item count.
				 return  "The work hour is "+workHour+" and the produced item count is "+itemCount+".";		  
			 }
		
			 
	   }
	
  

