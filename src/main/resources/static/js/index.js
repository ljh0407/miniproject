alert('확인용')
let stno = 1; // 매장 번호

// 1.매장 등록
function store(){
    alert('버튼')
    let data = { stname : document.querySelector(".stname").value }
    console.log('ㅇㅇㅇㅇㅇㅇㅇ'+data)
    $.ajax({
        url : "/store/setstore" ,
        type : "post",
        data : JSON.stringify(data),
        contentType : "application/json",
        success : function(re) {
            if( re == true){
                alert('매장등록 성공');
                location.reload();  //새로고침
            }
            else{ alert('매장등록 실패')}
        }
    })
}

// 2. 모든 매장 출력
storelist();
function storelist(){

    $.ajax({
        url : "/store/getstore" ,
        type : "get" ,
        success : function(re){
            let html = "<tr><th></th></tr>";
            re.forEach( c =>{
                html += '<button type="button" onclick="bcnochage('+c.stno+')">'+c.stname+'</button>';
            })
            document.querySelector('.storebox').innerHTML = html;
        }
    })
}

// 3. 매장선택하기
function bcnochage( cno ){ stno = cno; alert( stno+'번 매장선택' );  }



 //4. 제품등록
function sale(){
    let data = {
        sname : document.querySelector('.sname').value,
        sprice : document.querySelector('.sprice').value,
    }
    console.log(data)
    $.ajax({  // http 사용하는 jquery 비동기통신 함수 [ 기본값 contentType : text/html ]
        url : "/sale/setsale",
        type : "post",
        data : JSON.stringify(data) ,
        contentType : "application/json",
        success : function(re) {
            if( re == true){
                alert('제품등록 성공');
                location.reload();  //새로고침
            }
            else{
                alert("제품등록 실패");
                location.reload();  //새로고침
             }
        }
    })
}

//5. 제품 출력
salelist()
function salelist(){
    $.ajax({
        url : "/sale/getsale",
        type : "get",
        success : function(list) {
            let html = '<tr>  <th> 번호 </th> <th> 이름 </th> <th> 가격 </th></tr>';
            console.log(list)
            list.forEach( (b) => {
                html +=
                '<tr>  <td> '+b.sno+' </td> <td>'+b.sname+' </td> <td> '+b.sprice+' </td></tr>';
            })
            document.querySelector(".saletable").innerHTML = html;

        }
    })
}
//
// // 6. 페이징
// function getview( stno ){
//     // 1. 클릭한 게시물번호 저장
//     sessionStorage.setItem("stno", stno );
//     // 2. 페이지 전환
//     location.href="";
// }