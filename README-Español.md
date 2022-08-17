# Android-Web-App
Una plantilla para aplicaciones web para Android preparada para cualquier sitio web en unos pocos pasos sencillos.

## PASOS PARA ESTABLECER LA WEB:
1. Clonar el repositorio si no lo está ya
2. Acceder al fichero: Android-Web-App\app\src\main\res\raw\config.txt
3. Sustituir https://www.pagina.com por la url deseada

## PASOS PARA ESTABLECER EL NOMBRE DE LA APP:
1. Clonar el repositorio si no lo está ya
2. Acceder al fichero: Android-Web-App\app\src\main\res\values\strings.xml
3. Sustituir Android-Web-App por el nombre deseado
4. Acceder al fichero: Android-Web-App\app\build.gradle
5. Sustituir applicationId "com.example.android_web_app" por applicationId "com.nombreAutor.nombreApp" NombreAutor y NombreApp no pueden contener espacios

## PASOS PARA ESTABLECER EL ICONO:
1. Clonar el repositorio si no lo está ya
2. Descargar una imagen que será el icono
3. Abrir el repositorio con Android Studio
4. En la ventana de Project, click derecho sobre res (dentro de app)
5. New / Image Asset
6. En Path pulsar sobre el icono de carpeta y seleccionar la ruta de la imagen
7. Poner Trim a Yes (centrar y ajustar la imagen)
8. Ajustar el tamaño en Resize
9. En la pestaña Options / Legacy Icon / Shape poner Circle
10. En la pestaña Background Layer poniendo Trim a yes y disminuyendo el tamaño a 0% se pone el fondo transparente
11. Pulsar Next y luego Finish
12. Eliminar duplicados en app / res / mipmap en los apartados ic_launcher y ic_launcher_round
