package Data_Structure.Hash;

import java.util.HashMap;

class HashMapExample1 {
	public static void main(String args[]) {
		HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
		hashtable.put("해리", 95);
		hashtable.put("헤르미온느", 100);
		hashtable.put("론", 85);
		hashtable.put("드레이코", 93);
		hashtable.put("네빌", 70);
		Integer num = hashtable.get("헤르미온느");
		System.out.println("헤르미온느의 성적은? " + num);

		/*hashCode 메소드*/
		String obj1 = new String("헤르미온느");	// 다른 객체라도 내용이 같으면 같은 해쉬코드 값을 가진다.
		String obj2 = new String("헤르미온느");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
	}
}
