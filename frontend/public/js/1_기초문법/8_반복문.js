/*
	
	반복문 : 
		1. for( 1.초기값; 2.조건문; 4.증감식){
			3. 실행문;
		}
			1. 초기값 : 반복의 처음값
			2. 조건문 : 조건이 true이면 {}실행 아니면 []실행x
			3. 실행문 : 반복시 실행될 코드
			4. 증감식 : 반복변수 증가/감소 단위
		ex) 1부터 10까지 1씩 증가 반복
			for(let i = 1; i <=10; i++){}
		ex) 1부터 100까지 홀수만 반복
			for(let i = 1; i<=100; i+=2){}	
*/

// 1.
	// let i = 0;	// 1. 초기값(i는 반복시 사용되는 증감변수)
	// i<10			// 2. 조건문(조건결과가 true이면 {} 실행되는 조건)
	// i++			// 3. 증감식({} 실행후 다음으로 증감변수 계산식)
for(let i = 0; i<3; i++){	// for start
	
	// i는 0부터 10미만까지 1씩증가 반복
	console.log('반복횟수 : ' + i)
	
	/*
		순서도 = 알고리즘 != 자료구조
		1. 생활속 순서도 2. 백준 3. 프로그램개발 순서
		
		1. let i = 0		=>	i = 0
		2. i < 3			=>	ture => {}
		3. console.log();	=>	0 출력
		-----------
		4. i++				=>	i = 1
		5. i<3				=>	true => {}
		6. console.log();	=>	1 출력
		-----------
		7. i==				=>	i = 2
		8. i<3				=>	true => {}
		9. console.log();	=>	2 출력
		-----------
		10. i++				=>	i = 3
		11. i<3				=>	false => 못 들어감
	*/
	
}	// for end


//	2. 배열( 인덱스 )과 반복문

let 상자 = ['사과','포도', '딸기'];
	// 1. 반목문 없을때
console.log(상자[0]);
console.log(상자[1]);
console.log(상자[2]);
	// 2. 반복문 사용할때[i 반복변수를 인덱스 대신 사용]
for(let i = 0; i<상자.length; i++){
	console.log(상자[i]);	
}

// 예제1) i는 1부터 10이하까지 1씩 증가 반복
console.log('------ex1--------');
for(let i = 1; i<=10; i++){
	console.log(i);
}

// 예제2) i는 1부터 10이하까지 1씩 증가 반복[한줄에 표시]
console.log('------ex2--------');
let output = ``;
for(let i = 1; i<=10; i++){
	output += `${i} `	// (+=) i변수를 output 변수에 추가
}
console.log(output);

// 예제3) i는 1부터 10이하까지 1씩 증가 반복 [HTML 표시]
console.log('------ex3--------');
output= ``;		// 위에서 사용한 output변수를 공백으로 초기화
for(let i = 1; i <= 10; i++){
	output += `<p> ${i} </p>`
}
document.write(output)

// 예제4) i는 1부터 10이하까지 1씩 증가 반복 (누적합계)
console.log('------ex4--------');
let sum = 0;	// 1부터 10까지 누적으로 더한 값을 저장할 변수
for(let i = 1; i<=10; i++){
	sum += i;	// 기존 sum 변수에 i를 더한값을 sum 변수에 대입
}
console.log(sum)

/*
	예제4 순서도
	
	초기값 i = 1	/	sum = 0
	for 시작
		i		조건			실행			누계			증감
		1		1<=10 true	0 +=1		0+1=1		i++
		2		2<=10 true	1 +=2		1+2=3		i++
		3		3<=10 true	3 +=3		3+3=6		i++
		4		4<=10 true	6 +=4		6+4=10		i++
		5		5<=10 true	10 +=5		10+5=15		i++
		6		6<=10 true	15 +=6		15+6=21		i++
		7		7<=10 true	21 +=7		21+7=28		i++
		8		8<=10 true	28 +=8		28+8=36		i++
		9		9<=10 true	36 +=9		36+9=45		i++
		10		10<=10 true	45 +=10		45+10=55	i++
		11		11<=10 false x(실행하지 않음) -> 반복문 종료
*/

// 예제5) i는 1부터 100까지 7배수 누적합계
	// 1. 7씩 증가방식
console.log('------ex5--------');
sum = 0;
for(let i = 0; i<=100; i+=7){
	sum += i;
}
console.log(sum);

	// 2. if(값%7 == 0)
sum = 0;
for(let i = 0; i<=100; i++){
	if(i % 7 == 0){
		sum += i;
	}
}	
console.log(sum)


// 예제6) 구구단(2단)
console.log('------ex6--------');
const 단2 = 2;
for(let i = 1; i <= 9; i++){
	console.log(`${단2} * ${i} = ${단2 * i}`);
}

// 예제7) 구구단(2단~9단)
/*

2단
	2*1
	~~
	2*9
3단
	3*1
	~~
	3*9	
사단
	4*1
	~~
	4*9	
*/

// 1단계 : 단 만들기(2부터 9까지 1씩증가)
for(let 단 = 2; 단<=9; 단++){
	console.log("단 : " + 단);
	
}

//2단계 : 곱 만들기(1부터 9까지 1씩 증가)
for(let 곱 = 1; 곱<=9; 곱++){
	console.log("곱 : " + 곱);
}	

//3단계 : 1, 2단계 합치기
for(let 단 = 2; 단<=9; 단++){
	for(let 곱 = 1; 곱<=9; 곱++){
		console.log(`${단} * ${곱} = ${단*곱}`);
	}	// 곱 end
}	// 단 end
















