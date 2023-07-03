/*
	
	함수	: 미리 정의된 코드의 집합
		1. 내장함수 : JS언어 내에 기본적으로 사용할 수 있는 함수
			console.log
			배열명.push()
			alert()
			prompt()
			parseInt()
			...
		2. 내장객체 : JS언에 내에 기본적으로 사용할 수 있는 객체
			console
			document
			Math
			new Date()
			...
		3. 정의함수 : 개발자가 정의해서 사용하는 함수
			function 함수명(){}	-->		함수명()
			
	DOM : Document Object Model (문서 객체 모델)
		- HTML(정적언어)	-JS(동적언어)
		1. 정의 : HTML문서 각 항목을 계층으로 표현된 JS객체
		2. 
			document
*/
// 1. document 객체를 이용하여 태그들을 객체로 호출
console.log(document);	// 현재 js가 포함된 html 문서의 전체
console.log(document.body);	//	<body> 호출
console.log(document.head);	//	<head> 호출
console.log(document.div);	//	<div> 호출(중복가능한 태그이므로 호출 안됨)
console.log(document.querySelector('div'));	// <div> 태크 호출(가장위의 태그 한개)
console.log(document.querySelector('.box1'));	// <div> 태그 호출(box1 클래스)
console.log(document.querySelector('#box2'));	// <div> 태그 호출(box2 아이디)
console.log(document.querySelectorAll('div'));	// <div> 태그 모두 호출
let div배열 = document.querySelectorAll('div');	// querySelectorAll은 배열로 저장
console.log(div배열[2]);	// [0] : 안녕하세요 [1] : 안녕하세요2

// 2. innerHTML 속성 : <태그> innerHTML </태그>
div배열[2].innerHTML = '안녕하세요3 수정HTML'
document.body.innerHTML = '';	//	body내에 모든 html 지우기
document.body.innerHTML += '<h3>추가HTML</h3>';
//	모양은 html이지만 타입은 문자열인 변수
let html = `<p> 변수로 작성한 HTML형식의 문자열 데이터 </p>`;

// 3. sytle 속성 : <태그 style="CSS작성"></태그>
document.body.style = `background-color : #eeeeee; font-size : 20px;`;

// 4. addEventListener('이벤트명', 함수);
	/*
		1.
			function 함수명(){}
			addEventListener('이벤트명', 함수명)
		2.	- 익명함수[함수명이 없는 함수 (인수)=> {실행코드}] 를 이용한 이벤트 추가
			addEventListener('이벤트명', ()=>{ });	
	*/
	/*
		이벤트명
			1. DOMContentLoaded : HTML이 완전히 열렸을때[모두 로드되었을때] 실행되는 이벤트
	*/
// 1) HTML이 완전히 열렸을때
document.addEventListener('DOMContentLoaded', () => { 
	console.log('스크립트에서 이벤트 실행1');
});	

// 2) 해당 객체가 호출 되었을때	
window.onload = () => {console.log('JS에서 이벤트 실행2');}

// 3) JS 열렸을때 이벤트 1번 실행(가장먼저 실행)
console.log('JS에서 이벤트 실행3')

// 4)
let p = document.querySelector('p'); console.log(p);
p.addEventListener('click', () => {
	console.log('p 태그 클릭했다.')
})













