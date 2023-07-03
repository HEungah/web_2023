/*



*/

// 누구를 ~~ : userbox 를
// 1. 조작//제어할 HTML 태그 호출
let userbox = document.querySelector('.userbox');

// 어떻게~~ : 키보드를 누를때
document.body.addEventListener('keydown', (e)=>{
	console.log('키 눌림');
	
	console.log(e);	// keydown 이벤트 상태 객체
	
	if(e.keyCode == 37){
		console.log('왼쪽으로 이동');	// css left 차감
		userbox.style.left--;
	}else if(e.keyCode == 39){
		console.log('오른쪽으로 이동');	// css left 증가
		userbox.style.left++;
	}
	
	console.log(userbox.style.left);
})























