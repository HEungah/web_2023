/*
	- 변수	:	변하는 수(데이터1개 저장하는 메모리 공간)
		- 저장된 데이터는 변경이 가능하다
		- let 변수 선언시 사용되는 키워드
		- 변하는 값,[임시로 저장하는 값]
		
	- 상수	:	고정된 수(데이터1개 저장하는 메모리 공간)
		- 저장된 데이터는 변경이 불가능하다.
		- const 상수 선언시 사용되는 키워드
		- 고정된값, 변하지 않는값, 일정한 값[파이(3.14) ...]
	
	- 변수/상수 형태
		1. 키워드(let/const)
		2. 변수/상수 이름 [영문, 띄어쓰기x, 숫자시작x, 카멜표기법 권장]
			카멜표기법 : classname -> className
		3. 대입연산자 =
			오른쪽 데이터가 왼쪽에 대입/저장
		4. 데이터	
		
	- 변수/상수 사용
		1. 호출 : 호출할 변수명
		2. 수정 : 수정할변수명 = 새로운 데이터
		
	- 연산자[연산/계산 시 사용되는 특수문자]
		1. 산술연산자 :	+(더하기), -(빼기), *(곱하기), /(나누기), %(나머지)

		2. 연결연산자 :	+연결연산자
					숫자+숫자 [+ 더하기]	변수1 + 변수2[만약에 두 변수모두 숫자가 저장되어있으면 더하기]
					숫자+'문자' [+ 연결연산자]
					'문자'+'문자'[+ 연결연산자]
		3. 비교연산자 :	 true 혹은 false 출력
				> 초과/크다	< 미만/작다
				>= 이상/크거나같다	<= 작거나같다
				== 같다[데이터비교]	===같다[데이터형/데이터 비교]
				!= 같지않다/아니다	!==같지않다/아니다
		
		4. 관계연산자 : 주로 비교연산자 2개 이상일때 사용, ture 혹은 false 출력
			&& 이면서 면서 이고 모두 그리고 AND [모두 참이면 참]
			\\ 이거나 거나 또는 하나라도 OR	[하나라도 참이면 참]
			! 반대 부정 not조건		!true => false / !false => true
			
		5. 대입연산자 :
			= 대입 [ 오른쪽 데이터를 왼쪽에 대입]
			+= [오른쪽 데이터를 왼쪽에 더한후에 왼쪽에 대입]
				1. 변수 = 10
				2. 변수 += 30	[ += 1. 더하기를 한다 2. 대입한다.]
				3. consloe.log(변수)
			-=, *=, /=, %=
		6. 증감연산자 :
			++ 1증가	[선위증가:	++변수	후위증가:	변수++]
			-- 1감소	[선위감소:	--변수	후위감소:	변수--]
			
		7. 삼항연산자 : 항 3개 존해나는 연산자
			조건 ? 참true : 거짓false
			-	만약 조건이 true이면 참 실행
				만약 조건이 false이면 거짓 실행
			- 	중첩가능
			조건1? 참1 : 조건2 ? 참2 : 거짓	

*/

// 1. 산술연산자
/*
console.log('더하기 : ' + 10 + 3)		// 결과 : 103
console.log('더하기 : ' + (10 + 3))	// 결과 : 13
console.log('빼기 : ' + (10 - 3))		// 결과 : 7
console.log('곱하기 : ' + (10 * 3))	// 결과 : 30
console.log('나누기 : ' + (10 / 3))	// 결과 : 3.33333
console.log('나머지 : ' + (10 % 3))	// 결과 : 1

// 문제 1
let leg = Number(prompt('국어 점수를 입력하세요'))		// Number('문자') => 숫자로 변환
let eng = Number(prompt('영어 점수를 입력하세요'))
let math = Number(prompt('수학 점수를 입력하세요'))
let all = leg + eng + math

console.log('총점은 ' + all + '입니다.') 
console.log('평균값은' + (all / 3) + '입니다.')

// 문제2
const pi = 3.14
let r = prompt('반지름을 입력해주세요')
console.log('원의 넓이는 ' + (r * r * pi) + '입니다.')

// 문제3
let num1 = prompt('숫자1을 입력해주세요')
let num2 = prompt('숫자2를 입력해주세요')
let result = (num1 / num2) * 100
console.log('앞 숫자는 뒤 숫자의 ' + result + '%입니다.')

// 문자 연산 예시
console.log(10 * 3)			// 결과 : 30
console.log('10' * 3)		// 결과 : 30
*/
// 비교연산자
/*
console.log('초과 : ' + (10>3) )		// true
console.log('미만 : ' + (10<3) )		// false
console.log('이상 : ' + (10>=3) )		// true
console.log('이하 : ' + (10<=3) )		// false
console.log('같다 : ' + (10==3) )		// false
console.log('같지않다 : ' + (10!=3) )		// true
*/

// 관계연산자
/*
console.log('이면서 : ' + (10>3 && 20>15))		// 10은 3보다 크면서 20은 15보다 크다. true and true => true
console.log('이면서 : ' + (10>3 && 20>30))		// true and false => false
console.log('이거나 : ' + (10>3 || 20>15))		// true or true => true
console.log('이거나 : ' + (10>3 || 20>30))		// true or false => true
console.log('부정 : ' + !(10>3))		// true => false
*/

/*
	-문제4 : prompt 함수 로 정수를 입력받아 홀수[true] / 짝수[false] 여부 출력
	-문제5 : prompt 함수 로 정수를 입력받아 7배수이면 true / 아니면 false 출력
	-문제6 : prompt 함수 로 십만원 단위의 금액을 입력받아 지폐 개수 세기 
         356789      결과 : 십만원3장 만원5장 천원6장 
	-문제7 : prompt 함수 로 아이디와 비밀번호를 입력받아 아이디가 admin 이고 비밀번호가 1234 와 일치하면 
         결과 : true 출력 아니면 false 출력 
	-문제8 : prompt 함수로 정수를 입력받아 홀수 이면서 7배수이면 true 아니면 false 출력
*/

/*
// 문제4
let num4 = prompt('숫자를 입력해주세요')
let result2 =((num4%2) == 1)
console.log('홀수(ture) 짝수(false) 결과 => ' + result2)

// 문제5
let num5 = prompt('숫자를 입력해주세요')
let result3 =((num5%7) == 0)
console.log('7의배수(ture) 7의배수아님(false) 결과 => ' + result3)

// 문제6
let money = prompt('십만원 단위의 금액을 입력해주세요')
let ten = parseInt(money / 100000)			//	parseInt : 정수형으로 변환
let sib = parseInt((money / 10000) % 10)
let tou = parseInt(((money / 1000) % 100) % 10)
console.log('십만원권' + ten + '장 ' + '만원권' + sib + '장 ' + '천원권' + tou + '장')

// 문제7
let id = prompt('id를 입력해주세요')
let password = prompt('password를 입력해주세요')
let result4 = (id == 'admin') && (password == '1234')
console.log('접속성공(ture) 접속실패(false) 결과 => ' + result4)

// 문제8
let num6 = prompt('숫자를 입력해주세요')
let result5 = (num6 % 2 == 1) && (num6 % 7 ==0)
console.log('홀수이면서 7의 배수(ture) 아님(false) 결과 => ' + result5)
*/

// 대입연산자
let 데이터1 = 10;	// let키워드(변수)로 '데이터1'이라는 변수명에 10을 저장
console.clear(데이터1)	// 10
데이터1 += 10;	// 1. 10 + 10 => 20 , 2. 데이터1에 20을 대입
console.clear(데이터1)	// 20
데이터1 -= 5;		// 20-5=> 15, 15 대입
console.clear(데이터1)	// 15
데이터1 *= 2;		// 15*2 => 30, 30 대입
console.clear(데이터1)	// 30
// /= %= 다 가능

// 예제
let html = '<h3> JS에서 작성된 HTML 입니다.</h3>'
html += '<p> 문단 추가 했습니다.</p>'
// html [JS에서 작성된 HTML 입니다. 문단 추가 했습니다.]
document.write(html)	// document.write() -> document : html문서, write : 쓰기

// 증감연산자[ data + 1, data +=1, data++]
let 데이터2 = 10 
console.log('data : ' + 데이터2)		// 10
console.log('data : ' + (데이터2++))	// 10(후위증가)
console.log('data : ' + 데이터2)		// 11
console.log('data : ' + (++데이터2))	// 12(선위증가)

console.log('data : ' + (데이터2--))	// 12(후위감소)
console.log('data : ' + 데이터2)	// 11
console.log('data : ' + (--데이터2))	// 10(선위감소)

// 삼항연산자 [ 조건 ? 참 : 거짓 ] (만약 조건이 true이면 참코드 실행 false이면 거짓코드 실행)
let age = 38	// '나이' 변수에 38 저장
let 연령구간 = (age<=19) ? '청소년' : '성인'	
			// 조건(true/false 결과를 갖는 연산)
console.log(연령구간)

let 점수 = 78
let 등급 = (점수 >= 90) ? 'A' : (점수 >= 80) ? 'B' : (점수 >= 70) ? 'C' : 'F'
console.log(등급 + '등급')

/*
	문제9 : 정수 2개를 입력받아 더 큰수 를 출력
	문제10 : 정수 3개를 입력받아 가장 큰수 를 출력 
	문제11 : 정수 3개를 입력받아 오름차순 으로 출력    [ 7 5 9 -> 5 7 9]
*/

// 문제 9
let num1 = prompt('첫번째 숫자를 입력해주세요')
let num2 = prompt('두번째 숫자를 입력해주세요')
console.log((num1>=num2 ? num1 : num2))

// 문제 10
let num3 = prompt('첫번째 숫자를 입력해주세요')
let num4 = prompt('두번째 숫자를 입력해주세요')
let num5 = prompt('세번째 숫자를 입력해주세요')
console.log(((num3>=num4) && (num3>=num5)  ? num3 : (num4 >= num5) ? num4 : num5))

// 문제 11
let num6 = prompt('첫번째 숫자를 입력해주세요')
let num7 = prompt('두번째 숫자를 입력해주세요')
let num8 = prompt('세번째 숫자를 입력해주세요')

let num9 = (((num6>=num7) && (num6>=num8)  ? num6 : (num7 >= num8) ? num7 : num8))
let num10 = (((num6<=num7) && (num6<=num8)  ? num6 : (num7 <= num8) ? num7 : num8))
let num11 =((num6 != num9) && (num6 != num10)) ? num6 : ((num7 != num9) && (num7 != num10)) ? num7 : num8  
console.log(num10 + ' ' + num11 + ' ' +num9)











