package LAB3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SafeList<E> implements List<E> {
    List<E> myLst = new ArrayList<>();
    static final Lock lock = new ReentrantLock();
    @Override
    public int size() {
        lock.lock();
        var res = myLst.size();
        lock.unlock();
        return res;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        var res = myLst.size();
        lock.unlock();
        return res == 0;
    }

    @Override
    public boolean contains(Object o) {
        lock.lock();
        var res = myLst.contains(o);
        lock.unlock();
        return res;
    }

    @Override
    public Iterator<E> iterator() {
        lock.lock();
        var res = myLst.iterator();
        lock.unlock();
        return res;
    }
}
