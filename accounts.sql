-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 10 May 2021, 19:59:12
-- Sunucu sürümü: 10.4.18-MariaDB
-- PHP Sürümü: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `users`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `accounts`
--

CREATE TABLE `accounts` (
  `PersonID` int(11) DEFAULT NULL,
  `Username` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `Password` int(11) DEFAULT NULL,
  `LastName` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `FirstName` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `Gender` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `City` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `Birthdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `accounts`
--

INSERT INTO `accounts` (`PersonID`, `Username`, `Password`, `LastName`, `FirstName`, `Gender`, `City`, `Birthdate`) VALUES
(2, 'kemal12', 121213, 'Parlak', 'Kemal', 'Erkek', 'İstanbul', '1996-04-20'),
(3, 'nilüfer12', 121213, 'Aydın', 'Nilüfer', 'Kadın', 'Ankara', '2000-09-04'),
(4, 'aydın12', 121213, 'Aksoy', 'Aydın', 'Erkek', 'İzmir', '1992-11-18'),
(5, 'hazal12', 121213, 'Algın', 'Hazal', 'Kadın', 'Antalya', '1995-05-22');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
