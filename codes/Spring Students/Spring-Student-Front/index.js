function login(event){
    event.preventDefault();

    loginProcess();


}


function loginAsTeacher(){
  document.getElementById('username').value='Orxan';
  document.getElementById('password').value='0041';
  loginProcess();
}


function loginAsTeacher(){
  document.getElementById('username').value='Kenan';
  document.getElementById('password').value='1234';
  loginProcess();
}
function loginProcess(){
  let username=document.getElementById('username').value;
    let password=document.getElementById('password').value;

    // AJAX

let token='Basic '+window.btoa(username+":"+password);


   let xml= new XMLHttpRequest();

   xml.onload=function(){

    localStorage.setItem('token',token);
    localStorage.setItem('username',username);

    // alert('duzdu esas sehifee kecmek olar')
    if(this.responseText=='ADMIN'){
      window.location.href='products.html';
    }else{
      window.location.href='cashier.html';
    }


   }

   xml.onerror=function(){
     alert('sef yazdin');
       }


   xml.open('GET','http://localhost:8080/users/login',true);
   xml.setRequestHeader('Authorization',token);
   xml.send();

}


function openSignupPage(){
  window.location.href='signup.html';
}