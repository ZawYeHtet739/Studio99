<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- BREADCRUMB -->
<div id="breadcrumb" class="section">
    <!-- container -->
    <div class="container">
        <!-- row -->
        <div class="row">
            <div class="col-md-12">
                <ul class="breadcrumb-tree">
                    <li><a href="/">Home</a></li>
                    <li class="active"><a href="#">${category.name} Collection</a></li>
                </ul>
            </div>
        </div>
        <!-- /row -->
    </div>
    <!-- /container -->
</div>
<!-- /BREADCRUMB -->

<!-- SECTION -->
<div class="section">
    <!-- container -->
    <div class="container">
        <!-- store products -->
        <div class="row">

            <!-- product -->
            <c:forEach var="product" items="${products}">
                <a href="/singleproduct/${product.id}">
                    <div class="col-md-3 col-xs-6">
                        <div class="product">

                            <div class="product-img">
                                <img src="/assets/img/${product.image_01}" alt="${product.image_01}">
                                <div class="product-label">
                                    <span class="new">${product.stock}</span>
                                </div>
                            </div>
                            <div class="product-body">
                                <p class="product-category">${category.name}</p>
                                <h3 class="product-name"><a href="#">${product.name}</a></h3>
                                <h4 class="product-price">${product.price} Ks</h4>
                            </div>
                            
                            <c:if test="${product.stock == 'INSTOCK'}">
                                <div class="add-to-cart">
                                    <button class="add-to-cart-btn"><i class="fa fa-shopping-bag"></i> add to
                                        bag
                                    </button>
                                </div>
                            </c:if>
                        </div>
                    </div>
                </a>
            </c:forEach>
            <!-- /product -->

        </div>
        <!-- /row -->
    </div>
    <!-- /container -->
</div>
<!-- /SECTION -->