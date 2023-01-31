package study;

import java.util.HashSet;
import java.util.Set;

// SSAFY_9기_서울_7반
// 스터디 현황(2023.02.01)

public class febStudies {
	public static void main(String[] args) {
		// 서울 7반 명단 'final'
		final String[] class7 = { "김경희", "김남진", "김민우", "김보경", "김용균", "김은솔", "김종혁", "김현수", "남윤정", "문홍웅", "박대균", "박종민",
				"배영석", "변지혜", "손준호", "신택수", "오주영", "유지나", "윤혜민", "이승엽", "이원희", "이주희", "정예지", "정유준", "정의석", "정태희", "조윤영",
				"지하은" };
//		================================================================================
//		 2월 스터디 명단
//		 * study1 : 알고리즘 문제 해결 역량을 키우고, CS 지식을 함양하기 위한 스터디 결성
//		 * study2 : '알고리즘이 뭔지 안다'까지 도달하기. solved.ac 클래스 다 깨기
//		 * study3 : 정처기 필기/실기 대비
//		 * study4 : 알고리즘 스터디
//		 * study5 : 알고리즘 실력 향상. 향후 기업 코딩 테스트 준비와 알고리즘을 통한 자료구조 공부
//		 * study6 : CS 지식 향상, 기업 면접 대비
//		 * study7 : 알고리즘 및 자격증 스터디
		String[] study1 = { "김용균", "김은솔", "박대균", "정의석", "정예지" };
		String[] study2 = { "변지혜", "지하은", "신택수", "이원희", "김민우", "김현수" };
		String[] study3 = { "문홍웅", "변지혜", "배영석", "지하은" };
		String[] study4 = { "김경희", "김종혁", "배영석", "박종민", "윤혜민", "이주희", "정유준" };
		String[] study5 = { "김보경", "배영석", "오주영", "정태희", "조윤영" };
		String[] study6 = { "김보경", "남윤정", "오주영", "정유준", "정태희" };
		String[] study7 = { "유지나", "남윤정" };
//		모든 스터디를 모아놓은 배열
		String[][] studies = { study1, study2, study3, study4, study5, study6, study7 };
//		================================================================================

//		자치회 지원금으로 지원. 중복 지급 X

//		class7Set == 7반 전체 컬렉션 'final'
		final Set<String> class7Set = new HashSet<>();
		for (int i = 0; i < class7.length; i++) {
			class7Set.add(class7[i]);
		}
//		studySet == 스터디 하는 사람만 모아놓은 컬렉션
		Set<String> studySet = new HashSet<String>();
		for (int i = 0; i < studies.length; i++) {
			for (String person : studies[i]) {
				studySet.add(person);
			}
		}
//		2월 지원 명단
		System.out.println("지원 : " + studySet.size() + "명");
		System.out.println(studySet);
//		미지원 명단
		Set<String> tmpSet = new HashSet<>();
		tmpSet.addAll(class7Set);
		tmpSet.removeAll(studySet);
		System.out.println("미지원 : " + tmpSet.size() + "명");
		System.out.println(tmpSet);
	}
}
