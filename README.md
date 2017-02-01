# Management app
  
  Spring MVC based application.


App was designed with <b>Spring 4</b> Framework.<br>
Used <b>Spring Security</b> to distinguish roles as ADMIN, MANAGER, USER in order to 
separate their management interfaces and abilities.<br>
Used <b>Hibernate</b> as ORM for app. User <b>PostgreSQL JDBS</b> driver to access the database.
<br>
<br>
As <b>templates engine</b> was used <b>Thymeleaf</b> template engine with <b>SpringEL</b> support.
All templates located in <b>webapp/WEB-INF/templates</b> directory with roles separation.
<br>
<br>
   Where created schema in Postgres database to store app data.
   All app's <b>spring configuration</b> stored in <b>com.config</b> package classes.
   All app's <b>DAOs</b> classes lies in <b>com.data</b> package.
   All app's <b>entities</b> classes located in <b>com.domain</b> package.
   All app's request <b>controllers</b> classes located in <b>com.controllers</b> package.
   <br>
   <br>
   <b>Maven</b> build automation tool was used in project to add dependencies and project building.
