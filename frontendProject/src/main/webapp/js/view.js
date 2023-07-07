// list.js 에서 클릭된 게시물 번호 호출
let no = sessionStorage.getItem('no');
let boardList = JSON.parse(localStorage.getItem('boardList'));

console.log('선택된 게시물 번호 : ' + no);

onView();
function onView(){
	// 식별자 : 인덱스, 게시물번호=>인덱스 찾기
	// 1. 해당하는 게시물번호의 게시물찾기
	for(let i = 0; i < boardList.length; i++){
		let b = boardList[i]	// i번째 게시물을 꺼내기
		if(b.no == no){
			// 만약에 i번째 게시물번호와 클릭된 게시물 번호와 같으면
			console.log(b);
			break;
		}
	}
}




























