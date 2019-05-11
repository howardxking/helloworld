package com.kingdom;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TimeServer {
	public static void main(String[] args) throws IOException {
		int port = 8080;
		if (null != args && args.length > 0) {
			try {
				port = Integer.valueOf(args[0]);
			}
			catch (NumberFormatException e) {
				// use default port number
			}
		}
		MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
		new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
	}
}

