/*
	- 과제3 : 가계부 만들기 ( 과제3.HTML , 과제3.JS , 과제3.CSS )
요구사항
	- 1.배열 3개 사용 ( 날짜배열 , 항목배열 , 금액배열 )
	- 2.함수 3개 이상 정의해서 구현 
	- 3.총합계는 계산해서 테이블 가장 하단에 출력하시오.
	- 4.해당 삭제 버튼 클릭시 해당 항목 제거 
	- 5. 출력시 숫자를 천단위 쉼표로 출력하시오. [ toLocaleString() 함수( 천단위쉼표가 있는 문자열로 변환)  ]
		- let 금액 = 1200000
		- 금액.toLocaleString( ) => '1,200,000'
	- 6. css 적절하게 적당히 꾸며서 제출해주세요.

ex) 입력 예시 [ input 3개 사용 ]
	날짜 : <input type="date" />
	항목 : <input type="text" />
	금액 : <input type="text" />

ex) 출력 예시 [ table 사용 ]
	날짜		항목		금액		비고
	2023-06-06	콜라		300		<button>삭제</button>
	2023-06-05	노트북		1,200,000		<button>삭제</button>
	2023-06-03	교통비		1,750		<button>삭제</button>
		-총합계-			1,202,050	
*/

let date = [];		// 날짜 저장 배열
let entry = [];		// 항목 저장 배열
let price = [];		// 금액 저장 배열


// CSS 선택자 또는 CSS 선택자 그룹으로 parentNode의 하위 element 중 매치되는 항목을 반환

function listInput(){
	let dateInput = document.querySelector('.dateInput');
	let entryInput = document.querySelector('.entryInput');
	let priceInput = document.querySelector('.priceInput');
	
	let datevalue = dateInput.value;	// 입력된 날짜값을 받아옴
	let entryvalue = entryInput.value;	// 입력된 항목값을 받아옴
	let pricevalue = priceInput.value;	// 입력된 금액값을 받아옴
	
	
	if(datevalue == ""){
		alert('날짜를 입력해주세요')
		return;
	}else if(entryvalue == ""){
		alert('항목을 입력해주세요')
		return;
	}else if(pricevalue == ""){
		alert('금액을 입력해주세요')
		return;
	}
	
	
	date.push(datevalue);		// 받아온 값을 날짜 배열에 저장
	entry.push(entryvalue);		// 받아온 값을 항복 배열에 저장
	price.push(pricevalue);		// 받아온 값을 금액 배열에 저장
	
	listadd();		// 테이블에 입력된 값을 추가하는 함수
				
	
	dateInput.value = '';		// 입력창 초기화
	entryInput.value = '';
	priceInput.value = '';
	
}


function listadd(){
	// tablebody 클래스에 매치되는 항목을 반환
	let tableInput = document.querySelector('.tablebody');
	let tableHTML = ``;		// 테이블을 추가하기 위해 쓰는 변수를 초기화
	
	// 배열의 길이만큼 반복하여 테이블을 추가함
	// 삭제 버튼을 누르면 removetd함수가 실행된다
	for(let i = 0; i < date.length; i++){
		tableHTML += `<tr>
					<td>${date[i]}</td>
					<td>${entry[i]}</td>
					<td>${Number(price[i]).toLocaleString()}</td>
					<td>
					<button class="modifybutton" onclick="modifytd(${i})">수정</button>
					<button class="removebutton" onclick="removetd(${i})">삭제</button>
					</td>
					</tr>	
					`;	
	}
	
	tableInput.innerHTML = tableHTML;	// 테이블 추가
	
	// 만약 테이블헤드를 제외한 테이블 행이 0이 아니라면 총합계 행 추가
	if(date.length != 0){
		tableHTML += `<tr class="sumtable">
						<td colspan="2">총합계</td>
						<td>${sumPrice()}</td>
						<td>${''}</td>
					  </tr>`
		tableInput.innerHTML = tableHTML;			
	}
	
}

// 총합계를 구하기위한 함수
function sumPrice(){
	let sum = 0;
	for(let i = 0; i < price.length; i++){
		sum += Number(price[i]);
	}
	return sum.toLocaleString();
}

// 테이블 삭제 함수
function removetd(index){
	date.splice(index, 1);		// 받아온 배열의 인덱스를 받아서 삭제
	entry.splice(index, 1);
	price.splice(index, 1);
	
	listadd();		// 삭제한 후의 테이블을 다시 출력
}

// 수정 데이터 입력창 생성 함수
function modifytd(index){
	let headerInput = document.querySelector('.headerbox');
	let headerHTML = ``;
	
	// 수정 버튼을 누르면 modifyInput함수 실행
	headerHTML =   `<div class="inputbox">
						<input class="mDateInput" type="date" placeholder="날짜">
						<input class="mEntryInput" type="text" placeholder="수정항목">
						<input class="mPriceInput" type="text" placeholder="수정금액">
						<button onclick="modifyInput(${index})">수정</button>
					</div>
					` 	

	// 입력 창 밑에 수정데이터 입력 창 생성
	headerInput.innerHTML += headerHTML;
	
	
}

// 수정데이터 입력후 테이블 출력
function modifyInput(index){
	let mDateInput = document.querySelector('.mDateInput');
	let mEntryInput = document.querySelector('.mEntryInput');
	let mPriceInput = document.querySelector('.mPriceInput');
	
	let mDatevalue = mDateInput.value;	// 수정된 날짜값을 받아옴
	let mEntryvalue = mEntryInput.value;	// 수정된 항목값을 받아옴
	let mPricevalue = mPriceInput.value;	// 수정된 금액값을 받아옴
	
	if(mDatevalue == ""){
		alert('날짜를 입력해주세요')
		return;
	}else if(mEntryvalue == ""){
		alert('항목을 입력해주세요')
		return;
	}else if(mPricevalue == ""){
		alert('금액을 입력해주세요')
		return;
	}
	
	// 날짜, 항목, 금액 배열에 수정된 데이터 입력
	date[index] = mDatevalue;
	entry[index] = mEntryvalue;
	price[index] = mPricevalue;
	
	// 수정된 데이터로 테이블 생성
	listadd();
	
	
	let headerInput = document.querySelector('.headerbox');
	let headerHTML = ``;
	headerHTML =  	`<h2>의선's 가계부</h2>
					 <div class="inputbox">
						<input class="dateInput" type="date" placeholder="날짜">
						<input class="entryInput" type="text" placeholder="항목">
						<input class="priceInput" type="text" placeholder="금액">
						<button onclick="listInput()">입력</button>
					 </div>
					`;
					
	// 수정 후 수정데이터 입력창 삭제
	headerInput.innerHTML = headerHTML;
}
































