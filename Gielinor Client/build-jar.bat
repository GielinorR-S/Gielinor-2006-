@echo off
setlocal EnableExtensions EnableDelayedExpansion

REM --- Config ---
set "JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-8.0.472.8-hotspot"
set "JAVAC=%JAVA_HOME%\bin\javac.exe"
set "JAR=%JAVA_HOME%\bin\jar.exe"
set "SRC_DIR=%~dp0src"
set "BIN_DIR=%~dp0bin"
set "ARGFILE=%~dp0sources.txt"
set "OUT_JAR=%~dp0GielinorClient.jar"

if not exist "%BIN_DIR%" mkdir "%BIN_DIR%"

echo [Gielinor Client] Compiling...
del /q "%ARGFILE%" 2>nul
for /r "%SRC_DIR%" %%f in (*.java) do (
  set "p=%%f"
  set "p=!p:\=/!"
  echo "!p!" >> "%ARGFILE%"
)

"%JAVAC%" -encoding UTF-8 -source 8 -target 8 -d "%BIN_DIR%" "@%ARGFILE%"
if errorlevel 1 (
  echo [Gielinor Client] Compile failed.
  pause
  exit /b 1
)

echo [Gielinor Client] Building jar: "%OUT_JAR%"
if exist "%OUT_JAR%" del /q "%OUT_JAR%"
pushd "%BIN_DIR%"
"%JAR%" cfe "%OUT_JAR%" client .
popd

echo [Gielinor Client] Done.
pause

