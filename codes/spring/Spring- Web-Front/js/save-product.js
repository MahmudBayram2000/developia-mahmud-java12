let editMode=false;

let product={};

function saveProduct(event){
    event.preventDefault();

    let name=document.getElementById('product-name').value;
    let cost=document.getElementById('product-cost').value;
    let price=document.getElementById('product-price').value;
    let barcode=document.getElementById('product-barcode').value;


   
    product.name=name;
    product.cost=cost;
    product.price=price;
    product.barcode=barcode;

    

    let xml= new XMLHttpRequest();

   

if(editMode){

  xml.onload=function(){
    alert('Mehsul yadda saxlandi');
    //window.location.href='products.html';
  }

  // buradaa rekadte api snne gonder 
 // product.id=Number(localStorage.getItem('productId'));
  xml.open('PUT','http://localhost:8080/products',true);
  xml.setRequestHeader('Authorization',localStorage.getItem('token'));
  xml.setRequestHeader('Content-Type','application/json');

  xml.send(JSON.stringify(product));

}else{

  xml.onload=function(){
    if(this.status==400){
      alert(JSON.parse(this.responseText).message);
    }else{
      alert('Mehsul yadda saxlandi');
     window.location.href='products.html';
    }
    
  }

  

  xml.open('POST','http://localhost:8080/products',true);
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

 
 
xml.open('GET','http://localhost:8080/products/'+id,true);
xml.setRequestHeader('Authorization',localStorage.getItem('token'));
  
xml.send( );


} 