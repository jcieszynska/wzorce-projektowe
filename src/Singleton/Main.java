package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

class KontrolerRuchu {
    private static KontrolerRuchu _konrtolerRuchu;
    private List<String> _serwery = new ArrayList<String>();
    private Random _generateRandom = new Random();

    private static ReentrantLock _lock = new ReentrantLock();

    public String Server;

    public String getServer() {
        int liczba = _generateRandom.nextInt(_serwery.size());
        return _serwery.get(liczba);
    }

    protected KontrolerRuchu() {
        _serwery.add("ServerI");
        _serwery.add("ServerII");
        _serwery.add("ServerIII");
        _serwery.add("ServerIV");
        _serwery.add("ServerV");
    }

    public static KontrolerRuchu zwrocKontrolerRuchu() {
        _lock.lock();
        try {
            if (_konrtolerRuchu == null) {
                _konrtolerRuchu = new KontrolerRuchu();
            }
        } finally {
            _lock.unlock();
        }

        return _konrtolerRuchu;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        KontrolerRuchu kRuchuJeden = KontrolerRuchu.zwrocKontrolerRuchu();
        KontrolerRuchu kRuchuDwa = KontrolerRuchu.zwrocKontrolerRuchu();

        if(kRuchuJeden == kRuchuDwa){
            System.out.println("Ta sama instancja\n");
        }

        KontrolerRuchu kontrolerRuchu = KontrolerRuchu.zwrocKontrolerRuchu();
        for (int i = 0; i < 15; i++){
            String serwer = kontrolerRuchu.getServer();
            System.out.println("Zapytanie zostało wysłane do: " + serwer);
        }
    }
}
