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

function listInput(){
	let datevalue = document.querySelector('.dateInput').value;
	let entryvalue = document.querySelector('.entryInput').value;
	let pricevalue = document.querySelector('.priceInput').value;
	
	date.push(datevalue);
	entry.push(entryvalue);
	price.push(pricevalue);
	
	console.log(date);
	console.log(entry);
	console.log(price);
	
	let tableInput = document.querySelector('.maintable');
	let tableHTML = `<tr>
					<td>${datevalue}</td>
					<td>${entryvalue}</td>
					<td>${pricevalue}</td>
					<td><button onclick="remove(${datevalue}, ${entryvalue}, ${pricevalue})">삭제</button></td>
				</tr>	
				`;
	console.log(tableHTML)	
	tableInput.innerHTML += tableHTML;
	
	datevalue = '';
	entryvalue = '';
	pricevalue = '';
	
}

function remove(datetd, entrytd, pricetd){
	console.log(datetd);
	console.log(entrytd);
	console.log(pricetd);
}






















