package behavioral.delegation;

import behavioral.delegation.printers.CanonPrinter;
import behavioral.delegation.printers.EpsonPrinter;

/**
 * Demonstration of delegation pattern. Notice that by calling print method through Printer controller, we can separate
 * the user from directly accessing specific Printer instances.
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
