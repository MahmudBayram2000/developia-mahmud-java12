function login(){

    event.preventDefault();
    let username=document.getElementById('username').value;
    let password=document.getElementById('password').value;

    let token='Basic '+window.btoa(username+":"+password);

    let xml=new XMLHttpRequest();

    xml.onload=function(){
        //alert('True you can continue')
        localStorage.setItem('token',token);
        window.location.href='products.html';
    }

    xml.onerror=function(){

        alert('False login ')

    }
    
    xml.open('GET','http://localhost:8080/users/login',true);
    xml.setRequestHeader('Authorization',token);
    xml.send();
}