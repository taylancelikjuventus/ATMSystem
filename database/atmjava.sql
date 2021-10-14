-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 09, 2021 at 07:49 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atmjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `row_id` int(11) NOT NULL,
  `accno` varchar(255) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `balance` int(255) NOT NULL,
  `datetime` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`row_id`, `accno`, `fname`, `lname`, `balance`, `datetime`) VALUES
(1, 'ACC01', 'Brock ', 'Lesnar', 6600, '2019-09-05 11:56:32'),
(2, 'ACC02', 'Mike', 'Tyson', 17400, '2017-07-11 21:39:46');

-- --------------------------------------------------------

--
-- Table structure for table `loans`
--

CREATE TABLE `loans` (
  `loan_id` int(11) NOT NULL,
  `accno` varchar(255) NOT NULL,
  `int_rate` double NOT NULL,
  `num_of_years` double NOT NULL,
  `amount_of_loan` double NOT NULL,
  `montly_payment` double NOT NULL,
  `total_payment` double NOT NULL,
  `datetime` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loans`
--

INSERT INTO `loans` (`loan_id`, `accno`, `int_rate`, `num_of_years`, `amount_of_loan`, `montly_payment`, `total_payment`, `datetime`) VALUES
(6, 'acc01', 4.2, 2.5, 4000, 148.07, 4442.03, '2021-09-07T03:03:02.377');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `tid` int(11) NOT NULL,
  `accno` varchar(255) NOT NULL,
  `fromaccno` varchar(255) NOT NULL,
  `toaccno` varchar(255) NOT NULL,
  `deposit` int(50) NOT NULL,
  `withdraw` int(50) NOT NULL,
  `transfer` int(50) NOT NULL,
  `balance` int(50) NOT NULL,
  `datetime` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`tid`, `accno`, `fromaccno`, `toaccno`, `deposit`, `withdraw`, `transfer`, `balance`, `datetime`) VALUES
(24, 'acc01', 'acc01', 'acc01', 1000, 0, 0, 8000, '2021-09-06T03:27:07.625'),
(25, 'acc01', 'acc01', 'acc01', 0, 200, 0, 7800, '2021-09-06T03:28:08.161'),
(26, 'acc01', 'acc01', 'acc02', 0, 0, 1000, 6800, '2021-09-06T03:29:27.659'),
(27, 'acc02', 'acc01', 'acc02', 0, 0, 1000, 17400, '2021-09-06T03:29:27.726'),
(28, 'acc01', 'acc01', 'acc01', 0, 10, 0, 6790, '2021-09-06T06:12:26.995'),
(29, 'acc01', 'acc01', 'acc01', 0, 10, 0, 6780, '2021-09-06T06:12:30.953'),
(30, 'acc01', 'acc01', 'acc01', 0, 50, 0, 6730, '2021-09-06T06:12:34.258'),
(31, 'acc01', 'acc01', 'acc01', 0, 100, 0, 6630, '2021-09-06T06:12:37.720'),
(32, 'acc01', 'acc01', 'acc01', 0, 20, 0, 6610, '2021-09-06T06:12:42.082'),
(33, 'acc01', 'acc01', 'acc01', 0, 10, 0, 6600, '2021-09-06T06:12:45.644'),
(34, 'acc01', 'acc01', 'acc01', 0, 30, 0, 6570, '2021-09-06T06:12:49.838'),
(35, 'acc01', 'acc01', 'acc01', 30, 0, 0, 6600, '2021-09-07T03:22:42.115');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `accno` varchar(255) NOT NULL,
  `pinno` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `accno`, `pinno`) VALUES
(1, 'ACC01', '8080'),
(3, 'ACC02', '5567');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`row_id`),
  ADD UNIQUE KEY `accno` (`accno`);

--
-- Indexes for table `loans`
--
ALTER TABLE `loans`
  ADD PRIMARY KEY (`loan_id`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`tid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `accno` (`accno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `accounts`
--
ALTER TABLE `accounts`
  MODIFY `row_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `loans`
--
ALTER TABLE `loans`
  MODIFY `loan_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `tid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
