module com.example.studiopazienti {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.example.studiopazienti to javafx.fxml;
	exports com.example.studiopazienti;
}