var MenuView=Backbone.View.extend({
	el : '#menuContainer',
	templateId:'#menu-tmpl',
	initialize:function(){
		console.log('menu init');
	},
	events:{
		
	},
	render:function(){
		console.log('menu render');
		this.$el.html(_.template($(this.templateId).html()));
		SalesSoft.router.navigate('aboutus',{
			//when we say trigger true, the url appears in browser gets change 
			trigger:true
		});
	}
});