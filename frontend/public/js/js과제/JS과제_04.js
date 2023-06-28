/*
	글쓰기 
		작성자, 비밀번호, 제목, 내용, 글등록 버튼
	
	글목록 페이지
		번호 제목 작성자 작성일 조회수 테이블에 추가
		(클릭하면 조회수 증가)
		
	글보기 페이지
		글목록 클릭할때마다 그 글로 바뀜	
		제목 내용 작성자 삭제 버튼(비밀번호 확인)

	- 객체 써야함  4개 속성


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
	
	// 받아온 값을 객체에 저장
	let post ={writer : writerInput, pw : pwInput, title : titleInput, content : contentInput, view : Number(count)}
	
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
	postslist.splice(index, 1);
	
	pageAdd();
	
	let postInput = document.querySelector('.viewpost');
	let postHTML = ``;
	postInput.innerHTML = postHTML;
}














