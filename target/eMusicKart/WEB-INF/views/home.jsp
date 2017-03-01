<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

        <!-- Carousel
        ================================================== -->
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img class="first-slide home-image" src="<c:url value="/resources/images/back1.jpeg" />" alt="First slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Welcome to eMusicKart</h1>
                            <p>Here you can browse and buy Instruments. Records and music related Accessories. Order How for Your Amazing New Kit!</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="second-slide home-image" src="<c:url value="/resources/images/back2.jpeg" />" alt="Second slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Facts You Should know About Music</h1>
                            <p>Music brings jey, to all of our hearts. It's one of those, emotional arts.</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="second-slide home-image" src="<c:url value="/resources/images/back3.jpeg" />" alt="Thrird slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Facts You Should know About Music</h1>
                            <p>Music expresses that which cannot be put into words and that which cannot remain silent.</p>
                        </div>
                    </div>
                </div>
                
                <div class="item">
                    <img class="second-slide home-image" src="<c:url value="/resources/images/back4.jpeg" />" alt="Fourth slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Facts You Should know About Music</h1>
                            <p>Music brings jey, to all of our hearts. It's one of those, emotional arts.</p>
                        </div>
                    </div>
                </div>
                
                
                <div class="item">
                    <img class="second-slide home-image" src="<c:url value="/resources/images/back5.jpeg" />" alt="Fiveth slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Facts You Should know About Music</h1>
                            <p>Some people have lives; some people have music.</p>
                        </div>
                    </div>
                </div>
                
                <div class="item">
                    <img class="second-slide home-image" src="<c:url value="/resources/images/back6.jpeg" />" alt="Sixth slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Facts You Should know About Music</h1>
                            <p>Music expresses that which cannot be said and on which it is impossible to be silent.</p>
                        </div>
                    </div>
                </div>
                
                <div class="item">
                    <img class="third-slide home-image " src="<c:url value="/resources/images/back7.jpeg" />" alt="Seventh slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>It's A Jazz Affair</h1>
                            <p>Through ups and downs, Somehow I manage to survive in life.</p>
                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div><!-- /.carousel -->


        <!-- Marketing messaging and featurettes
        ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->

        <div class="container marketing">

            <!-- Three columns of text below the carousel -->
            <div class="row">
                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Instrument" />" role="button">
                        <img class="img-circle" src="<c:url value="/resources/images/instrument.jpg"/>" alt="Instrument Image" width="140" height="140">
                    </a>

                    <h2>Instrument:</h2>
                    <p>Well crafted and delicate instruments</p>

                </div>



                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Record" />" role="button">
                        <img class="img-circle" src="<c:url value="/resources/images/record.gif"/>" alt="Instrument Image" width="140" height="140">
                    </a>

                    <h2>Discography:</h2>
                    <p>An exceptional collections of music records in favor of the traditional and modern genre of jazz </p>

                </div>


                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Accessory" />" role="button">
                        <img class="img-circle" src="<c:url value="/resources/images/accessory.jpg"/>" alt="Instrument Image" width="140" height="140">
                    </a>

                    <h2>Accessories:</h2>
                    <p>All musical and related geeky goods</p>

                </div>
            </div>


<%@ include file="/WEB-INF/views/template/footer.jsp" %>
