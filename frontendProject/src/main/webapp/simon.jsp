<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Simon Game</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link href='https://fonts.googleapis.com/css?family=Original+Surfer&effect=emboss' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="/frontendProject/css/simon.css">


</head>

<body>

  <div id="outer-circle">
    <div id="topleft"></div>
    <div id="topright"></div>
    <div id="bottomleft"></div>
    <div id="bottomright"></div>
    <div id="inner-circle">
      <div id="title" class="font-effect-emboss">SIMON!</div>
      <div id="switches">
        <input type="checkbox" class="toggle" id="on">
        <button class="button" id="start">Start</button>
        <input type="checkbox" class="toggle" id="strict">
      </div>
      <div class="text1">
        <span>POWER</span><span>STRICT</span>
      </div>
      <div id="turn"></div>
      <div class="text2">
        COUNT
      </div>
    </div>
  </div>

  <script  src="js/index.js"></script>

</body>
</html>