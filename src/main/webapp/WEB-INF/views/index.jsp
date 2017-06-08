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
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/creative.css" rel="stylesheet">

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
                <a class="navbar-brand page-scroll" href="#page-top">Top Trip</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#about">Inscription</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#services">Connexion</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1 id="homeHeading">Top Trip</h1>
                <hr>
                <h3>S'informer. Se préparer. Voyager</h3>
                <p id = "p1">Des vacances à organiser ? </p>
                <p id = "p2">Choisissez Top Trip comme allié !</p>
           
                <!-- <a href="#about" class="btn btn-primary btn-xl page-scroll">//  Barre de recherche  //</a> -->
 <form class="navbar-form navbar-center">		
  <form>
    <div class="form-group">
    <div class="form-group">
      <select class="form-control" id="sel1" onChange="document.location = this.value" value="GO">
      	<option>Choisissez votre destination..</option>
      	<c:forEach items="${countryList}" var="country">	
			<option value="pays?countryID=${country.countryID}">
				${country.countryName}
			</option>
		</c:forEach>
      </select>
      <br>
    </div>
  </form>
</div>  
	  
	  </form>
            </div>
        </div>


		
    </header>

    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Notre site</h2>
                    <hr class="light">
                    <p class="text-faded">Vous souhaitez préparer vos voyages dans les meilleures conditions ? Nous sommes là pour vous aider! 
                    Préparez votre valise avec nous et partagez vos expériences avec vos amis ! </p>
                    <a href="#services" class="page-scroll btn btn-default btn-xl sr-button">Inscrivez-vous!</a>
                </div>
            </div>
        </div>
    </section>

    <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Fonctionnalités du site</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>
    </section>

    <section class="no-padding" id="portfolio">
        <div class="container-fluid">
            <div class="row no-gutter popup-gallery">
                <div class="col-lg-4 col-sm-4">
                    <a href="img/portfolio/fullsize/01.jpg" class="portfolio-box">
                        <img src="img/portfolio/thumbnails/01.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Renseignements Pays 
                                </div>
                                <div class="project-name">
                                    Trouvez les informations utiles sur le pays de vos rêves pour faciliter la planification de vos voyages !
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-4">
                    <a href="img/portfolio/fullsize/02.jpg" class="portfolio-box">
                        <img src="img/portfolio/thumbnails/02.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Journal de bord
                                </div>
                                <div class="project-name">
                                    Stockez vos photos et avis sur les pays visités et créez votre propre liste de pays à explorer à l'avenir !
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-4">
                    <a href="img/portfolio/fullsize/03.jpg" class="portfolio-box">
                        <img src="img/portfolio/thumbnails/03.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Valise
                                </div>
                                <div class="project-name">
                                    Préparez votre propre checklist pour vos valises ! 
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
               
            </div>
        </div>
    </section>
	<jsp:include page="footer.jsp" />
	
	 <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="vendor/scrollreveal/scrollreveal.min.js"></script>
    <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/creative.js"></script>
        
</body>

</html>