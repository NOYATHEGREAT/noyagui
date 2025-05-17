-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2025 at 09:59 PM
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
-- Table structure for table `bill_type`
--

CREATE TABLE `bill_type` (
  `bill_id` int(20) NOT NULL,
  `bill_name` varchar(255) NOT NULL,
  `company` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bill_type`
--

INSERT INTO `bill_type` (`bill_id`, `bill_name`, `company`, `description`) VALUES
(1, 'Electriicy', 'Veco', 'Company of Yeahs'),
(4, 'Water', 'Miwascco', 'Tubig');

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
(25, 13, 'Deleted user ID: 14', '2025-04-06 04:05:22'),
(26, 16, 'User Login: KOE', '2025-04-26 13:41:23'),
(27, 16, 'User Logout: KOE', '2025-04-26 13:41:46'),
(28, 17, 'User Login: doe', '2025-05-17 15:37:19'),
(29, 17, 'Updated a user: johndoe', '2025-05-17 15:38:32'),
(30, 17, 'Deleted user ID: 16', '2025-05-17 15:38:56'),
(31, 18, 'User Login: ann', '2025-05-17 15:44:13'),
(32, 18, 'User Logout: ann', '2025-05-17 15:44:40'),
(33, 18, 'User Login: ann', '2025-05-17 16:01:10'),
(34, 18, 'User Login: ann', '2025-05-17 16:03:13'),
(35, 18, 'User Login: ann', '2025-05-17 16:05:13'),
(36, 18, 'User Login: ann', '2025-05-17 16:07:15'),
(37, 18, 'User Login: ann', '2025-05-17 16:09:45'),
(38, 18, 'User Login: ann', '2025-05-17 16:11:47'),
(39, 18, 'User Login: ann', '2025-05-17 16:12:15'),
(40, 18, 'User Login: ann', '2025-05-17 16:14:33'),
(41, 18, 'User Login: ann', '2025-05-17 16:16:11'),
(42, 18, 'User Login: ann', '2025-05-17 16:18:47'),
(43, 18, 'User Login: ann', '2025-05-17 16:28:26'),
(44, 18, 'User Logout: ann', '2025-05-17 16:28:34'),
(45, 18, 'User Login: ann', '2025-05-17 16:29:10'),
(46, 18, 'User Login: ann', '2025-05-17 16:29:58'),
(47, 18, 'User Login: ann', '2025-05-17 16:38:59'),
(48, 18, 'User Logout: ann', '2025-05-17 16:39:12'),
(49, 18, 'User Login: ann', '2025-05-17 17:27:41'),
(50, 18, 'User Login: ann', '2025-05-17 17:28:53'),
(51, 18, 'User Login: ann', '2025-05-17 17:49:46'),
(52, 18, 'User Login: ann', '2025-05-17 17:51:09'),
(53, 18, 'User Login: ann', '2025-05-17 17:53:29'),
(54, 18, 'User Login: ann', '2025-05-17 18:02:18'),
(55, 18, 'User Login: ann', '2025-05-17 18:04:57'),
(56, 18, 'User Login: ann', '2025-05-17 18:10:16'),
(57, 18, 'Deleted bill type ID: 2', '2025-05-17 18:10:30'),
(58, 18, 'User Login: ann', '2025-05-17 18:10:48'),
(59, 18, 'Deleted bill type ID: 2', '2025-05-17 18:10:55'),
(60, 18, 'User Login: ann', '2025-05-17 18:12:06'),
(61, 18, 'User Login: ann', '2025-05-17 18:12:45'),
(62, 18, 'Deleted bill type ID: 3', '2025-05-17 18:13:07'),
(63, 18, 'User Login: ann', '2025-05-17 18:30:36'),
(64, 18, 'User Logout: ann', '2025-05-17 18:30:48'),
(65, 18, 'Paid bill with ID: 4', '2025-05-17 19:34:31'),
(66, 18, 'User Login: ann', '2025-05-17 19:57:55'),
(67, 18, 'User Login: ann', '2025-05-17 19:58:52');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaction`
--

CREATE TABLE `tbl_transaction` (
  `transaction_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `bill_id` int(10) NOT NULL,
  `payment_method` varchar(255) NOT NULL,
  `amount` int(255) NOT NULL,
  `transaction_date` date NOT NULL,
  `status` varchar(255) NOT NULL,
  `billingperiod` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_transaction`
--

INSERT INTO `tbl_transaction` (`transaction_id`, `user_id`, `bill_id`, `payment_method`, `amount`, `transaction_date`, `status`, `billingperiod`) VALUES
(1, 18, 4, 'Gcash', 12345, '2025-05-18', 'Paid', 'april1020'),
(2, 18, 4, 'Gcash', 12345, '2025-05-18', 'Paid', 'april1020'),
(3, 18, 4, 'Gcash', 1234141, '2025-05-18', 'Paid', 'april'),
(4, 18, 4, 'Gcash', 12345, '2025-05-18', 'Paid', 'april'),
(5, 18, 4, 'Cash', 1234, '2025-05-18', 'Paid', 'poss'),
(6, 18, 4, 'Gcash', 1234, '2025-05-18', 'Paid', 'april');

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
(15, 'Chrtistian', 'Yongzon', 'yannie', 'yannie@yannie.com', '12345678901', 'vb+Lf8PZzEf13tvD4KTklPFS7hbpRgyzUQ0VQTSylEI=', 'Pending', 'User', '', '', ''),
(16, 'GWAPO', 'KOE', 'gwapokoe', 'gwapokoe123@gmail.com', '12345678914', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Active', 'Admin', '', '', ''),
(17, 'john', 'doe', 'johndoe', 'johndoe@gmail.com', '12345678911', 'SIoURHW2tkEn9JDH+TqNtK1f0jeNso96S3AE6+I52Xc=', 'Active', 'Admin', '', '', 'src/userImages/488796919_656924093717343_6570830547808190677_n.jpg'),
(18, 'judy', 'ann', 'judy', 'judyann@gmail.com', '12345678912', 'XxqSkx8Ucu9jA+5rbzIN1MezvPLMPD6DlTcv8UU4uqI=', 'Active', 'Admin', 'What is your father name?', 'BatBat', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill_type`
--
ALTER TABLE `bill_type`
  ADD PRIMARY KEY (`bill_id`);

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `log_uid` (`log_uid`);

--
-- Indexes for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD PRIMARY KEY (`transaction_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `bill_id` (`bill_id`);

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill_type`
--
ALTER TABLE `bill_type`
  MODIFY `bill_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `transaction_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD CONSTRAINT `tbl_logs_ibfk_1` FOREIGN KEY (`log_uid`) REFERENCES `tbl_users` (`u_id`);

--
-- Constraints for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD CONSTRAINT `bill_id` FOREIGN KEY (`bill_id`) REFERENCES `bill_type` (`bill_id`),
  ADD CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `tbl_users` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
