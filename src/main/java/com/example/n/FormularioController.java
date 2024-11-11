package com.example.n;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * Controlador del formulario que gestiona la interacción del usuario
 * con los campos de entrada y las acciones de aceptar y cancelar.
 */
public class FormularioController {

    @FXML // fx:id="txtApellidos"
    private TextField txtApellidos; // Campo de texto para ingresar los apellidos, inyectado por FXMLLoader

    @FXML // fx:id="txtNombre"
    private TextField txtNombre; // Campo de texto para ingresar el nombre, inyectado por FXMLLoader

    @FXML // fx:id="txtProfesion"
    private TextField txtProfesion; // Campo de texto para ingresar la profesión, inyectado por FXMLLoader

    /**
     * Maneja el evento de aceptar. Valida que los campos no estén vacíos
     * y muestra un mensaje de error si es necesario. Si todos los campos son válidos,
     * muestra una confirmación con los datos ingresados.
     *
     * @param event el evento de acción que se dispara al hacer clic en el botón de aceptar
     */
    @FXML
    void aceptar(ActionEvent event) {
        String error = ""; // Variable para almacenar mensajes de error

        // Validación del campo Nombre
        if (txtNombre.getText().isBlank()) {
            error = "El campo Nombre no puede estar vacío";
        }

        // Validación del campo Apellidos
        if (txtApellidos.getText().isBlank()) {
            if (!error.isBlank()) {
                error += "\n"; // Agrega un salto de línea si ya hay un mensaje de error
            }
            error += "El campo Apellidos no puede estar vacío";
        }

        // Validación del campo Profesión
        if (txtProfesion.getText().isBlank()) {
            if (!error.isBlank()) {
                error += "\n"; // Agrega un salto de línea si ya hay un mensaje de error
            }
            error += "El campo Profesión no puede estar vacío";
        }

        // Si hay errores, muestra una alerta
        if (!error.isBlank()) {
            alerta(error);
        } else {
            // Si no hay errores, muestra una confirmación con los datos ingresados
            String resultado = "Nombre: " + txtNombre.getText() + "\nApellidos: " + txtApellidos.getText() + "\nProfesión: " + txtProfesion.getText();
            confirmacion(resultado);
        }
    }

    /**
     * Maneja el evento de cancelar. Cierra la aplicación.
     *
     * @param event el evento de acción que se dispara al hacer clic en el botón de cancelar
     */
    @FXML
    void cancelar(ActionEvent event) {
        Platform.exit(); // Cierra la aplicación
    }

    /**
     * Muestra una alerta de error con el mensaje proporcionado.
     *
     * @param texto el mensaje de error que se mostrará en la alerta
     */
    public void alerta(String texto) {
        Alert alerta = new Alert(Alert.AlertType.ERROR); // Crea una alerta de tipo ERROR
        alerta.setHeaderText(null); // No se muestra encabezado
        alerta.setTitle("ERROR"); // Título de la alerta
        alerta.setContentText(texto); // Establece el contenido del mensaje
        alerta.showAndWait(); // Muestra la alerta y espera a que el usuario la cierre
    }

    /**
     * Muestra una alerta de información con el mensaje proporcionado.
     *
     * @param texto el mensaje de información que se mostrará en la alerta
     */
    public void confirmacion(String texto) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION); // Crea una alerta de tipo INFORMATION
        alerta.setHeaderText(null); // No se muestra encabezado
        alerta.setTitle("Info"); // Título de la alerta
        alerta.setContentText(texto); // Establece el contenido del mensaje
        alerta.showAndWait(); // Muestra la alerta y espera a que el usuario la cierre
    }
}