<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        
        <!-- Slider CSS -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <link rel="stylesheet" href="css/slider.css">
        <script src="javaScript/slider.js"></script>


        <title>GoPerú</title>
        <!-- Favicon -->
        <link rel="icon" href="img/LogoGoPeru1.png">

        <!-- Style CSS -->
        
    </head>
 
    
    <body>
              <!--slider start-->
        <section>
            <div id="slider" style="max-height: 400px; width: 90%; max-width: 960px; margin: 0 auto">
                <div class="slide">
                    <img src="" alt="" data-src-async="img/bembos.png">
                </div>
                <div class="slide">
                    <img src="" alt="" data-src-async="img/kfc-sunny.jpg">
                </div>
                <div class="slide">
                    <img src="" alt="" data-src-async="img/bembos.png">
                </div>
            </div>
        </section>      
              <script>
                  var slider = new Slider("slider", {
                    play_icon: '<i class="fas fa-play"></i>',
                    pause_icon: '<i class="far fa-pause-circle"></i>',
                    prev_icon: '<i class="fas fa-angle-left"></i>',
                    next_icon: '<i class="fas fa-angle-right"></i>'
                  });
              </script>
              <script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"></script>
                <!-- Latest compiled and minified JavaScript -->
              <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
      </body>
</html>