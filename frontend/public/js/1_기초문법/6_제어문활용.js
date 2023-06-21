/*
	  조건 : 반복문X 입력:prompt 출력 : console 
      문제 1 : 2개의 정수 를 입력받아서 가장 큰수를 출력 
      문제 2 : 3개의 정수 를 입력받아서 가장 큰수를 출력     [ max 함수 x ]
      문제 3 : 4개의 정수 를 입력받아서 가장 큰수를 출력    [ max 함수 x ]
       
      문제 4 : 3개의 정수 를 입력받아서 오름차순 / 내림차순 출력 
      문제 5 : 4개의 정수 를 입력받아서 오름차순 / 내림차순 출력 
       
      문제 6 : 점수를 입력받아 점수 90점이상 합격 출력 아니면 탈락 출력 
      문제 7 : 점수를 입력받아 점수 90점이상 A등급 출력 
                            80점이상 B등급 출력 
                            70점이상 C등급 출력  
                            그외 재시험
      문제 8 : 아이디와 비밀번호 입력받기 
              회원아이디가 admin 이고 비밀번호가 1234 이면 로그인 성공 출력 
                                     아니면 로그인실패 출력
*/

/*
// 문제1
let num1 = Number(prompt('[문제1]정수1을(를) 입력하세요'))
let num2 = Number(prompt('[문제2]정수2을(를) 입력하세요'))
if(num1 > num2){console.log('가장 큰수는 ' + num1 +'입니다.')}
else if(num1 < num2){console.log('가장 큰수는 ' + num2 +'입니다.')}
else{console.log('두 정수는 같습니다.')}

// 문제2
let num3 = Number(prompt('[문제2]정수3을(를) 입력하세요'))
let num4 = Number(prompt('[문제2]정수4을(를) 입력하세요'))
let num5 = Number(prompt('[문제2]정수5을(를) 입력하세요'))

let max = num3

if(max < num4){max = num4}
if(max < num5){max = num5}
console.log('가장 큰 수는 ' + max + '입니다.')

// 문제3
let num6 = Number(prompt('[문제3]정수6을(를) 입력하세요'))
let num7 = Number(prompt('[문제3]정수7을(를) 입력하세요'))
let num8 = Number(prompt('[문제3]정수8을(를) 입력하세요'))
let num9 = Number(prompt('[문제3]정수9을(를) 입력하세요'))
let max2 = num6

if(max2 < num7){max2 = num7}
if(max2 < num8){max2 = num8}
if(max2 < num9){max2 = num9}
console.log('가장 큰 수는 ' + max2 + '입니다.')

// 문제4
let num10 = Number(prompt('[문제4]정수10을(를) 입력하세요'))
let num11 = Number(prompt('[문제4]정수11을(를) 입력하세요'))
let num12 = Number(prompt('[문제4]정수12을(를) 입력하세요'))
let max3 = num10
let min = num10

if(max3 < num11){max3 = num11}
if(max3 < num12){max3 = num12}

if(min > num11){min = num11}
if(min > num12){min = num12}

let mid = (num10 + num11 + num12) - (max3+ min)
console.log('오름차순' + min + ' ' + mid + ' ' + max3)
console.log('내림차순' + max3 + ' ' + mid + ' ' + min)

// 문제5
let num13 = Number(prompt('[문제5]정수13을(를) 입력하세요'))
let num14 = Number(prompt('[문제5]정수14을(를) 입력하세요'))
let num15 = Number(prompt('[문제5]정수15을(를) 입력하세요'))
let num16 = Number(prompt('[문제5]정수16을(를) 입력하세요'))

if(num13 > num14){
	let temp = num13
	num13 = num14
	num14 = temp
}
if(num13 > num15){
	let temp = num13
	num13 = num15
	num15 = temp
}
if(num13 > num16){
	let temp = num13
	num13 = num16
	num16 = temp
}
if(num14 > num15){
	let temp = num14
	num14 = num15
	num15 = temp
}
if(num14 > num16){
	let temp = num14
	num14 = num16
	num16 = temp
}
if(num15 > num16){
	let temp = num15
	num15 = num16
	num16 = temp
}
console.log('오름차순' + num13 + ' ' + num14 + ' ' + num15 + ' ' + num16)
console.log('내림차순' + num16 + ' ' + num15 + ' ' + num14 + ' ' + num13)


// 문제6
let score = Number(prompt('점수를 입력하세요'))
if(score >= 90){console.log('합격입니다')}
else(console.log('탈락입니다'))

*/

// 문제7
let score2 = Number(prompt('점수를 입력하세요'))
if(score2 >= 90){
	console.log('A')
}else if(score2 >= 80){
	console.log('B')
}else if(score2 >= 70){
	console.log('C')
}else(console.log('재시험입니다.'))

// 문제8
let id = prompt('id를 입력해주세요')
let password = prompt('password를 입력해주세요')

if(id == 'admin'){
	if(password == '1234'){
		console.log('로그인 성공')
	}else(console.log('로그인 실패'))
}else(console.log('로그인 실패'))






















