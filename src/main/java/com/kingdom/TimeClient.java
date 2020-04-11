package com.kingdom;
import java.io.IOException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;

public class TimeClient {
	public static void main(String[] args) {
		int port = 8080;
		if (null != args && args.length > 0) {
			try {
				port = Integer.valueOf(args[0]);
			}
			catch (NumberFormatException e) {
				// use default port number
			}
		}
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			socket = new Socket("127.0.0.1", port);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			out.println("QUERY TIME ORDER");
			System.out.println("Send order 2 server succeed.");
			String resp = in.readLine();
			System.out.println("Now is : " + resp);
		}
		catch (Exception e) {
			System.out.println(Runtime.getRuntime().availableProcessors());
			System.out.println("Exception occured!");
		}
		finally {
			
			if (null != out) {
				out.close();
				out = null;
			}
			
			if (null != in) {
				try {
					in.close();
				}
				catch (IOException e1) {
					e1.printStackTrace();
				}
				in = null;
			}
			
			if (null != socket) {
				try {
					socket.close();
				}
				catch (IOException e1) {
					e1.printStackTrace();
				}
				socket = null;
			}
		}
	}
}

