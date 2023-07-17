package algorithm;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 단어의 개수
        
        int groupWordCount = 0; // 그룹 단어 개수 초기화
        
        for (int i = 0; i < N; i++) {
            String word = scanner.next(); // 단어 입력
            
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }
        
        System.out.println(groupWordCount);
    }
    
    private static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26]; // 알파벳 방문 여부 체크
        
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            int index = current - 'a'; // 알파벳 인덱스 계산
            
            if (!visited[index]) {
                visited[index] = true;
            } else {
                // 이전에 이미 방문한 알파벳이라면 그룹 단어가 아님
            	System.out.println(current);
            	System.out.println(i-1);
                if (current != word.charAt(i - 1)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
/*
 * 	happy - > words.get(0)
	new -> words.get(1)
	year -> words.get(2)
	
	words.get(0).charAt(0) -> h
	words.get(0).charAt(1) -> a		-----> h삭제	------> appy
	(appy).indexOf(h)   ----> flase;
	
	words.get(0).charAt(0) -> a
	words.get(0).charAt(1) -> p		-----> a삭제	------> ppy
	(ppy).indexOf(a)   ----> flase;
	
	words.get(0).charAt(0) -> p
	words.get(0).charAt(1) -> p
	words.get(0).charAt(2) -> y		-----> p삭제	------->y
	if(words.get(0).lenth == 1)	----> count++
	
	
	ppp if(j > words.get(0).length - 1)
 */























