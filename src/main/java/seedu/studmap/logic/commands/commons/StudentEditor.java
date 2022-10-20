package seedu.studmap.logic.commands.commons;

import seedu.studmap.model.student.Student;

/**
 * An abstract class that encapsulates the manner in which a student may be edited.
 */
public abstract class StudentEditor {

    /**
     * Creates a new student by editing a given student.
     * Editing behaviour is to be defined in the inherited class.
     * @param studentToEdit Student to be edited
     * @return New edited student
     */
    public abstract Student editStudent(Student studentToEdit);

    /**
     * Returns true if this editor will make edits when used.
     */
    public abstract boolean hasEdits();
}
