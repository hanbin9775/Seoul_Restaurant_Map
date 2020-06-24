var bars  = document.getElementsByClassName('statsItemBar');
var rankingboxes = document.getElementsByClassName('rankingBox');
var graphs = document.getElementsByClassName('seoulMap');



var chicken_button = document.querySelector(".chickenBtn");
var cafe_button = document.querySelector(".cafeBtn");
var dduck_button = document.querySelector(".dduckBtn");

window.onload = function(){
	entrance();
	chicken_button.addEventListener('click',categoryChange);
	cafe_button.addEventListener('click',categoryChange);
	dduck_button.addEventListener('click',categoryChange);
	
	chicken_button.addEventListener('click',chickenSelect);
	cafe_button.addEventListener('click',cafeSelect);
	dduck_button.addEventListener('click',dduckSelect);
}


function entrance() {
  for(var i=0; i<bars.length; i++){
	  bars[i].classList.add('active');
  }
}

function categoryChange(){
	for(var i=0; i<bars.length; i++){
		bars[i].classList.remove('active');
	}
	setTimeout("entrance()", 500);
}

function chickenSelect(){
	rankingboxes[0].classList.remove('unselected');
	rankingboxes[1].classList.add('unselected');
	rankingboxes[2].classList.add('unselected');
	graphs[0].classList.remove('unselected');
	graphs[1].classList.add('unselected');
	graphs[2].classList.add('unselected');
}
function cafeSelect(){
	rankingboxes[0].classList.add('unselected');
	rankingboxes[1].classList.remove('unselected');
	rankingboxes[2].classList.add('unselected');
	graphs[0].classList.add('unselected');
	graphs[1].classList.remove('unselected');
	graphs[2].classList.add('unselected');
}
function dduckSelect(){
	rankingboxes[0].classList.add('unselected');
	rankingboxes[1].classList.add('unselected');
	rankingboxes[2].classList.remove('unselected');
	graphs[0].classList.add('unselected');
	graphs[1].classList.add('unselected');
	graphs[2].classList.remove('unselected');
}