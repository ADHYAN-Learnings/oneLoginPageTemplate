(function($) {
	
	/*This function is written for responsive side Menu  and body */
	$.fn.flexibleSideMenuAndBody = function(){
		var PixelSizeOfSideMenu = $("#sidebar").css("margin-left");
		var Customwidth = $(this).width();

		if(Customwidth<='768'){	
			$("#sideMenuSection").removeAttr("class");
			$("#bodySection").removeAttr("class");
			
			$("#sideMenuSection").attr("class","col-sm-0 col-md-0 col-lg-0 col-lg-0");
			$("#bodySection").attr("class","col-sm-12 col-md-12 col-lg-12 col-lg-12");
			$("#sidebarCollapse").show();
		} else {
			$("#sideMenuSection").removeAttr("class");
			$("#bodySection").removeAttr("class");
			
			$("#sideMenuSection").attr("class","col-sm-3 col-md-3 col-lg-3 col-lg-3");
			$("#bodySection").attr("class","col-sm-9 col-md-9 col-lg-9 col-lg-9");
			$("#sidebarCollapse").hide();
		}
	};
	
	/*This function is written for appearing for sideMenu in smaller screen click event
	 * on header section right button 
	 * */
	$.fn.sidebarCollapsibleButtonEvent = function(){
		$('#sidebar').toggleClass('active');
	}
	
	/*Malihu custom scroll bar plugin which will load on the time of page load*/
	$(window).on("load",function(){
		$("#sidebar").mCustomScrollbar({
			mouseWheelPixels: 500,
			axis:"y",
			mouseWheel:{
				preventDefault:true,
				enable:true,
				axis:"y"
			}
		});
	});
	
}(jQuery));