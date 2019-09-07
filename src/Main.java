import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		int choice;
		Scanner sc = new Scanner(System.in);


		System.out.println("============================" );
		System.out.println("       VEHICLE MARKET        ");
		System.out.println("============================" );
		System.out.println("| Options:                    |");
		System.out.println("| 1. Select a Vehicle Type    |");
		System.out.println("| 2. Select a Brand           |");
		System.out.println("| 3. Select a Model           |");
		System.out.println("| 4. Select a Shape and Color |");
		System.out.println("| 5. View all employees       |");
		System.out.println("| 6. Select default Vehicle   |");

		choice = sc.nextInt();

		switch(choice) {

		case 1 :


			System.out.println("Select a Type");
			System.out.println("1-Automobile");
			System.out.println("2-Motorcycles");
			System.out.println("3-Truck");
			int ch1=sc.nextInt();
			switch(ch1) {


			case 1:
				TypeFactory tf1 = new TypeFactory();
				TypeI  type1 = tf1.getTypeI("Automobile");     //  using same interface for object create
				type1.type();                                           //factory pattern  (creational)
				break;

			case 2:

				TypeFactory tf2 = new TypeFactory();
				TypeI type2 = tf2.getTypeI("Motorcycles");         //factory pattern
				type2.type();
				break;

			case 3:
				TypeFactory tf3= new TypeFactory();	
				TypeI type3=tf3.getTypeI("Truck");              //factory  pattern
				type3.type();
				break;

			}

		case 2:


			System.out.println("Select a Brand");
			System.out.println("1-Toyota");
			System.out.println("2-Bmw");      //------- //bridge pattern (structural)
			int ch2 = sc.nextInt();
			switch(ch2) {
			case 1:
				BrandI b3 = new Toyota();
				b3.brand();
				break;
			case 2:
				BrandI b4 = new Bmw();
				b4.brand();
				break;
			}


		case 3:


			System.out.println("Select Model");
			System.out.println("1-Model A");
			System.out.println("2-Model B");
			System.out.println("3-Model C");
			System.out.println("4-Model D");
			int ch3=sc.nextInt();
			switch(ch3) {

			case 1 :

				BrandI m1= new ModelADecorator(new Toyota());       
				m1.brand();                                    //decorator pattern
				break;                                           

			case 2:
				BrandI m2=new ModelBDecorator(new Bmw());    //
				m2.brand();                                //decorator pattern  (structural)

				break;
			case 3 : 
				ModelState state = new ModelState();   //state pattern
				BrandI modelC = new ModelCState();

				state.setBrandI(modelC);
				state.brand();


				break;
			case 4 : 
				ModelState state1 = new ModelState();    
				BrandI modelD = new ModelDState();    //state pattern   (behavior)
				state1.setBrandI(modelD);
				state1.brand();  

				break;
			}



		case 4:



			System.out.println("Select Shape and Color");
			System.out.println("1-Sedan");
			System.out.println("2-Hatchback");
			int ch4=sc.nextInt();
			switch(ch4) {	

			case 1:
				ShapeBridge s1 = new Sedan(new Blue());          // bridge pattern (structural)
				ShapeBridge s2 = new Sedan(new Red());            
				ShapeBridge s3 = new Sedan(new White());
				s1.paint();                        
				s2.paint();
				s3.paint();                            //objects declared
				break;

			case 2:
				ShapeBridge h1 = new Hatchback(new Blue());     //bridge pattern
				ShapeBridge h2 = new Hatchback(new Red());     //objects declared
				ShapeBridge h3 = new Hatchback(new White()); 
				h1.paint();
				h2.paint();
				h3.paint();
				break;

			}

			break;
		case 5 :


			EmployeesPrototype emps = new EmployeesPrototype();
			emps.loadData();
			EmployeesPrototype empsNew = (EmployeesPrototype) emps.clone();
			EmployeesPrototype empsNew1 = (EmployeesPrototype) emps.clone();

			List<String> list = empsNew.getEmpList();                            // Prototype Design  Pattern (creational)
			list.add("John");
			List<String> list1 = empsNew1.getEmpList();
			list1.remove("Smith");

			System.out.println("emps List: "+emps.getEmpList());
			System.out.println("empsNew List: "+list);
			System.out.println("empsNew1 List: "+list1);

			break;


		case 6 :

			ManageSystem manageSystem = new ManageSystem();                              //facade (structural)
			ManageSystemFacade facadeSystem = new ManageSystemFacade(manageSystem);
			facadeSystem.type();
			facadeSystem.brand();
			facadeSystem.paint();
			break;

		}
		sc.close();
	}
}

























