package ex02;

import java.util.ArrayList;
import java.util.List;

class PriceInfo {
	private String model;
	private int price;
	
	public PriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public int getPrice() { return price; }
	public String getModel() { return model; }
}

public class StreamExam02 {

	public static void main(String[] args) {
		List<PriceInfo> lists = new ArrayList<PriceInfo>();
		lists.add(new PriceInfo("Toy", 500));
		lists.add(new PriceInfo("Robot", 1500));
		lists.add(new PriceInfo("Box", 700));
		lists.add(new PriceInfo("string", 1200));
		lists.add(new PriceInfo("servlet", 1000));
		lists.add(new PriceInfo("java", 700));
		
		int sum = lists.stream().filter(p->p.getPrice()>500).mapToInt(t->t.getPrice()).sum();
		System.out.println(sum);
		System.out.println("-----------------------------");
		/*
		 * 0. List 데이타 3개 추가..
		 * 1. PriceInfo 클래스 멤버변수 model getter 생성
		 * 2. 필터링조건 : model이 참조하는 문자열 길이가 4이상이면 해당 인스턴스 통과
		 * 3. 맵핑 방법 : PriceInfo 인스턴스 -> String 인스턴스(모델링)
		 * 4. forEach로 2.3 조건 만족하는 인스턴스만 출력
		 */
		lists.stream()
			.filter(m-> m.getModel().length() > 4)
			.map(m -> m.getModel())
			.forEach(s-> System.out.println(s));
		
	}

}







