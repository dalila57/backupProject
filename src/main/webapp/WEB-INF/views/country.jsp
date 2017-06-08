<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Page web Top Trip">
    <meta name="author" content="Les Explorateurs">

    <title>Top Trip</title>

    <!-- Bootstrap Core CSS -->
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="../vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="../css/creative.pays.fr.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="../">Top Trip</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#about">Inscription</a>
                    </li>

                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>

<div class="container">  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="../img/portfolio/fullsize/fr/c1.jpg" alt="carrouselPays1" style="width:100%;">
      </div>

      <div class="item">
        <img src="../img/portfolio/fullsize/fr/c2.jpg" alt="carrouselPays2" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="../img/portfolio/fullsize/fr/c3.jpg" alt="carrouselPays3" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
		
    </header>

   <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Infos Pays : ${countryDetails.countryName}</h2>
                    <hr class="light">
					  <div class="row">
						<div class="col-md-4"><h4>Numéro d'urgence <i class="fa fa-phone" aria-hidden="true"></i> : ${countryDetails.emergencyNumber}</h4></div>
						<div class="col-md-4"><h4>Monnaie <i class="fa fa-money" aria-hidden="true"></i> : ${countryDetails.money}</h4></div>
						<div class="col-md-4"><h4>Fuseau horaire<span class="glyphicon glyphicon-time"> : ${countryDetails.timeZone}</span></h4></div>
					  </div>
					
					
                </div>
            </div>
        </div>
    </section>


   <section class="no-padding" id="portfolio">
        <div class="container-fluid">
			<div class="row no-gutter popup-gallery">
                <div class="col-lg-3 col-sm-3">
                	 <a href="../img/portfolio/fullsize/fr/1.jpg" class="portfolio-box">
                     	<img src="../img/portfolio/fullsize/fr/1.jpg" class="img-responsive" alt="">
                     	 <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                	LALALA
                                </div>
                           </div>
                         </div>
                     </a>       
                </div>
				 <div class="col-lg-3 col-sm-3">
				 	<a href="../img/portfolio/fullsize/fr/2.jpg" class="portfolio-box">
                     	<img src="../img/portfolio/fullsize/fr/2.jpg" class="img-responsive" alt="">
                     	 <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                	MAMAMA
                                </div>
                           </div>
                         </div> 
                     </a>      
                </div>
				 <div class="col-lg-3 col-sm-3">
				 	<a href="../img/portfolio/fullsize/fr/3.jpg" class="portfolio-box">
                     	<img src="../img/portfolio/fullsize/fr/3.jpg" class="img-responsive" alt="">
                     	 <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                	TATATA
                                </div>
                           </div>
                         </div>  
                     </a>     
                </div>
				 <div class="col-lg-3 col-sm-3">
				 	<a href="../img/portfolio/fullsize/fr/4.jpg" class="portfolio-box">
                     	<img src="../img/portfolio/fullsize/fr/4.jpg" class="img-responsive" alt="">
                     	 <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                	TOTOTOT
                                </div>
                           </div>
                         </div> 
                     </a>      
                </div>

            </div>
        </div>
    </section>


<div class = "valise text-center">
 	<h3>Ne pas oublier !</h3>
 <hr class="primary">
 	<div class="row text-left">
 		<div class="col-md-2" "col-sm-4">
 			<h4>Documents</h4>
 			<div class="thumbnail">
 				<div class="checkbox">
 					<%-- <c:forEach items="${documents}" var="documents">
 					 	<label><input type="checkbox" value="">"${documents.documentsName}"</label>
 					 </c:forEach> --%>
				</div>
			</div>
		</div>
		
 		<div class="col-md-2" "col-sm-4">
 			<h4>Médecine</h4>
 			<div class="thumbnail">
 				<div class="checkbox">
 					<label><input type="checkbox" value="">Trousse de secours</label>
 				</div>

			</div>
		</div>
		<div class="col-md-2" "col-sm-4">
 			<h4>Hygiène</h4>
 			<div class="thumbnail">
 				<div class="checkbox">
 					 <label><input type="checkbox" value="">Trousse de toilette</label>
 				</div>
 			</div>
		</div>
		
		<div class="col-md-2" "col-sm-4">
 			<h4>Multimédia</h4>
 			<div class="thumbnail">
 				<div class="checkbox">
 					 <label><input type="checkbox" value="">Portable</label>
 				</div>
 				<div class="checkbox">
 					 <label><input type="checkbox" value="">Chargeurs</label>
 				</div>
			</div>	
		</div>
	</div>	
</div>
<hr class="primary">
	<jsp:include page="footer.jsp" />
	
	 <!-- jQuery -->
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="../vendor/scrollreveal/scrollreveal.min.js"></script>
    <script src="../vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Theme JavaScript -->
    <script src="../js/creative.js"></script>
        

</body>

</html>