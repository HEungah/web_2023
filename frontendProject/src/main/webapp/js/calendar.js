console.log('calendar.js 실행');

// 현재 연도/월 {초기값}
	// new Date() : 현재 날짜/시간 반환해주는 클래스
		// .getFullYear() : 연도 
		// .getMonth() : 월
		// .getDay() : 요일[일(0) ~ 토(6)]
		// .getDate() : 일
		// [다음달 1일에서 -1] : 현재 월의 마지막 일수 구하기
	// new Date(연도, 월, 일) : 사용자 정의 날짜 반환해주는 클래스	
let year = new Date().getFullYear();	// 현재 연도
let month =	new Date().getMonth()+1; // 현재 월(0~11) + 1
console.log(year); console.log(month);

// 1. 현재 연도/월 기준으로 달력 출력 하는 함수

calPrint();
function calPrint(){
	// 1. 현재 연도와 월 을 해당 구역에 출력하기
	document.querySelector('.caldate').innerHTML = `${year}년 ${month}월`;
	// 2. 요일과 일 출력
	
	/*
		1. 시작 요일
	*/
	// 현재 보고 있는 캘린더의 날짜
	let now = new Date(year, month - 1, 1);
	let sweek = now.getDay();
	console.log(sweek);
	
	// 2. 현재 월의 마지막일
	let now2 = new Date(year, month, 0);	// 달의 마지막 일 수 구하기
	let eDay = now2.getDate(); console.log(eDay);
	let dweek = new Date(year, month-1, eDay).getDay();
	
	
	let calendar = document.querySelector('.calendar');
	let html = ``;
	
	// 요일
	html += `
			<div class="week sunday"> 일 </div>
			<div class="week"> 월 </div>
			<div class="week"> 화 </div>
			<div class="week"> 수 </div>
			<div class="week"> 목 </div>
			<div class="week"> 금 </div>
			<div class="week"> 토 </div>
			`
	//**** 현재 달력 1일의 요일까지 공백 출력
	for(let b = 1; b <=sweek; b++){// 1부터 1일까지의 공백 구역 출력
		html += `<div></div>`
	}		
			
	for(let day = 1; day <=eDay; day++){
		html += `<div> ${day} </div>`
	}
	
	for(let e = 1; e <= 6-dweek; e++){
		html += `<div></div>`
	}		
	
	
	
	calendar.innerHTML = html;
}

// 버튼을 클릭했을때 현재 월을 변환해주는 함수
function onNext( check ){
	console.log('onNext 함수 실행')
	if(check == 0){	// 이전 달
		month--;
		// 만약 현재 달이 1월일 경우
		if(month < 1){
			month = 12;
			year--;
		}
	}else if(check == 1){	// 다음 달
		month++;
		if(month > 12){
			month = 1;
			year++;
		}
		// 만약 현재 달이 12월일 경우
	}
	// 월 증가후 달력 새로고침
	calPrint();
	
}

































