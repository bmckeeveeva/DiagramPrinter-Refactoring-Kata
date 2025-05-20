package sammancoaching;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DiagramPrinterTest {

    @Test
    public void translatingEmptyDocumentFails() {
        DiagramPrinter printer = new DiagramPrinter();
        StringBuilder output = new StringBuilder();
        boolean result = printer.printSummary(null, "swedish", output);
        assertFalse(result);
    }

    @Test
    public void printingEmptyDocumentFails() throws IOException {
        DiagramPrinter printer = new DiagramPrinter();
        boolean result = printer.printDiagram(null, null, null);
        assertFalse(result);
    }
}

