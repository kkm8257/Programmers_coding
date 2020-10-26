import java.util.Stack;

public class kakao2_success {

	public static void main(String[] args) {

		
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer=0;
		
		Stack<Integer> stack = new Stack<>();
		
	
		for(int moves_i = 0 ; moves_i<moves.length;moves_i++ ) {

//			//System.out.println("뽑기전");
//			for(int a = 0 ; a<board.length;a++) {
//				
//				for (int b = 0 ;b< board[a].length;b++) {
//					//System.out.print(board[a][b]+ " ");
//					
//				}
//				//System.out.println();
//			}
			
			
			
			for(int board_i=0;board_i<board.length;board_i++) {
				
				
				
				if(board[board_i][moves[moves_i]-1]!=0) {
					
					//0이 아니면 ,즉 값이 있으면
					if(stack.empty()) {//비어있으면 그냥 삽입
			
						stack.push(board[board_i][moves[moves_i]-1]);

//						//System.out.println("스택에 첫값 삽입");
//						//System.out.println("peek : "+stack.peek());
//						//System.out.println("뽑은 값 : "+board[board_i][moves[moves_i]-1]);
						board[board_i][moves[moves_i]-1]=0;
						break;
						
						
					}
					else {//비어있지않으면 비교
						//System.out.println("비교");
						
						if(stack.peek()==board[board_i][moves[moves_i]-1]) {
							//피크값이랑 같으면 삭제
							//System.out.println("삭제");

							//System.out.println("peek : "+stack.peek());
							//System.out.println("뽑은 값 : "+board[board_i][moves[moves_i]-1]);
							
							stack.pop();
					
							answer=answer+2;
							board[board_i][moves[moves_i]-1]=0;
							break;
							
						}
						else {
							//같지않으면

							//System.out.println();
							
							
							stack.push(board[board_i][moves[moves_i]-1]);
							//System.out.println("넣은 값 : "+board[board_i][moves[moves_i]-1]);
							//System.out.println("peek : "+stack.peek());
							board[board_i][moves[moves_i]-1]=0;
							break;
							
						}
				
					}
	
				}
				
			}
		
			
//			//System.out.println("뽑기후");
//			for(int a = 0 ; a<board.length;a++) {
//				
//				for (int b = 0 ;b< board[a].length;b++) {
//					//System.out.print(board[a][b]+ " ");
//					
//				}
//				//System.out.println();
//			}
//			
			
		}
		
		
		
		
		
		System.out.println("답:"+answer);
		
		
	}
	
	
	

}
