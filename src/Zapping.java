public class Zapping {
    public static int numeroClicks(int canalOrigen, int canalDestino) {
        int clicks = 0;
        while (canalOrigen != canalDestino) {
            clicks++;
            if (canalDestino > canalOrigen) {
                canalOrigen = (canalOrigen + 1) % 100;
            } else {
                canalOrigen = (canalOrigen + 99) % 100;
            }
        }
        return clicks;
    }
}

