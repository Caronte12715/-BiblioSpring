# bibliotecaWebUrjc_DAD

**Nombre de la aplicación web:** BiblioSpring

**Descripción de la temática de la web:**
<p>La web consistirá en proporcionar servicio de una biblioteca tanto a usuarios que quieran hacer uso de la misma o tanto al bibliotecario para realizar todas las tareas de gestión que se necesitase. </p>

**Entidades principales:**
<ul>
<li>Libro: Conlleva unos atributos que lo caracterizan (nombre, escritor, descripción, categoría) </li>
<li>Usuario: Diferencia de tipos de usuarios(si es socio o administrador de la biblioteca) y las acciones que permite realizar.</li>
<li>Categoría:Tendrá varias temáticas en las diferentes áreas(informática, literatura, biología, deportes, historia, geografía...)</li>
<li>Préstamo: Todo lo referente al control y gestión de los pagos de los carnet</li>
<li>Alternativa: Otros tipos de recursos disponibles en la biblioteca (películas, revistas, fanzines,...) </li>
</ul>

**Funcionalidades del servicio interno:**
<ul>
<li>Enviar un correo de bienvenida al registrarte</li>
</ul>  

**Parte privada:**
<p>Los socios de la biblioteca pueden alquilar libros, también pueden renovar su carnet de socio anual, hacer reservas de libros, publicar alguna reseña sobre el libro alquilado, cambiar sus datos, realizar el pago de una deuda pendiente, ... </p>
<p>El administrador (bibliotecario) podrá añadir un libro, eliminar un libro, modificar las características de un libro, podrá gestionar los préstamos de libros, podrá repartir los libros de la biblioteca en categorías, podrá añadir y eliminar los tipos de Alternativas (Fanzines, Películas y Revistas)... </p>

**Parte pública:**
<p>Los usuarios que no sean socios de la biblioteca podrán consultar el horario de la biblioteca, consultar los precios y beneficios de poseer el carné de socio, una opción de contactar con la biblioteca (cómo llegar), ver las distintas redes sociales que tiene la biblioteca, ver información adicional de la biblioteca, consultar las normas de uso interno en la biblioteca, ver la política de privacidad, consultar los libros que están disponibles, consultar los fanzines, películas y revistas que están disponibles, etc</p>

**Integrantes del equipo de desarrollo:**
<ul>
<li> Agustín López Gil - a.lopezgi.2016@alumnos.urjc.es - agustinlopezg</li>
</ul>

**Modelo UML:**

![UML](https://github.com/agustinlopezg/bibliotecaWebUrjc_DAD/blob/master/UML_FASE3.jpg?raw=true)    

**Diagrama de clases:**

![Diagrama_de_clases](https://github.com/agustinlopezg/bibliotecaWebUrjc_DAD/blob/master/diagramaClasesDAD_fase3.jpg?raw=true)
      
**Modelo Entidad-Relación:**

![Diagrama_de_clases](https://github.com/agustinlopezg/bibliotecaWebUrjc_DAD/blob/master/MODELO_E_R.png?raw=true)
     
**Descripción de las pantallas principales:** 

<li> Libro: Se puede buscar los libros que hay en la biblioteca por diferentes filtros: título y categoría </li>
<li>Usuario: Ingresas a la aplicación mediane un LogIn en el que se tiene que escribir los datos (nombre y contraseña) para acceder.</li>
<li>Categoría:Consulta todos los libros de la biblioteca repartidos en categorías para una mayor facilidad de uso</li>
<li>Préstamo: Accede a la posibilidad de entrar en el espacio personal del usuario premium para renovar el carné anual, cambiar los datos personales, etc.</li>
<li>Alternativa: Consulta los fanzines, revistas y películas que hay en la biblioteca. </li>


**Instrucciones precisas para desplegar la aplicación:**
<p> Compilación: 
	<li> 1. Botón derecho sobre el proyecto. </li> 
	<li> 2. Clickar sobre 'Run as' </li>
	<li> 3. Clickar sobre Spring Boot Application </li> </p>
     
<p>Virtualización:</p>

Creamos una carpeta: (aquí meteremos nuestros archivos)

		sudo mkdir carpeta  
            sudo mount -t vboxsf shared /home/

Instalamos Java

		sudo  apt install  
            sudo apt-get install -y openjdk-8-jdk
            
Instalamos MySQL server

		sudo apt-get install mysql-server 
            
Creamos la base de datos y el nombre de nuestra BBDD

		sudo bibliospringbd
            
Creamos el usuario "root"

		create user 'root'@'127.0.0.1';     
            
Modificamos la contraseña de la base de datos

		alter mysql.user 'root'@'localhost' identified with mysql_native_password by '1234';
            
Ejecutamos los .jar

		sudo java -jar BiblioSpringUrjc-0.0.1-SNAPSHOT & 
            sudo java -jar Servicio_interno-0.0.1-SNAPSHOT &           
            
<p> ¿Qué hace falta instalar?: Eclipse STS 4, Java 8, MySQL Workbench 8.0 y VirtualBox </p>      
      



