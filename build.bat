@echo off
set _CLASSPATH=%JAVA_HOME%\lib\tools.jar;
for %%f in (.\lib\ant\*.jar) do call .\extra\template\cp.bat %%f


java -cp "%_CLASSPATH%"  org.apache.tools.ant.Main   %1 %2 %3 %4 %5