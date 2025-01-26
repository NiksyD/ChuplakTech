package home.midterm;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class EnrollmentController extends SceneController implements Initializable {

    @FXML
    private TableView<EnrollmentData> tableView;

    @FXML
    private TableColumn<EnrollmentData, CheckBox> selectColumn;

    @FXML
    private TableColumn<EnrollmentData, String> courseCode;

    @FXML
    private TableColumn<EnrollmentData, String> descTitle;

    @FXML
    private TableColumn<EnrollmentData, Integer> lecUnits;

    @FXML
    private TableColumn<EnrollmentData, Integer> labUnits;

    @FXML
    private TableColumn<EnrollmentData, Integer> totalUnits;

    @FXML
    private TableColumn<EnrollmentData, String> remarks;

    @FXML
    private ComboBox<String> semesterComboBox;

    private final String[] semesters = {"Choose...", "1st Year, 1st Semester", "1st Year, 2nd Semester", "2nd Year, 1st Semester", "2nd Year, 2nd Semester", "3rd Year, 1st Semester", "3rd Year, 2nd Semester", "3rd Year, Summer", "4th Year, 1st Semester", "4th Year, 2nd Semester"};

    private final Map<String, String[][]> semesterSubjectsMap = new HashMap<>();

    // Dynamically populate subjectsList
    ObservableList<EnrollmentData> subjectsList = FXCollections.observableArrayList();

    // Delete selected row to the table by checking the checkbox
    @FXML
    void deleteSelectedRow(ActionEvent event) {
        ObservableList<EnrollmentData> selectedRows = FXCollections.observableArrayList();
        for (EnrollmentData data : subjectsList) {
            if (data.getSelectColumn().isSelected()) {
                selectedRows.add(data);
            }
        }
        subjectsList.removeAll(selectedRows);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize subject details for each semester
        //  1st Year, 1st Semester
        semesterSubjectsMap.put("1st Year, 1st Semester", new String[][]{
                {"ENGL 100", "Communication Arts", "3", "0", "3", ""},
                {"SOCIO 102", "Gender and Society", "3", "0", "3", ""},
                {"MATH 100", "College Mathematics", "3", "0", "3", ""},
                {"PSYCH 101", "Understanding the Self", "3", "0", "3", ""},
                {"CC-INTCOM11", "Introduction to Computing", "3", "0", "3", ""},
                {"CC-COMPROG11", "Computer Programming 1", "2", "1", "3", ""},
                {"IT-WEBDEV11", "Web Design & Development", "2", "1", "3", ""},
                {"PE 101", "Movement Competency Training (PATHFit 1)", "2", "0", "2", ""},
                {"NSTP 101", "National Service Training Program 1", "3", "0", "3", ""}
        });

        // 1st Year, 2nd Semester
        semesterSubjectsMap.put("1st Year, 2nd Semester", new String[][]{
                {"ENGL 101", "Purposive Communication", "3", "0", "3", "ENGL 100"},
                {"ENTREP 101", "The Entrepreneurial Mind", "3", "0", "3", ""},
                {"MATH 101", "Mathematics in the Modern World", "3", "0", "3", "MATH 100"},
                {"HIST 101", "Readings in Philippines History", "3", "0", "3", ""},
                {"HUM 101", "Art Appreciation", "3", "0", "3", ""},
                {"CC-COMPROG12", "Computer Programming 2", "2", "1", "3", "CC-COMPROG11"},
                {"CC-DISCRET12", "Discrete Structures", "3", "0", "3", "CC-INTCOM11"},
                {"PE 102", "Exercise-based Fitness Activities (PATHFit 2)", "2", "0", "2", "PE 101"},
                {"NSTP 102", "National Service Training Program 2", "3", "0", "3", "NSTP 101"}
        });

        // 2nd Year, 1st Semester
        semesterSubjectsMap.put("2nd Year, 1st Semester", new String[][]{
                {"SOCIO 101", "The Contemporary World", "3", "0", "3", ""},
                {"RIZAL 101", "Life, Works & Writings of Dr. Jose Rizal", "3", "0", "3", ""},
                {"CC-DIGILOG21", "Digital Logic Design", "2", "1", "3", "CC-DISCRET12"},
                {"IT-OOPROG21", "Object-Oriented Programming", "2", "1", "3", "CC-COMPROG12"},
                {"IT-SAD21", "System Analysis & Design", "3", "0", "3", "CC-COMPROG12"},
                {"CC-ACCTG21", "Accounting for IT", "3", "0", "3", "MATH 101"},
                {"CC-TWRITE21", "Tactical Writing & Presentation Skills", "3", "0", "3", "ENGL 101, CC-INTCOM11"},
                {"PE 103", "Sports and Dance (PATHFit 3)", "2", "0", "2", "PE 102"}
        });

        // 2nd Year, 2nd Semester
        semesterSubjectsMap.put("2nd Year, 2nd Semester", new String[][]{
                {"STS 101", "Science, Technology & Society", "3", "0", "3", ""},
                {"PHILO 101", "Ethics", "3", "0", "3", ""},
                {"CC-QUAMETH22", "Quantitative Methods w/ Prob. Stat.", "3", "0", "3", "CC-DISCRET12"},
                {"IT-PLATECH22", "Platform Technologies w/ Op. Sys.", "2", "1", "3", "CC-DIGILOG21"},
                {"CC-APPSDEV22", "Applications Devt & Emerging Tech.", "2", "1", "3", "IT-OOPROG21"},
                {"CC-DASTRUC22", "Data Structures & Algorithms", "2", "1", "3", "it-OOPROG21"},
                {"CC-DATACOM22", "Data Communications", "2", "1", "3", "CC-DIGILOG21"},
                {"PE 104", "Sports & Outdoor Adventures (PATHFit 4)", "2", "0", "2", "PE 103"}
        });

        // 3rd Year, 1st Semester
        semesterSubjectsMap.put("3rd Year, 1st Semester", new String[][]{
                {"IT-IMDBSYS31", "Database Management (DB Sys. 1)", "2", "1", "3", "CC-APPSDEV22"},
                {"IT-NETWORK31", "Computer Networks", "2", "1", "3", "CC-DATACOM22"},
                {"IT-TESTQUA31", "Testing & Quality Assurance", "2", "1", "3", "CC-APPSDEV22"},
                {"CC-HCI31", "Human-Computer Interaction", "3", "0", "3", "IT-SAD21"},
                {"CC-RESCOM31", "Methods of Research in Computing", "3", "0", "3", "CC-TWRITE21, CC-QUAMETH22"},
                {"IT-EL______", "IT Elective 1", "2", "1", "3", "●"},
                {"IT-FRE______", "Free Elective 1", "3", "0", "3", "● ●"},
                {"IT-FRE______", "Free Elective 2", "3", "0", "3", "● ●"}
        });

        // 3rd Year, 2nd Semester
        semesterSubjectsMap.put("3rd Year, 2nd Semester", new String[][]{
                {"IT-IMDBSYS32", "Database Management (DB Sys. 2)", "2", "1", "3", "IT-IMDBSYS31"},
                {"IT-INFOSEC32", "Information Assurance & Security", "2", "1", "3", "IT-IMDBSYS31,IT-NETWORK31"},
                {"IT-SYSARCH32", "System Integration & Architecture", "2", "1", "3", "IT-TESTQUA31, CC-HCI31"},
                {"CC-TECHNO32", "Technopreneurship", "3", "0", "3", "CC-RESCOM31"},
                {"IT-INTPROG32", "Integrative Prog'g & Technologies", "2", "1", "3", "IT-IMDBSYS31"},
                {"IT-SYSADMN32", "Systems Administration & Maintenance", "2", "1", "3", "IT-NETWORK31"},
                {"IT-EL2", "IT Elective 2", "2", "1", "3", "●"},
                {"IT-FRE2", "Free Elective 3", "3", "0", "3", "● ●"}
        });

        // 3rd Year, Summer
        semesterSubjectsMap.put("3rd Year, Summer", new String[][]{
                {"IT-CPSTONE30", "Capstone Project 1", "3", "0", "3", "* * *"},
                {"CC-PROFIS10", "Professional Issues in Computing", "3", "0", "3", "* *"}
        });

        // 4th Year, 1st Semester
        semesterSubjectsMap.put("4th Year, 1st Semester", new String[][]{
                {"LIT 11", "Literatures of the World", "3", "0", "3", ""},
                {"IT-CPSTONE40", "Capstone Project 2", "3", "0", "3", "IT-CPSTONE30"},
                {"IT-EL______", "IT Elective 3", "2", "1", "3", "●"},
                {"IT-FRE______", "Free Elective 3", "3", "0", "3", "● ●"}
        });

        // 4th Year, 2nd Semester
        semesterSubjectsMap.put("4th Year, 2nd Semester", new String[][]{
                {"CC-PRACT40", "Practicum", "0", "9", "9", ""},
                {"IT-EL______", "IT Elective 5", "2", "1", "3", "●"}
        });

        // Drop down menu for semester
        semesterComboBox.setValue("Choose...");
        semesterComboBox.getItems().addAll(semesters);

        // Table View
        selectColumn.setCellValueFactory(new PropertyValueFactory<>("selectColumn"));
        courseCode.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        descTitle.setCellValueFactory(new PropertyValueFactory<>("descTitle"));
        lecUnits.setCellValueFactory(new PropertyValueFactory<>("lecUnits"));
        labUnits.setCellValueFactory(new PropertyValueFactory<>("labUnits"));
        totalUnits.setCellValueFactory(new PropertyValueFactory<>("totalUnits"));
        remarks.setCellValueFactory(new PropertyValueFactory<>("remarks"));

        // Disable reordering of columns
        selectColumn.setReorderable(false);
        courseCode.setReorderable(false);
        descTitle.setReorderable(false);
        lecUnits.setReorderable(false);
        labUnits.setReorderable(false);
        totalUnits.setReorderable(false);
        remarks.setReorderable(false);

        // Listener to ChoiceBox
        semesterComboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            subjectsList.clear();
            if (semesterSubjectsMap.containsKey(newValue)) {
                for (String[] details : semesterSubjectsMap.get(newValue)) {
                    subjectsList.add(new EnrollmentData(
                            new CheckBox(), // Select Column
                            details[0], // Subject code
                            details[1], // Title
                            Integer.parseInt(details[2]), // Lecture Units
                            Integer.parseInt(details[3]), // Lab Units
                            Integer.parseInt(details[4]), // Credit Units
                            details[5]  // Remarks,
                    ));
                }
            }
        });

        // Set the items of the table view
        tableView.setItems(subjectsList);
    }
}