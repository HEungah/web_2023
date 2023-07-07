console.log('js 파일 실행');

/*섬머노트를 실행할때 사용하는 코드*/
$(document).ready(function() {
  $('#summernote').summernote({
	  
	  lang : 'ko-KR', // 한글 적용[ 한글.JS CDN필요]
	  height : 500,
	  placeholder : '여기에 내용 작성'
	  
  });
});

// ----------------------------------------------------
// 수정할 게시물 = 클릭된 게시물 = 현재 보고있는 게시물 [세션에 저장되어있는 번호]
let no = sessionStorage.getItem('no');
let boarderList = JSON.parse(localStorage.getItem('boardList'));

// 수정할 게시물을 출력
onView();
function onView(){
	let title = document.querySelector('.title');
	let content = document.querySelector('#summernote');
	
	// 클릭된 게시물의 정보 1개
	for(let i = 0; i < boarderList.length; i++){
		let b= boarderList[i];
		if(b.no == no){
			// 3. 출력/대입
			title.value = b.title;
			content.value = b.content;
			break;
		}
	}
	
}// f end

// 수정된 게시물을 리스트에 저장
function onUpdate(){
	console.log('onUpdate 함수 실행');
	
	let title = document.querySelector('.title').value;
	let content = document.querySelector('#summernote').value;
	let userNo = 0;
	
	for(let i = 0; i < boarderList.length; i++){
		let b= boarderList[i];
		if(b.no == no){
			userNo = i;
			break;
		}
	}
	
	let board = {
		title : title,	//	입력받은 값
		content : content,	// 입력받은 값
		no : Number(no),			// 게시물 번호
		date : `${new Date().getFullYear()}-${new Date().getMonth()}-${new Date().getDate()}`,
		view : 0,	// 게시물 조회수 0부터 시작
		like : 0,	// 게시물 추천수 0부터 시작
		writer : boarderList[userNo].writer	// 게시물 작성자
	}
	
	boarderList[userNo] = board;
	
	localStorage.setItem('boardList', JSON.stringify(boarderList));
	
	alert('수정 성공');
	
	location.href="list.jsp";
}























