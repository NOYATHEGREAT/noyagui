-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 06, 2025 at 06:23 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `billpayments`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `log_id` int(11) NOT NULL,
  `log_uid` int(11) NOT NULL,
  `log_action` varchar(255) NOT NULL,
  `log_timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`log_id`, `log_uid`, `log_action`, `log_timestamp`) VALUES
(11, 11, 'User Login: Laluna', '2025-04-06 03:06:36'),
(12, 11, 'Updated a user: ivan12', '2025-04-06 03:07:16'),
(13, 13, 'User Login: Noya', '2025-04-06 03:44:42'),
(14, 13, 'User Login: Noya', '2025-04-06 03:47:38'),
(15, 13, 'Create a user: yannie', '2025-04-06 03:49:05'),
(16, 13, 'Updated a user: ivan12', '2025-04-06 03:50:58'),
(17, 13, 'User Logout: Noya', '2025-04-06 03:51:09'),
(18, 11, 'User Login: Laluna', '2025-04-06 03:56:49'),
(19, 11, 'Deleted user ID: 14', '2025-04-06 03:57:14'),
(20, 11, 'User Logout: Laluna', '2025-04-06 03:57:24'),
(21, 11, 'User Login: Laluna', '2025-04-06 03:58:49'),
(22, 11, 'Deleted user ID: 14', '2025-04-06 03:59:05'),
(23, 11, 'User Logout: Laluna', '2025-04-06 04:00:05'),
(24, 13, 'User Login: Noya', '2025-04-06 04:05:12'),
(25, 13, 'Deleted user ID: 14', '2025-04-06 04:05:22');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `u_id` int(10) NOT NULL,
  `f_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(60) NOT NULL,
  `phone_number` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `status_1` varchar(100) NOT NULL,
  `type` varchar(255) NOT NULL,
  `question` varchar(50) NOT NULL,
  `answer` varchar(50) NOT NULL,
  `image` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`u_id`, `f_name`, `last_name`, `username`, `email`, `phone_number`, `pass`, `status_1`, `type`, `question`, `answer`, `image`) VALUES
(11, 'Ivan', 'Laluna', 'ivan12', 'ivan@ivan.com', '12345678902', 'wwGTrEWyqV6TCnqBqHxi4rtLUVc5sND49E18gPdyCWQ=', 'Active', 'Admin', '', '', ''),
(12, 'Karl', 'Campoy', 'campoy12', 'campoy@campoy.com', '12345678901', 'DRMq8/pzj2GubAGvMUBmNDWzx7fpCVfUbXh+p7//Bi0=', 'Active', 'User', 'What is your fav color?', 'red', ''),
(13, 'John Lloyd', 'Noya', 'noya12', 'noya@noya.com', '12345678901', 'iHu1c60hflgmU+6hR9PEXHxXOGsh6OacjeWhsYgcvvc=', 'Active', 'Admin', '', '', ''),
(15, 'Chrtistian', 'Yongzon', 'yannie', 'yannie@yannie.com', '12345678901', 'vb+Lf8PZzEf13tvD4KTklPFS7hbpRgyzUQ0VQTSylEI=', 'Pending', 'User', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `log_uid` (`log_uid`);

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD CONSTRAINT `tbl_logs_ibfk_1` FOREIGN KEY (`log_uid`) REFERENCES `tbl_users` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
