<?php

$startTime = microtime(true);
$a = 0;
do {
    $a += 1;
    echo $a . PHP_EOL;
} while ($a < 100000000);
$endTime = microtime(true);
$timeElapsed = $endTime - $startTime;
echo "Time: " . ($timeElapsed * 1000) . " ms" . PHP_EOL;
echo "Speed: " . (100000000 / $timeElapsed) . " processes per second" . PHP_EOL;

?>