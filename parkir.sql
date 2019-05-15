-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Bulan Mei 2019 pada 00.55
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `parkiran`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `parkir`
--

CREATE TABLE `parkir` (
  `id` int(11) NOT NULL,
  `nopol` varchar(20) NOT NULL,
  `tipe` varchar(20) NOT NULL,
  `Jam_masuk` varchar(50) NOT NULL,
  `keluar` enum('ya','tdk') NOT NULL DEFAULT 'tdk',
  `Jam_keluar` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `parkir`
--

INSERT INTO `parkir` (`id`, `nopol`, `tipe`, `Jam_masuk`, `keluar`, `Jam_keluar`) VALUES
(91, 'AE 3132 TE', 'MOBIL', '01', 'ya', '22'),
(92, 'T 6612 JV', 'MOTOR', '01', 'ya', '12'),
(93, 'B 3132 CNW', 'MOBIL', '01', 'ya', '12'),
(94, 'AD 1022 FE', 'MOTOR', '01', 'ya', '12'),
(95, 'B 5122 TX', 'MOTOR', '01', 'ya', '12'),
(96, 'S 3900 NS', 'MOTOR', '01', 'ya', '12'),
(97, 'AB 1111 DA', 'MOBIL', '01', 'ya', '12'),
(98, 'F 2144 CX', 'MOTOR', '01', 'ya', '12'),
(99, 'N 8812 NC', 'MOTOR', '01', 'ya', '12'),
(100, 'A 7611 MK', 'MOBIL', '01', 'ya', '12'),
(101, 'Z 7111 MK', 'MOBIL', '01', 'ya', '12'),
(102, 'AD 9312 GZ', 'MOBIL', '01', 'ya', '20'),
(103, 'D 3132 SE', 'MOBIL', '01', 'ya', '11'),
(104, 'F 7887 GJ', 'MOTOR', '02', 'tdk', '-'),
(105, 'G 6898 Z', 'MOTOR', '02', 'tdk', '-'),
(106, 'B 48 US', 'MOBIL', '05', 'tdk', '-'),
(107, 'H 7123 Z', 'MOTOR', '23', 'tdk', '-'),
(108, 'D 3132 AS', 'MOTOR', '23', 'tdk', '-'),
(109, 'Y 8080 Z', 'MOTOR', '02', 'tdk', '-'),
(110, 'K 7979 Z', 'MOTOR', '09', 'ya', '21'),
(111, 'K 2131 Z', 'MOTOR', '09', 'tdk', '-'),
(112, 'B', 'MOTOR', '09', 'ya', '22'),
(113, 'B', 'MOTOR', '09', 'tdk', '-');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `parkir`
--
ALTER TABLE `parkir`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `parkir`
--
ALTER TABLE `parkir`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=114;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
