package duke.command;

import java.io.File;

import org.junit.jupiter.api.Test;

import duke.common.DukeException;
import duke.common.Ui;
import duke.io.Storage;
import duke.io.TaskList;
import duke.parser.Parser;
import duke.task.Todo;

public class DukeCommandTest {
    final String dataDir = System.getProperty("user.dir") + File.separator + "dataTest";
    final String dataFile = "duke.txt";

    @Test
    public void testListCommand_testIsExit() throws DukeException {
        String fullCommand = "list";
        Command command = Parser.parse(fullCommand);
        Ui ui = new Ui();
        Storage storage = new Storage(dataDir + File.separator + dataFile);
        TaskList taskList = new TaskList();
        taskList.addTask(new Todo("return book"));
        command.execute(taskList, ui, storage);

    }
}
