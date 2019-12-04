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
				<a class="block" href="https://minnesota.cbslocal.com/2019/11/19/ray-lewis-dalvin-cook-kirk-cousins-minnesota-vikings-inside-the-nfl/">
	  				<h2>Dalvin Cook is a Game Changer for the Vikings</h2></a>
	  				<p>In the game for the Viking vs. the Broncos, Krik Cousins...</p>
				</article>
			</div>
		</div>
	</td>
  
    <td>
		<div class = "box-style">
			<div class = "box-article-two">
			
				<img class = "news-Dalvin-Cook" src="WEBSITE_GENERAL_TEMPLATES/PHOTOS/sea.jpg">
				<article>
				<div>
				<a class="block" href="http://www.nfl.com/news/story/0ap3000001083654/article/2019-nfl-playoffclinching-scenarios-for-week-14">
				
	  				<h2>2019 NFL playoff-clinching scenarios for Week 14</h2></a>
	  				<p>Here are the playoff-clinching scenarios for Week 14 of the 2019 NFL season (Click here to see the full NFL playoff picture)...</p>
				</div>
				</article>
			</div>
		</div>
	</td>
  
    <td>
		<div class = "box-style">
			<div class = "box-article-three">
				<img class = "news-Dalvin-Cook" src="WEBSITE_GENERAL_TEMPLATES/PHOTOS/AARON_ROGERS.jpg_fit=scale">
				<article>
				<div>
				<a class="block" href="https://packerswire.usatoday.com/2019/12/03/aaron-rodgers-amazes-matt-lafleur-with-fourth-down-throw-vs-giants/">
	  				<h2>Aaron Rodgers amazes Matt LaFleur with fourth down throw vs. Giants</h2></a>
	  				<p>Quarterback Aaron Rodgers delivered the turning point of the Green Bay Packers' 31-13 win over the New York Giants...</p>
				</div>
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