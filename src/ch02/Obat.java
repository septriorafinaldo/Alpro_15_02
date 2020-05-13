package ch02;

import java.util.Date;

public class Obat {
    String barcode;
    String nama;
    Date tanggalKedalursa;
    double harga;

    public String getBarcode() {
        return barcode;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalKedaluarsa() {
        return tanggalKedalursa;
    }

    public double getHarga() {
        return harga;
    }
}