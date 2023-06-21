/*
	요구사항1 : 아이디와 비밀번호를 입력받아 회원가입을 진행하고 싶어요.
   [조건1] 
      입력 <input> 사용 해서 아이디 입력받기 
      입력 <input> 사용 해서 비밀번호 입력받기 
   [조건2]
      * 1차원배열만 사용 [ 배열 변수 여러개 사용 가능 ]
   [조건3]
      <input type="button"> 사용해서 회원가입 이벤트 실행 [ 회원가입함수 구현하기 ]

-------------------------------------------------------------------
요구사항2 : 아이디와 비밀번호를 입력받아 로그인 을 진행하고 싶어요.
   [조건1]
      입력 <input> 사용 해서 아이디 입력받기 
      입력 <input> 사용 해서 비밀번호 입력받기 
   [조건2] 
      만약에 배열에 존재하는 아이디,비밀번호가 일치한 데이터가 있을경우
      [ 로그인 성공 ] 아니면  [ 로그인 실패 ] alert 로 출력해주세요.
   [조건3]
      <input type="button"> 사용해서 로그인 이벤트 실행    [ 로그인함수 구현하기 ]
------------------------------------------------------------------------
요구사항3 : 유효성검사 진행해주세요.  
   1. 만약에 입력상자[input] 에 공백 이면 학번을 입력해주세요~       [ if( sno2Value == '' ) ]
   2. 회원가입 이나 로그인시 성공시에 입력상자[input] 의 value 다시 공백으로 초기화 해주세요.   [ sno2.value = '' ]
   3. 입력상자[input]에 입력한 아이디 와 비밀번호 가 8자리가 이상일경우에만 회원가입하도록 해주세요.   [ sno2Value.length !=8  ]

요구사항4 : 기본적인 css 작업해주세요
   1. (필수) div 2개를 만들어서 [ 왼쪽은 회원가입 구역 ] [ 오른쪽은 로그인 구역 ]
   2. 그외 이쁘게 꾸며주세요. 
*/

let idList = []		// id 리스트
let pwList =[]	// password 리스트

function membership(){

	let idInput = document.querySelector('.member_id')
	let pwInput = document.querySelector('.member_password')
	
	let id = 0
	if(idInput.value == ''){
		idInput.value = '201411782'
		id = idInput.value
	}else(id = idInput.value)
	
	let pw = pwInput.value
	
	let idIndex = idList.indexOf(id)
	
	if(idIndex == -1){
		if(id.length >= 8){
			if(pw.length >= 8){
				idList.push(id)
				pwList.push(pw)
				alert('회원가입이 완료되었습니다.')
			}else{alert('비밀번호를 8자리 이상 입력해주세요.')}
		}else(alert('아이디를 8글자 이상 입력해주세요.'))
	}else(alert('중복된 아이디입니다.'))
	
	console.log(idList)
	console.log(pwList)
	
	idInput.value = ''
	pwInput.value = ''
	
}

function login(){

	let idInput = document.querySelector('.login_id')
	let pwInput = document.querySelector('.login_password')
	
	let id = idInput.value
	let pw = pwInput.value
	
	let idIndex = idList.indexOf(id)
	let pwIndex = pwList.indexOf(pw)
	
	if(idIndex != -1){
		if(pwIndex != -1){
			if(idIndex == pwIndex){
				alert('로그인 성공!')
			}else(alert('아이디 또는 비밀번호가 틀렸습니다.'))
		}else(alert('비밀번호가 틀렸습니다.'))
	}else(alert('아이디가 틀렸습니다.'))
	
	
	idInput.value = ''
	pwInput.value = ''
	
}


















