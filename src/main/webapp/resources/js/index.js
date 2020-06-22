var bars  = document.getElementsByClassName('statsItemBar');

window.onload = function(){
	entrance();
}

function entrance() {
  for(var i=0; i<bars.length; i++){
	  bars[i].classList.add('active');
  }
}

