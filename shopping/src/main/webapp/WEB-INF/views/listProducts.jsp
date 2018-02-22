	<div class="container">

	<div class="row">

		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>


		</div>

		<div class="col-md-9">

			<div class="row">
				<div class="col-lg-12">
				<c:if test="${userClickAllProducts==true}">
					<ol class="breadcrumb">
                          <li><a href="${contextRoot}/home">Home/</a></li>
                          <li class="active"><a href="">All Products</a>
					</ol>
				</c:if>
				
				
				<c:if test="${userClickCategoryProducts==true}">
					<ol class="breadcrumb">
                          <li><a href="${contextRoot}/home">Home /</a></li>
                          <li class="active"><a href="">Category /</a>
                          <li class="active"><a href=""> ${category.name} </a>
                          
					</ol>
				</c:if>
				</div>

			</div>

		</div>

	</div>

</div>