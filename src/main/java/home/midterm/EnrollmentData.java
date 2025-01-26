package home.midterm;

import javafx.scene.control.CheckBox;

public class EnrollmentData {
    private CheckBox selectColumn;
    private String courseCode;
    private String descTitle;
    private int labUnits, lecUnits, totalUnits;
    private String remarks;

    public EnrollmentData(CheckBox selectColumn ,String courseCode, String descTitle, int lecUnits, int labUnits, int totalUnits, String remarks) {
        this.selectColumn = new CheckBox(selectColumn.getText());
        this.courseCode = courseCode;
        this.descTitle = descTitle;
        this.labUnits = labUnits;
        this.lecUnits = lecUnits;
        this.totalUnits = totalUnits;
        this.remarks = remarks;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDescTitle() {
        return descTitle;
    }

    public void setDescTitle(String descTitle) {
        this.descTitle = descTitle;
    }

    public int getLabUnits() {
        return labUnits;
    }

    public void setLabUnits(int labUnits) {
        this.labUnits = labUnits;
    }

    public int getLecUnits() {
        return lecUnits;
    }

    public void setLecUnits(int lecUnits) {
        this.lecUnits = lecUnits;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public CheckBox getSelectColumn() {
        return selectColumn;
    }

    public void setSelectColumn(CheckBox selectColumn) {
        this.selectColumn = selectColumn;
    }
}
