<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SalesSoft</title>

<!-- Lib -->
<script type="text/javascript" src="assests/js/jquery-2.0.3.min.js"></script>
<script type="text/javascript" src="assests/js/underscore.min.js"></script>
<script type="text/javascript" src="assests/js/backbone.min.js"></script>


<!-- Model -->
<script type="text/javascript" src="apps/model/Login.js"></script>

<!--  View  -->
<script type="text/javascript" src="apps/views/login/LoginView.js"></script>
<script type="text/javascript"
	src="apps/views/dashboard/DashBoardView.js"></script>
<script type="text/javascript" src="apps/views/company/CompanyView.js"></script>
<script type="text/javascript" src="apps/views/sales/SalesView.js"></script>
<script type="text/javascript" src="apps/views/purchase/PurchaseView.js"></script>
<script type="text/javascript" src="apps/views/menu/MenuView.js"></script>
<script type="text/javascript" src="apps/views/aboutus/AboutUsView.js"></script>

<script type="text/javascript" src="apps/SalesSoft.js"></script>
<script type="text/javascript" src="apps/router.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		SalesSoft.start();
	});
</script>
</head>
<body>
	<div id="menuContainer"></div>
	<div id="container"></div>
</body>
</html>
<jsp:include page="apps/views/login/login.html"></jsp:include>
<jsp:include page="apps/views/company/company.html"></jsp:include>
<jsp:include page="apps/views/sales/sales.html"></jsp:include>
<jsp:include page="apps/views/purchase/purchase.html"></jsp:include>
<jsp:include page="apps/views/dashboard/dashboard.html"></jsp:include>
<jsp:include page="apps/views/menu/menu.html"></jsp:include>
<jsp:include page="apps/views/aboutus/aboutus.html"></jsp:include>