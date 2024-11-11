package com.example.n;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación que extiende la clase Application de JavaFX.
 * Esta clase es responsable de iniciar la aplicación y cargar la interfaz de usuario
 * definida en un archivo FXML.
 */
public class Formulariopplication extends Application {

    /**
     * Método que se llama al iniciar la aplicación. Carga el archivo FXML,
     * configura la escena y muestra la ventana principal.
     *
     * @param stage el escenario principal de la aplicación
     * @throws IOException si ocurre un error al cargar el archivo FXML
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Carga el archivo FXML que define la interfaz de usuario
        FXMLLoader fxmlLoader = new FXMLLoader(Formulariopplication.class.getResource("/com/example/n/Formulario.fxml"));

        // Crea una nueva escena a partir del contenido del archivo FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Establece el título de la ventana
        stage.setTitle("Formulario:");

        // Asigna la escena al escenario principal
        stage.setScene(scene);

        // Muestra la ventana
        stage.show();
    }

    /**
     * Método principal que inicia la aplicación JavaFX.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Application.launch(); // Llama al método launch para iniciar la aplicación
    }
}