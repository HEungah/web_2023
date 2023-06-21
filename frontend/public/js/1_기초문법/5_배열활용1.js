// 1. 배열선언 : '학생리스트' 배열명으로 비어있는 배열 선언
let 학생리스트 = []		// 초기에는 배열에 아무것도 없음

// 2. 이벤트 : 무엇인가가 실행
	// onclick : 온클릭 이벤트 [클릭했을때 이벤트 실행]
	// 이벤트 함수[코드들이 모여있는 주머니/공간/집합]
		// 함수 형태 : function 함수명(매개변수){ } => 미리 정의된 코드
function 추가함수(){	// function start
	// 1. input에서 입력받은 데이터 가져오기
	let snameInput = document.querySelector(".sname")
		// document : 문서(html)객체
		// query : 쿼리(질의)
		// Selector : 선택자(id, class, 마크업 등)
			// 1. document.querySelector(".sname") : sname 이라는 class명 가진 input 객체 호출
			// 2. 호출된 input 객체를 'sname' 변수에 담았다.
	// 2. 입력받은 데이터 가져오기
	let name = snameInput.value	
			// 3. 변수명.value : 입력된 값 호출
	// 3. 입력받은 데이터를 배열에 추가
	let index = 학생리스트.indexOf(name)
	index != -1 ? alert('중복데이터 입니다') : 학생리스트.push(name)
			// 4. 배열명.push(데이터) : 해당 데이터를 배열에 추가
	// 4. 배열 출력
		// document.write(학생리스트)		// 문서에 해당 데이터를 쓰기(기존데이터는 삭제)
		// 1. ul 객체 호출
	let slistUl = document.querySelector(".slist")
		// 2. 해당 ul 객체에 쓰기
	slistUl.innerHTML = '<li>' + 학생리스트 + '</li>'
		// innerHTML : <>(inner)</>
	// *현재 <input> 객체 입력값 초기화
	snameInput.value = ''
		
}	// function end

/*
	document.querySelector(".className") : 해당 class명을 가진 DOM 객체 호출
	DOM객체.value : 입력된 데이터호출(input, textarea 등등)
	DOM객체.innerHTML : 마크업 사이에 HTML 형식 추가(div, span, td, ul 등등)]
	
	배열
	1. let 배열 = []
	2. 배열.push(데이터)
*/

// 3.삭제 함수
function 삭제함수(){
	// 입력받은 데이터 삭제
	
	// 1. <input> 객체 호출
	let snameInput = document.querySelector('.sname')
	// 2. <input> 객체의 value 속성 호출
	let name = snameInput.value
	// 3. 삭제하려는 데이터 인덱스 찾기
	let index = 학생리스트.indexOf(name)
		// 해당 데이터가 배열에 존재하면 0~찾을번호 없으면 -1
	// 4. 데이터 삭제
	index != -1 ? 학생리스트.splice(index, 1) : alert('데이터없음!')
	// * 유혀성검사 : 개발자가 원하는 데이터인지 검사
	// 결과물 출력
	
	// 5. 배열 출력
	let slistUl = document.querySelector(".slist")
		// 2. 해당 ul 객체에 쓰기
	slistUl.innerHTML = '<li>' + 학생리스트 + '</li>'
		// innerHTML : <>(inner)</>
	// *현재 <input> 객체 입력값 초기화
	snameInput.value = ''	
}// function end















