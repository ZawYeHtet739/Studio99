<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- SECTION -->
<div class="section">
    <!-- container -->
    <div class="container">
        <!-- row -->
        <div class="row">

            <c:forEach var="cat" items="${categories}">

                <!-- shop -->
                <div class="col-md-4 col-xs-6">
                    <div class="shop">
                        <div class="shop-img">
                            <img src="/assets/img/${cat.image}" alt="${cat.image}">
                        </div>
                        <div class="shop-body">
                            <h3>${cat.name}<br>Collection</h3>
                            <a href="/products/${cat.id}" class="cta-btn">Shop now <i class="fa fa-arrow-circle-right"></i></a>
                        </div>
                    </div>
                </div>
                <!-- /shop -->

            </c:forEach>
        </div>
        <!-- /row -->
    </div>
    <!-- /container -->
</div>
<!-- /SECTION -->