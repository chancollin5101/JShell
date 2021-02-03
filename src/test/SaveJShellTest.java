// **********************************************************
// Assignment2:
// Student1: Collin Chan
// UTORID user_name: chancol7
// UT Student #: 1006200889
// Author: Collin Chan
//
// Student2: Jeff He
// UTORID user_name: Hejeff2
// UT Student #: 1006398783
// Author: Jeff He
//
// Student3: Nevin Wong
// UTORID user_name: wongnevi
// UT Student #: 1005391434
// Author: Nevin Wong
//
// Student4: David Huynh
// UTORID user_name: huynhd12
// UT Student #: 1005991937
// Author: David Huynh
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// I have also read the plagiarism section in the course info
// sheet of CSC B07 and understand the consequences.
// *********************************************************

package test;

import static org.junit.Assert.assertEquals;

import driver.SaveJShell;
import java.io.File;
import org.junit.Before;
import org.junit.Test;
import driver.JShell;

public class SaveJShellTest {

	JShell shell;

	@Before
	public void setUp() {
		shell = new JShell();
	}

	@Test
	public void testGetManual() {
		String manual;
		manual = SaveJShell.getManual();
		assertEquals(manual,
				"saveJShell localFilePath\n"
						+ "The above command will interact with your real file "
						+ "system on your computer.\n"
						+ "Saves the current working session of the shell"
						+ "so that it can be loaded in a future session");
	}

	@Test
	public void testPerformOutcome() {
		SaveJShell.performOutcome(shell,
				new String[]{"saveJShell", " ./test.txt"}, 0, null);
		File f = new File("./test.txt");
		assertEquals(f.isFile(), true);
	}
}
