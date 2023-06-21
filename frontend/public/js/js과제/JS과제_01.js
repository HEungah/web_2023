//문제11 : 정수 3개를 입력받아 오름차순 으로 출력    [ 7 5 9 -> 5 7 9]

// 문제 11
let num6 = Number(prompt('첫번째 숫자를 입력해주세요'))
let num7 = Number(prompt('두번째 숫자를 입력해주세요'))
let num8 = Number(prompt('세번째 숫자를 입력해주세요'))

// 제일 큰 수
let num9 = (((num6>=num7) && (num6>=num8)  ? num6 : (num7 >= num8) ? num7 : num8))
// 제일 작은 수
let num10 = (((num6<=num7) && (num6<=num8)  ? num6 : (num7 <= num8) ? num7 : num8))
// 중간
let num11 = ((num6 != num9) && (num6 != num10)) ? num6 : ((num7 != num9) && (num7 != num10)) ? num7 : num8  
console.log(num10 + ' ' + num11 + ' ' +num9)

/*
	문제12 : [ 가위바위보 게임 ] 
   - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다. 
   - 승리자 판단과 무승부 경우의수를 출력하시오.
   [입력]
      플레이어1가 0 혹은 1 혹은 2 입력받아 변수에 저장합니다.
      플레이어2가 0 혹은 1 혹은 2 입력받아 변수에 저장합니다.
   [경우의수 판단]
      플레이어1 이겼을때 경우의수 ' 플레이어1 승리 ' 출력
      플레이어2 이겼을때 경우의수 ' 플레이어2 승리 ' 출력
      비겼을경우 '무승부' 출력
*/

let p1 = Number(prompt('플레이어1 -> 가위(0) 바위(1) 보(2)'))
let p2 = Number(prompt('플레이어2 -> 가위(0) 바위(1) 보(2)'))
let result1 = '플레이어1 승리'
let result2 = '플레이어2 승리'
let result3 = '무승부'

console.log((p1 == p2) ? result3 :((p1 ==((p2 + 1)%3)) ?  result1 : result2))











