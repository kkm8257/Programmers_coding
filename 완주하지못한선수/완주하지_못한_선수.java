import java.util.ArrayList;
import java.util.Collections;

public class 완주하지_못한_선수 {

	public static void main(String[] args) {

		String[] participant = {"mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };

		ArrayList<String> part_list = new ArrayList<>();
		ArrayList<String> com_list = new ArrayList<>();

		String answer;
		
		for (int i = 0; i < participant.length; i++) {

			part_list.add(participant[i]);

		}

		for (int i = 0; i < completion.length; i++) {

			com_list.add(completion[i]);

		}

		Collections.sort(part_list);
		Collections.sort(com_list);
		
		
		for (int j = 0; j < part_list.size(); j++) {

			System.out.println(part_list.get(j));

		}
		
		System.out.println();
		for (int j = 0; j < com_list.size(); j++) {

			System.out.println(com_list.get(j));

		}
		boolean isEnd=true;
		
		int temp = 0;
		
		for(int i = 0 ; i<com_list.size();i++) {
			
			if(!part_list.get(i).equals(com_list.get(i))) {
				temp=i;
				isEnd=false;
				break;
			}
		
		}
		
		
		
		if(isEnd) {
			answer=part_list.get(part_list.size()-1);
	System.out.println("aa");
		}
		
		else {
			answer= part_list.get(temp);
			
		}
		
		System.out.println("답 : "+answer);
		
		

	}

}
