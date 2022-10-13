package assigment.employeepayroll.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileIOTest {
	private static final String HOME = System.getProperty("user.home");
	private static final String IO_FILE = "TempFolder";

	@Test
	public void givenPathWhenCheckedThenConfirm() throws IOException {
		// Check File Exists
		Path pathHome = Paths.get(HOME);
		Assertions.assertTrue(Files.exists(pathHome));

		// Delete FIle and Check File Not Exist
		Path pathFile = Paths.get(HOME + "/" + IO_FILE);
		if (Files.exists(pathFile))
			FilesDelete.deleteFiles(pathFile.toFile());
		Assertions.assertTrue(Files.notExists(pathFile));

		// Create Directory
		Files.createDirectory(pathFile);
		Assertions.assertTrue(Files.exists(pathFile));

		// Create File
		IntStream.range(1, 5).forEach(cntr -> {
			Path pathTemp = Paths.get(pathFile + "/temp" + cntr);
			Assertions.assertTrue(Files.notExists(pathTemp));
			try {
				Files.createFile(pathTemp);
			} catch (IOException ignored) {
			}
			Assertions.assertTrue(Files.exists(pathTemp));
		});

		// List Files, Directories as well as Files with Extension
		Files.list(pathFile).filter(Files::isRegularFile).forEach(System.out::println);
		Files.newDirectoryStream(pathFile).forEach(System.out::println);
		Files.newDirectoryStream(pathFile, path -> path.toFile().isFile() && path.toString().startsWith("temp"))
				.forEach(System.out::println);
	}
}
