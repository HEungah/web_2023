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

let lotto = []; 		// 로또번호 저장 배열

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
	console.log( 선택된번호 + ' 숫자버튼을 클릭했군요. ')
	// < push > 배열에 저장하기전에 유효성검사
	// 1. 중복검사/취소기능 = 배열명.indexOf
	if( lotto.indexOf( 선택된번호 ) != -1 ){ // -1 : 동일한 데이터가 배열내 없음 뜻  // != -1 : 배열내 존재하면 
		alert('이미 선택된 번호 입니다.[해당 숫자는 취소 합니다.]'); // 안내문구 
		// * 취소기능 : 배열내 해당 인덱스의 데이터 제거 
		lotto.splice( lotto.indexOf(선택된번호) , 1 ); // 선택된번호의 인덱스 1개 삭제 
		선택번호출력(); // 삭제후 배열 상태 출력함수
		return; // 함수 강제 종료 
	} // if end
	
	// 2. 6개 초과인지 검사 = 배열명.length	: 배열내 데이터 총개수/길이 
	if( lotto.length == 6 ){
		alert('이미 6개 번호 모두 선택하셨습니다.');
		return; // 함수 강제 종료 // return 안했을경우 아래보드 실행!!!!
	} // if  end 
	
	// * 배열에 저장 ( 2개의 유효성검사를 모두 통과했을때 배열에 저장 ) 
	lotto.push( 선택된번호 ); console.log( lotto )
	선택번호출력();	// 추가후 배열 상태 출력함수
}

// 3. 현재 선택된 번호들을 출력 (실행 조건 : 배열에 변화가 있으면)
function 선택번호출력(){
	document.querySelector('.선택번호출력구역').innerHTML = lotto;
	if(lotto.length == 6){
		document.querySelector('.추첨결과버튼구역').innerHTML = `<button onclick="추첨결과()">추첨결과</button>`;
	}
	
	else{
		document.querySelector('.추첨결과버튼구역').innerHTML = ``;
	}
}

function 추첨결과(){
	let count = 0;			// 맞은 번호 개수
	let randomlotto= [];	// 당첨번호 저장 배열
	
	for(let i = 0; i <6; i++){
// ******* Math.random()*마지막번호 + 시작번호 => 난수생성 ************
		let 추첨번호 = parseInt((Math.random()*45)+1);
		if(randomlotto.indexOf(추첨번호) == -1){	// 랜덤숫자 중복체크
			randomlotto.push(추첨번호);
		}else{i--;}	// 중복인 번호가 나오면 반복한번 더 실행
	}
	
	// 1. 배열과 for 활용
	for(let i = 0; i <lotto.length; i++){
		if(lotto.indexOf(randomlotto[i]) != -1 ){
			count++;
		}
	}
	
	/*
	// 2. 향상된 for문 활용[for(let 반복변수명 in 배열명)]
	for(let 선택번호 in lotto){	// 자동으로 0번 인덱스부터 마지막 인덱스까지 반복변수에 대입
		if(randomlotto.indexOf(lotto[선택번호]) != -1){count++;}
	}
	
	// 3. 향상된 for문 활용[for(let 반복변수명 of 배열명)]
	for(let 데이터 of lotto){		// 자동으로 0번 인덱스부터 마지막 인덱스까지의 데이터를 반복변수에 대입
		if(randomlotto.indexOf(데이터) != -1){count++;}
	}
	
	// 4. for 라이브러리[배열명.forEach() vs 배열명.map vs 배열명.filter]
	// 배열명.forEach((반복변수) =>{실행문})
	// 배열명.forEach((반복변수, 인덱스) =>{실행문})
	lotto.forEach((데이터, 인덱스)=>{
		if(randomlotto.indexOf(데이터) != -0){count++;}
	});	
	*/	
		
	if(count == 6){
		alert('1등입니다.');
	}else if(count == 5){
		alert('2등입니다.');
	}else if(count == 4){
		alert('3등입니다.');
	}else{alert('꽝입니다.');}
	
	console.log(randomlotto);
	console.log('맞은개수 => ' + count);
}
















