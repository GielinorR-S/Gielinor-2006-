@echo off
java -Xms512m -Xmx1024m -cp bin;lib/* org.hyperion.Server
pause
