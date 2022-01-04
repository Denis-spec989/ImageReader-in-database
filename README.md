# Приложение для просмотра изображения из базы данных 
____
Приложение позволяет просматривать  выбранное изображение, из уже загруженных в базу данных на сервере. Добавление фотографии в базу данных возможно с помощью [приложения](https://github.com/Denis-spec989/Insert-photo-in-database-app). 
___
## Оглавление
1. [Описание приложения](#anchor1)
2. [Демо проекта](#anchor2)
3. [Используемые технологии в проекте](#anchor3)
4. [Техническое описание проекта](#anchor4)
___
<a id="anchor1"></a>
### 1.Описание приложения
Данное приложения для просмотра изображения  написано на open-source среде разработки **Apache Netbeans IDE** с использованием **Java SE 16**, и драйверов для работы **JDBC**-Microsoft JDBC Driver for SQL Server(Type 4) , и библиотеки **Absolute Layout**. Установка и настройка проекта будет указана в пункте [Техническое описание проекта](#anchor1)

**Цель проекта** - просмотр данных(в нашем случае изображения), находящихся(находящегося) в БД на сервере.
___
<a id="anchor2"></a>
### 2.Демо проекта 
**Запускаем приложение для просмотра изображения**
![avat](https://raw.githubusercontent.com/Denis-spec989/ImageReader-in-database/master/assets/scr1.jpg)
В нашей базе данных уже лежат фотографии.(Эти фотографии добавлялись при предыдущих тестах программы)
**Выберем 2 изображения с названием **testphoto1** и **mountain** под номером 3 и убедимся , что они открываются корректно**

**testphoto1**
![avat](https://raw.githubusercontent.com/Denis-spec989/ImageReader-in-database/master/assets/scr2.jpg)

**mountain номером 3**
![avat](https://raw.githubusercontent.com/Denis-spec989/ImageReader-in-database/master/assets/scr3.jpg)


**Все работает :blush:**
___
### 3.Используемые технологии в проекте
<a id="anchor3"></a>
:heavy_check_mark: JDBC
:heavy_check_mark: SQL-запросы
:heavy_check_mark: Java Stream API
:heavy_check_mark: Swing и AWT
___
<a id="anchor4"></a>
### 4.Техническое описание проекта
Если у вас нет сервера с установленной базой данных и добавленными фотографиямя , перейдите по [ссылке на репозиторий](https://github.com/Denis-spec989/Insert-photo-in-database-app). В данном репозитории находится приложение для добавления изображения в базу данных на сервере и полная инструкция по установке и настройке сервера с базой данных.
Если у вас есть сервер с базой данных и добавленными фотографиями , вам остается только ввести пароль от сервера в методе **getPhotos()** и **getPhoto(int id**) и запустить приложение.
```Java
try(Connection con=DriverManager.
                        getConnection(url,"sa","You need to insert your password in Microsofr SQL Server"))
        {
```




