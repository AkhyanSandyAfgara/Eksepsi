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
public class FileUploader {
    public static void main(String[] args) {
        String filePath = "data.txt";       // file yang akan diunggah
        String serverName = "localhost";    // alamat server
        int port = 8080;                    // port server

        // try-with-resources untuk memastikan file dan socket tertutup otomatis
        try (
            BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
            Socket socket = new Socket(serverName, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
        ) {
            // membaca isi file baris demi baris dan mengirimkan ke server
            String line;
            while ((line = fileReader.readLine()) != null) {
                out.println(line);
            }

            System.out.println("File berhasil dikirim ke server.");

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (UnknownHostException e) {
            System.out.println("Host server tidak dikenal: " + e.getMessage());
        } catch (SocketException e) {
            System.out.println("Terjadi kesalahan koneksi socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O: " + e.getMessage());
        }
    }
}
