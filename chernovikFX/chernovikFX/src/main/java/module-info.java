module graficfx.chernovikfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens graficfx.chernovikfx to javafx.fxml;
    exports graficfx.chernovikfx;
}