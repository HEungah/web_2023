// list.js 에서 클릭된 게시물 번호 호출
let no = sessionStorage.getItem('no');
let boardList = JSON.parse(localStorage.getItem('boardList'));

console.log('선택된 게시물 번호 : ' + no);

onView();
// 게시물 상세보기 출력 [실행조건 : 페이지가 열렸을때 실행]
function onView(){
	// 식별자 : 인덱스, 게시물번호=>인덱스 찾기
	
	let title = document.querySelector('.title');
	let writerdate = document.querySelector('.writerdate')
	let content = document.querySelector('.content');

	// 1. 해당하는 게시물번호의 게시물찾기
	for(let i = 0; i < boardList.length; i++){
		let b = boardList[i]	// i번째 게시물을 꺼내기
		if(b.no == no){
			// 만약에 i번째 게시물번호와 클릭된 게시물 번호와 같으면
			console.log(b);
			title.innerHTML = b.title;
			writerdate.innerHTML = `작성자 : ${b.writer} 작성일 : ${b.date}`;
			content.innerHTML = b.content;
			break;
		}
	}// for end
}

function onDelete(){	// 삭제하기 버튼을 눌렀을때 실행
	
	// 1. 해당하는 게시물번호의 게시물찾기
	for(let i = 0; i < boardList.length; i++){
		// i번째 게시물을 꺼내기
		if(boardList[i].no == no){
			// 만약에 i번째 게시물번호와 클릭된 게시물 번호와 같으면 해당 인덱스를 삭제
			boardList.splice(i, 1);
			localStorage.setItem('boardList', JSON.stringify(boardList)) ;
			
			sessionStorage.removeItem('no');	// 클릭된 게시물 번호는 세션에서 삭제
			break;
		}
	}// for end
	
	location.href = "list.jsp";
}


function modifyContent(){	// 수정하기 버튼을 눌렀을때 실행
	console.log('수정하기 함수 실행');
	
	location.href="update.jsp";
}



























