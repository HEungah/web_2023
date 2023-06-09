console.log('list.js 실행');

// 1. 쿠키에 있는 배열 호출 [ 페이지[JS] 열리면]

let boardList = JSON.parse(localStorage.getItem('boardList'));
	// 쿠키 세션에 저장된 객체/배열 호출시 JSON.parse()
	// 쿠키/세션에 저장된 객체/배열 저장시 JSON.stringify()
if(boardList == null)boardList = []	

// 1. 게시물 출력 함수 [페이지[JS] 열리면]
boardPrint();
function boardPrint(){
	// 어디에
	let tcontent = document.querySelector('.tcontent')
	// 무엇을
	let html = ``;
		// HTML 구성 : 쿠키에서 꺼내온 배열을 반복문 해서 HTML 누적 더하기
	for(let i = 0; i < boardList.length; i++){
		let board = boardList[i];
		html += `
				<tr>
					<td>${board.no}</td><td onclick="onViewLoad(${board.no})">${board.title}</td><td>${board.writer}</td>
					<td>${board.date}</td><td>${board.view}</td><td>${board.like}</td>
				</tr>		
				`
	}	
	
	tcontent.innerHTML = html;
	
}	// f end

// 2. 게시물 상세페이지로 이동[실행조건 : 클릭한 게시물 제목]
function onViewLoad(no){
	console.log('현재 클릭한 게시물의 번호 -> ' + no);
	// 조회수 증가 알고리즘
	for(let i = 0; i < boardList.length; i++){
		let b = boardList[i];
		if(b.no == no){
			boardList[i].view++;
			// 만약에 세션/쿠키 사용중 이라면 ...업데이트
			localStorage.setItem('boardList', JSON.stringify(boardList));
			break;
		}
	}
	
	
	sessionStorage.setItem('no',no);
	// 페이지 이동
	location.href="view.jsp";
}






























