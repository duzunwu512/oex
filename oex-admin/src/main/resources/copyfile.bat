@echo off

echo.
echo 开始COPY文件...
echo.

cd %~dp0
xcopy %~dp0\templates ..\..\..\target\classes\templates/E/Y

echo COPY文件结束...
rem pause
