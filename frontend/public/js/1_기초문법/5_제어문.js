/*

	- 제어문 = if = 만약에
	ex) if(A편의점_콜라 <= 1000){ 구매하고 집으로 간다.}
		else if(B편의점_콜라 <= 1000){ 구매하고 집으로 간다.}
		else if(C편의점_콜라 <= 1000){ 구매하고 집으로 간다.}
		else{ 그냥 집으로 간다.}
		
	1. 제어문 : 흐름에 대한 논리적인 제어
	2. if, switch 문법
	3. if 형태
		* 조건 : 결과값이 true of false 결과를 갖는 변수 혹은 연산
		* 조건과 참/거짓의 코드가 이어져야한다.
		1.	if(조건) 참일경우 코드	
		2.	if(조건){참일경우코드1; 참일경우코드2}
		3.	if(조건){참일경우코드}
			else{거짓일경우코드}
		4.	if(조건){참일경우코드}
			else if(조건2){참2일경우코드}	
			else if(조건3){참3일경우코드}	
			else if(조건4){참4일경우코드}
			else{거짓}
		5. if 중첩
			if(조건1){
				if(조건2){}
				else if(조건3){}
				else
			}else{
				if(조건2){}
				else if(조건3){}
				else
			}
	
*/

// 1. if 형태1
if( 10 > 3) console.log('참[1] 10이 3보다 크다.')	// 조건이 참(true)라서 실행o
if( 10 > 30) console.log('참[2] 10이 20보다 크다.')	// 조건이 거짓(false)라서 실행x
if( 10 > 20); console.log('참[3 10이 20보다 크다.')	// x

// 2. if 형태2
if( 10 > 3) console.log('참1'); console.log('참2')	// x
if( 10 > 20)console.log('참3'); console.log('참4')	// x
if( 10 > 20){console.log('참5'); console.log('참6')}	// o

// 3. if 형태3
if( 10 > 3){console.log('[참] 10 더 크다.')}
else{console.log('[거짓] 10 더 작다.')}

// 4. if 형태4
if(10 >= 20){console.log('참[1] 10이 20보다 이상이다.')}
else if(10 >= 15){console.log('참[2] 10이 15보다 이상이다.')}
else if(10 >= 10){console.log('참[3] 10이 10보다 이상이다.')}
else{console.log('[거짓] 10이 10미만이다.')}
	// ----------------vs--------------------
10 > 20 ? console.log('참[1] 10이 20보다 이상이다.')
	: 10 >= 15 ? console.log('참[2] 10이 15보다 이상이다.')
	: 10 >= 10 ? console.log('참[3] 10이 10보다 이상이다.')
	: console.log('[거짓] 10이 10미만이다.')













