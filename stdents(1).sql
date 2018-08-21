-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 21, 2018 at 08:02 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stdents`
--

-- --------------------------------------------------------

--
-- Table structure for table `emp_proj`
--

CREATE TABLE `emp_proj` (
  `idsinhvien` bigint(20) NOT NULL,
  `idmonhoc` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_mysql561_ci;

--
-- Dumping data for table `emp_proj`
--

INSERT INTO `emp_proj` (`idsinhvien`, `idmonhoc`) VALUES
(12, 13),
(13, 14),
(17, 18),
(21, 22),
(24, 25),
(24, 26),
(25, 27),
(25, 28),
(26, 29),
(26, 30),
(27, 31),
(27, 32),
(28, 33),
(28, 34),
(29, 35),
(29, 36),
(30, 37),
(30, 38),
(16, 17),
(72, 22),
(72, 21),
(72, 22),
(72, 33);

-- --------------------------------------------------------

--
-- Table structure for table `monhoc`
--

CREATE TABLE `monhoc` (
  `id` bigint(20) NOT NULL,
  `sotrinh` int(11) DEFAULT NULL,
  `tenmonhoc` varchar(255) COLLATE utf8_croatian_mysql561_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_mysql561_ci;

--
-- Dumping data for table `monhoc`
--

INSERT INTO `monhoc` (`id`, `sotrinh`, `tenmonhoc`) VALUES
(13, 3, 'Tin Hoc'),
(14, 3, 'Tin Hoc'),
(16, 3, 'Tin Hoc'),
(17, 3, 'Tin Hoc'),
(18, 3, 'Tin Hoc'),
(20, 3, 'Tin Hoc'),
(21, 3, 'Tin Hoc'),
(22, 3, 'Tin Hoc'),
(25, 3, 'Tin Hoc'),
(26, 3, 'Tin Hoc'),
(27, 3, 'Tin Hoc'),
(28, 3, 'Tin Hoc'),
(29, 3, 'Tin Hoc'),
(30, 3, 'Tin Hoc'),
(31, 3, 'Tin Hoc'),
(32, 3, 'Tin Hoc'),
(33, 3, 'Tin Hoc'),
(34, 3, 'Tin Hoc'),
(35, 3, 'Tin Hoc'),
(36, 3, 'Tin Hoc'),
(37, 3, 'Tin Hoc'),
(38, 3, 'Tin Hoc'),
(39, 3, 'Tin Hoc'),
(40, 3, 'Sinh Hoc'),
(41, 3, 'Sinh Hoc'),
(42, 3, 'Sinh Hocaaaaaa'),
(43, 3, 'Siooonh Hocaaaaaa'),
(44, 3, 'Siooonh Hocaaaaaa'),
(45, 3, 'Siooonh Hocaaaaaa'),
(46, 3, 'Siooonh Hocaaaaaa'),
(47, 3, 'Siooonh Hocaaaaaa');

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `id` bigint(20) NOT NULL,
  `lop` varchar(255) COLLATE utf8_croatian_mysql561_ci DEFAULT NULL,
  `gioitinh` int(11) DEFAULT NULL,
  `ngaysinh` varchar(255) COLLATE utf8_croatian_mysql561_ci DEFAULT NULL,
  `quequan` varchar(255) COLLATE utf8_croatian_mysql561_ci DEFAULT NULL,
  `tensv` varchar(255) COLLATE utf8_croatian_mysql561_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_mysql561_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`id`, `lop`, `gioitinh`, `ngaysinh`, `quequan`, `tensv`) VALUES
(12, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(13, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(16, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(17, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(21, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(24, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(25, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(26, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(27, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(28, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(29, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(30, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(32, NULL, 0, '12/09/1984', 'Thai Binh asdadad', 'Thai'),
(33, 'A1', 0, '12/09/1984', 'Thai Binh', 'Thai'),
(37, 'A1', 0, '12/09/1984', 'Thai Binh asdadad', 'Thai'),
(50, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(51, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(52, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(55, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(57, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(58, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(59, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(60, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(61, NULL, 0, NULL, NULL, NULL),
(62, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(63, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(64, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai'),
(72, NULL, 0, '12/09/1984', 'Thai Binh', 'Thai');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `emp_proj`
--
ALTER TABLE `emp_proj`
  ADD KEY `FKel1j1bimhv8oxqeoo4p7k208l` (`idmonhoc`),
  ADD KEY `FK1fwb7rokwp4q2mqucj0q8039k` (`idsinhvien`);

--
-- Indexes for table `monhoc`
--
ALTER TABLE `monhoc`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `monhoc`
--
ALTER TABLE `monhoc`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `sinhvien`
--
ALTER TABLE `sinhvien`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `emp_proj`
--
ALTER TABLE `emp_proj`
  ADD CONSTRAINT `FK1fwb7rokwp4q2mqucj0q8039k` FOREIGN KEY (`idsinhvien`) REFERENCES `sinhvien` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKel1j1bimhv8oxqeoo4p7k208l` FOREIGN KEY (`idmonhoc`) REFERENCES `monhoc` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
