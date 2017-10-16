package behavioral.delegation.printers;

import behavioral.delegation.Printer;

public class CanonPrinter implements Printer {

    @Override
    public void print(String message) {

        System.out.println("Canon Printer: " + message);

    }

}
