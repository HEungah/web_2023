package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC연동 {
	public static void main(String[] args) {
		
		try {
		// --------------------------------예외가 발생할것 같은 코드들-----------------------------
			
			// 1. p.908 : 현재 프로젝트에 JDBC 파일을 build path add하기
			// 2. p.909 : DB연결하기 위해 JDBC Driver 클래스를 찾아서 메모리 로딩 하기
			//	Class.forName("oracle.jdbc.OracleDriver");  ---> oracle
			Class.forName("com.mysql.cj.jdbc.Driver");
				// 만약에 해당 JDBC 드라이버 클래스가 검색이 실패하면 예외발생 -> 예외처리 필요
			//Connection conn = DriverManager.getConnection("DB주소", "root", "1234");
				// 1. DB주소 : jdbc:mysql://ip주소:port번호/db명
							// 1) jdbc:oracle:thin:@localhost:1521/orcl	-> oracle
							// 2) jdbc:mysql://localhost:3306/orcl	-> mysql
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb4web", "root", "1234");
			System.out.println("안내) 연동 성공");
			
		// -------------------------------------------------------------------------------------	
		// --------------만약에 try{}에서 예외가 발생했으면 실행되는 catch{} 코드-------------
		} catch(Exception e) {
			
			System.out.println("안내) 연동실패 사유 : " + e);
		}	// catch end
		// ----------------------------------------------------------------------------------
	}
}




/*
  	예외처리 :
  		- Exception 클래스
  		- 예외[오류] 발생했을때 흐름 제어 (만약에 오류가 발생했을때 다른 코드로 흐름을 제어함)
  		- try{} catch{}
  			try{ 예외[오류]가 발생할것 같은코드 }
  			catch(예외클래스명 객체변수명){예외가 발생했을때 실행할코드}
  			
  			* try{} 안에서 예외가 발생하는 순간 바로 catch로 이동하기 때문에 예외발생한 코드 아래로는 실행x
  			
  		- 예외[오류]가 발생할것 같은코드
  			- 일반예외 : 컴파일 과정에서 발생하는 예외 [ 컴파일이 체크함 ]  --> 미리 처리가능(파일처리, DB연동, 입출력 등등)
  			- 실행예외 : 실행도중에 발생하는 예외 [ 개발자 경험으로 판단 ] --> 실행중 각종 오류 [ 타입에러, 인덱스부족, ... ]
  			
  	DB연동/조작에 필요한 클래스/인터페이스
  		0. DriverManager				: 연동 DB객체 생성 클래스
  		1. Connection					: PreparedStatement 필요한 객체 생성
  		2. PreparedStatement		: SQL의 DDL DML 문 실행할때
  		3. ResultSet					: DB에서 가져온 데이터를 읽을때
  	
  	
  
  
 */ 























