/*
	글쓰기 
		작성자, 비밀번호, 제목, 내용, 글등록 버튼
		비밀번호로 사용자 식별
		작성자, 비밀번호, 제목을 반드시 입력해야함
	
	글목록 페이지
		번호 제목 작성자 작성일 조회수 테이블에 추가
		(클릭하면 조회수 증가)
		
	글보기 페이지
		글목록 클릭할때마다 그 글로 바뀜	
		제목 내용 작성자 삭제 버튼(비밀번호 확인)
		삭제버튼을 누르면 글보기 페이지도 초기화

	- 객체 써야함  4개 속성
	
	작업순서

	1. 글쓰기 페이지 html 작성
	
	2. 작성된 게시글은 postInpt() 함수 실행중에 객체(post)로 저장, 
		객체를 저장할 전역배열 생성(postlist), 작성할때의 시간을 저장할 datelist전역배열 생성
	
	3. 글쓰기 버튼을 누르면 postInput() 함수 실행	
	
	4. postInput() 함수
		1) 조회수 변수를 0으로 초기화
		2) input태그에서 받아온 값을 각 변수에 저장
		3) 작성자, 비밀번호, 제목을 적지 않으면 함수 강제종료
		4) 받아온 값을 게시글 객체에 저장
		5) 객체를 게시글리스트 배열에 저장
		6) 게시글 작성이 성공했으면 input창을 초기화
		7) 게시글 작성시간을 계산하고 datelist 배열에 저장하는 함수실행(datelist()함수)
		8) 게시글을 글 등록 페이지에 출력하는 함수 실행(pageAdd()함수)
	
	5. datelist() 함수
		Date() 객체를 생성후 현재시간을 받아와 생성된 문자열을 datelist배열에 저장한다.
		
	6. pageAdd() 함수
		postlist배열의 길이만큼 반복하여 각 인덱스에 저장되어있는 객체를 html로 출력한다.
		게시글을 클릭하면 postview(index) 함수를 실행하는 onclick 태그를 작성
		
	7. postview(index) 함수
		제목, 내용, 작성자를 출력하는 상세보기 페이지를 생성하는 함수
		제목, 내용, 작성자를 차례로 postlist배열에서 받아와서 출력
		출력된 내용 밑에 removePost(index)를 실행시키는 삭제버튼 생성
		
	8. removePost(index) 함수	
		postlist객체에 저장된 비밀번호와 입력된 비밀번호가 같아야함(다르면 함수 종료)
		인수로 받아온 index에 해당하는 postlist배열의 객체를 삭제
		삭제 후 다시 pageAdd() 함수 실행
		글보기 페이지를 초기화
		
		
	-------------추가된 요구사항--------------
	삭제된 postlist배열의 인덱스번호와 같은 datelist배열의 인덱스의 값도 삭제해야함		
		
			
	
*/

let postslist = [] 	// 게시글 객체를 저장할 배열 생성
let datelist = []	// 작성시간을 저장할 배열 생성




function postInput(){	// 글 등록버튼을 누르면 실행되는 함수
	console.log('글 등록버튼을 눌렀습니다.')
	
	let count = 0;		// 조회수 초기값
	
	let writerInput = document.querySelector('.writer').value;	// 작성자 입력칸의 값을 가져와서 저장
	let pwInput = document.querySelector('.pw').value;	// 비밀번호 입력칸의 값을 가져와서 저장
	let titleInput = document.querySelector('.title').value;	// 제목 입력칸의 값을 가져와서 저장
	let contentInput = document.querySelector('.content').value;	// 내용 입력칸의 값을 가져와서 저장
	
	if(writerInput == '' || pwInput == '' || titleInput == ''){
		alert('작성자, 비밀번호, 제목을 모두 입력해주세요.');
		return;
	}
	
	// 받아온 값을 객체에 저장
	let post ={writer : writerInput, pw : Number(pwInput), title : titleInput, content : contentInput, view : Number(count)}
	
	postslist.push(post);	// 생성된 객체를 postslist 배열에 저장
	
	alert('작성이 완료되었습니다.');
	
	console.log(postslist);
	
	// ----------입력창 초기화----------------
	document.querySelector('.writer').value = '';
	document.querySelector('.pw').value = '';
	document.querySelector('.title').value = '';
	document.querySelector('.content').value = '';
	
	console.log(postslist);
	
	dateAdd();	// 작성시간을 계산하는 함수를 호출
	
	pageAdd();	// 글목록 페이지 테이블 생성 함수 호출
	
}

function pageAdd(){	// 글목록 페이지 테이블 생성 함수
	
	let tableInput = document.querySelector('.tablebody');	// 테이블 내용 속성을 받아와서 저장
	let tableHTML = ``;		// 테이블을 출력하기 위해 html 값을 저장할 변수 생성
	
	
	// 배열 길이만큼 테이블 추가
	for(let i = 0; i < postslist.length; i++){
		// onclick속성을 추가하여 글을 클릭했을때 postview 함수 실행
		tableHTML += `
						<tr onclick="postview(${i})">
							<td>${i + 1}</td>
							<td>${postslist[i].title}</td>
							<td>${postslist[i].writer}</td>
							<td>${datelist[i]}</td>
							<td>${postslist[i].view}</td>
						</tr>
					`;	
	}
	
	tableInput.innerHTML = tableHTML;
	
	
	
	
	
}

function dateAdd(){		// 작성 시간을 계산하는 함수
	
	const date = new Date();	// 등록할때 시간을 입력하기위해 date 객체 생성
	
	const year = date.getFullYear();
	const month = ('0' + (date.getMonth() + 1)).slice(-2);
	const day = ('0' + date.getDate()).slice(-2);
	const hours = ('0' + date.getHours()).slice(-2);
	const minutes = ('0' + date.getMinutes()).slice(-2);
	const seconds = ('0' + date.getSeconds()).slice(-2);
	const dateStr = year + '년 ' + month + '월 ' + day + '일 '
					+ hours + ':' + minutes + ':' + seconds;
					
	datelist.push(dateStr);	// datelist에 현재 작성시간 저장				
}

function postview(index){	// 등록된 글을 클릭하면 조회수 증가하고 글보기 페이지에 상세정보를 표기하는 함수
	postslist[index].view++;	// <tr> 태그를 클릭하면 조회수 상승
	
	pageAdd();	// 조회수를 상승시키고 테이블 출력
	
	let postInput = document.querySelector('.viewpost');	// viewpost 클래스의 내용속성을 가져옴
	let postHTML = ``;		//  html 출력을 위한 변수 생성
	
	postHTML += `
				제목 : ${postslist[index].title}<br/>
				내용 : ${postslist[index].content}<br/>
				작성자 : ${postslist[index].writer}<br/>
				<button onclick="removePost(${index})">삭제</button>
				`
	postInput.innerHTML = postHTML;			
}

function removePost(index){		// post삭제 함수
	let pwcheck = Number(prompt('비밀번호를 입력해주세요'));
	
	if(postslist[index].pw == pwcheck){
		
	

		postslist.splice(index, 1);
		datelist.splice(index, 1);
		
		pageAdd();
		
		let postInput = document.querySelector('.viewpost');
		let postHTML = ``;
		postInput.innerHTML = postHTML;
		
	}else{
		alert('비밀번호가 틀렸습니다.')
	}
}














