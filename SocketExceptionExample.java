/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.net.*;
/**
 *
 * @author AKHYAN
 */
public class SocketExceptionExample {
    public static void main(String[] args) {
        try {
            // Membuka koneksi socket ke localhost port 8080
            Socket socket = new Socket("localhost", 8080);

            // Langsung menutup socket
            socket.close();

            // Coba akses lagi setelah ditutup → akan error
            OutputStream out = socket.getOutputStream();
            out.write("Halo".getBytes());

        } catch (SocketException e) {
            System.out.println("Kesalahan koneksi socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O: " + e.getMessage());
        }
    }
}
