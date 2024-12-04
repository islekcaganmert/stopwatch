#include <stdio.h>
#include <time.h>

int main() {
    long a = 0;
    long start_time = (long)time(NULL);
    do {
        a += 1;
        printf("%ld\n", a);
    } while (a < 100000000);
    printf("Time: %ld\n", (long)time(NULL) - start_time);
    printf("Speed: %ld process per second\n", 100000000 / ((long)time(NULL) - start_time));
    return 0;
}