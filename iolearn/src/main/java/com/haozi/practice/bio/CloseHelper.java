package com.haozi.practice.bio;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/**
 * Created by ASUS on 2018/10/21.
 */
public class CloseHelper {
    public static void close(Reader in, Writer out, Socket socket) throws IOException {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            in = null;
        }

        if (out != null) {
            out.close();
            out = null;
        }

        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            socket = null;
        }
    }

}
