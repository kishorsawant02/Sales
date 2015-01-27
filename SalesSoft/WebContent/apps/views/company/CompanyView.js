var CompanyView=Backbone.View.extend({
 el:'#container',
 templateId:'#company-tmpl',
 initialize:function(){
	 console.log("Company initialize");
 },
 events:{
	 
 },
 render:function(){
	 console.log('render Comapny');
	 this.$el.html(_.template($(this.templateId).html()));
 }
	 
	
});