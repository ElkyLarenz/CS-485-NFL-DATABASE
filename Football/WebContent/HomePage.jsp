<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Load font awesome icons -->

<meta name="viewport"	
		content="width=device-width, initial-scale=1.0">
	<link href="WEB_DESIGN/CSS/general.css" type="text/css" rel="stylesheet">
	<link href="WEB_DESIGN/CSS/homePage.css" type="text/css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Fantasy Football</title>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
</head>


<body>
<jsp:include page ="WEBSITE_GENERAL_TEMPLATES/header.html" />
<img class = mainFBIMAGE src="WEBSITE_GENERAL_TEMPLATES/PHOTOS/mainFBIMAGE.jpg_large">

<!-- there is space here -->
<h1 class = "news-head">News</h1>
<!-- this is the start of the general news -->
<div class = "box-articles">
<table style="width:100%">
<!-- CHANGE THE POSITION OF THESE SO THEY ALL ALIGN IN A ROW -->
<tr>
	<td>
		<div class = "box-style">
			<div class = "box-article-one">
				<img class = "news-Dalvin-Cook" src="WEBSITE_GENERAL_TEMPLATES/PHOTOS/dalvin-Cook.jpg">
				<article>
	  				<h2>Dalvin Cook is a Game Changer for the Vikings</h2>
	  				<p>In this week's game for the Viking vs. the Broncos, Krik Cousins...</p>
				</article>
			</div>
		</div>
	</td>
  
    <td>
		<div class = "box-style">
			<div class = "box-article-two">
				<img class = "news-Dalvin-Cook" src="WEBSITE_GENERAL_TEMPLATES/PHOTOS/minkah-fitzpatrick-steelers.jpg">
				<article>
	  				<h2>Minkah Fitzpatrick is being fined for his taunt against the Rams</h2>
	  				<p>In this week's 10 game of the Pittsburgh Steelers vs. The Los Angeles Rams...</p>
				</article>
			</div>
		</div>
	</td>
  
    <td>
		<div class = "box-style">
			<div class = "box-article-three">
				<img class = "news-Dalvin-Cook" src="WEBSITE_GENERAL_TEMPLATES/PHOTOS/AARON_ROGERS.jpg_fit=scale">
				<article>
	  				<h2>Aaron Rogers also known as baby Jesus is having a great season</h2>
	  				<p>The Green Bay Packers are having a great season...</p>
				</article>
			</div>
		</div>
	</td>
</tr>
</table>
</div>
<jsp:include page ="WEBSITE_GENERAL_TEMPLATES/footer.html" />
</body>
</html>