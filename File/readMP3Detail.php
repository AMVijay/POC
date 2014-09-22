<html>
  <head>
    <title>PHP Test</title>
  </head>
  <body>
    <?php echo '<p>Hello World</p>'; ?>
    <?php 

$filePath = "";

$file = fopen($filePath,"r");

$str = $fseek($file,128);

print $str;

$fclose($file);

    ?>
  </body>
</html>