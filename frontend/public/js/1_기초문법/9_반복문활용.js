/*
// 문제1) 입력받은 수 만큼 * 출력 
// 문제2) 입력받은 수 만큼 * 출력 [  - 3줄(3배수)마다 줄바꿈 ]
// 문제3) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*
**         
***      
****   
*****
// 문제4) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
*****
****
***
**
*
// 문제5) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
    *	i = 1 ' ' = 4(line - i) , * = 1	i++
   **	i = 2 ' ' = 3(line - i) , * = 2	i++
  ***				...
 ****				...
*****	i = 5 ' ' = 0(line - i) , * = 5
// 문제6) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*****	i = 5 ' ' = 0(line - i), * = 5 i--
 ****	i = 4 ' ' = 1(line - i), * = 4 i--
  ***				...
   **				...
    *	i = 1 ' ' = 4(line - i), * = 1 
// 문제7) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
    *
   ***
  *****
 *******
*********
// 문제8) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*********
 *******
  *****
   ***
    *
// 문제9) 입력받은 줄 수 만큼 * 출력  [ ex) 10 ]
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
// 문제10) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*          *
  *      *
    *  *
      *
    *  *
  *      *
*          *

*/


// 문제1)
let star = prompt('[문제1]별의 갯수를 입력해주세요');
let result ='';
for(let i = 0; i < star; i++){
	result += '*';
}
console.log(result)

// 문제2) 입력받은 수 만큼 * 출력 [  - 3줄(3배수)마다 줄바꿈 ]
star = prompt('[문제2]별의 갯수를 입력해주세요');
result = '';
for(let i = 1; i <= star; i++){
	result += '*';
	if(i % 3 == 0){
		result += '\n';
		}
}
console.log(result)

/*
문제3) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
입력받은 변수 => 5
*
**         
***      
****   
*****
*/

let line = prompt('[문제3]줄 수를 입력해주세요')
result = '';
for(let i = 0; i < line; i++){
	for(let j = 0; j <= i; j++){
		result += '*';
	}
	console.log(result);
	result = '';
}

/*
문제4) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
*****
****
***
**
*
*/

line = prompt('[문제4]줄 수를 입력해주세요')
for(let i = line; i > 0; i--){
	for(let j = 0; j < i; j++){
		result += '*';
	}
	console.log(result);
	result = '';
}


/*문제5) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
	입력받은 줄 수 => line
    *	i = 1 ' ' = 4(line - i) , * = 1(i)
   **	i = 2 ' ' = 3(line - i) , * = 2
  ***				...
 ****				...
*****	i = 5 ' ' = 0(line - i) , * = 5*/

line = prompt('[문제5]줄 수를 입력해주세요')
for(let i = 1; i <= line; i++){
	for(let j = 0; j < line - i; j++){
		result += ' ';
	}
	for(let j = 0; j < i; j++){
		result += '*';
	}
	console.log(result);
	result = '';
}


/*문제6) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*****	i = 5 ' ' = 0(line - i), * = 5 i--
 ****	i = 4 ' ' = 1(line - i), * = 4 i--
  ***				...
   **				...
    *	i = 1 ' ' = 4(line - i), * = 1 */
   
line = prompt('[문제6]줄 수를 입력해주세요')
for(let i = line; i > 0; i--){
	for(let j = 0; j < line - i; j++){
		result += ' ';
	}
	for(let j = 0; j < i; j++){
		result += '*';
	}
	console.log(result);
	result = '';
}

/*
문제7) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
    *		(반복횟수)i = 1, ' ' = line - i, * = 1(i*2 - 1)
   ***		(반복횟수)i = 2, ' ' = line - i, * = 3
  *****		(반복횟수)i = 3, ' ' = line - i, * = 5
 *******	(반복횟수)i = 4, ' ' = line - i, * = 7
*********	(반복횟수)i = 5, ' ' = line - i, * = 9

*/

line = prompt('[문제7]줄 수를 입력해주세요')
let cnt = 1;
for(let i =1; i <= line; i++){
	for(let j = 0; j < line - i; j++){
		result += ' ';
	}
	for(let j = 0; j < cnt; j++){
		result += '*';
	}
	console.log(result);
	result ='';
	cnt += 2;
}

/*
문제8) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*********
 *******
  *****
   ***
    *
*/

line = Number(prompt('[문제8]줄 수를 입력해주세요'))
cnt = (line*2) -1 ;
result = '';
for(let i = line; i > 0; i--){
	for(let j = 0; j < line - i; j++){
		result += ' ';
	}
	for(let j = 0; j < cnt; j++){
		result += '*';
	}
	console.log(result);
	result ='';
	cnt = cnt - 2;
}  
   
/*
문제9) 입력받은 줄 수 만큼 * 출력  [ ex) 10 ]
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/
line = Number(prompt('[문제9]줄 수를 입력해주세요'))
cnt = 1;
let hfline = line/2;
let cnt2 = hfline + 4;
for(let i =1; i <= hfline; i++){
	for(let j = 0; j < hfline - i; j++){
		result += ' ';
	}
	for(let j = 0; j < cnt; j++){
		result += '*';
	}
	console.log(result);
	result ='';
	cnt += 2;
}

cnt2 = (hfline*2) -1 ;
for(let i = hfline; i > 0; i--){
	for(let j = 0; j < hfline - i; j++){
		result += ' ';
	}
	for(let j = 0; j < cnt2; j++){
		result += '*';
	}
	console.log(result);
	result ='';
	cnt2 = cnt2 - 2;
} 



/*
문제10) 입력받은 줄 수 만큼 * 출력  [ ex) 7 ]
line = 7  13(7*2-1)칸
line = 6  11(6*2-1)칸
line = 5  9(5*2-1)칸
line = 3  5(3*2-1)칸
*           *	line = 1 별 2개(1,13) 공백 11개
  *       *		line = 2 별 2개(3,11)
    *   *		line = 3 별 2개(5,9)
      *			line = 4 별 1개(7)
    *   *		line = 5 별 2개(5,9)
  *       *
*           *
중간줄 판별
7 -> 4(i)
5 -> 3(i)
3 -> 2(i)

*/

line = Number(prompt('[문제10]줄 수를 입력해주세요'))
for(let i = 1; i <= line; i++){
	if((i*2) -1 != line){
		for(let j = 0; j <(line*2) -1; j++){
			if((i*2)-1 == j+1 || ((line-i+1)*2 - 1 == j+1)){
				result += '*';
			}else{result += ' ';}
		}
		console.log(result);
		result ='';
	}else{
		for(let j = 0; j <(line*2) -1; j++){
			if((i*2)-1 == j+1){
				result += '*';
			}else{result += ' ';}
		}
		console.log(result);
		result ='';
	}
}

/*
문제11) 입력받은 줄 수 만큼 * 출력  [ ex) 7 ]
line = 7  13(7*2-1)칸
line = 6  11(6*2-1)칸
line = 5  9(5*2-1)칸
line = 3  5(3*2-1)칸
*           *	line = 1 별 2개(1이상 1이하 or 13이상 13이하)
***       ***	line = 2 별 6개(1이상 3이하 or 11이상 13이하)
*****   *****	line = 3 별 10개(1이상 5이하 or 9이상 13이하)
*************	line = 4 별 13개(13개)
*****   *****	line = 5 별 10개(1이상 5이하 or 9이상 13이하)
***       ***	line = 6 별 6개(1이상 3이하 or 11이상 13이하)
*           *
중간줄 판별
7 -> 4(i)
5 -> 3(i)
3 -> 2(i)

*/

line = Number(prompt('[문제11]줄 수를 입력해주세요'))
for(let i = 1; i <= line; i++){
	if((i*2) -1 < line){						
		for(let j = 0; j <(line*2) -1; j++){	
			if(( (j >= 0) && (j < (i*2)-1) )||( (j+1 >= (line-i+1)*2 - 1) && (j <= (line*2) -2))){
				result += '*';
			}else{result += ' ';}
		}
		console.log(result);
		result ='';
	}else if((i*2) -1 == line){
		for(let j = 0; j <(line*2) -1; j++){
			result += '*';
		}
		console.log(result);
		result ='';
	}else{
		for(let j = 0; j <(line*2) -1; j++){
			if(( (j >= 0) && (j < (line-i+1)*2 - 1) )||( (j+1 >= i*2-1) && (j <= (line*2) -2))){
				result += '*';
			}else{result += ' ';}
		}
		console.log(result);
		result ='';
	}
}


/*
문제12) 입력받은 줄 수 만큼 * 출력  [ ex) 7 ]
line = 7  13(7*2-1)칸
line = 6  11(6*2-1)칸
line = 5  9(5*2-1)칸
line = 3  5(3*2-1)칸
*************	line = 1 별 13개	' ' 0개
  *********		line = 2 별 9개	' ' 4개
    *****		line = 3 별 5개	' ' 8개
      *			line = 4 별 1개	' ' 12개
    *****		line = 5 별 5개	' ' 8개
  *********		line = 6 별 9개	' ' 4개
*************	line = 7 별 13개 ' ' 0개
중간줄 판별
7 -> 4(i)
5 -> 3(i)
3 -> 2(i)

*/

line = Number(prompt('[문제12]줄 수를 입력해주세요'))
for(let i = 1; i <= line; i++){
	if((i*2) -1 < line){						
		for(let j = 0; j <(line*2) -1; j++){	
			if(( (j >= 0) && (j < (i*2)-1) )||( (j+1 >= (line-i+1)*2 - 1) && (j <= (line*2) -2))){
				result += '*';
			}else{result += ' ';}
		}
		console.log(result);
		result ='';
	}else if((i*2) -1 == line){
		for(let j = 0; j <(line*2) -1; j++){
			if(j == (i*2) -1){
				
			}
		}
		console.log(result);
		result ='';
	}else{
		for(let j = 0; j <(line*2) -1; j++){
			if(( (j >= 0) && (j < (line-i+1)*2 - 1) )||( (j+1 >= i*2-1) && (j <= (line*2) -2))){
				result += '*';
			}else{result += ' ';}
		}
		console.log(result);
		result ='';
	}
}












