@echo off
setlocal EnableExtensions EnableDelayedExpansion

REM --- Config ---
set "JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-8.0.472.8-hotspot"
set "JAVA=%JAVA_HOME%\bin\java.exe"
set "JAVAC=%JAVA_HOME%\bin\javac.exe"
set "SRC_DIR=%~dp0src"
set "BIN_DIR=%~dp0bin"
set "ARGFILE=%~dp0sources.txt"

if not exist "%BIN_DIR%" mkdir "%BIN_DIR%"

echo [Gielinor Client] Building...
del /q "%ARGFILE%" 2>nul
for /r "%SRC_DIR%" %%f in (*.java) do (
  set "p=%%f"
  set "p=!p:\=/!"
  echo "!p!" >> "%ARGFILE%"
)

REM Compile (use argfile; forward slashes prevent javac escaping issues on Windows)
"%JAVAC%" -encoding UTF-8 -source 8 -target 8 -d "%BIN_DIR%" "@%ARGFILE%"
if errorlevel 1 (
  echo [Gielinor Client] Build failed.
  pause
  exit /b 1
)

echo [Gielinor Client] Running...
"%JAVA%" -Xms256m -Xmx512m -cp "%BIN_DIR%" client
pause
