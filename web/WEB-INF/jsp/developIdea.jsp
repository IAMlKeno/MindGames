<%@ page pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% String title = "Develop"; %>
<!DocType html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="A front-end template that helps you build fast, modern mobile web apps.">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Develop Idea</title>

    <!-- Add to homescreen for Chrome on Android -->
    <meta name="mobile-web-app-capable" content="yes">
    <!--    <link rel="icon" sizes="192x192" href="assets/images/android-desktop.png">-->

    <!-- Add to homescreen for Safari on iOS -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Material Design Lite">
    <!--    <link rel="apple-touch-icon-precomposed" href="assets/images/ios-desktop.png">-->

    <!-- Tile icon for Win8 (144x144 + tile color) -->
    <meta name="msapplication-TileImage" content="images/touch/ms-touch-icon-144x144-precomposed.png">
    <meta name="msapplication-TileColor" content="#3372DF">
    
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.cyan-light_blue.min.css">
    <link rel="stylesheet" href="<c:url value="/resources/main.css" />">
    <link href="<c:url value="/resources/main.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/modal/modalStyle.css" />" rel="stylesheet">

    <!-- Kenneth Kufluk 2008/09/10 -->
    <link href="<c:url value="/resources/js-mindmap-master/js-mindmap.css" />" rel="stylesheet" />
    <link href="<c:url value="/resources/js-mindmap-master/style.css" />" type="text/css" rel="stylesheet"/>

    <!-- jQuery -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"" type="text/javascript"></script>
    <!-- UI, for draggable nodes -->
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.15/jquery-ui.min.js"></script>

    <!-- Raphael for SVG support (won't work on android) -->
    <script type="text/javascript" src="<c:url value="/resources/js-mindmap-master/raphael-min.js" />"></script>

    <!-- Mindmap -->
    <script type="text/javascript" src="<c:url value="/resources/js-mindmap-master/js-mindmap.js" />"></script>

    <!-- Kick everything off -->
    <script src="<c:url value="/resources/js-mindmap-master/script.js" />" type="text/javascript"></script>
    
    <script src="<c:url value="/resources/modal/modal.js" />" type="text/javascript"></script>
    <style>
        #view-source {
            position: fixed;
            display: block;
            right: 0;
            bottom: 0;
            margin-right: 40px;
            margin-bottom: 40px;
            z-index: 900;
        }
    </style>
</head>
<body>
    <ul style="margin:auto">
        <li>
            <a href="">
                ${idea.ideaTitle}
            </a>
            <ul class="features">
                <c:forEach items="${idea.features}" var="feature">
                <li>
                    <a href="" title="${feature.featureTitle}">
                        ${feature.featureTitle}
                    </a>
                </li>
                </c:forEach>
            </ul>
        </li>
    </ul>
    <div class="developIdeaDiv" 
         style="font-size: larger; position:absolute; top:90%; right:45%">
        <input type="button" id="newFeatureButton" class="mdl-button mdl-js-button 
                mdl-button--colored mdl-button--raised" value="New Feature"
                style="width:150%; z-index: 9"/>
    </div>
<%@include file="../jspf/featureModal.jspf" %>
    
</body>