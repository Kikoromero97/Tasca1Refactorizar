public class Zapping {
    public static int numeroClicks (int canalOrigen, int canalDestino) {
        int clicks = 0;
        do {
            clicks++;
            if (canalDestino > canalOrigen) {
                canalOrigen = (canalOrigen + 1) % 100;
            } else if (canalDestino < canalOrigen) {
                canalOrigen = (canalOrigen + 99) % 100;
            } else {
                clicks = 0;
                break;
            }
        } while (canalOrigen != canalDestino);
        return clicks;
    }
}
