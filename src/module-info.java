module com.jdc.minipos {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	opens com.jdc.pos to javafx.fxml;
}
