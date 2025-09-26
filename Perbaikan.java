/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
/**
 *
 * @author AKHYAN
 */
public class Perbaikan {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line = br.readLine();

            if (line == null) {
                System.out.println("File kosong, tidak ada data yang bisa diproses.");
                return;
            }

            int angka = Integer.parseInt(line);

            if (angka == 0) {
                System.out.println("Tidak bisa membagi dengan nol!");
                return;
            }

            System.out.println("Hasil: " + (10 / angka));

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan. Pastikan 'data.txt' tersedia.");
        } catch (NumberFormatException e) {
            System.out.println("Isi file harus berupa angka yang valid.");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O: " + e.getMessage());
        }
    }
}
