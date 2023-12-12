let editMode=false;

let product={};

function  saveProduct(){

    event.preventDefault();
    let name=document.getElementById('product-name').value;
    let cost=document.getElementById('product-cost').value;
    let barcode=document.getElementById('product-barcode').value;
    let price=document.getElementById('product-price').value;

    let product={};
    product.name=name;
    product.cost=cost;
    product.barcode=barcode;
    product.price=price;

    let xml=new XMLHttpRequest();

    xml.onload=function(){
        alert('Product registered')  
        window.location.href='products.html';

        
    }


    if(editMode){
        xml.open('PUT','http://localhost:8080/products',true);
        xml.setRequestHeader('Authorization',localStorage.getItem('token'));
        xml.setRequestHeader('Content-Type','application/json');
      
        xml.send(JSON.stringify(product));
      
      }else{
        xml.open('POST','http://localhost:8080/products',true);
          xml.setRequestHeader('Authorization',localStorage.getItem('token'));
          xml.setRequestHeader('Content-Type','application/json');
      
          xml.send(JSON.stringify(product));
      }

      if(localStorage.getItem('productEditMode')=='true'){
        editMode=true;
        let id=Number(localStorage.getItem('productId'));
        
        
        
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
}