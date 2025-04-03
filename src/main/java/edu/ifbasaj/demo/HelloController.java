package edu.ifbasaj.demo;

import edu.ifbasaj.demo.model.Boleto;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TableView<Boleto> tblBoletos;

    private TableColumn<Boleto, String> columnCredor;
    private TableColumn<Boleto, Double> columnValor;
    private TableColumn<Boleto, Void> colBtn;

    public void initialize() {
        // Inicialize o TableView aqui
        // Criar uma lista de Boleto
        List<Boleto> boletos = List.of(
            new Boleto(1, "Credor 1", 100.0),
            new Boleto(2, "Credor 2", 200.0),
            new Boleto(3, "Credor 3", 300.0)
        );
        columnCredor = new TableColumn<>("Credor");
        columnCredor.setCellValueFactory(new PropertyValueFactory<>("credor"));
        columnValor = new TableColumn<>("Valor");
        columnValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        colBtn = new TableColumn<>("Ações");
        colBtn.setCellFactory(param -> new BotaoAcaoCell());
        tblBoletos.getColumns().addAll(columnCredor, columnValor, colBtn);
        tblBoletos.setItems(FXCollections.observableList(boletos));
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    private class BotaoAcaoCell extends javafx.scene.control.TableCell<Boleto, Void> {
        @Override
        protected void updateItem(Void item, boolean empty) {
            super.updateItem(item, empty);
            if (empty) {
                setGraphic(null);
            } else {
                Button btn = new Button("Pagar");
                btn.setOnAction(event -> {
                    Boleto boleto = getTableView().getItems().get(getIndex());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Pagar Boleto");
                    alert.setContentText("Você está prestes a pagar o boleto do credor " + boleto.getCredor() + " com valor de " + boleto.getValor() + " reais.");
                    alert.showAndWait();
                });
                setGraphic(btn);
            }
        }

    }
}