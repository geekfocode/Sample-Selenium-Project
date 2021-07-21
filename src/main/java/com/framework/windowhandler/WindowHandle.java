package com.framework.windowhandler;

import java.io.IOException;

public class WindowHandle {

	public static void fileUpload(String path) throws IOException {
		Runtime.getRuntime().exec(path);
	}
}
