var AboutUsView=Backbone.View.extend({
 el:'#container',
 templateId:'#aboutus-tmpl',
 initialize:function(){
	 console.log("About Us initialize");
 },
 events:{
	 
 },
 render:function(){
	 console.log('render Abouts Us');
	 this.$el.html(_.template($(this.templateId).html()));
 }
	 
	
});