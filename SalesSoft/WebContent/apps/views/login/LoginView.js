var LoginView = Backbone.View.extend({
	el : '#container',
	templateId:'#login-tmpl',
	initialize: function(){
		console.log('init');
	},
	events : {
		'click #login':'loginBtnClick'

	},
	render : function() {
		console.log('login render');
		this.$el.html(_.template($(this.templateId).html()));
		},
		loginBtnClick:function(){
			/*
			 * Without using router.js we cal call it directly
 			   new DashBoard().render();
			*/
			
			// Using router.js for navigation
			SalesSoft.router.navigate('menu',{
				//when we say trigger true, the url appears in browser gets change 
				trigger:true
			});
			
		}

});