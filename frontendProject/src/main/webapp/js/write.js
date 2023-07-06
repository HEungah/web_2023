console.log('js 파일 실행');

/*섬머노트를 실행할때 사용하는 코드*/
$(document).ready(function() {
  $('#summernote').summernote({
	  
	  lang : 'ko-KR', // 한글 적용[ 한글.JS CDN필요]
	  height : 500,
	  placeholder : '여기에 내용 작성'
	  
  });
});

// ----------------------------------------------------

// 로그인제 게시판[로그인 했다는 가정하에 로그인된 아이디를 가정하여 변수에 저장]
let loginId = 'blue1234';

/*
	브라우저 저장소 : 1. 세션 2. 쿠키
		세션 : 모든 브라우저 꺼지면 초기화
		쿠키 : 모든 브라우저/OS 꺼져도 유지 / 직접 쿠키 삭제하기 전까지 유지
	- 사용방법 = JS에서 객체 제공 (키와 값으로 이루어진 객체)
		seesionStorage -> 세션
			seesionStorage.setItem('키', 값)	: 해당 값을 '키'라는 이름으로 저장
			seesionStorage.getItem('키')	: 해당 키를 호출하면 저장된 값 호출
			seesionStorage.clear()	: 삭제
			
		localStorage -> 쿠키
			localStorage.setItem('키', 값)	
			localStorage.getItem('키')	
			localStorage.clear()

*/

// 등록 함수 [ 실행조건 : 등록 버튼을 클릭했을때 ]
function onWrite(){
	// 입력받은 값을 가져온다.
	let title = document.querySelector('.title').value;
	let content = document.querySelector('#summernote').value;
	
	console.log(title);
	console.log(content);
	
	// 유효성 검사를 한다.

	// 해당 객체를 배열에 저장한다.
		// 1. 기존에 쿠키에서 게시물들이 저장된 게시물배열을 호출한다.
	let boardList = JSON.parse(localStorage.getItem('boardList'));
		// 2. 만약에 쿠키가 존재하지 않으면[객체가 없으면 null]
	if(boardList == null){boardList = []} // 쿠키가 없으면 빈배열 생성
	// 입력받은 값이 여러개 이면 객체화
	// 마지막 게시물 번호에 +1을 해준다.
	console.log(boardList.length)
	let no = (boardList.length == 0 ? 1 : boardList[boardList.length-1].no+1);

	let board = {
		title : title,	//	입력받은 값
		content : content,	// 입력받은 값
		no : no,			// 게시물 번호[마지막 게시물 +1]
		date : `${new Date().getFullYear()}-${new Date().getMonth()}-${new Date().getDate()}`,
		view : 0,	// 게시물 조회수 0부터 시작
		like : 0,	// 게시물 추천수 0부터 시작
		writer : loginId	// 게시물 작성자
	}
	
		// 3. 위에서 생성된 board를 boardList에 저장
	boardList.push(board);
		// 4. boardList를 다시 쿠키에 저장한다.
	localStorage.setItem('boardList', JSON.stringify(boardList));			
		// 5. 확인
	console.log(localStorage.getItem('boardList'));	
		// 6. 글쓰기 성공 했으면 페이지 전환
	alert('글쓰기 성공');
		// HTML : <a href="#"></a>
		// JS : location.href="경로"
	location.href="list.jsp";		
	
	
	
	
	
	/*// 세션/쿠키 -> 브라우저/pc에 저장 (JS외 저장 가능하다) -> JS 새로고침해도 유지
	sessionStorage.setItem('세션',1);
	localStorage.setItem('쿠키',2);
	// 세션과 쿠키는 문자형태로밖에 저장하지 못한다.
	-JSON : JS 객체 문법으로 구조화된 데이터를 표현하기 위한 문자 기반의 포멧[형식]
		- 구조(모양)는 객체/배열 인데 포멧[형식/자료형/타입]은 문자형태
		-
			{id : 'qwe', pwd : '123'} -> JSON : "{id : 'qwe', pwd : '123'}"
		- 사용방법
			1. JSON.parse() -> 문자타입을 객체/배열로 변환
			2. JSON.stringify() -> 객체/배열 타입을 문자타입으로 변환
		
		
	console.log(sessionStorage.getItem('세션'));
	console.log(localStorage.getItem('쿠키'));*/
}

















