@echo off

echo.
echo ��ʼCOPY�ļ�...
echo.

cd %~dp0
xcopy %~dp0\templates ..\..\..\target\classes\templates/E/Y

echo COPY�ļ�����...
rem pause
