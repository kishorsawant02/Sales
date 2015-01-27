var PurchaseView=Backbone.View.extend({
	el : '#container',
	templateId:'#purchase-tmpl',
	initialize:function(){
		console.log('purchase init');
	},
	events:{
		
	},
	render:function(){
		console.log('purchase render');
		this.$el.html(_.template($(this.templateId).html()));
	}
});