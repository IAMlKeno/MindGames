<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% String title = "Home";%>
<%@include file="../jspf/fragments/head.jspf" %>
<script src="<c:url value="/resources/ideaHub.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/modal/modal.js" />" type="text/javascript"></script>
<body>
    <div class="demo-layout mdl-layout mdl-js-layout mdl-layout--fixed-header">
        <%@include file="../jspf/fragments/menu.jspf" %>
        <main class="mdl-layout__content mdl-color--grey-100" style="min-height:600px">
            <div class="newIdeaButtonDiv" style="text-align: center; margin: 3% 0 3% 0">
                <input type="submit" id="ideaSubmitButton" 
                       class="mdl-button mdl-js-button mdl-button--colored 
                       mdl-button--raised" value="Add New Idea" 
                       style="width:50%" />
            </div>
            <div class="ideaGrid">
                <c:if test="${ideaList != null}" >
                    <h1>Hi</h1>
                    <%@include file="../jspf/fragments/ideaCard.jspf" %>
                </c:if>
                <c:if test="${ideaWithNewFeature != null}" >
                    <h1>HELLO</h1>
                </c:if>
                <c:forEach begin="1" end="5">
                    <!-- using card to hold idea example-->
                    <div class="mdl-card mdl-shadow--2dp ideaCard">
                        <div class="mdl-card__title ideaTitleDiv">
                            <h4 class="mdl-card__title-text ideaTitle">
                                Idea Title
                            </h4>
                            <span class="rating">&#40;10&#41;</span>
                        </div>
                        <div class="progress statusCheckboxDivs">
                            Is this idea in progress?&nbsp;
                            <span class="statusCheckboxSpan">
                                <input type="checkbox" class="statusCheckbox" onclick="changeStatus($(this))"/>
                            </span>
                        </div>
                        <div class="complete statusCheckboxDivs">
                            Is this idea complete?&nbsp;
                            <span class="statusCheckboxSpan">
                                <input type="checkbox" class="statusCheckbox" onclick="changeStatus($(this))"/>
                            </span>
                        </div>
                        <div class="mdl-card__supporting-text">
                            <h5 class="ideaFeatureTitle">
                                Features:
                            </h5>
                            <c:forEach items="${features}" var="feature">
                                <ul class="mdl-list">
                                    <li class="mdl-list__item mdl-list__item--two-line">
                                        <span class="mdl-list__item-primary-content">
                                            <i class="material-icons mdl-list__item-icon">stop</i>
                                            <span>
                                                ${feature.featureTitle}
                                            </span>
                                        </span>
                                    </li>
                                </ul>
                            </c:forEach>
                        </div>
                        <div class="mdl-card__actions">
                            <input type="submit" class="mdl-button mdl-js-button 
                                   mdl-button--colored mdl-button--raised developIdeaButton" value="Develop Idea" />
                        </div>
                    </div>
                </c:forEach>
            </div>
        </main>
    </div>
    <%@include file="../jspf/modal.jspf" %>
    <%@include file="../jspf/fragments/footer.jspf" %>