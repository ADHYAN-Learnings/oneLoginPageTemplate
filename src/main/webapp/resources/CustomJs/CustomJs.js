
$(document).ready(function () {
	
	/* Don't write  'this' function use currentObject Only*/
	var currentObject = $(this);
	
	$(currentObject).flexibleSideMenuAndBody();
	
	$(window).bind("resize",function(){
		setTimeout(function(){
			$(currentObject).flexibleSideMenuAndBody();	
		},100);
	});
	  
	$("#sidebarCollapse").click(function(){
		$(currentObject).sidebarCollapsibleButtonEvent();
	});
	
	var Customwidth = currentObject.width();
	
	if(Customwidth<='768') {
	$("#sidebar").swipeleft(function(){
		$(currentObject).sidebarCollapsibleButtonEvent();
		
	});
	}
});
