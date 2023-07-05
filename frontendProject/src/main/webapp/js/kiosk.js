console.log('kiosk.js 파일 실행')

// ------------샘플 데이터----------------------

// 1. 광고이미지 변경
	// 1) 광고이미지 여러개 = 배열
let bimgList = ['burgerkingh1.png', 'burgerkingh2.png', 'burgerkingh3.png',
	'burgerkingh4.png', 'burgerkingh5.png'];
// 2. 카테고리 출력 함수
	// 1) 카테고리 여러개 저장하는 배열
let categoryList = ['신제품(NEW)','프리미엄' ,'와퍼&주니어', '치킨&슈림프버거', '올데이킹&킹모닝']
	// 1. 제품 여러개 저장하는 배열
		// 서로 다른 유형들의 데이터 여러개 저장 = 객체, 같은 유형들의 데이터 여러개 저장 = 배열
		// 버거이름, 버거가격, 버거이미지, 버거카테고리
		// 다른 배열이나 객체의 연관관계 생각해서 변수설정(카테고리(상위) ---> 제품(하위))
let burgerList = [
	{name : '헬로디아블로와퍼', price : 9500, img : '헬로디아블로와퍼.png', category: 0},
	{name : '헬로릴리트와퍼', price : 9000, img : '헬로릴리트와퍼.png', category: 0},
	{name : '치킨킹BLT', price : 8900, img : '치킨킹BLT.png', category: 3}
]	

	// 카트(장바구니) 배열/ 선택 버거들이 저장되는 배열
	// 버거의 식별키를 저장
let cartList = [];	
	// 주문(주문내역)배열
	/*
		주문{주문번호 : , 주문날짜 : , 결제금액 : , 주문내역 : [], 상태 : 0[주문요청], 1[주문완료], 2[주문취소]}
	*/
let orderList = [
	{ono : 1, date : '2023-07-05 13:32:28', pay : 30000, products : [0, 0, 2], state : 1}
];



// ---------------------------------------------


	// 2) 특정시간마다 이미지의 src 변경하기
		// -setInterval(함수/기능, 밀리초)
let viewhimg = 0	// 현재 출력중인 광고 이미지 인덱스를 저장하고 있는 변수		
		
setInterval( ()=>{
	// 해당 이미지 태그 호출
	let himg = document.querySelector('.himg');
	// 클래스의 속성명을 바꿀 수 있다.
	viewhimg++;		// 인덱스 증가시킴[다음이미지로 변경]
	//	만약에 마지막 인덱스 다음이면 처음 인덱스로 이동
	if(viewhimg >= bimgList.length){
		viewhimg = 0;
	}
	himg.src = `../img/${bimgList[viewhimg]}`

	
}, 2500 );	// 2.5초마다 실행코드가 주기적으로 실행		

	// 2) 카테고리 출력 함수 정의[실행 조건 : 1. 페이지 열렸을때 2. 
categoryPrint(0);	// 최초로 실행했을때는 가장 앞에 있는 카테고리 선택
function categoryPrint(selectNo){
	let categorymenu = document.querySelector('.categorymenu');
	let html = ``;
		// HTML 구성 : 배열내 모든 데이터(for)를 li 형식으로 출력
	for(let i = 0; i < categoryList.length; i++){
		if(i == selectNo){
			html += `<li onclick="categorySelect(${i})" class="categoryselect">${categoryList[i]}</li>`
		}else{html += `<li onclick="categorySelect(${i})">${categoryList[i]}</li>`}
	}	
	// 3) 구성된 html 출력
	categorymenu.innerHTML = html;
	productPrint(selectNo);
}	

// 3. 카테고리 클릭 함수
function categorySelect(selectNo){	// 실행조건 : 1. li에서 클릭햇을때
	// <li> 여러개 존재 하는데 무엇을 선택했는지 식별
	// 카테고리의 '모든' li 호출
	// querySelector -> 객체 1개 호출	querySelectorAll -> 여러개 객체를 배열로 호출
	let categoryli = document.querySelectorAll('.categorymenu li');
	console.log(categoryli);
	
	// 해당 선택된 인덱스의 class 추가
	// JS에서 class 추가 / 삭제 가능
	for(let i = 0; i<categoryList.length; i++){
		// 선택된 카테고리의 i번째 카테고리 찾기
		if(i == selectNo){
			// 해당 li 에 class 추가 : DOM객체명.classList.add('새로운클래스명')
			categoryli[i].classList.add('.categoryselect');
		}else{
			// 해당 li 에 class 삭제 : DOM객체명.classList.remove('삭제할클래스명')
			categoryli[i].classList.remove('.categoryselect');
		}
	}
	categoryPrint(selectNo);
	productPrint(selectNo);
}

// 4. 제품 출력 함수[실행 조건 : 1. 카테고리 클릭(변경)시]
function productPrint(categoryNo){	// 어떤 카테고리의 제품을 출력해야하는지(인수판단)
	// 1. 출력을 어디에 해야하는지
	let productbox = document.querySelector('.productbox');
	// 2. 무엇을 출력해야하는지[ 선택된 카테고리에 맞는 제품들만 출력]
	let html = ``;
		// html 구성
		for(let i = 0; i < burgerList.length; i++){// 모든 버거배열/리스트[서랍장] 열어서 확인 
			if(burgerList[i].category == categoryNo){
				html += `
						<div onclick="productSelect(${i})" class="product">
							<img src="../img/${burgerList[i].img}"/>
							<div class="pinfo">
								<div class="pname">${burgerList[i].name}</div>
								<div class="pprice">${burgerList[i].price.toLocaleString()}원</div>
							</div>
						</div>
						`
			}
		}
	// 3. 어떻게 출력해야하는지
	productbox.innerHTML = html;
	
}

// 5. 제품 선택해서 카트에 담는 함수[실행 조건 : 제품 이미지 클릭시]
function productSelect(productNo){	// 어떤 제품을 카트에 담아야 하는지(인수판단)
	console.log(burgerList[productNo].name);
	// 선택된 버거의 식별키를 배열에 저장[ 버거의 모든 정보를 저장할 필요가 없음]
	cartList.push(productNo); console.log(cartList);
	
	cartPrint();
}

// 6. 카트내 버거들을 출력 함수
function cartPrint(){	// 인수 없음
	let cartbottom = document.querySelector('.cartbottom');
	let html = ``;
	let total = 0;		// 버거들의 가격 총액을 저장하는 변수
	
	for(let i = 0; i < cartList.length; i++){
		html += `
				<div class="citem">
					<div class="iname">${burgerList[cartList[i]].name}</div>
					<div class="iprice">${burgerList[cartList[i]].price}원</div>
					<span onclick="productCancle(${i})" class="icancel">x</span>
				</div>
				`
		total += burgerList[cartList[i]].price;		
	}
	
	cartbottom.innerHTML = html;
	// 카트내 제품 수
	document.querySelector('.ccount').innerHTML = `${cartList.length}`;
	// 카트내 제품 총액
	document.querySelector('.ctotal').innerHTML = `${total.toLocaleString()}원`;
	// 만약에 카트내 제품이 많아서 가로 스크롤이 생성되었을때 자동으로 스크롤을 가장 오른쪽에 위치시킴
	cartbottom.scrollLeft = 10000;
	
}

// 7. 카트내 버거 부분 취소 함수[실행조건 : 카트내 상품의 x를 클릭했을때]
function productCancle(cartNo){ // 어떤 제품을 취소해야 하는지
	cartList.splice(cartNo, 1);
	
	cartPrint();
}

// 8. 카트내 버거 전체 취소 함수[실행조건 : 취소하기 버튼을 클릭했을때, 주문이 완료되었을때,]
function cartCancel(){	// 인수 없음
	cartList.splice(0); // cartList 배열의 모든 요소를 삭제
	
	cartPrint();
}

// 9. 주문완료 함수[실행조건 : 주문하기 버튼을 클릭했을때]
function productOrder(){	// 인수 없음
	if(cartList.length == 0){
		alert('상품을 선택해주세요.');
		return;
	}
	// 주문번호 만들기
	let orderNum = orderList[orderList.length-1].ono;
	// 카트에 있던 제품 인덱스를 새로운 배열에 저장
	let products = [];
	let totalprice = 0;
	for(let i = 0; i < cartList.length; i++){
		products.push(cartList[i]);	// i 번째 제품을 새로운 배열에 저장
		totalprice += burgerList[cartList[i]].price;
	}
	
	// 1. 주문객체 생성
	let order = {
		ono : orderNum+1,			// 주문번호 생성해서 저장
		date : new Date(),		// 현재 날짜/시간을 구해주는 함수 이용해서 자동생성
		pay : totalprice,				// 제품들의 총 가격
		products : products,	// 카트에 있던 모든 제품들
		state : 0 				// 주문객체 생성시 '주문요청'으로 초기로 사용
	}
	
	// 2. 주문배열에 저장하기
	orderList.push(order);
	
	// 카트 취소(전체취소함수 재호출)
	cartCancel();
	// 주문 리스트 확인
	console.log(orderList);
} // 주문완료 함수 end





















