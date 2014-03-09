function popUpGeneral(url) 
{ 
	var height = "620"; 
	var width = "900"; 
	var top = "30"; 
	var left = "100";
	var scrollbars = "1"; /* scrollbar */ 
	var toolbar = "1"; /* toolbar */ 
	var location = "1"; /* location bar */ 
	var menubar = "1"; /* menu bar */ 
	var statusbar = "0"; 
	var resizeable = "1"; /* allow user to resize window */
	
	var popUpString = ''; 
	popUpString += 'height=' + height; 
	popUpString += ',width=' + width; 
	popUpString += ',top=' + top; 
	popUpString += ',left=' + left; 
	popUpString += ',scrollbars=' + scrollbars; 
	popUpString += ',toolbar=' + toolbar; 
	popUpString += ',location=' + location; 
	popUpString += ',menubar=' + menubar; 
	popUpString += ',status=' + statusbar; 
	popUpString += ',resizable=' + resizeable; 
	window.open(url, 'newPopup', popUpString); 
}


