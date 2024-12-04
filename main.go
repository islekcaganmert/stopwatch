package main

import (
	"fmt"
	"time"
)

func main() {
	var a int64 = 0
	startTime := time.Now().Unix()
	for a < 100000000 {
		a += 1
		fmt.Println(a)
	}
	elapsedTime := time.Now().Unix() - startTime
	fmt.Printf("Time: %d\n", elapsedTime)
	fmt.Printf("Speed: %d process per second\n", 100000000/elapsedTime)
}