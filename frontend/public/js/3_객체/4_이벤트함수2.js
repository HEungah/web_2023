/*

	이벤트함수
	HTML 이벤트 적용하는 방법
	1.
		<태그 이벤트속성명="함수명()"></태그명>
	2.	
		document.addEventListener(이벤트명, 함수명)	// 기존 함수 적용
		document.addEventListener(이벤트명, (인수) => {실행코드정의})	// 익명 화살표 함수 정의해서 적용
		document.addEventListener(이벤트명, function(){})	// 익명 함수 정의해서 적용
		
			document.addEventListener(이벤트명, (이벤트결과인수=e,event) => {})
	이벤트
		이벤트명
		1. DOMcontentLoaded : HTML이 완전히 열렸을때 실행되는 이벤트
		2. window.onload	: 해당 객체가 호출 되었을때
		3. click	: 해당 객체를 클릭했을때
		4. keyup	: 해당 객체에서 키보드를 누르고 떼었을때
		5. keydown	: 해당 객체에서 키보드를 눌럿을때
			- key 상태 확인

*/

// 1.
let text = document.querySelector('.textbox');
text.addEventListener('keyup', (event) => {
	console.log('키보드 입력하고 뗴었을때');
	
	let h3 = document.querySelector('.h3box')
	
	console.log(text.value.length);
	
	h3.innerHTML = `입력된 문자 길이 : ${text.value.length}`;
	// 1. 키 상태 확인	-> 키보드 제어 가능
	console.log(event);
	console.log(event.altKey);	// alt를 눌렀는지?
	console.log(event.ctrlKey);	// ctrl을 눌렀는지?
	console.log(event.shiftKey);	// shift를 눌렀는지?
	console.log(event.code);	// 입력된 키보드의 코드네임
	console.log(event.key);		// 입력한 키
	console.log(event.keyCode);		// 입력된 키보드의 코드번호
	// 만약에 키보드에서 엔터를 쳤을때
	if(event.keyCode == 13){
		alert('엔터를 입력했습니다.');
	}
})

// 2.
let moving = document.querySelector('.moving');	// 1. 버튼 태그 호출
moving.style.position = `absolute`;	// 2. style 속성 이용한 css 추가
	// DOM객체명.style = `속성명 : 값, 속성명 : 값`;
	// DOM객체명.style.css속성명 = `값`;		주의할점 : css속성명 작성시 카멜표기법 사용
	//		DOM객체명.style.backgroundColor = `blue`; JS는 속성명에 - 사용금지
	
	// *버튼 위치의 초기값 x=가로축, y=세로축, block=이동단위(30px씩 이동)
	let x = 7; let y = 7; let block = 30;
// 1. 버튼 위치 출력 함수
movingPrint();
function movingPrint(){
	moving.style.left = `${x*block}px`;
	moving.style.top = `${y*block}px`;
}
// 2. 이동 이벤트 함수(만약에 본문에서 키다운을 누르면)
document.body.addEventListener('keydown',(e)=>{
	// e : keydown 이벤트 결과 객체
	// * 만약에 이도상태가 true인 경우에만 가능
	if(control == true){
		// 1. 만약에 key를 눌렀을때
		let key = e.keyCode;	// 눌린 키보드 키의 코드넘버
		console.log(key);
		// 왼쪽방향키 = 37 위쪽방향키 = 38 오른쪽방향키 = 39 아래방향키 = 40
		if(key == 37){
			x--;		// 왼쪽으로 이동
		}else if(key == 38){
			y--;		// 위쪽으로 이동
		}else if(key == 39){
			x++;		// 오른쪽으로 이동
		}else if(key == 40){
			y++;		// 아래쪽으로 이동
		}
		
		movingPrint(); // 해당 버튼의 위치 새로고침(재랜더링)
	}
	
})
let control = true;	// 버튼 이동상태를 저장하는 변수 true = 이동가능, false = 이동불가

moving.addEventListener('click', ()=>{ 
	control = !control		// 현재 상태를 반대로 변경
	if(control) moving.innerHTML=`배치하기`;
	else moving.innerHTML=`이동하기`;
})





















