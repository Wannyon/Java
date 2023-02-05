package Object_ex;
import java.util.Scanner;

public class Sungjuk implements Cloneable {
	String hakbun, irum;
	int kor, eng, math, tot;
	double avg;
	String grade;
	
	static int cnt = 0;
	static double tot_avg = 0.0;
	
	Sungjuk(){
	}
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 => ");
		hakbun = scan.next();
		System.out.print("이름 입력 => ");
		irum = scan.next();
		System.out.print("국어 입력 => ");
		kor = scan.nextInt();
		System.out.print("영어 입력 => ");
		eng = scan.nextInt();
		System.out.print("수학 입력 => ");
		math = scan.nextInt();
	}
	
	void process()
	{
		tot = kor + eng + math;
		avg = tot / 3.;
		
		switch ((int)avg / 10) {
			case 10:
			case 9:
				grade = "수";
				break;
			case 8:
				grade = "우";
				break;
			case 7:
				grade = "미";
				break;
			case 6:
				grade = "양";
				break;
			default:
				grade = "가";
				break;
		}
	}
	
	void output()
	{
		System.out.printf("%4s  %3s  %3d   %3d   %3d   %3d  %5.2f  %2s\n",
				hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	
	static double getTotal_avg() {
		return tot_avg / cnt;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Sungjuk))	// instanceof : 캐스트 연산의 가능 유무에 따라 true/false 반환.
			return false;
		Sungjuk sungjuk = (Sungjuk) obj;
		if (this.hakbun.equals(sungjuk.hakbun) && 
			this.irum.equals(sungjuk.irum) &&
			this.kor == sungjuk.kor &&
			this.eng == sungjuk.eng &&
			this.math == sungjuk.math)
			return true;
		else
			return false;
	}
	
	public String toString() {
		String str = "학번:" + this.hakbun + "\n";
		str += "이름:" + this.irum + "\n";
		str += "국어:" + this.kor + "\n";
		str += "영어:" + this.eng + "\n";
		str += "수학:" + this.math + "\n";
		str += "총점:" + this.tot + "\n";
		str += "평균:" + this.avg + "\n";
		str += "등급:" + this.grade + "\n";
		return str;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} 
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}