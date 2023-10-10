package ex08;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
class Car{
	private String model;
	private String color;
	
	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return (model.hashCode()+color.hashCode());
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		String _model = ((Car)obj).model;
		String _color = ((Car)obj).color;
		
		return 	model.equals(_model) && color.equals(_color)
				? true : false;
	}
	
	@Override
	public String toString() {
		return model + ": " + color;
	}
}

public class SetCollection03 {

	public static void main(String[] args) {
		Set<Car> set = new HashSet<Car>();
		
		set.add(new Car("소나타","흰색"));
		set.add(new Car("그랜저","검정색"));
		set.add(new Car("소나타","검정색"));
		set.add(new Car("제네시스","흰색"));
		set.add(new Car("제네시스","검정색"));
		set.add(new Car("소나타","검정색"));
		
		Iterator<Car> itr = set.iterator();
		
		while(itr.hasNext()) {
			Car c = itr.next();
			System.out.println(c.toString());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
