package Odwiedzający;

import java.util.ArrayList;
import java.util.List;

public class Struktura {
    private List<Element> elements = new ArrayList<>();

    public void Dolacz(Element element){
        elements.add(element);
    }

    public void Odlacz(Element element){
        elements.remove(element);
    }

    public void Akceptuj(Odwiedzajacy odwiedzajacy){
        for (Element element : elements) {
            element.Akceptuj(odwiedzajacy);
        }
    }
}
