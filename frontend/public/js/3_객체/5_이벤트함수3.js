/*

	

*/
// 1. select 목록상자에서 변경될때 선택된 value 가져오기

let selectbox = document.querySelector('.selectbox');

	// * 이벤트 등록[addEventListener vs <select onchange=">"]
selectbox.addEventListener('change', ()=>{
	console.log('목록상자가 변경되었습니다.');
	console.log(selectbox.value);
})	

// 2. input 체크상자에서 체크 여부 가져오기
let checkbox = document.querySelector('.checkbox');

checkbox.addEventListener('change', ()=>{
	console.log('체크상자가 변경되었습니다.');
	console.log(checkbox.checked);	// 체크 여부
})

// 3. 타이머 예제
	// 1) 해당 태그 호출
let timer = document.querySelector('.timer');
let timerbox = document.querySelector('.timerbox');

	// 2) 시간 함수
let time = 0;	// 타이머 시간을 저장하는 변수
let timerid = 0;	// 타이머 함수가 저장되는 변수

	// 3) 이벤트 등록
timer.addEventListener('change', ()=>{
	
	// 만약에 체크박스에 체크가 되어있으면
	if(timer.checked){
		
		timerid = setInterval( ( )=>{ 
			
				time++;	// 변수 1씩 증가
				timerbox.innerHTML = `${time} 초`;
				
			},1000);	// 1000밀리초 -> 1초 (1초마다 함수 실행)
		
	}else{//체크박스에 체크가 안되어있으면
		clearInterval(timerid);
	}
})


/*

	setInterval() : 특정 시간마다 함수를 재호출해주는 함수
		setInterval(함수, 시간); -> 입력한 시간마다 함수 실행
		함수
			1. 기존함수명
			2. ()=>{}
			3. function(){}		// 익명함수[ 재호출 불가 ]
		시간 : 밀리초[ 1/1000 초]
			1000 -> 1초
			100 -> 0.1초
			10 -> 0.01초
			1 -> 0.001초	
	clearInterval() : 	Interval을 멈추는 함수
*/
























