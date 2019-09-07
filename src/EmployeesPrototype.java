
import java.util.ArrayList;
import java.util.List;
public class EmployeesPrototype implements Cloneable {

	private List<String> empList;

	public EmployeesPrototype(){            
		
		empList = new ArrayList<String>();      //array list created
	}

	public EmployeesPrototype(List<String> list){
		this.empList=list;                              //constructor
	}
	public void loadData(){
                                        
		empList.add("Fred");
		empList.add("Sabrina");
		empList.add("David");
		empList.add("Ben");
	}

	public List<String> getEmpList() {
		return empList;
	}

                                                                
	public Object clone() throws CloneNotSupportedException{

		List<String> temp = new ArrayList<String>();    // clone method is overridden to provide a deep copy of the employees list
                                                              
		for(String s : this.getEmpList()){
			temp.add(s);
		}
		return new EmployeesPrototype(temp);
	}

}

