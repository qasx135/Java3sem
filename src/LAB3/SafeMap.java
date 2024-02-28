//package LAB3;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.Semaphore;
//
//public class SafeMap<K, V> implements Map<K, V> {
//    static final Semaphore semaphore = new Semaphore(1);
//    final Map<K, V> myMap = new HashMap<>();
//
//    @Override
//    public int size() {
//        try {
//            semaphore.acquire();
//            var res = myMap.size();
//            semaphore.release();
//            return res;
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        try {
//            semaphore.acquire();
//            var res = myMap.isEmpty();
//            semaphore.release();
//            return res;
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    public boolean containsKey(Object key) {
//        try {
//            semaphore.acquire();
//            var res = myMap.containsKey(key);
//            semaphore.release();
//            return res;
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    public boolean containsValue(Object value) {
//        try {
//            semaphore.acquire();
//            var res = myMap.containsValue(value);
//            semaphore.release();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//}
