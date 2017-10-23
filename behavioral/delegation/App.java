package behavioral.delegation;

import behavioral.delegation.printers.CanonPrinter;
import behavioral.delegation.printers.EpsonPrinter;

/**
 * Demonstration of delegation pattern.
 */
public class App {

    public static void main(String[] args) {

        String message = "hello delegation";

        PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
        PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());

        canonPrinterController.print(message);
        epsonPrinterController.print(message);

    }

}
