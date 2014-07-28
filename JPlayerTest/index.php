<html>
    <head>
        <title>JPlayer Playlist Test</title>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="js/jPlayer/jquery.jplayer.min.js"> </script>
		<script src="js/jPlayer/jplayer.playlist.min.js"> </script>
        <script src="js/test.js"></script>

        <script>

            $(document).ready(function(){

                sayHelloWorld();

                //initializeJPlayer("#jPlayerDiv");
				
				var jPlayerCSSSelector = {jPlayer: "#jPlayerDiv", cssSelectorAncestor: "#jp_container_1"};
				var playlist = [
					{
						title:"Cro Magnon Man",
						artist:"The Stark Palace",
						mp3:"http://www.jplayer.org/audio/mp3/TSP-01-Cro_magnon_man.mp3",						
						poster: "http://www.jplayer.org/audio/poster/The_Stark_Palace_640x360.png"
					},				
					{	
						title:"Amma Endu",
						artist:"Rajini",
						mp3:"./media/Amma amma.mp3",					
						poster: "http://www.jplayer.org/audio/poster/The_Stark_Palace_640x360.png"
					}
				]; 
				
				var options = {autoPlay: true,supplied: "mp3"};
						
				configurePlaylist(jPlayerCSSSelector,playlist,options);

            });

        </script>

    </head>

    <body>
        <div id="jPlayerDiv"></div>
        <div id="jp_container_1">
            <a href="#" class="jp-play">Play</a>
            <a href="#" class="jp-pause">Pause</a>
        </div>
    </body>

</html>