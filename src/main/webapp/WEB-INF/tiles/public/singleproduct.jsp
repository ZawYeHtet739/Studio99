<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!-- BREADCRUMB -->
<div id="breadcrumb" class="section">
    <!-- container -->
    <div class="container">
        <!-- row -->
        <div class="row">
            <div class="col-md-12">
                <ul class="breadcrumb-tree">
                    <li><a href="/">Home</a></li>
                    <li><a href="/products/${category.id}">${category.name} Collection</a></li>
                    <li class="active">${product.name} </li>
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
        <!-- row -->
        <div class="row">

            <!-- Product main img -->
            <div class="col-md-5 col-md-push-2">
                <div id="product-main-img">
                    <div class="product-preview">
                        <img src="/assets/img/${product.image_01}" alt="${product.image_01}">
                    </div>

                    <div class="product-preview">
                        <img src="/assets/img/${product.image_02}" alt="${product.image_02}">
                    </div>

                    <div class="product-preview">
                        <img src="/assets/img/${product.image_03}" alt="${product.image_03}">
                    </div>

                    <div class="product-preview">
                        <img src="/assets/img/${product.image_04}" alt="${product.image_04}">
                    </div>

                </div>
            </div>
            <!-- /Product main img -->

            <!-- Product thumb imgs -->
            <div class="col-md-2  col-md-pull-5">
                <div id="product-imgs">
                    <div class="product-preview">
                        <img src="/assets/img/${product.image_01}" alt="${product.image_01}">
                    </div>

                    <div class="product-preview">
                        <img src="/assets/img/${product.image_02}" alt="${product.image_02}">
                    </div>

                    <div class="product-preview">
                        <img src="/assets/img/${product.image_03}" alt="${product.image_03}">
                    </div>

                    <div class="product-preview">
                        <img src="/assets/img/${product.image_04}" alt="${product.image_04}">
                    </div>

                </div>
            </div>
            <!-- /Product thumb imgs -->

            <!-- Product details -->
            <div class="col-md-5">
                <div class="product-details">
                    <h2 class="product-name">${product.name}</h2>
                    <div>
                        <h3 class="product-price">${product.price} Ks</h3>
                        <span class="product-available">${product.stock}</span>
                    </div>
                    <p>${product.description}</p>

                    <div class="product-options">
                        <label>
                            Size
                            <select class="input-select-02">
                                <c:forEach var="size" items="${sizes}">
                                    <option value="${size.name}">${size.name}</option>
                                </c:forEach>
                            </select>
                        </label>
                        <label>
                            Color
                            <select class="input-select-03">
                                <c:forEach var="color" items="${colors}">
                                    <option value="${color.name}">${color.name}</option>
                                </c:forEach>
                            </select>
                        </label>
                    </div>

                    <c:if test="${product.stock == 'INSTOCK'}">
                        <div class="add-to-cart">
                            <div class="qty-label">
                                Qty
                                <div class="input-number">
                                    <input type="number">
                                    <span class="qty-up">+</span>
                                    <span class="qty-down">-</span>
                                </div>
                            </div>
                            <button class="add-to-cart-btn"><i class="fa fa-shopping-bag"></i> add to bag</button>
                        </div>
                    </c:if>

                    <ul class="product-links">
                        <li>Category:</li>
                        <li><a href="/products/${category.id}">${category.name}</a></li>
                    </ul>

                </div>
            </div>
            <!-- /Product details -->

            <!-- Product tab -->
            <div class="col-md-12">
                <div id="product-tab">
                    <!-- product tab nav -->
                    <ul class="tab-nav">
                        <li class="active"><a data-toggle="tab" href="#tab1">Description</a></li>
                        <li><a data-toggle="tab" href="#tab2">Details</a></li>
                    </ul>
                    <!-- /product tab nav -->

                    <!-- product tab content -->
                    <div class="tab-content">
                        <!-- tab1  -->
                        <div id="tab1" class="tab-pane fade in active">
                            <div class="row">
                                <div class="col-md-12">
                                    <p>${product.description}</p>
                                </div>
                            </div>
                        </div>
                        <!-- /tab1  -->

                        <!-- tab2  -->
                        <div id="tab2" class="tab-pane fade in">
                            <div class="row">
                                <div class="col-md-12">
                                    <p>${product.details}</p>
                                </div>
                            </div>
                        </div>
                        <!-- /tab2  -->

                    </div>
                    <!-- /product tab content  -->
                </div>
            </div>
            <!-- /product tab -->
        </div>
        <!-- /row -->
    </div>
    <!-- /container -->
</div>
<!-- /SECTION -->