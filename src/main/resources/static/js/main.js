$( document ).ready(function(){
	if(window.innerWidth < 500){
		$("h1").addClass("display-5");
	} else if(window.innerWidth < 960){
		$("h1").addClass("display-3");
	} else {
		$("h1").addClass("display-1");
	}
});