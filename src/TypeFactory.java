
public class TypeFactory {

public TypeI  getTypeI(String shapeType){
		
		if(shapeType == null){
			
		return null; }
		
		if(shapeType.equalsIgnoreCase("Automobile")){
			
		return new Automobile(); }
		
		else if(shapeType.equalsIgnoreCase("Motorcycles")){
			
		return new Motorcycles(); }
		
		else if(shapeType.equalsIgnoreCase("Truck")) {
			return new Truck();
			
		}
		
			return null; } }