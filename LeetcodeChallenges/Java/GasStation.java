public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] twiceGas = new int[n * 2];
        int[] twiceCost = new int[n * 2];
        int amountGas = 0;
        boolean possible = false;

        for (int i = 0; i < n; i++) {
            twiceCost[i] = cost[i];
            twiceCost[i + n] = cost[i];
            twiceGas[i] = gas[i];
            twiceGas[i + n] = gas[i];
        }

        for (int i = 0; i < n; i++) {
            amountGas = gas[i];
            for (int j = i; j < n + i; j++) {
                if (amountGas > twiceCost[j] || (j == n + i - 1 && amountGas >= twiceCost[j + 1])) {
                    amountGas = amountGas - twiceCost[j + 1] + twiceGas[j + 1];
                    possible = true;

                } else {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };
        gasStation.canCompleteCircuit(gas, cost);
    }
}
