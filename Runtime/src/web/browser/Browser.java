package web.browser;

import java.io.IOException;

public class Browser {
	public static void openUrl(String url){
		String browserName = "firefox";					// Default browser name
		String ieBrowser = "iexplore";
        // Add quotes around the URL to allow ampersands and other special characters to work.
		Process process = null;
		try {
			process = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", "start", "\"\"", browserName, '"' + url + '"' });
		} catch (IOException e) {
			e.printStackTrace();
		}

      // This avoids a memory leak on some versions of Java on Windows.
      // That's hinted at in <http://developer.java.sun.com/developer/qow/archive/68/>.
      try {
        int exitCode = process.waitFor();
        if (exitCode != 0) {	// if Netscape was not open
          try {
			Runtime.getRuntime().exec(new String[] {ieBrowser, url });
			} catch (IOException e) {
				System.out.println("No iexplore is installed.");
			}
        }
        
        process.exitValue();
      } catch (InterruptedException ie) {
        try {
			throw new IOException("InterruptedException while launching browser: " + ie.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
      }
	}
}
