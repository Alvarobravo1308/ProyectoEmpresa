create database ProyectoIndra
use ProyectoIndra
CREATE TABLE Usuario (
  id_usuario INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  email VARCHAR(150) UNIQUE NOT NULL,
  password VARCHAR(255) NOT NULL
);

CREATE TABLE Organizador (
  id_organizador INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  contacto VARCHAR(150) NOT NULL
);

CREATE TABLE Categoria (
  id_categoria INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL
);

CREATE TABLE Ubicacion (
  id_ubicacion INT PRIMARY KEY AUTO_INCREMENT,
  tipo ENUM('Presencial', 'Online') NOT NULL,
  direccion VARCHAR(255),
  enlace_online VARCHAR(255)
);

CREATE TABLE Evento (
  id_evento INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  fecha DATE NOT NULL,
  duracion_horas INT,
  descripcion TEXT,
  imagen_url VARCHAR(255),
  id_categoria INT,
  id_ubicacion INT,
  id_organizador INT,
  FOREIGN KEY (id_categoria) REFERENCES Categoria(id_categoria),
  FOREIGN KEY (id_ubicacion) REFERENCES Ubicacion(id_ubicacion),
  FOREIGN KEY (id_organizador) REFERENCES Organizador(id_organizador)
);

CREATE TABLE Inscripcion (
  id_inscripcion INT PRIMARY KEY AUTO_INCREMENT,
  id_usuario INT,
  id_evento INT,
  fecha_insc DATE NOT NULL,
  PRIMARY KEY (id_usuario, id_evento),
  FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario),
  FOREIGN KEY (id_evento) REFERENCES Evento(id_evento)
);
