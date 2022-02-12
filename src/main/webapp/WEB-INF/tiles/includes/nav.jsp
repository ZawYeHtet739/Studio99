<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- NAVIGATION -->
<nav id="navigation">
    <!-- container -->
    <div class="container">
        <!-- responsive-nav -->
        <div id="responsive-nav">
            <!-- NAV -->
            <ul class="main-nav nav navbar-nav">
                <li class="active"><a href="/">Home</a></li>
                <li><a href="#">Hot Deals</a></li>
                <c:forEach var="cat" items="${categories}">
                    <li><a href="/products/${cat.id}">${cat.name}</a></li>
                </c:forEach>
            </ul>
            <!-- /NAV -->
        </div>
        <!-- /responsive-nav -->
    </div>
    <!-- /container -->
</nav>
<!-- /NAVIGATION -->
