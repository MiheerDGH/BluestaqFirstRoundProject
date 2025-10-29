import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    private int currentFloor;
    private boolean movingUp;
    private final int maxFloor;
    private final int minFloor;
    private final Queue<Integer> requests;

    public Elevator(int minFloor, int maxFloor) {
        this.currentFloor = minFloor;
        this.movingUp = true;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.requests = new LinkedList<>();
    }

    public void requestFloor(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            requests.add(floor);
            System.out.println("Request added: " + floor);
        } else {
            System.out.println("Invalid floor request: " + floor);
        }
    }

    public void step() {
        if (requests.isEmpty()) {
            System.out.println("No pending requests.");
            return;
        }

        int target = requests.peek();
        if (currentFloor < target) {
            currentFloor++;
            movingUp = true;
        } else if (currentFloor > target) {
            currentFloor--;
            movingUp = false;
        }

        System.out.println("Elevator at floor: " + currentFloor +
                           (movingUp ? " (going up)" : " (going down)"));

        if (currentFloor == target) {
            System.out.println("Arrived at floor " + currentFloor + ". Doors opening...");
            requests.poll(); // remove completed request
        }
    }

    public boolean isIdle() {
        return requests.isEmpty();
    }
}
