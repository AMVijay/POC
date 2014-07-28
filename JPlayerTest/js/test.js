

function sayHelloWorld(){
	alert("Hello, World");
}

function initializeJPlayer(jplayerDivId){
	
	//alert("Div Id :: " + jplayerDivId);
	
	$(jplayerDivId).jPlayer({	
	
		ready : function(){			
			$(this).jPlayer("setMedia",{
				mp3 : "./media/Amma amma.mp3"
			});
		}
	});
}


function configurePlaylist(jPlayerCSSSelector,playlist,options){
	
	var myPlaylist = new jPlayerPlaylist(jPlayerCSSSelector, playlist, options);
	
	myPlaylist.play(0);
}
