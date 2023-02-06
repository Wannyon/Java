package Data_Structure;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {	// head부터 따라가야하기 때문에 검색에 시간이 걸린다.
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		int num = list.size();
//		for (int cnt = 0; cnt < num; cnt++) {
//			String str = list.get(cnt);
//			System.out.println(str);
//		}
		
//		Iterator<String> iterator = list.iterator(); 
//		 while (iterator.hasNext()) { // NoSuchElementException의 발생 방지.
//		 String str = iterator.next(); 
//		 System.out.println(str); 
//		 } 
		
		for (String str : list)		// Iterator 객체 생성. 위와 같은 표현
			System.out.println(str);	// 순차자료구조 형태로 나타낼 수 있다.
	}

}
