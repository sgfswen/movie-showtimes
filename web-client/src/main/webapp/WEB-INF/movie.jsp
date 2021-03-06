<%-- 
    Document   : movie
    Created on : Feb 3, 2015, 9:34:50 AM
    Author     : HaiNNT
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:set var="xml" value="${requestScope.xml}"/>
<x:parse var="doc" xml="${xml}" scope="session"/>
<c:import url="header.jsp"/>
<div id="body">
    <div id="movie-container" class="container">
        <c:import var="movieXsl" url="movie/movieList.xsl" charEncoding="UTF-8"/>
        <x:transform xslt="${movieXsl}" xml="${xml}">
            <x:param name="movieName" value="${param.movie}"/>
        </x:transform>
    </div>

    <c:if test="${not empty param.movie}">   
        <div id="theater-container"  class="container">
            <c:import var="theaterXsl" url="movie/theaterList.xsl" charEncoding="UTF-8"/>
            <x:transform xslt="${theaterXsl}" xml="${xml}">
                <x:param name="movieId" value="${param.movie}"/>
            </x:transform>
        </div>

    </c:if>

    <c:if test="${not empty param.theater and not empty param.movie}">
        <div id="showtime-container" class="container">
            <c:import var="timeXsl" url="movie/timeList.xsl" charEncoding="UTF-8"/>
            <x:transform xslt="${timeXsl}" xml="${xml}">
                <x:param name="movieId" value="${param.movie}"/>
                <x:param name="theaterId" value="${param.theater}"/>
            </x:transform>
        </div>
    </c:if>

</div>
<div style='display: none' id="movie-detail">
    
</div>
<c:import url="footer.jsp"/>