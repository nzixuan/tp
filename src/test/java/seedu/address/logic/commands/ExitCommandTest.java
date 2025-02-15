package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.logic.commands.ExitCommand.MESSAGE_EXIT_ACKNOWLEDGEMENT;

import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;

public class ExitCommandTest {
    private Model model = new ModelManager();
    private Model expectedModel = new ModelManager();

    @Test
    public void execute_exit_success() {
        CommandResult expectedCommandResult = new CommandResult(MESSAGE_EXIT_ACKNOWLEDGEMENT, false, true, false);
        assertCommandSuccess(new ExitCommand(), model, expectedCommandResult, expectedModel);
    }

    @Test
    public void equals() {
        ExitCommand exitCommand = new ExitCommand();
        // same object -> returns true
        assertTrue(exitCommand.equals(exitCommand));

        // same values -> returns true
        ExitCommand exitCommandcopy = new ExitCommand();
        assertTrue(exitCommand.equals(exitCommandcopy));

        // different types -> returns false
        assertFalse(exitCommand.equals(1));

        // null -> returns false
        assertFalse(exitCommand.equals(null));
    }
}
