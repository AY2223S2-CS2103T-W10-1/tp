package seedu.address.model.module;

/**
 * Represents a Module's deadline.
 */
public class Deadline {
    public static final String MESSAGE_CONSTRAINTS =
            "Deadline should only contain alphanumeric characters and spaces, and it should not be blank";
    public static final String VALIDATION_REGEX = "[^\\d].*";

    public final String value;

    /**
     * Constructs an {@code Deadline}.
     *
     * @param deadline A valid deadline.
     */
    public Deadline(String deadline) {
        //deadline is optional and hence we do not requireNonNull.
        //requireNonNull(deadline);
        value = deadline;
    }

    /**
     * Returns if a given string is a valid deadline.
     */
    public static boolean isValidDeadline(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }


    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof seedu.address.model.module.Deadline // instanceof handles nulls
                && value.equals(((seedu.address.model.module.Deadline) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
