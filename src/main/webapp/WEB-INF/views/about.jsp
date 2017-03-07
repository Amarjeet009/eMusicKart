<%@ include file="/WEB-INF/views/template/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<style>
div.img {
    border: 1px solid #ccc;
}

div.img:hover {
    border: 1px solid #777;
}

div.img img {
    width: 100%;
    height: auto;
}

div.desc {
    padding: 15px;
    text-align: center;
}

* {
    box-sizing: border-box;
}

.responsive {
    padding: 0 6px;
    float: left;
    width: 24.99999%;
}

@media only screen and (max-width: 700px){
    .responsive {
        width: 49.99999%;
        margin: 6px 0;
    }
}

@media only screen and (max-width: 500px){
    .responsive {
        width: 100%;
    }
}

.clearfix:after {
    content: "";
    display: table;
    clear: both;
}
</style>
</head>
<body>
<div class="container-wrapper">
    <div class="container">

        <div class="page-header">
            <h1>About Us</h1>
             <p>A Company based in Noida, India passionate about musical instruments and supplying quality musical instruments in India. 
  Pianos, Keyboards, Guitars, Drums & other musical instruments are delivering through out the country. Satisfied customers and 
  their continues feedback helping us to growing our musical instruments online store to next level and their satisfied wording 
  about the muscial instruments products are the key successful reason of our growth in last few years. Musicstores.in is selling 
  musical instruments in india at most cheaper rate. Enjoy your shopping at musicstores.in with Cash on Delivery option.

   <br>On eMusicKart.com, customers have too many choices while purchasing a Yamaha keyboard, Casio Keyboard, Roland Keyboard. 
   Stay assure with our quick delivery process. Explore today at india's biggest online musical instruments store</p>
        </div>
</div>
</div>


       <div class="responsive">
  <div class="img">
    <a target="_blank" href="img_fjords.jpg">
      <img src="img_fjords.jpg" alt="Trolltunga Norway" width="300" height="200">
    </a>
    <div class="desc">Add a description of the image here</div>
  </div>
</div>


<div class="responsive">
  <div class="img">
    <a target="_blank" href="img_forest.jpg">
      <img src="img_forest.jpg" alt="Forest" width="600" height="400">
    </a>
    <div class="desc">Add a description of the image here</div>
  </div>
</div>

<div class="responsive">
  <div class="img">
    <a target="_blank" href="img_lights.jpg">
      <img src="img_lights.jpg" alt="Northern Lights" width="600" height="400">
    </a>
    <div class="desc">Add a description of the image here</div>
  </div>
</div>

<div class="responsive">
  <div class="img">
    <a target="_blank" href="img_mountains.jpg">
      <img src="img_mountains.jpg" alt="Mountains" width="600" height="400">
    </a>
    <div class="desc">Add a description of the image here</div>
  </div>
</div>

<div class="clearfix"></div>
       
        
        
        
        


<%@ include file="/WEB-INF/views/template/footer.jsp" %>
</body>
</html>