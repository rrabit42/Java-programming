package week11;
import java.util.*;

public class week11_2_김서영 {

	public static void main(String[] args) {
		//필요한 변수들
		  //hashmap
		Map<String, String> stumap = new HashMap<String, String>();
		  //키보드 입력
		Scanner kbd = new Scanner(System.in);
		  //학생 ID, 이름
		String ID, Name;
		  //최대, 최소 길이 담을 변수
		int maxLen, minLen;
		  //최대, 최소 길이의 이름을 value로 가진 id 변수
		String maxId, minId;
		
		//사용자에게 학생ID와 이름 입력받기
		System.out.println("학생의 ID와 이름을 차례로 입력하세요. (종료시 0 0 입력)");
		
		//0 0 입력받을 때까지 사용자에게 학생 정보 계속 입력받기
		while(true) {
			//ID 입력받기
			ID = kbd.next();
			//이름 입력받기
			Name = kbd.next();
			//0 0일 때 반복문 탈출
			if(ID.equalsIgnoreCase("0") && Name.equalsIgnoreCase("0")) break;
			//0 0이 아니면 map에 값 추가
			stumap.put(ID, Name);
		}
		
		//keyset
		Set s = stumap.keySet();
		//set 값 하나씩 가져오기 위해 iterator 사용
		Iterator<String> it = s.iterator();
		
		//학생명단 출력
		System.out.println("<학생명단>");
		System.out.println("[ID]\t\t[NAME]");
		//값이 있으면 iterator를 이용해 값 불러오기
		while(it.hasNext()) {
			//id 값 하나 가져와서
			String id = it.next();
			//id와 value(이름) 출력
			System.out.println(id+"\t\t"+stumap.get(id));
		}
		
		//다시 iterator 초기화
		it = s.iterator();
		//그리고 maxId, minId 초기화
		maxId = it.next();
		minId = it.next();
				
		//전체 학생수 출력
		System.out.println("\n\n전체 학생수:"+s.size());
		
		//최대 길이의 이름과 최소 길이의 이름 구하기
		maxLen = stumap.get(maxId).length();
		minLen = stumap.get(minId).length();
		
		//iterator 초기화
		it = s.iterator();
		//모든 값을 비교해서 최대 길이와 최소 길이와 그 것의 id 찾기
		while(it.hasNext()) {
			//id 하나 가져오기
			String j = it.next();
			//각 id마다 비교해서 최대 길이와 그 id 찾기
			if(maxLen < stumap.get(j).length()) {
				maxLen = stumap.get(j).length();
				maxId = j;
			}
			//최소 길이와 그 id 찾기
			if(minLen > stumap.get(j).length()) {
				minLen = stumap.get(j).length();
				minId = j;
			}
		}
		
		//가장 긴 이름을 가진 학생 정보 출력
		System.out.println("<가장 긴 이름을 가진 학생>");
		System.out.println("ID:"+maxId+"\tName:"+stumap.get(maxId)+"\t길이:"+maxLen);
		//가장 짧은 이름을 가진 학생 정보 출력
		System.out.println("<가장 짧은 이름을 가진 학생");
		System.out.println("ID:"+minId+"\tName:"+stumap.get(minId)+"\t길이:"+minLen);
	}

}
