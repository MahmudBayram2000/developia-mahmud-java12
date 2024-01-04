let editMode=false;

let product={};

function saveStudent(event){
    event.preventDefault();

    let name=document.getElementById('student-name').value;
    let surname=document.getElementById('student-surname').value;
    let address=document.getElementById('student-address').value;
    let phone=document.getElementById('student-phone').value;


   
    student.name=name;
    student.surname=surname;
    student.address=address;
    student.phone=phone;

    

    let xml= new XMLHttpRequest();

   

if(editMode){

  xml.onload=function(){
    alert(' yadda saxlanildi');
    //window.location.href='products.html';
  }

  // buradaa rekadte api snne gonder 
 // product.id=Number(localStorage.getItem('productId'));
  xml.open('PUT','http://localhost:8080/students',true);
  xml.setRequestHeader('Authorization',localStorage.getItem('token'));
  xml.setRequestHeader('Content-Type','application/json');

  xml.send(JSON.stringify(student));

}else{

  xml.onload=function(){
    if(this.status==400){
      alert(JSON.parse(this.responseText).message);
    }else{
      alert('yadda saxlanildi');
     window.location.href='students.html';
    }
    
  }

  

  xml.open('POST','http://localhost:8080/students',true);
    xml.setRequestHeader('Authorization',localStorage.getItem('token'));
    xml.setRequestHeader('Content-Type','application/json');

    xml.send(JSON.stringify(product));
}
    

    



}




if(localStorage.getItem('productEditMode')=='true'){
editMode=true;
let id=Number(localStorage.getItem('productId'));


// burada i ye gore mehsulu apiden yukle


let xml= new XMLHttpRequest();

xml.onload=function(){
  product=JSON.parse(this.responseText);

  document.getElementById('product-name').value=product.name;
  document.getElementById('product-cost').value=product.cost;
  document.getElementById('product-price').value=product.price;
  document.getElementById('product-barcode').value=product.barcode;

}

 
 
xml.open('GET','http://localhost:8080/students/'+id,true);
xml.setRequestHeader('Authorization',localStorage.getItem('token'));
  
xml.send( );


}