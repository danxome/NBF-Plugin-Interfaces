package fr.esgi.interfaces.printJob;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import org.pf4j.ExtensionPoint;

public interface PrintJob extends ExtensionPoint {

    Button buildPrintButton(AnchorPane root);
}
