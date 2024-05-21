import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class RandomizedSet {

    List<Integer> randomList;
    Random rand = new Random();

    public RandomizedSet() {
        randomList = new ArrayList<Integer>();
    }

    public boolean insert(int val) {
        if (randomList.contains(val)) {
            return false;
        } else {
            randomList.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        boolean check = randomList.remove(Integer.valueOf(val));
        if (check) {
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        int size = randomList.size();
        int random = rand.nextInt(size);
        return randomList.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */