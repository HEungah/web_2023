console.log('js파일 실행');

let 회원리스트 = [];	// member객체 여러개를 저장하는 배열

function 등록(){	// 회원가입 버튼을 클릭했을때 실행
	console.log('등록함수 실행');
	// 1. 입력값 가져오기
		// 1. document.qerySelector('.클래스').value;
		// 2. document.querySelector('#id').value;
		
	let mid = document.querySelector('#mid').value;
	let mpwd = document.querySelector('#mpwd').value;
	
	console.log(mid);
	console.log(mpwd);
	
	
	/*	return을 이용한 유효성 검사
	if(mid == ''|| mpwd == ''){alert('회원가입 실패 : 회원정보를 모두 입력해주세요'); return;}
	if(mid.length < 8 || mpwd.length < 8){alert('회원가입 실패 : 8글자 이상 입력해주세요'); return;}}
	*/
	
	// *유효성검사1
	if(mid == ''|| mpwd == ''){	// 입력한 값이 하나라도 공백이면
		alert('회원가입 실패 : 회원정보를 모두 입력해주세요')
	}else{
		
		// *유효성검사2
		
		if(mid.length < 8 || mpwd.length < 8){	// 입력값이 하나라도 길이가 8미만이면
			alert('회원가입 실패 : 8글자 이상 입력해주세요')
		}else{
	
			// 2. 객체에 담기(입력된 데이터(mid, mpwd)를 {}안에서 속성명(아이디, 비밀번호) 붙여서 저장)
			let member = {아이디 : mid, 비밀번호 : mpwd};
			console.log(member);
			
			// 3. 등록할때(함수실행)마다 객체 계속 생성되고 함수가 끝나면 객체 초기화
			// 밖에 전역변수 만들어서 저장해야함 (객체배열 생성)
			// *{}안에서 선언된 객체를 전역 배열에 저장
			
			회원리스트.push(member);
			alert('회원가입성공')
			}
	}
	
	// --------------입력상자 초기화---------------
	document.querySelector('#mid').value = '';
	document.querySelector('#mpwd').value = '';
	
	
}	// function end (mid,mpwd,member 모두 초기화)

// 2. 로그인
function 로그인(){	// 로그인버튼을 클릭했을때 실행
	// 1. 입력된 값을 가져오기
	let mid2 = document.querySelector('#mid2').value;
	let mpwd2 = document.querySelector('#mpwd2').value;
	
	let login = false;
	
	// 2. 입력된 값이 존재하는지 검사
		// - 회원리스트(전체) 중에서 회원1개씩 꺼내서 검사하는데 아이디와 비밀번호 일치하는것
	for(let i = 0; i<회원리스트.length; i++){
		//i는 0ㅜ터 마지막인덱쓰까지 1씩 증가 반복 -> 회원리스트에서 회원1명씩 꺼내기
		if(회원리스트[i].아이디 == mid2){	// i번째 인덱스의 객체1개 꺼내기
			if(member.비밀번호 == mpwd2){
				login = true;	// i번째 객체는 로그인 성공했다는것을 변수에 저장
				i=회원리스트.length;	// 로그인성공 1회성이기 때문에 로그인 성공시 다른 객체는 검사할 필요 없음(강제 종료)
				//break;		가장 가까운 반복문 종료
			}
		}
	}
	
	if(login == true){
		alert('로그인 성공')
	}else{alert('로그인 실패')}	
	
	
	// --------------입력상자 초기화---------------
	document.querySelector('#mid2').value = '';
	document.querySelector('#mpwd2').value = '';
}

















