/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  HP
 * Created: Jan 12, 2019
 */


CREATE TABLE ADMIN(
KODE INT(5) PRIMARY KEY AUTO INCREMENT,
NAMA VARCHAR(100) NOT NULL,
USERNAME VARCHAR(50) NOT NULL,
PASSWORD VARCHAR(50) NOT NULL,
AKSES INT
);

CREATE TABLE PELANGGAN(
KODE INT PRIMARY KEY,
NAMA VARCHAR(100)NOT NULL,
ALAMAT VARCHAR(250) NOT NULL,
EMAIL VARCHAR(100)NOT NULL,
TELP VARCHAR(13)
);

CREATE TABLE BARANG(
KODE CHAR(10) PRIMARY KEY,
NAMA VARCHAR(25) NOT NULL,
MEREK VARCHAR(50) NOT NULL,
STOK CHAR (15) NOT NULL,
HARGA INT NOT NULL,
WARNA VARCHAR(50) NOT NULL
);

CREATE TABLE MEREK(
KODE INT PRIMARY KEY,
NAMA VARCHAR(100)NOT NULL
);

CREATE TABLE WARNA(
KODE INT PRIMARY KEY,
NAMA VARCHAR(100)NOT NULL
);


CREATE TABLE PENJUALAN(
NOTA CHAR(10) PRIMARY KEY,
TGL_PEMBELIAN DATE NOT NULL,
PENJUAL CHAR(5) NOT NULL,
PELANGGAN INT,
CONSTRAINT FOREIGN KEY(KASIR) REFERENCES PENGGUNA(KODE),
CONSTRAINT FOREIGN KEY(PELANGGAN) REFERENCES PELANGGAN(KODE)
);

CREATE TABLE DET_PENJUALAN(
NOTA CHAR(10) NOT NULL,
KODE_BARANG CHAR(10) NOT NULL,
HARGA INT NOT NULL,
JUMLAH INT NOT NULL,
CONSTRAINT FOREIGN KEY(NOTA) REFERENCES PENJUALAN(NOTA),
CONSTRAINT FOREIGN KEY(BARANG) REFERENCES BARANG(KODE)
);

