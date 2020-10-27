import java.util.ArrayList;
import java.util.Collections;

public class 두_개_뽑아서_더하기 {

	
	public static void main(String[] args) {
		
		
		
		int[] numbers= {2,1,3,4,1};
		
		 int[] answer = {};
		 
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> ansList=new ArrayList<>();
		
		for(int i = 0 ; i<numbers.length;i++) {
			
			for(int j  = 0 ;j<numbers.length;j++) {
				
				if(i==j)continue;
				list.add(numbers[i]+numbers[j]);
				
			}
			
			
		}
		
		Collections.sort(list);
		
		for(int a : list) {
			System.out.print(a+" ");
		}
		
	     for(int item : list){
	            if(!ansList.contains(item))
	            	ansList.add(item);
	        }
	     
	     System.out.println();
	 	for(int a : ansList) {
			System.out.print(a+" ");
		}
	
	 	
	 	
	 	
	}
	
	
	
	
//	import java.util.ArrayList;
//	import java.util.Collections;
//
//
//	class Solution {
//	    public int[] solution(int[] numbers) {
//	        
//	        
//	     
//	        
//		ArrayList<Integer> list = new ArrayList<>();
//			ArrayList<Integer> ansList=new ArrayList<>();
//	        
//	        
//		for(int i = 0 ; i<numbers.length;i++) {
//				
//				for(int j  = 0 ;j<numbers.length;j++) {
//					
//					if(i==j)continue;
//					list.add(numbers[i]+numbers[j]);
//					
//				}
//				
//				
//			}
//	        
//	        		Collections.sort(list);
//	             for(int item : list){
//		            if(!ansList.contains(item))
//		            	ansList.add(item);
//		        }
//	        
//	        int count=0;
//	           int[] answer =new int[ansList.size()];
//	        
//	        for(int item : ansList){
//	            
//	            answer[count]=item;
//	            count++;
//	            
//	            
//	        }
//	        
//	        
//	        return answer;
//	    }
//	}
	
	
	

}
