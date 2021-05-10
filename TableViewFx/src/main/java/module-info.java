module ni.edu.uni.fcys.programacion2.tableviewfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ni.edu.uni.fcys.programacion2.tableviewfx to javafx.fxml;
    exports ni.edu.uni.fcys.programacion2.tableviewfx;
    exports ni.edu.uni.fcys.programacion2.tableviewfx.controller;
    exports ni.edu.uni.fcys.programacion2.tableviewfx.pojo;
}
