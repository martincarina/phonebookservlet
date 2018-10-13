# README #

Этот проект - телефонная книга, реализованная на следующих технологиях:

Клиентская часть: html, css, js, knockout, jquery, jquery-ui, bootstrap, underscore.
Серверная часть: servlets + Tomcat.
БД: оперативная память, уничтожается при выключении проекта.
Сборка: средствами идеи - артефактами.
Запуск: Tomcat.

Что умеет делать проект:
отображать существующие контакты
добавлять новые контакты

Что нужно добавить в проект:
удаление контакта,
удаление всех выбранных контактов,
пометить контакт как важный,
фильтрация контактов,
выгрузка контактов в excel - подсказка используйте библиотеку: apache poi.

По желанию:
Можно изменить клиентскую часть вплоть до чистого html, можно поменять библиотеки и архитектуру - главное проект должен работать.

Как собрать проект:
нажмите кнопку build project
идея собирает артефакт - артефакт описан в проекте File -> Project Structure -> Artifacts -> phonebook
собранный артефакт будет размещен в директории out

Как запустить проект
Run phonebook@tomcat - данная команда собирает проект и запускает Tomcat
Debug phonebook@tomcat - данная команда собирает проект в режиме дебаг и запускает Tomcat

Отладка серверной части:
1) запустите проект в режиме дебаг
2) используйте Postman

Отладка клиентской части:
1) запускайте проект в chrome
2) используйте инструменты разработчика

Реализованные методы API:
GET {host}/phonebook/get/all - получения списка контактов

POST {host}/phonebook/add - добавление нового контакта в формате
Тело запроса:
{
 "firstName": "Имя",
 "lastName": "Фамилия",
 "phone": "Телефон"
}

Как должен выглядеть готовый проект:
Проект должен запускаться 1-2 кнопками: MAKE и RUN tomcat.
Если меняете артефакт и/или нужны новые библиотеки - вносите это все в проект.
Чтобы проверить, что другой человек сможет запустить проект без проблем - сделайте checkout в отдельную директорию и запустите его.