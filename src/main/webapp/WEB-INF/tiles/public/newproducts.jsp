<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- SECTION -->
<div class="section">
    <!-- container -->
    <div class="container">
        <!-- row -->
        <div class="row">

            <!-- section title -->
            <div class="col-md-12">
                <div class="section-title">
                    <h3 class="title">New Products</h3>
                </div>
            </div>
            <!-- /section title -->

            <!-- Products tab & slick -->
            <div class="col-md-12">
                <div class="row">
                    <div class="products-tabs">

                        <!-- tab -->
                        <div id="tab1" class="tab-pane active">
                            <div class="products-slick" data-nav="#slick-nav-1">


                                <!-- product -->
                                <c:forEach items="${products}" var="product" begin="0" end="4">
                                    <div class="product">
                                        <a href="/singleproduct/${product.id}">
                                            <div class="product-img">
                                                <img src="/assets/img/${product.image_01}" alt="${product.image_01}">
                                                <div class="product-label">
                                                    <span class="new">${product.stock}</span>
                                                </div>
                                            </div>

                                            <div class="product-body">

                                                <c:forEach items="${categories}" var="category">

                                                    <c:if test="${category.id == product.cat_id}">
                                                        <p class="product-category">${category.name}</p>
                                                    </c:if>

                                                </c:forEach>

                                                <h3 class="product-name"><a
                                                        href="/singleproduct/${product.id}">${product.name}</a></h3>
                                                <h4 class="product-price">${product.price} Ks</h4>
                                            </div>

                                            <c:if test="${product.stock == 'INSTOCK'}">
                                                <div class="add-to-cart">
                                                    <button class="add-to-cart-btn"><i class="fa fa-shopping-bag"></i>
                                                        add
                                                        to
                                                        bag
                                                    </button>
                                                </div>
                                            </c:if>
                                        </a>
                                    </div>
                                </c:forEach>
                                <!-- /product -->
                            </div>
                            <div id="slick-nav-1" class="products-slick-nav"></div>
                        </div>
                        <!-- /tab -->


                    </div>
                </div>
            </div>
            <!-- Products tab & slick -->
        </div>
        <!-- /row -->
    </div>
    <!-- /container -->
</div>
<!-- /SECTION -->