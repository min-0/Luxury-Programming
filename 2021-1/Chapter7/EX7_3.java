package ch7;

import java.util.*;

public class EX7_3 {
	public static void main(String[] args) {
		//문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> a = new ArrayList<String>();
		
		//키보드로부터 4개의 이름 입력 받아 ArrayList에 삽입
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하라");
			String s = sc.next(); //키보드로부터 이름을 입력
			a.add(s); //ArrayList 컬렉션에 삽입
		}
		
		//ArrayList에 들어 있는 모든 이름 출력
		for (int i=0; i<4; i++) {
			String name = a.get(i); //ArrayList의 i번째 문자열 얻어오기
			System.out.print(name + " ");
		}
		
		//가장 긴 이름 출력
		int longestIndex = 0; //현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) //이름 길이 비교
				longestIndex = i; //i번째 이름이 더 긴 이름임
		}
		System.out.println("\n가장 긴 이름은 " + a.get(longestIndex));
		sc.close();
	}
}
