-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-04-2024 a las 03:28:59
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `obligatorio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `N_Pedido` int(11) NOT NULL,
  `Fecha_Pedido` varchar(15) NOT NULL,
  `Cantidad_Articulos` int(11) NOT NULL,
  `Fecha_Pago` varchar(15) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `Peso` int(11) NOT NULL,
  `Costo` int(11) NOT NULL,
  `Entrega` int(11) NOT NULL,
  `ID_cli` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`N_Pedido`, `Fecha_Pedido`, `Cantidad_Articulos`, `Fecha_Pago`, `Direccion`, `Peso`, `Costo`, `Entrega`, `ID_cli`) VALUES
(1, '201123', 2, '300423', 'jose.P.varela 1830', 40, 30000, 1, 2040);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `N_Prod` int(11) NOT NULL,
  `Stock` tinyint(4) NOT NULL,
  `precio` int(11) NOT NULL,
  `producto` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`N_Prod`, `Stock`, `precio`, `producto`) VALUES
(1, 1, 3000, 'auriculares'),
(2, 1, 1500, 'control'),
(3, 0, 6000, 'monitor'),
(5, 1, 200, 'mouse');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID` int(11) NOT NULL,
  `usuario` varchar(15) NOT NULL,
  `contra` varchar(15) NOT NULL,
  `admin` tinyint(1) NOT NULL,
  `CI` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID`, `usuario`, `contra`, `admin`, `CI`) VALUES
(1, 'jose', 'cliente', 0, 55366354),
(2, 'admin', 'admin', 1, 123456),
(3, 'hola', 'cliente', 0, 3242425),
(4, 'cliente', 'holaaa', 0, 4678265);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`N_Pedido`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`N_Prod`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `N_Prod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
