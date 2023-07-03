/*



*/

// 누구를 ~~ : userbox 를
// 1. 조작//제어할 HTML 태그 호출
let userbox = document.querySelector('.userbox');

// 유저 위치 = x 좌표
let u_left = 50;

// 어떻게~~ : 키보드를 누를때
document.body.addEventListener('keydown', (e)=>{
	console.log('키 눌림');
	
	console.log(e);	// keydown 이벤트 상태 객체
	
	if(e.keyCode == 37){
		console.log('왼쪽으로 이동');	// css left 차감
		u_left -= 10;	// 10차감
		// *유효성검사[ 배경밖을 못나가게 해야함]
		if(u_left < 0){u_left = 0;}
	}else if(e.keyCode == 39){
		console.log('오른쪽으로 이동');	// css left 증가
		u_left += 10;	// 10증가
		if(u_left > 910){u_left = 910;}
		
		userbox.style.backgroundImage = `url(img/move.png)`;
		
	}else if(e.keyCode == 65){	// 만약에 a키를 눌렀을때
		console.log('공격');
		userbox.style.backgroundImage = `url(img/atack.png)`;	// 공격이미지 출력
	}
	
	// 3. 캐릭터 박스 이동
	userbox.style.left = `${u_left}px`;
	
	console.log(userbox.style.left);
})	// f end


// 2. 키 누르고 떼었을때 = keyup
document.body.addEventListener('keyup', (e)=>{
	// 이동을 멈췄을때 원래 이미지 출력
	userbox.style.backgroundImage = `url(img/캐릭터.png)`;
})

























