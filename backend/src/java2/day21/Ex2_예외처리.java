package java2.day21;

public class Ex2_예외처리 {
	
	public static void main(String[] args) {
		// p.470 : 다중 catch -> 다양한 예외에 따른 흐름제어 가능
		String[] array = {"100", "1oo"};
		
		for(int i = 0; i <= array.length; i++) {
								// array.length : 2	 -> 인덱스 0~1
			try {
				int value = Integer.parseInt(array[i]); // 알파벳은 숫자로 변환할수 없음 -> 예외 발생( NumberFormatException )
				System.out.println(array[i]);	// 인덱스2는 존재하지 않음 -> 예외 발생( ArrayIndexOutOfBoundsException )
			}catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음 : " + e);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨 : " + e);
			}catch (NullPointerException | ClassCastException e) { // 2가지 예외를 동일하게 처리
				System.out.println("데이터 오류 : " + e);
			}catch(Exception e) { // *상위 예외 클래스는 아래쪽에 작성한다
				System.out.println("예외 발생 : " + e);
			}
		}
		
		
	}

}
