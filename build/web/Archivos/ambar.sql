-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-11-2019 a las 00:33:31
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ambar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admin`
--

CREATE TABLE `admin` (
  `id` int(10) NOT NULL,
  `AdminDNI` varchar(30) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `AdminNombre` varchar(70) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `AdminApellido` varchar(70) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `AdminTelefono` varchar(15) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `AdminDireccion` varchar(200) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `CuentaCodigo` varchar(70) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `admin`
--

INSERT INTO `admin` (`id`, `AdminDNI`, `AdminNombre`, `AdminApellido`, `AdminTelefono`, `AdminDireccion`, `CuentaCodigo`) VALUES
(1, '12312312', 'dsad', 'dsad', '3123', 'adasd', 'AC23943461'),
(11, '1026', 'jose', 'gomez', '', '', 'AC82802993'),
(15, '89789789897', 'jkhkjhkj', 'jhkh', '786786', 'kjh', 'AC18951845'),
(16, '7687687', 'guyg', 'yugyu', '', '', 'AC22361049'),
(17, '78686876', 'gug', 'uguiguigiu', '', '', 'AC31667359'),
(18, '785675675', 'hhh', 'hhh', '', '', 'AC406433611'),
(19, '77777777777', 'jjjjjjjjjj', 'jjjjjjjj', '', '', 'AC264081812'),
(20, '3123', 'DASD', 'ASDASD', '23123123', 'ASDA', 'AC269100112'),
(21, '23123', 'dasd', 'asdasd', '213123', '', 'AC790362813'),
(22, '23213', 'sad', 'asda', '12312', '', 'AC180664214');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE `administradores` (
  `id_administrador` int(11) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `especialidad` varchar(50) NOT NULL,
  `numero_tarjeta` varchar(50) NOT NULL,
  `cedula` int(50) NOT NULL,
  `id_usuario` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `apartamentos`
--

CREATE TABLE `apartamentos` (
  `id_apartamento` int(50) NOT NULL,
  `torre` varchar(50) NOT NULL,
  `numero` varchar(50) NOT NULL,
  `area` int(50) NOT NULL,
  `parqueadero` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `apartamentos`
--

INSERT INTO `apartamentos` (`id_apartamento`, `torre`, `numero`, `area`, `parqueadero`) VALUES
(17, '4', '4', 4, '4'),
(20, '3', '23', 50, ''),
(23, '2', '401', 50, '50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora`
--

CREATE TABLE `bitacora` (
  `id` int(10) NOT NULL,
  `BitacoraCodigo` varchar(150) COLLATE utf8_spanish2_ci NOT NULL,
  `BitacoraFecha` date NOT NULL,
  `BitacoraHoraInicio` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `BitacoraHoraFinal` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `BitacoraTipo` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `BitacoraYear` int(4) NOT NULL,
  `CuentaCodigo` varchar(70) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `bitacora`
--

INSERT INTO `bitacora` (`id`, `BitacoraCodigo`, `BitacoraFecha`, `BitacoraHoraInicio`, `BitacoraHoraFinal`, `BitacoraTipo`, `BitacoraYear`, `CuentaCodigo`) VALUES
(48, 'CB35183172', '2019-10-12', '08:38:44 am', '08:39:46 am', 'Administrador', 2019, 'AC82802993'),
(52, 'CB61329376', '2019-10-12', '09:19:19 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(53, 'CB44706377', '2019-10-12', '09:23:38 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(54, 'CB61378968', '2019-10-12', '09:47:13 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(55, 'CB15340815', '2019-10-12', '10:00:16 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(56, 'CB57224966', '2019-10-12', '10:16:58 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(57, 'CB99403737', '2019-10-12', '10:28:23 am', '10:33:50 am', 'Administrador', 2019, 'AC82802993'),
(58, 'CB63186568', '2019-10-12', '10:33:54 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(59, 'CB66480529', '2019-10-12', '10:44:45 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(60, 'CB913259010', '2019-10-12', '10:46:01 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(62, 'CB753010212', '2019-10-23', '11:51:51 am', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(63, 'CB799837313', '2019-10-23', '11:52:06 am', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(64, 'CB630205414', '2019-10-23', '11:54:05 am', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(65, 'CB245801115', '2019-10-23', '11:56:36 am', '12:03:02 pm', 'Propietario', 2019, 'PC31324608'),
(66, 'CB916091016', '2019-10-23', '12:00:02 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(67, 'CB339057217', '2019-10-23', '12:00:09 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(68, 'CB978705018', '2019-10-23', '12:00:41 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(69, 'CB168950919', '2019-10-23', '12:03:05 pm', '12:07:26 pm', 'Propietario', 2019, 'PC31324608'),
(70, 'CB639656120', '2019-10-23', '12:07:29 pm', '12:07:37 pm', 'Propietario', 2019, 'PC31324608'),
(72, 'CB191556022', '2019-10-23', '12:08:51 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(73, 'CB393746423', '2019-10-23', '12:11:02 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(74, 'CB465697024', '2019-10-23', '12:13:56 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(75, 'CB454211125', '2019-10-23', '12:14:07 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(76, 'CB123304126', '2019-10-23', '12:14:27 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(77, 'CB704248927', '2019-10-23', '12:14:57 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(78, 'CB258453528', '2019-10-23', '12:16:10 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(79, 'CB098861229', '2019-10-23', '12:17:26 pm', '12:17:33 pm', 'Propietario', 2019, 'PC31324608'),
(81, 'CB663464731', '2019-10-23', '12:19:58 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(82, 'CB417694032', '2019-10-23', '12:22:49 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(83, 'CB974009133', '2019-10-23', '12:26:01 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(84, 'CB337156034', '2019-10-23', '12:27:55 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(85, 'CB934628135', '2019-10-23', '12:29:52 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(86, 'CB886720336', '2019-10-23', '12:31:56 pm', '12:32:35 pm', 'Propietario', 2019, 'PC31324608'),
(0, 'CB046044634', '2019-10-26', '12:20:38 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB001074135', '2019-10-26', '12:33:27 pm', '12:36:27 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB457327136', '2019-10-26', '12:36:31 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB400952437', '2019-10-26', '01:44:55 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB950034138', '2019-10-26', '01:46:58 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB675481439', '2019-10-26', '01:48:21 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB334229240', '2019-10-26', '01:51:34 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB606142341', '2019-10-26', '01:51:55 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB465892042', '2019-10-26', '01:55:55 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB992087643', '2019-10-26', '08:54:11 pm', '02:14:26 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB210599546', '2019-10-27', '02:20:37 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB557625847', '2019-10-27', '08:19:47 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB137806549', '2019-10-27', '11:09:48 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB865948152', '2019-10-27', '11:17:56 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB152834853', '2019-10-27', '11:18:31 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB937001154', '2019-10-27', '11:20:40 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB079566655', '2019-10-27', '11:23:51 pm', '11:27:09 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB202664657', '2019-10-27', '11:28:22 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB053949558', '2019-10-30', '05:12:00 am', '05:20:42 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB808465561', '2019-10-30', '05:29:01 am', '05:44:48 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB314438366', '2019-10-30', '06:01:45 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB333033667', '2019-10-30', '06:07:31 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB424183168', '2019-10-30', '07:19:12 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB404710169', '2019-10-30', '07:19:36 am', '07:33:28 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB863506671', '2019-10-30', '07:34:07 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB508599972', '2019-10-30', '09:30:48 am', '10:39:13 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB485455773', '2019-10-30', '10:39:15 am', '10:41:11 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB272626075', '2019-10-30', '10:41:25 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB426976976', '2019-10-30', '11:57:45 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB466996577', '2019-10-30', '12:03:51 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB722355578', '2019-10-31', '01:11:05 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB298533780', '2019-10-31', '01:11:49 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB099220582', '2019-10-31', '01:12:21 pm', '01:14:44 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB473174383', '2019-10-31', '01:14:47 pm', '01:14:55 pm', 'Propietario', 2019, 'PC602001411'),
(0, 'CB663510484', '2019-10-31', '01:14:57 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB809989385', '2019-10-31', '03:16:38 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB808669586', '2019-10-31', '03:17:05 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB359429087', '2019-10-31', '03:18:18 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB739079688', '2019-10-31', '03:19:05 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB277355989', '2019-10-31', '03:21:04 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB231275690', '2019-10-31', '03:21:09 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB896635391', '2019-10-31', '05:41:01 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB218222492', '2019-10-31', '05:52:48 pm', '08:13:16 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB920417995', '2019-10-31', '08:19:04 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB784890796', '2019-10-31', '08:19:16 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB936425497', '2019-10-31', '08:21:01 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB075352098', '2019-10-31', '08:21:39 pm', '08:22:53 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB5551914101', '2019-11-04', '01:54:07 pm', '02:02:32 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB2827512103', '2019-11-04', '02:18:32 pm', '02:36:39 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB4717490107', '2019-11-04', '02:50:04 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB6233658108', '2019-11-04', '02:51:20 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB3952789109', '2019-11-04', '02:51:59 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB7906125110', '2019-11-04', '02:52:28 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB1485969112', '2019-11-04', '02:53:25 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB2070431113', '2019-11-04', '02:54:13 pm', '02:54:41 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB0075502115', '2019-11-04', '02:55:06 pm', '02:55:59 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB4298200117', '2019-11-04', '02:56:17 pm', '02:58:56 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB0084177119', '2019-11-04', '03:00:03 pm', '03:00:16 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB6953808121', '2019-11-04', '03:00:58 pm', '05:28:55 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB6162582122', '2019-11-04', '04:34:28 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(48, 'CB35183172', '2019-10-12', '08:38:44 am', '08:39:46 am', 'Administrador', 2019, 'AC82802993'),
(52, 'CB61329376', '2019-10-12', '09:19:19 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(53, 'CB44706377', '2019-10-12', '09:23:38 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(54, 'CB61378968', '2019-10-12', '09:47:13 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(55, 'CB15340815', '2019-10-12', '10:00:16 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(56, 'CB57224966', '2019-10-12', '10:16:58 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(57, 'CB99403737', '2019-10-12', '10:28:23 am', '10:33:50 am', 'Administrador', 2019, 'AC82802993'),
(58, 'CB63186568', '2019-10-12', '10:33:54 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(59, 'CB66480529', '2019-10-12', '10:44:45 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(60, 'CB913259010', '2019-10-12', '10:46:01 am', 'Sin registro', 'Administrador', 2019, 'AC82802993'),
(62, 'CB753010212', '2019-10-23', '11:51:51 am', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(63, 'CB799837313', '2019-10-23', '11:52:06 am', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(64, 'CB630205414', '2019-10-23', '11:54:05 am', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(65, 'CB245801115', '2019-10-23', '11:56:36 am', '12:03:02 pm', 'Propietario', 2019, 'PC31324608'),
(66, 'CB916091016', '2019-10-23', '12:00:02 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(67, 'CB339057217', '2019-10-23', '12:00:09 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(68, 'CB978705018', '2019-10-23', '12:00:41 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(69, 'CB168950919', '2019-10-23', '12:03:05 pm', '12:07:26 pm', 'Propietario', 2019, 'PC31324608'),
(70, 'CB639656120', '2019-10-23', '12:07:29 pm', '12:07:37 pm', 'Propietario', 2019, 'PC31324608'),
(72, 'CB191556022', '2019-10-23', '12:08:51 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(73, 'CB393746423', '2019-10-23', '12:11:02 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(74, 'CB465697024', '2019-10-23', '12:13:56 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(75, 'CB454211125', '2019-10-23', '12:14:07 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(76, 'CB123304126', '2019-10-23', '12:14:27 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(77, 'CB704248927', '2019-10-23', '12:14:57 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(78, 'CB258453528', '2019-10-23', '12:16:10 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(79, 'CB098861229', '2019-10-23', '12:17:26 pm', '12:17:33 pm', 'Propietario', 2019, 'PC31324608'),
(81, 'CB663464731', '2019-10-23', '12:19:58 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(82, 'CB417694032', '2019-10-23', '12:22:49 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(83, 'CB974009133', '2019-10-23', '12:26:01 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(84, 'CB337156034', '2019-10-23', '12:27:55 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(85, 'CB934628135', '2019-10-23', '12:29:52 pm', 'Sin registro', 'Propietario', 2019, 'PC31324608'),
(86, 'CB886720336', '2019-10-23', '12:31:56 pm', '12:32:35 pm', 'Propietario', 2019, 'PC31324608'),
(0, 'CB046044634', '2019-10-26', '12:20:38 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB001074135', '2019-10-26', '12:33:27 pm', '12:36:27 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB457327136', '2019-10-26', '12:36:31 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB400952437', '2019-10-26', '01:44:55 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB950034138', '2019-10-26', '01:46:58 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB675481439', '2019-10-26', '01:48:21 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB334229240', '2019-10-26', '01:51:34 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB606142341', '2019-10-26', '01:51:55 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB465892042', '2019-10-26', '01:55:55 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB992087643', '2019-10-26', '08:54:11 pm', '02:14:26 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB210599546', '2019-10-27', '02:20:37 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB557625847', '2019-10-27', '08:19:47 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB137806549', '2019-10-27', '11:09:48 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB865948152', '2019-10-27', '11:17:56 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB152834853', '2019-10-27', '11:18:31 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB937001154', '2019-10-27', '11:20:40 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB079566655', '2019-10-27', '11:23:51 pm', '11:27:09 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB202664657', '2019-10-27', '11:28:22 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB053949558', '2019-10-30', '05:12:00 am', '05:20:42 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB808465561', '2019-10-30', '05:29:01 am', '05:44:48 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB314438366', '2019-10-30', '06:01:45 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB333033667', '2019-10-30', '06:07:31 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB424183168', '2019-10-30', '07:19:12 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB404710169', '2019-10-30', '07:19:36 am', '07:33:28 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB863506671', '2019-10-30', '07:34:07 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB508599972', '2019-10-30', '09:30:48 am', '10:39:13 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB485455773', '2019-10-30', '10:39:15 am', '10:41:11 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB272626075', '2019-10-30', '10:41:25 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB426976976', '2019-10-30', '11:57:45 am', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB466996577', '2019-10-30', '12:03:51 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB722355578', '2019-10-31', '01:11:05 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB298533780', '2019-10-31', '01:11:49 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB099220582', '2019-10-31', '01:12:21 pm', '01:14:44 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB473174383', '2019-10-31', '01:14:47 pm', '01:14:55 pm', 'Propietario', 2019, 'PC602001411'),
(0, 'CB663510484', '2019-10-31', '01:14:57 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB809989385', '2019-10-31', '03:16:38 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB808669586', '2019-10-31', '03:17:05 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB359429087', '2019-10-31', '03:18:18 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB739079688', '2019-10-31', '03:19:05 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB277355989', '2019-10-31', '03:21:04 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB231275690', '2019-10-31', '03:21:09 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB896635391', '2019-10-31', '05:41:01 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB218222492', '2019-10-31', '05:52:48 pm', '08:13:16 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB920417995', '2019-10-31', '08:19:04 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB784890796', '2019-10-31', '08:19:16 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB936425497', '2019-10-31', '08:21:01 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB075352098', '2019-10-31', '08:21:39 pm', '08:22:53 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB5551914101', '2019-11-04', '01:54:07 pm', '02:02:32 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB2827512103', '2019-11-04', '02:18:32 pm', '02:36:39 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB4717490107', '2019-11-04', '02:50:04 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB6233658108', '2019-11-04', '02:51:20 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB3952789109', '2019-11-04', '02:51:59 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB7906125110', '2019-11-04', '02:52:28 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB1485969112', '2019-11-04', '02:53:25 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB2070431113', '2019-11-04', '02:54:13 pm', '02:54:41 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB0075502115', '2019-11-04', '02:55:06 pm', '02:55:59 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB4298200117', '2019-11-04', '02:56:17 pm', '02:58:56 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB0084177119', '2019-11-04', '03:00:03 pm', '03:00:16 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB6953808121', '2019-11-04', '03:00:58 pm', '05:28:55 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB6162582122', '2019-11-04', '04:34:28 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB9987878247', '2019-11-05', '08:12:05 am', '08:37:52 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB0119717251', '2019-11-06', '08:11:07 am', '08:13:04 am', 'Administrador', 2019, 'AC23943461'),
(0, 'CB1930992253', '2019-11-14', '03:21:15 pm', 'Sin registro', 'Administrador', 2019, 'AC23943461'),
(0, 'CB2885838190', '2019-11-14', '04:24:52 pm', '04:54:16 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB2941244191', '2019-11-14', '04:54:19 pm', 'Sin registro', 'Propietario', 2019, 'PC848517217'),
(0, 'CB8695544192', '2019-11-14', '04:56:05 pm', 'Sin registro', 'Propietario', 2019, 'PC848517217'),
(0, 'CB7073127193', '2019-11-14', '04:56:43 pm', 'Sin registro', 'Propietario', 2019, 'PC848517217'),
(0, 'CB3020668194', '2019-11-14', '04:58:07 pm', 'Sin registro', 'Propietario', 2019, 'PC848517217'),
(0, 'CB5547776195', '2019-11-14', '05:06:39 pm', '05:11:03 pm', 'Propietario', 2019, 'PC848517217'),
(0, 'CB3397170196', '2019-11-14', '05:11:06 pm', '05:13:51 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB8159933197', '2019-11-14', '05:13:53 pm', 'Sin registro', 'Propietario', 2019, 'PC848517217'),
(0, 'CB3045164198', '2019-11-14', '05:20:26 pm', '05:23:56 pm', 'Propietario', 2019, 'PC848517217'),
(0, 'CB9888631199', '2019-11-14', '05:23:58 pm', '05:24:03 pm', 'Propietario', 2019, 'PC848517217'),
(0, 'CB1704680200', '2019-11-14', '05:24:05 pm', '05:33:08 pm', 'Administrador', 2019, 'AC23943461'),
(0, 'CB4969971201', '2019-11-14', '05:25:46 pm', 'Sin registro', 'Propietario', 2019, 'PC848517217'),
(0, 'CB5822048202', '2019-11-14', '05:27:18 pm', '05:27:50 pm', 'Propietario', 2019, 'PC848517217');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `id` int(10) NOT NULL,
  `CuentaCodigo` varchar(70) COLLATE utf8_spanish2_ci NOT NULL,
  `CuentaPrivilegio` int(1) NOT NULL,
  `CuentaUsuario` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `CuentaClave` varchar(535) COLLATE utf8_spanish2_ci NOT NULL,
  `CuentaEmail` varchar(70) COLLATE utf8_spanish2_ci NOT NULL,
  `CuentaEstado` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `CuentaTipo` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `CuentaGenero` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `CuentaFoto` varchar(535) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `cuenta`
--

INSERT INTO `cuenta` (`id`, `CuentaCodigo`, `CuentaPrivilegio`, `CuentaUsuario`, `CuentaClave`, `CuentaEmail`, `CuentaEstado`, `CuentaTipo`, `CuentaGenero`, `CuentaFoto`) VALUES
(1, 'AC23943461', 1, '1', 'ZFZHQUVjc2NkZTkxUU5yZXk2WmxmUT09', '', 'Activo', 'Administrador', 'Mujer', 'Male3Avatar.png'),
(11, 'AC82802993', 1, 'j', 'aXJFbUdLa1JnRFZYcGVPcFdLRDVTdz09', '', 'Activo', 'Administrador', 'Hombre', 'Male3Avatar.png'),
(31, 'AC53108894', 1, 'hjgjhghj', 'cnZ6UmVuRzRzTGxyaVhLZ2tJeGc0Zz09', '', 'Activo', 'Administrador', 'Mujer', 'Male3Avatar.png'),
(32, 'AC18951845', 1, 'kkhggfhjg', 'dkx1MDM5dWg1RWtzMzUrK2VRSVAwQT09', '', 'Activo', 'Administrador', 'Hombre', 'Male3Avatar.png'),
(37, 'AC75991107', 1, 'ugyugkkjhg', 'cnZ6UmVuRzRzTGxyaVhLZ2tJeGc0Zz09', '', 'Activo', 'Cliente', 'Mujer', 'Male3Avatar.png'),
(40, 'AC22361049', 1, 'ygyugyu', 'cnZ6UmVuRzRzTGxyaVhLZ2tJeGc0Zz09', '', 'Activo', 'Administrador', 'Mujer', 'Male3Avatar.png'),
(46, 'AC31667359', 1, 'uhuihiuh', 'dkx1MDM5dWg1RWtzMzUrK2VRSVAwQT09', '', 'Activo', 'Administrador', 'Mujer', 'Male3Avatar.png'),
(53, 'AC406433611', 0, 'hhh', 'dkx1MDM5dWg1RWtzMzUrK2VRSVAwQT09', '', 'Activo', 'Administrador', 'Mujer', 'Male3Avatar.png'),
(55, 'AC264081812', 1, 'jjjjjjjjj', 'aXJFbUdLa1JnRFZYcGVPcFdLRDVTdz09', '', 'Activo', 'Administrador', 'Mujer', 'Male3Avatar.png'),
(71, 'PC602001411', 4, '4', 'VzNjaWRlbzlrRlRJb0Q1ZDkyTGZiQT09', '', 'Activo', 'Propietario', 'Mujer', 'Male3Avatar.png'),
(74, 'AC269100112', 1, 'ASD', 'ZjExaWR1VFd3cTNIeHo1Mitxb1Fjdz09', '', 'Activo', 'Administrador', 'Mujer', 'Male3Avatar.png'),
(75, 'AC790362813', 1, 'ddd', 'YXJDWW5kd3pCb0RkUFhuNVNmaWFLdz09', '', 'Activo', 'Administrador', 'Mujer', 'Male3Avatar.png'),
(76, 'AC180664214', 0, 'dddd', 'YXJDWW5kd3pCb0RkUFhuNVNmaWFLdz09', '', 'Activo', 'Administrador', 'Hombre', 'Male3Avatar.png'),
(78, 'PC723324315', 2, 'fffdasdasdasd', 'bG9JUnh0MmVacnVwdG9Nd3QrazYzdz09', '', 'Activo', 'Propietario', 'Mujer', 'Female2Avatar.png'),
(79, 'PC046233416', 4, 'dasdasd', 'YXJDWW5kd3pCb0RkUFhuNVNmaWFLdz09', '', 'Activo', 'Propietario', 'Mujer', 'Male3Avatar.png'),
(80, 'PC377276317', 4, 'dasdasdddd', 'YXJDWW5kd3pCb0RkUFhuNVNmaWFLdz09', '', 'Activo', 'Propietario', 'Hombre', 'Male3Avatar.png'),
(81, 'PC848517217', 4, '2', 'MUUxcDExRHBkMUJkM3JhZXBpZllpQT09', '', 'Activo', 'Propietario', 'Mujer', 'Female2Avatar.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventos`
--

CREATE TABLE `eventos` (
  `id_eventos` int(11) NOT NULL,
  `asunto_eventos` varchar(50) NOT NULL,
  `descripcion_eventos` varchar(4000) NOT NULL,
  `fecha_eventos` varchar(50) NOT NULL,
  `hora_eventos` varchar(50) NOT NULL,
  `year_eventos` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `eventos`
--

INSERT INTO `eventos` (`id_eventos`, `asunto_eventos`, `descripcion_eventos`, `fecha_eventos`, `hora_eventos`, `year_eventos`) VALUES
(24, 'dasd', 'asdasd', '2019-11-05', '08:37:46 am', '2019'),
(25, 'adasd', 'asdasd', '2019-11-14', '03:57:45 pm', '2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informes`
--

CREATE TABLE `informes` (
  `id_informes` int(11) NOT NULL,
  `asunto_informes` varchar(50) NOT NULL,
  `descripcion_informes` varchar(4000) NOT NULL,
  `fecha_informes` varchar(50) NOT NULL,
  `hora_informes` varchar(50) NOT NULL,
  `year_informes` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `informes`
--

INSERT INTO `informes` (`id_informes`, `asunto_informes`, `descripcion_informes`, `fecha_informes`, `hora_informes`, `year_informes`) VALUES
(24, 'dasd', 'asdasd', '2019-11-05', '08:37:46 am', '2019'),
(25, 'sdf', 'sdf', '2019-11-06', '08:12:55 am', '2019'),
(26, 'dasd', 'asdasd', '2019-11-14', '04:07:17 pm', '2019'),
(27, 'dasd', 'dasdsa', '2019-11-14', '04:51:00 pm', '2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `noticias`
--

CREATE TABLE `noticias` (
  `id_noticias` int(11) NOT NULL,
  `asunto_noticias` varchar(50) NOT NULL,
  `descripcion_noticias` varchar(4000) NOT NULL,
  `fecha_noticias` varchar(50) NOT NULL,
  `hora_noticias` varchar(50) NOT NULL,
  `year_noticias` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `noticias`
--

INSERT INTO `noticias` (`id_noticias`, `asunto_noticias`, `descripcion_noticias`, `fecha_noticias`, `hora_noticias`, `year_noticias`) VALUES
(21, 'asfasd', 'asdasd', '2019-11-04', '02:28:40 pm', '2019'),
(22, 'dasd', 'asdasd', '2019-11-04', '02:56:23 pm', '2019'),
(23, 'fsf', 'sdfsdf', '2019-11-04', '03:00:11 pm', '2019'),
(24, 'asdasd', 'asdasd', '2019-11-14', '04:11:53 pm', '2019'),
(25, 'dasd', 'asdasd', '2019-11-14', '04:25:08 pm', '2019'),
(26, 'dasd', 'asdasd', '2019-11-14', '04:29:49 pm', '2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `novedades`
--

CREATE TABLE `novedades` (
  `id_novedades` int(11) NOT NULL,
  `asunto_novedades` varchar(50) NOT NULL,
  `descripcion_novedades` varchar(4000) NOT NULL,
  `fecha_novedades` varchar(50) NOT NULL,
  `hora_novedades` varchar(50) NOT NULL,
  `year_novedades` varchar(50) NOT NULL,
  `CuentaCodigo` varchar(50) NOT NULL,
  `torre` int(50) NOT NULL,
  `numero` int(50) NOT NULL,
  `respuesta` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `novedades`
--

INSERT INTO `novedades` (`id_novedades`, `asunto_novedades`, `descripcion_novedades`, `fecha_novedades`, `hora_novedades`, `year_novedades`, `CuentaCodigo`, `torre`, `numero`, `respuesta`) VALUES
(17, 'fsdf', 'sfsf', '2019-10-31', '01:12:10 pm', '2019', 'PC668916911', 2, 401, 'Si'),
(18, 'sdfsdf', 'sfsdf', '2019-10-31', '01:14:52 pm', '2019', 'PC602001411', 4, 4, 'Si'),
(19, 'fsdf', 'sdfsdf', '2019-10-31', '08:26:23 pm', '2019', 'PC668916911', 2, 401, 'Si'),
(21, 'dasd', 'dasdasd', '2019-11-14', '05:06:59 pm', '2019', 'PC848517217', 2, 401, 'Si'),
(22, 'dasd', 'asdasd', '2019-11-14', '05:08:24 pm', '2019', 'PC848517217', 2, 401, 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `id` int(10) NOT NULL,
  `PropietarioDNI` varchar(40) COLLATE utf8_spanish2_ci NOT NULL,
  `PropietarioNombre` varchar(70) COLLATE utf8_spanish2_ci NOT NULL,
  `PropietarioApellido` varchar(70) COLLATE utf8_spanish2_ci NOT NULL,
  `PropietarioTelefono` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `PropietarioOcupacion` varchar(40) COLLATE utf8_spanish2_ci NOT NULL,
  `PropietarioDireccion` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `CuentaCodigo` varchar(70) COLLATE utf8_spanish2_ci NOT NULL,
  `id_apartamento` varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `propietario`
--

INSERT INTO `propietario` (`id`, `PropietarioDNI`, `PropietarioNombre`, `PropietarioApellido`, `PropietarioTelefono`, `PropietarioOcupacion`, `PropietarioDireccion`, `CuentaCodigo`, `id_apartamento`) VALUES
(8, '4', 'c', 'c', '', '4', '4', 'PC602001411', '17'),
(9, '123123213', 'dasdasddd', 'dasdasd', '23123', '2', '401', 'PC723324315', '23'),
(10, '123123', 'dasd', 'dasd', '213123', '2', '401', 'PC046233416', '23'),
(11, '231233123', 'dasd', 'asdsad', '48484', '2', '401', 'PC377276317', '23'),
(12, '21341234231', 'dsad', 'aSDASD', '1234', '2', '401', 'PC848517217', '23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas`
--

CREATE TABLE `respuestas` (
  `id_respuestas` int(11) NOT NULL,
  `asunto_respuestas` varchar(50) NOT NULL,
  `descripcion_respuestas` varchar(4000) NOT NULL,
  `fecha_respuestas` varchar(50) NOT NULL,
  `hora_respuestas` varchar(50) NOT NULL,
  `year_respuestas` varchar(50) NOT NULL,
  `id_novedades` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `respuestas`
--

INSERT INTO `respuestas` (`id_respuestas`, `asunto_respuestas`, `descripcion_respuestas`, `fecha_respuestas`, `hora_respuestas`, `year_respuestas`, `id_novedades`) VALUES
(29, 'fsadf', 'asfasdf', '2019-10-31', '08:21:47 pm', '2019', '17'),
(30, 'fasf', 'asdfasdfasdf', '2019-10-31', '08:22:50 pm', '2019', '18'),
(31, 'dasd', 'dasd', '2019-11-14', '04:22:42 pm', '2019', '19'),
(32, 'dasd', 'asdasd', '2019-11-14', '05:11:21 pm', '2019', '21');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD KEY `CuentaCodigo` (`CuentaCodigo`);

--
-- Indices de la tabla `administradores`
--
ALTER TABLE `administradores`
  ADD PRIMARY KEY (`id_administrador`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `apartamentos`
--
ALTER TABLE `apartamentos`
  ADD PRIMARY KEY (`id_apartamento`),
  ADD UNIQUE KEY `parqueadero` (`parqueadero`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `CuentaCodigo` (`CuentaCodigo`);

--
-- Indices de la tabla `eventos`
--
ALTER TABLE `eventos`
  ADD PRIMARY KEY (`id_eventos`);

--
-- Indices de la tabla `informes`
--
ALTER TABLE `informes`
  ADD PRIMARY KEY (`id_informes`);

--
-- Indices de la tabla `noticias`
--
ALTER TABLE `noticias`
  ADD PRIMARY KEY (`id_noticias`);

--
-- Indices de la tabla `novedades`
--
ALTER TABLE `novedades`
  ADD PRIMARY KEY (`id_novedades`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `CuentaCodigo` (`CuentaCodigo`);

--
-- Indices de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`id_respuestas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `administradores`
--
ALTER TABLE `administradores`
  MODIFY `id_administrador` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `apartamentos`
--
ALTER TABLE `apartamentos`
  MODIFY `id_apartamento` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- AUTO_INCREMENT de la tabla `eventos`
--
ALTER TABLE `eventos`
  MODIFY `id_eventos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `informes`
--
ALTER TABLE `informes`
  MODIFY `id_informes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `noticias`
--
ALTER TABLE `noticias`
  MODIFY `id_noticias` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `novedades`
--
ALTER TABLE `novedades`
  MODIFY `id_novedades` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `propietario`
--
ALTER TABLE `propietario`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `id_respuestas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
