void main() {
    final startTime = DateTime.now().millisecondsSinceEpoch;
    int a = 0;
    do {
        a += 1;
        print(a);
    } while (a < 100000000);
    final endTime = DateTime.now().millisecondsSinceEpoch;
    final timeElapsed = endTime - startTime;
    print('Time: $timeElapsed ms');
    print('Speed: ${100000000 / (timeElapsed / 1000.0)} processes per second');
}