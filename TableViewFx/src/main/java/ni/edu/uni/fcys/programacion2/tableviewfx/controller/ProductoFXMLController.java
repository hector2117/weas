/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.tableviewfx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SortEvent;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import ni.edu.uni.fcys.programacion2.tableviewfx.pojo.Producto;

/**
 * FXML Controller class
 *
 * @author Sistemas-09
 */
public class ProductoFXMLController implements Initializable {

    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtDescripcion;
    @FXML
    public Spinner<Integer> SpCantidad;
    @FXML
    public TextField txtPrecio;
    @FXML
    public TextField txtImagen;
    @FXML
    public Button btnBuscar;
    @FXML
    public TableView<Producto> tblVProducto;
    @FXML
    public TableColumn<Producto, String> tblCId;
    @FXML
    public TableColumn<Producto, String> tblCNombre;
    @FXML
    public TableColumn<Producto, String> tblCDescripcion;
    @FXML
    public TableColumn<Producto, String> tblCCantidad;
    @FXML
    public TableColumn<Producto, String> tblCPrecio;
    @FXML
    public Button btnAgregar;
    @FXML
    public Button btnEliminar;

    private ObservableList<Producto>productos;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        productos = FXCollections.observableArrayList();
        productos.add(new Producto(1, "CocaCola", "Vitamina CSM", 15, 6, ""));
        tblCId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tblCNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tblCDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        tblCPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        tblCCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        SpCantidad.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 1));
       
        
        tblVProducto.setItems(productos);
    }    

    @FXML
    public void txtNombreAction(ActionEvent event) {
    }

    @FXML
    public void txtDescripcionAction(ActionEvent event) {
    }

    @FXML
    public void SpCantidadAction(MouseEvent event) {
    }

    @FXML
    public void txtPrecioAction(ActionEvent event) {
    }

    @FXML
    public void txtImagenAction(ActionEvent event) {
    }

    @FXML
    public void btnBuscarAction(ActionEvent event) {
    }

    @FXML
    public void tblVProductoAction(SortEvent<C> event) {
    }

    @FXML
    public void btnAgregarAction(ActionEvent event) {
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        int cantidad = Integer.parseInt(SpCantidad.getValue().toString());
        float precio = Float.parseFloat(txtPrecio.getText());
        int id = 0;
        
        Producto last = productos.get(productos.size()-1);
        if(last == null){
            id = 1;
        }
        
        Producto p = new Producto(last.getId()+1, nombre, descripcion, cantidad, precio, "");
        productos.add(p);
        
    }

    @FXML
    public void btnEliminarAction(ActionEvent event) {
    }
    
}
