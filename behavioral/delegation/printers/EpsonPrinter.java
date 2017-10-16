package behavioral.delegation.printers;

import behavioral.delegation.Printer;

public class EpsonPrinter implements Printer {

    @Override
    public void print(String message) {

        System.out.println("Epsin Printer: " + message);

    }

}
