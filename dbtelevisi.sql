-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2023 at 04:42 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtelevisi`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbakun`
--

CREATE TABLE `tbakun` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbakun`
--

INSERT INTO `tbakun` (`username`, `password`) VALUES
('admin', 'admin'),
('admin', 'admin'),
('admin', 'admin'),
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tbtelevisi`
--

CREATE TABLE `tbtelevisi` (
  `nama_siaran` varchar(50) NOT NULL,
  `jam_siaran` varchar(50) NOT NULL,
  `jenis_siaran` varchar(50) NOT NULL,
  `durasi_siaran` varchar(50) NOT NULL,
  `saluran_siaran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbtelevisi`
--

INSERT INTO `tbtelevisi` (`nama_siaran`, `jam_siaran`, `jenis_siaran`, `durasi_siaran`, `saluran_siaran`) VALUES
('Indonesian Idol', 'Malam', 'Hiburan', '120 menit', 'RCTI'),
('Malam Minggu Miko', 'Malam', 'Hiburan', '30 Menit', 'ANTV'),
('Bola Indonesia', 'Sore', 'Olahraga', '90 Menit', 'ANTV'),
('Jejak Petualang', 'Sore', 'Berita', '60 Menit', 'Trans 7'),
('dahsyat', 'Pagi', 'Hiburan', '120 menit', 'RCTI'),
('cek ricek', 'Sore', 'Hiburan', '60 menit', 'TransTV'),
('masterchef indonesia', 'Malam', 'Berita', '60 Menit', 'TvOne');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
