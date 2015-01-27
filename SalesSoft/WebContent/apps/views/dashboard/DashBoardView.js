var DashBoardView = Backbone.View.extend({
	el : '#container',
	templateId:'#dashboard-tmpl',
	initialize : function() {
		console.log('dashboard init');
	},
	events : {
		'click #purchase_a' : 'renderPurchase',
		'click #sales_a' : 'renderSales',
		'click #company_a' : 'renderCompany',
	},
	render : function() {
		console.log('dashboard render ');
		this.$el.html(_.template($(this.templateId).html()));
	},
	renderPurchase : function() {
		SalesSoft.router.navigate('purchase', {
			trigger : true
		});
	},
	renderCompany: function (){
		SalesSoft.router.navigate('company',{
			trigger:true
		});
	},
	renderSales :function(){
		SalesSoft.router.navigate('sales', {
			trigger : true
		});
	}
});