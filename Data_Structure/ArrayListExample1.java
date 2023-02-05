package Data_Structure;

import java.util.ArrayList;

class ArrayListExample1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");	// 중간 삽입.
		list.set(0, "오렌지");	// 데이터 교체.
		list.remove(2);	// 0123~ 위치에 있는 데이터 삭제.
		list.remove("복숭아");	// 0인덱스부터 검사해서 데이터를 찾아 삭제(한개만).
		int num = list.size();
		
//		for (int cnt = 0; cnt < num; cnt++) {
//			String str = list.get(cnt);
//			System.out.println(str);
//		}
		for (String str : list) {	// 향상된 for문
			System.out.println(str);
		}
	}
}