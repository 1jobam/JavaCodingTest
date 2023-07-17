package lvl1;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습 > 스택/큐 >같은 숫자는 싫어
 * 프로그래머스
 * @author 박종민
 *
 */
public class java01 {
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		new Solution().solution(arr);
	}
	
	public static class Solution {
	    public int[] solution(int []arr) {
	        int[] answer = {};
	        
	        List<Integer> arrList = new ArrayList<>();
	        
	        int j = -1;
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i] >= 0 && arr[i] <= 9){
	                if(arr[i] != j){
	                    arrList.add(arr[i]);
	                }
	                j = arr[i];        
	            }
	        }
	        
	        answer = arrList.stream().mapToInt(Integer::intValue).toArray();

	        return answer;
	    }
	}
}

