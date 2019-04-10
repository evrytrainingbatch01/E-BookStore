-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: ebookdb
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_book`
--

DROP TABLE IF EXISTS `tbl_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_book` (
  `book_id` bigint(20) NOT NULL,
  `book_author` varchar(255) DEFAULT NULL,
  `book_info` longtext,
  `book_publisher` varchar(255) DEFAULT NULL,
  `book_title` varchar(255) DEFAULT NULL,
  `book_price` double DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_book`
--

LOCK TABLES `tbl_book` WRITE;
/*!40000 ALTER TABLE `tbl_book` DISABLE KEYS */;
INSERT INTO `tbl_book` VALUES (1,'Ian Masser','This book draws on author’s wealth of knowledge working on numerous projects across many countries. It provides a clear overview of the development of the SDI concept and SDI implementation and brings a logical chronological approach to the linkage of GIS technology with SDI enabling data for the benefit of society from local to global scales.','CRC Press','Geographic Information Systems to Spatial Data Infrastructures',500.1),(2,'Xiong Luo','The book provides an advanced vision and trends of computational intelligence in cyberspace and cyber-enabled spaces. It reviews architectures and models, as well as state-of-the-art computational and interpretation capabilities for social, industrial, and multimedia applications. Cyber-enabled intelligence involves the design and development of intelligent and innovative application scenarios in social networks, computer vision, multimedia, and image processing. Application scenarios can also cover the applicability of intelligent sensing, data collection and predictive analysis in Internet of Things.','Taylor & Francis','Cyber-Enabled Intelligence',1200.3),(3,'Alex Okita','For the novice game programmer with no experience with any programming languages. Covers how C# is used to make a game in Unity3D. Interactive examples give C# code meaning. As more complex aspects of C# are explained the interactivity of example games gains depth. Common programming tasks are taught by way of making a game. Thereader will understand how to read and apply C# in Unity3D and apply that knowledge to other development environments that use C#. New to this edition: includes latest C# functionality and feratures; new tips and tricks oo tuples, pattern matching, out variables, local functions, binary laterals, digit separators, null propagator reduces, etc.','A K Peters/CRC Press','Learning C# Programming with Unity 3D, second edition',389),(4,'Daniel Samson','This book provides practitioners with strategies and tools for establishing and maintaining a successful, value-centric internal audit organization.','Auerbach Publications','The Audit Value Factor',776),(5,'Manas Kamal Bhuyan','The book familiarizes readers with fundamental concepts and issues related to computer vision and major approaches that address them. The focus of the book is on image acquisition and image formation models, radiometric models of image formation, image formation in the camera, image processing concepts, concept of feature extraction and feature selection for pattern classification/recognition, and advanced concepts like object classification, object tracking, image-based rendering, and image registration. Intended to be a companion to a typical teaching course on computer vision, the book takes a problem-solving approach.','CRC Press','Computer ',5330),(6,'Jay Liebowitz','This book examines how to develop the main traits that are necessary to become an “informed intuitant”. Case studies and examples of successful “informed intuitants” are a major component of the book. “Intuitant” is someone who has the intuitive awareness to be successful. “Informed intuitant” indicates that the individual/decision maker not only applies his/her intuition but also verifies it through using data-driven approaches (such as data analytics). Some of this work resulted from research examining how well do executives trust their intuition.','Taylor & Francis','Developing Informed Intuition for Decision-Making',3277),(7,'Prashanth Kotturi','Written by a team of expert practitioners at the Independent Office of Evaluation of IFAD, this book gives an insight into the implications of new and emerging technologies in development evaluation.','Routledge','Information and Communication Technologies for Development Evaluation',633),(8,'Debashis Khan','This book provides good coverage of the powerful numerical techniques namely, finite element and wavelets, for the solution of partial differential equation to the scientists and engineers with a modest mathematical background. The objective of the book is to provide the necessary mathematical foundation for the advanced level applications of these numerical techniques. The book begins with the description of the steps involved in finite element and wavelets-Galerkin methods. The knowledge of Hilbert and Sobolev spaces is needed to understand the theory of finite element and wavelet-based methods. Therefore, an overview of essential content such as vector spaces, norm, inner product, linear operators, spectral theory, dual space, and distribution theory, etc. with relevant theorems are presented in a coherent and accessible manner. For the graduate students and researchers with diverse educational background, the authors have focused on the applications of numerical techniques which are developed in the last few decades. This includes the wavelet-Galerkin method, lifting scheme, and error estimation technique, etc.','Chapman and Hall/CRC','Mathematical Theory of Subdivision',880.3),(9,'Massimo Ragnedda','Blockchain and Web 3.0 fills the gap in our understanding of blockchain technologies by hosting a discussion of the new technologies in a variety of disciplinary settings.','Routledge','Blockchain and Web 3.0',2500),(10,'Silvio Carta','Big Data, Code and the Discrete City explores how digital technologies is gradually changing the way in which the public space is designed by architects, managed by policy-makers, and experienced by individuals. Smart city technologies are superseding the traditional human experience that has characterised the making of the public space until today. This book examines how computers see the public space and the effect of algorithms, artificial intelligences, and automated processes on the human experience in public spaces.','Routledge','Big Data, Code and the Discrete City',5300);
/*!40000 ALTER TABLE `tbl_book` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-10 14:48:53
