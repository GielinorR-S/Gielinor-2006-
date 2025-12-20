@echo off
setlocal

set "JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-8.0.472.8-hotspot"
set "JAVA=%JAVA_HOME%\bin\java.exe"
set "JAR=%~dp0GielinorClient.jar"

if not exist "%JAR%" (
  echo [Gielinor Client] Missing GielinorClient.jar
  echo Run build-jar.bat first.
  pause
  exit /b 1
)

"%JAVA%" -Xms256m -Xmx512m -jar "%JAR%"
pause

