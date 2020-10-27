import java.util.ArrayList;

public class 모의고사 {

	public static void main(String[] args) {

		int[] answers = { 1, 3, 2, 4, 2 };

		int[] answer = {};

		int count_1 = 0;
		int count_2 = 0;
		int count_3 = 0;

		int[] ansArr_1 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < answers.length; i++) {

			if (answers[i] == ansArr_1[i % 5]) {
				// 정답
				count_1++;
			}
		}

		int[] ansArr_2 = { 2, 1, 2, 3, 2, 4, 2, 5 };

		for (int i = 0; i < answers.length; i++) {

			if (answers[i] == ansArr_2[i % 8]) {
				count_2++;
			}

		}

		int[] ansArr_3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == ansArr_3[i % 10]) {
				count_3++;
			}

		}

//
//		System.out.println(count_1);
//		System.out.println(count_2);
//		System.out.println(count_3);
//		System.out.println();	
//		

		int max = Math.max(Math.max(count_1, count_2),count_3);

		ArrayList<Integer> arr = new ArrayList<>();

		if (max == count_1)
			arr.add(1);
		if (max == count_2)
			arr.add(2);
		if (max == count_3)
			arr.add(3);

		answer = new int[arr.size()];

		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}

		for (int a = 0; a < answer.length; a++) {

			System.out.println(answer[a]);
		}

	}
}
