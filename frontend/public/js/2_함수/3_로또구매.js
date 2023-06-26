/*
	로또구매 프로그램
		1. 로또구매 버튼 클릭해서 실행
			-----> 버튼 클릭시 함수 실행
		2. 1~45개 버튼 화면에 표시
			-----> for을 사용해서 버튼 생성
		3. 6개 버튼 선택(중복 불가능) / 구매취소
		4. 6개 숫자 모두 선택시 추첨결과 버튼 활성화 / 유효성 결과
		5. 당첨번호 = 자동 난수(랜덤) 6개
		6. 선택한 6개 숫자와 당첨번호 6개와 비교해서 결과
*/

// 1. 로또 구매 함수 정의
function 로또구매(){
	console.log('로또구매() 실행')
	
	// 1. 1~45개의 버튼 생성
	let buttonHTML =``;
	for(let i = 1; i <=45; i++){	//for start
		// 버튼 하나씩 변수에 추가
		buttonHTML +=	
		`<button onclick="버튼클릭(${i})"> ${i}</button>`;	// i번째 버튼 생성
		
		if(i % 5 == 0){		// 5번째 숫자마다 줄바꿈
			buttonHTML+= `<br/>`;
		}
		
		
	}	// for end
	
	// 2.
	document.querySelector('.buttonbox').innerHTML = buttonHTML;
}

// 2. 숫자(선택) 버튼 함수 정의
function 버튼클릭(선택된번호){
	console.log(선택된번호 + '를 클릭했음');
	
	
}



















