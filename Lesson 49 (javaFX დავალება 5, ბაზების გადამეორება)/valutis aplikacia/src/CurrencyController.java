import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class CurrencyController implements Initializable {
    @FXML
    private ChoiceBox<String> from;
    @FXML
    private ChoiceBox<String> to;
    @FXML
    private Spinner<Double> fromSpinner;
    @FXML
    private Label label;

    private final String[] currencies = {"USD", "EUR", "GBP", "GEL"};

    private Map<String, Double> exchangeRates;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD -> EUR", 0.85);
        exchangeRates.put("USD -> GBP", 0.74);
        exchangeRates.put("USD -> GEL", 2.7);
        exchangeRates.put("EUR -> USD", 1.18);
        exchangeRates.put("EUR -> GBP", 0.87);
        exchangeRates.put("EUR -> GEL", 3.17);
        exchangeRates.put("GBP -> USD", 1.36);
        exchangeRates.put("GBP -> EUR", 1.15);
        exchangeRates.put("GBP -> GEL", 3.65);
        exchangeRates.put("GEL -> USD", 0.37);
        exchangeRates.put("GEL -> EUR", 0.32);
        exchangeRates.put("GEL -> GBP", 0.27);

        from.getItems().addAll(currencies);
        to.getItems().addAll(currencies);
        from.getSelectionModel().selectFirst();
        to.getSelectionModel().selectFirst();

        SpinnerValueFactory.DoubleSpinnerValueFactory dsf =
                new SpinnerValueFactory.DoubleSpinnerValueFactory(
                        0.0,
                        Double.MAX_VALUE,
                        0.0,
                        0.5
                );
        fromSpinner.setValueFactory(dsf);

        fromSpinner
                .valueProperty()
                .addListener(
                        new ChangeListener<Double>() {
                            @Override
                            public void changed(ObservableValue<? extends Double> observableValue, Double aDouble, Double t1) {
                                label.setText(
                                        convertCurrency()
                                );
                            }
                        }
                );
    }

    public String convertCurrency() {
        double fromValue = Double.parseDouble(fromSpinner.getValue().toString());

        String query = from.getValue() + " -> " + to.getValue();

        double rate = 1;
        if (!from.getValue().equals(to.getValue())) {
            rate = exchangeRates.get(query);
        }

        return String.format("%.2f", fromValue * rate);
    }
}
