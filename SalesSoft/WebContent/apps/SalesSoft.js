var SalesSoft = {
	start : function() {
		this.views = {
			login : new LoginView()
		};
		this.model = {};
		this.router = new Router();
		Backbone.history.start({
			silent : true
		});
		this.views.login.render();
	},
	
};