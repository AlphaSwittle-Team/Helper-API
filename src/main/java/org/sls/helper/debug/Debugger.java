package org.sls.helper.debug;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Debugger {
	private File debugFile;

	public static Debugger instance()
	{
		return new Debugger();
	}

	public void debug(File debugFile)
	{
		this.debugFile = debugFile;
	}

	public void log(String message)
	{
		PrintWriter out = null;
		try
		{
			out = new PrintWriter(new FileWriter(debugFile), true);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		out.write(message);
		out.close();
	}
}
