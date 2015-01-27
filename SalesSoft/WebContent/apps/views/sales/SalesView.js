var SalesView=Backbone.View.extend({
	el : '#container',
	templateId:'#sales-tmpl',
	initialize:function(){
		console.log('sales initialiize');
	},
	events:{
		
	},
	render:function(){
		console.log('sales render');
		this.$el.html(_.template($(this.templateId).html()));
	}
});