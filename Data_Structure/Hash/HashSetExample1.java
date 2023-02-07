package Data_Structure.Hash;

import java.util.HashSet;

class HashSetExample1 {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();	//집합으로 사용할 HashSet 객체를 생성.
		
		set.add("자바");		// 집합에 데이터를 저장.
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");	
		System.out.println("저장된 데이터의 수 = " + set.size());
		
//		Iterator<String> iterator = set.iterator();		//집합에 있는 데이터를 모두 가져와서 출력.
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			System.out.println(str);
//		}
		for (String str : set) {
			System.out.println(str);
		}
	}
}
