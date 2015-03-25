package modelviewcontrollerMVC;

/**
 * Created by Squall on 25/03/2015.
 */

/*
    Model - Model represents an object or JAVA POJO carrying data. It can also have log ic to update
        controller if its data changes.

    View - View represents the visualization of the data that model contains.

    Controller - Controller acts on both Model and view. It controls the data flow into model object and
        updates the view whenever data chang es. It keeps View and Model separate.
 */

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudent();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("John");
        controller.updateView();
    }

    private static Student retrieveStudent() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
