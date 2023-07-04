console.log('kiosk.js 파일 실행')

// 1. 광고이미지 변경
	// 1) 광고이미지 여러개 = 배열
let bimgList = ['burgerkingh1.png', 'burgerkingh2.png', 'burgerkingh3.png',
	'burgerkingh4.png', 'burgerkingh5.png'];
	// 2) 특정시간마다 이미지의 src 변경하기
		// -setInterval(함수/기능, 밀리초)
let viewhimg = 0	// 현재 출력중인 광고 이미지 인덱스를 저장하고 있는 변수		
		
setInterval( ()=>{
	// 해당 이미지 태그 호출
	let himg = document.querySelector('.himg');
	// 클래스의 속성명을 바꿀 수 있다.
	viewhimg++;		// 인덱스 증가시킴[다음이미지로 변경]
	//	만약에 마지막 인덱스 다음이면 처음 인덱스로 이동
	if(viewhimg >= bimgList.length){
		viewhimg = 0;
	}
	himg.src = `../img/${bimgList[viewhimg]}`

	
}, 3000 );	// 2초마다 실행코드가 주기적으로 실행		

// 2. 카테고리 출력 함수
	// 1) 카테고리 여러개 저장하는 배열
let categoryList = ['신제품(NEW)','프리미엄' ,'와퍼&주니어', '치킨&슈림프버거', '올데이킹&킹모닝']
	// 2) 카테고리 출력 함수 정의[실행 조건 : 1. 페이지 열렸을때 2. 
categoryPrint();	
function categoryPrint(){
	let categorymenu = document.querySelector('.categorymenu');
	let html = ``;
		// HTML 구성 : 배열내 모든 데이터(for)를 li 형식으로 출력
	for(let i = 0; i < categoryList.length; i++){
		html += `<li class="categoryselect">${categoryList[i]}</li>`
	}	
	// 3) 구성된 html 출력
	categorymenu.innerHTML = html;
}	


// 3. 카테고리 클릭 함수






















