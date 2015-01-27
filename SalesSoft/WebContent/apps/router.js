var Router = Backbone.Router.extend({
	routes : {
		'company': 'renderComapnyView',
		'menu':'renderMenuView',
		'purchase':'renderPurchaseView',
		'sales':'renderSalsesView',
		'dashboard':'renderDashboardView',
		'aboutus':'renderAboutUsView',
		
	
	},
	renderMenuView :function(){
		if(!SalesSoft.views.menu){
			SalesSoft.views.menu = new MenuView();
			SalesSoft.views.menu.render();
		}
	},
	renderAboutUsView :function(){
		if(!SalesSoft.views.aboutus){
			SalesSoft.views.aboutus = new AboutUsView();
			SalesSoft.views.aboutus.render();
		}
	},
	renderDashboardView :function(){
		if(!SalesSoft.views.dashboard){
			SalesSoft.views.dashboard = new DashBoardView();
			SalesSoft.views.dashboard.render();
		}
	},
	renderComapnyView :function(){
			if(!SalesSoft.views.company){
				SalesSoft.views.company = new CompanyView();
				SalesSoft.views.company.render();
			}
	},
	renderPurchaseView:function(){
		if(!SalesSoft.views.purchase){
			SalesSoft.views.purchase = new PurchaseView();
			SalesSoft.views.purchase.render();
		}
	},
	renderSalsesView :function(){
		if(!SalesSoft.views.sales){
			SalesSoft.views.sales = new SalesView();
			SalesSoft.views.sales.render();
		}
	}
});