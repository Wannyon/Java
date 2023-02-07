package Data_Structure.Hash;

import java.util.HashMap;

class HashMapExample2 {
	public static void main(String args[]) {
		HashMap<Name, Integer> hashtable = new HashMap<Name, Integer>();
		hashtable.put(new Name("해리", "포터"), 95);
		hashtable.put(new Name("헤르미온느", "그레인져"), 100);
		hashtable.put(new Name("론", "위즐리"), 85);
		hashtable.put(new Name("드레이코", "말포이"), 93);
		hashtable.put(new Name("네빌", "롱버텀"), 70);
		Integer num = hashtable.get(new Name("헤르미온느", "그레인져"));
		System.out.println("헤르미온느 그레인져의 성적은? " + num);
		System.out.println();

		/*hashCode 메소드*/
		Name obj1 = new Name("헤르미온느", "그레인져");
		Name obj2 = new Name("헤르미온느", "그레인져");
		int hash1 = obj1.hashCode();	// 객체의 주소의 해쉬코드를 사용.
		int hash2 = obj2.hashCode();	// Name 클래스가 Object 클래스로부터 상속받은 hashCode 메소드를 그대로 사용하기 때문.
		System.out.println(hash1);		// Name 클래스에서 오버라이딩 필요.
		System.out.println(hash2);
	}
}